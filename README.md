maven ear example
=====================

## liberty dev mode

Start with:

```bash
mvn clean io.openliberty.tools:liberty-maven-plugin:3.10.3:dev
```
or:

```bash
mvn clean liberty:dev
```

### visit
* local: [http://localhost:9080/webui/](http://localhost:9080/webui/)
* credentials: admin/admin, webuser/webuser



## podman

build:

```bash
app=maven-ear-example
ver=1.0-SNAPSHOT

mvn clean package 
podman build -t $app:$ver module-ear/. 
podman images
```

start:

```bash
app=maven-ear-example
ver=1.0-SNAPSHOT
log="-e WLP_LOGGING_CONSOLE_FORMAT=DEV -e WLP_LOGGING_CONSOLE_LOGLEVEL=info -e WLP_LOGGING_CONSOLE_SOURCE=message,trace,accessLog,ffdc,audit"
podman run --replace -d --name $app -e http.port=9091 $log -p 9091:9091 $app:$ver

```

troubleshooting:

```bash
podman ps -a
# => df2ed0d903e0 #podman logs -f df2ed0d903e0
podman logs -f --latest
podman exec -it --latest /bin/bash
podman top --latest

```

## visit
* container [http://localhost:9091/webui/](http://localhost:9091/webui/)
* credentials: admin/admin, webuser/webuser

## openshift

### installation

Install openshift local "crc" and start it.

On RHEL8, which is based on Fedora 28, crc uses NetworkManager and dnsmasq, see
[https://crc.dev/docs/networking/](https://crc.dev/docs/networking/) for details

Since ws-featureUtility.jar needs a proxy anyway, we change the crc configuration to user networking mode and setup a local http proxy.

The required changes are:

```bash
crc config set network-mode user
crc config set host-network-access true
```

A proxy config for a local apache might look like this:

```/etc/httpd/conf/httpd.conf
Listen 8888 
<VirtualHost *:8888>
ProxyRequests On
 ProxyVia On
<Proxy "*">
 Allow from all
 </Proxy>
</VirtualHost>
```

To avoid adding SEL rules for port 8888 and to avoid conflicts with crc, you might want to disable port 80 and 443 in apache http.conf file and
temporarily set SEL policy to permissive:

```bash
setenforce permissive
systemctl start httpd.service
```

By default crc allocates 31gb of disk space for the crc vm, of which only ~5gb is available on a fresh install.
So we increase the disc size and restart crc:

```bash
crc config set disk-size 50

crc cleanup
crc setup
crc start -p ./pull-secret.txt # --log-level debug
```

The crc also needs the openshift operator. It can be installed
using the web console (as kubeadmin).

### setup

```bash
eval $(crc oc-env)
oc login -u kubeadmin https://api.crc.testing:6443
oc adm policy add-cluster-role-to-user cluster-admin developer
oc login -u developer https://api.crc.testing:6443

oc new-project demo-app
```

* default credentials: kubeadmin/xxx, developer/developer

setup the "buildconfig" and "docker" image streams:


```bash
oc projects # => demo-app

oc process -f build.yaml | oc create -f -
```


### package

In maven-ear-example run:

```bash
app=maven-ear-example
mvn clean package
#oc start-build $app-buildconfig --from-dir=.
oc start-build $app-buildconfig --from-dir=./module-ear -F

oc get builds
oc logs build/$app-buildconfig-1
oc get imagestreams
oc describe imagestream/$app-imagestream
```

Note that the Dockerfile is located in the module-ear directory and contains a reference to the local http proxy we've set up earlier. The proxy is required by installFeatures which, for some reason, cannot access FEATURE_REPO_URL directly. Please see [installFeatures](https://openliberty.io/docs/latest/reference/command/featureUtility-commands.html) for details.

### deploy

In maven-ear-example run:

```bash
app=maven-ear-example
oc apply -f deploy.yaml

oc get OpenLibertyApplications
oc describe olapps/$app # "olapps" is short for OpenLibertyApplications 8)

```

### visit

```bash
oc get routes
```

Example output:

```bash
NAME     HOST/PORT                                                     PATH   SERVICES   PORT       TERMINATION   WILDCARD
maven-ear-example   maven-ear-example-demo-app.2886795274-80-kota02.environments.katacoda.com          maven-ear-example     9091-tcp                 None

NAME                HOST/PORT                                     PATH   SERVICES            PORT       TERMINATION   WILDCARD
maven-ear-example   maven-ear-example-demo-app.apps-crc.testing          maven-ear-example   9092-tcp   reencrypt     None


```


* container [http://HOST:9092/webui/](http://HOST:9092/webui/)
* credentials: admin/admin, webuser/webuser

### tear down

```bash
    kubectl delete -f deploy.yaml
```

### troubleshooting

```bash
oc whoami --show-console

oc get events
oc get pods

KUBE_EDITOR="gedit"
project=demo-app
deployment=maven-ear-example

oc debug deployment/$deployment --as-root -n $project
oc get deployment -n $deployment
oc debug deployment/$deployment --as-root -n $project # geht nicht wenn nicht startfähig
oc edit deployment/$deployment


 oc edit deployment/openliberty-app-sample

oc get pods
oc rsh <pod_name>  


---- get image from internal image stream ---
=> https://medium.com/@mgreenbe_84803/using-openshifts-internal-registry-e4a81d09da59

REGISTRY="$(oc get route/default-route -n openshift-image-registry -o=jsonpath='{.spec.host}')/openshift"

podman login --tls-verify=false -u unused -p $(oc whoami -t)  ${REGISTRY}

virsh -c qemu:///system dumpxml crc | grep -e vcpu -e "memory unit"

```
