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
crc config set memory 14384
crc config set cpus 8
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
NAME                HOST/PORT                                     PATH   SERVICES            PORT       TERMINATION   WILDCARD
maven-ear-example   maven-ear-example-demo-app.apps-crc.testing          maven-ear-example   9443-tcp   reencrypt     None


```


* container [http://HOST/webui/](http://HOST/webui/)
* credentials: admin/admin, webuser/webuser

### tear down

```bash
    oc delete -f deploy.yaml
```

## local s2i

This builds a local docker container using s2i binary and podman.

### setup

Download [s2i](https://github.com/openshift/source-to-image/releases/download/v1.4.0/source-to-image-v1.4.0-d3544c7e-linux-amd64.tar.gz) or install it:

```bash

go install github.com/openshift/source-to-image/cmd/s2i@latest
```

Make sure docker emulation is installed and running:
```bash
yum install podman-docker
systemctl podman.service restart
```

### package, build and deploy

In maven-ear-example run:

```bash
JAVA_HOME=/usr/java/jdk-11.0.15
DOCKER_HOST=unix:///run/user/$UID/podman/podman.sock
app=maven-ear-example

mvn clean package
s2i --loglevel=5  build . openliberty/open-liberty-s2i:24.0.0.12-java11  $app  # --as-dockerfile Containerfile
docker run -it -p 9080:9080  -P $app
 
```

Examine:

```bash
podman exec -it $(podman ps | sed 1d | awk '{print $1}') /bin/bash

```

### visit

* container [http://localhost:9080/webui/](http://localhost:9080/webui/)
* credentials: admin/admin, webuser/webuser

### see also 

- [s2i](https://github.com/openshift/source-to-image)
- [liberty s2i](https://github.com/OpenLiberty/open-liberty-s2i?tab=readme-ov-file)
- [liberty docker](https://github.com/OpenLiberty/ci.docker)

### tear down

```bash
    podman rm $app
```

## openshift s2i


### setup

```bash
eval $(crc oc-env)
oc login -u developer https://api.crc.testing:6443
```

* default credentials: kubeadmin/xxx, developer/developer

create a new project:


```bash
oc new-project demo-app-s2i
```


### package, build and deploy

In maven-ear-example run:

```bash
JAVA_HOME=/usr/java/jdk-11.0.15
app=maven-ear-example

mvn clean package
oc import-image openliberty/open-liberty-s2i:24.0.0.12-java11 --confirm

oc new-build --name=$app --image-stream=open-liberty-s2i:24.0.0.12-java11 --binary=true

oc start-build $app -v9  --from-dir=./module-ear -F

oc new-app $app --name=$app

oc expose service $app --path=/webui

```

Please see [releases](https://github.com/OpenLiberty/open-liberty-s2i/releases) for details.

### visit

```bash
oc get routes
```

Example output:

```bash
NAME                HOST/PORT                                     PATH   SERVICES            PORT       TERMINATION   WILDCARD
maven-ear-example   maven-ear-example-demo-app.apps-crc.testing          maven-ear-example   9443-tcp   reencrypt     None


```


* container [http://HOST/](http://HOST/)
* credentials: admin/admin, webuser/webuser

### ConfigMap

```bash
(cd kubernetes
oc create configmap config.variables --from-file=config/variables
oc create configmap config.dir --from-file=config
oc describe configmaps config.dir config.variables

oc patch deployment/$app --patch-file $app_mount_config.patch.yaml
)

```


### tear down

```bash
    oc delete -f --all
```

## openshift s2i from git


### setup

```bash
eval $(crc oc-env)
oc login -u developer https://api.crc.testing:6443
```

* default credentials: kubeadmin/xxx, developer/developer

create a new project:


```bash
oc new-project demo-app-s2i-from-git
```


### package, build and deploy

In maven-ear-example run:

```bash
JAVA_HOME=/usr/java/jdk-11.0.15
app=maven-ear-example

mvn clean package
oc import-image openliberty/open-liberty-s2i:24.0.0.12-java11 --confirm

oc new-build . --name=$app  --image-stream=open-liberty-s2i:24.0.0.12-java11
oc start-build $app

oc new-app $app --name=$app
oc expose service $app --path=/webui

```

Please see [releases](https://github.com/OpenLiberty/open-liberty-s2i/releases) for details.

### visit

```bash
oc get routes
```

Example output:

```bash
NAME                HOST/PORT                                     PATH   SERVICES            PORT       TERMINATION   WILDCARD
maven-ear-example   maven-ear-example-demo-app.apps-crc.testing          maven-ear-example   9443-tcp   reencrypt     None


```


* container [http://HOST/](http://HOST/)
* credentials: admin/admin, webuser/webuser

### ConfigMap

```bash
(cd kubernetes
oc create configmap config.variables --from-file=config/variables
oc create configmap config.dir --from-file=config
oc describe configmaps config.dir config.variables

oc patch deployment/$app --patch-file $app_mount_config.patch.yaml
)

```

### trigger a new build

```bash

curl -X POST -k https://api.crc.testing:6443/apis/build.openshift.io/v1/namespaces/demo-app-s2i/buildconfigs/maven-ear-example/webhooks/SECRET/generic
```

### tear down

```bash
    oc delete -f --all
`

## openshift with image

### setup

```bash
eval $(crc podman-env)
alias podman=podman-remote

oc login -u developer https://api.crc.testing:6443

oc new-project demo-image
```

### package

In maven-ear-example run:

```bash
app=maven-ear-example
ver=1.0-SNAPSHOT

mvn clean package

podman build -t $app:$ver module-ear/. 
podman images
```


### push image

```bash
app=maven-ear-example

oc registry login --insecure=true
podman tag $app:1.0-SNAPSHOT $(oc registry info)/$(oc project -q)/$app:$ver
podman push $(oc registry info)/$(oc project -q)/$app:$ver
oc get imagestream

```


### deploy

In maven-ear-example run:

```bash
(cd kubernetes
app=maven-ear-example
ver=1.0-SNAPSHOT
oc apply -f kubernetes.yaml

oc get pods
)
```

### visit

```bash
oc get routes
```

Example output:

```bash
NAME                HOST/PORT                                     PATH   SERVICES            PORT       TERMINATION   WILDCARD
maven-ear-example   maven-ear-example-demo-image.apps-crc.testing          maven-ear-example   9443-tcp   reencrypt     None


```


* container [http://HOST/webui/](http://HOST/webui/)
* credentials: admin/admin, webuser/webuser

### tear down

```bash
app=maven-ear-example
(cd kubernetes
oc delete -f kubernetes.yaml
oc delete imagestream/$app
oc delete project demo-image
)
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

debug featureUtility: rsh to the container while building (add RUN sleep 65535 to Dockerfile) and chroot to the image

```bash

oc rsh maven-ear-example-buildconfig-7-build
find . -name configure.sh
=> ... 
=> ./var/lib/containers/storage/overlay/39c7c1331885131a5433fd1bc3c87905b0d295f2f4e7456fbbf0b3c053ea71ca/merged/opt/ol/helpers/build/configure.sh

myroot=/var/lib/containers/storage/overlay/39c7c1331885131a5433fd1bc3c87905b0d295f2f4e7456fbbf0b3c053ea71ca/merged/
mount --bind /dev $myroot/dev
mount --bind /proc $myroot/proc
chroot $myroot
# path taken from environment (buildah should be called with "-v9" option passed in from the oc start-build command)
PATH=/opt/java/openjdk/bin:/usr/local/sbin:/usr/local/sbin:/usr/local/bin:/usr/sbin:/usr/bin:/sbin:/bin:/opt/ol/wlp/bin:/opt/ol/helpers/build

https_proxy="" http_proxy="" java -Djava.awt.headless=true --add-opens java.base/java.lang=ALL-UNNAMED --add-exports java.base/sun.security.action=ALL-UNNAMED -jar /opt/ol/wlp/bin/tools/ws-featureUtility.jar installServerFeatures --acceptLicense defaultServer --noCache

 podman rmi $(podman images -qa) -f

```

# ConfigMap

```bash
(cd kubernetes
oc create configmap config.variables --from-file=config/variables
oc create configmap config.dir --from-file=config

oc describe configmaps config.dir config.variables

oc apply -f kubernetes.yaml

)

```
