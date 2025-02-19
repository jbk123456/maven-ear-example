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

### visit
* container [http://localhost:9091/webui/](http://localhost:9091/webui/)
* credentials: admin/admin, webuser/webuser

## openshift 

### installation

Install openshift local "crc" and start it.

On RHEL8, which is based on Fedora 28, crc uses NetworkManager and dnsmasq, see
[https://crc.dev/docs/networking/](https://crc.dev/docs/networking/) for details


### setup

By default crc allocates 31gb of disk space for the crc vm, of which only ~5gb is available on a fresh install.
So we increase the disc size and restart crc:

```bash
crc config set network-mode user
crc config set host-network-access true
crc config set memory 14384
crc config set cpus 8
crc config set disk-size 50
```



## s2i binary

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
export DOCKER_HOST=unix:///run/user/$UID/podman/podman.sock
app=maven-ear-example
name=open-liberty-s2i:24.0.0.12-java11
ver=latest
img=$name:$ver
user=openliberty
#s2i=file://./.s2i/bin

mvn clean package
s2i --loglevel=5  build . $user/$img  $app  --copy   # --exclude='(^|/)\.git(/|$)|pom\.xml' # --scripts-url=$s2i 
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

## openshift s2i from git or local source


### setup

```bash
eval $(crc oc-env)
oc login -u developer https://api.crc.testing:6443
```

create a new project:


```bash
oc new-project demo-app-s2i-from-git
```


### package, build and deploy

In maven-ear-example run:

```bash
img=open-liberty-s2i:24.0.0.12-java11
app=maven-ear-example

oc import-image openliberty/$img --confirm
```

source build:

```bash
oc new-build . --name=$app --image-stream=$img  -o json | 
#  jq '.items[1].spec.strategy.sourceStrategy+={scripts:"'$s2i'"}' |
  oc apply -f-

oc start-build $app  --from-dir=. # -v9 

oc new-app $app --name=$app -o json |
  jq '.items|=map(select(.kind=="Deployment").spec.template.spec.containers|=map(select(.name="maven-ear-example").resources+={limits:{memory:"1Gi"},requests:{memory:"512Mi"}}))' |
  oc apply -f-
oc expose service $app --path=/webui

```

binary build:

```bash
JAVA_HOME=/usr/java/jdk-11.0.15
#s2i=file://./.s2i/bin


mvn clean install


oc start-build $app  --from-dir=. --exclude='(^|/)\.git(/|$)|pom\.xml' # -v9 

oc logs -f build/$(oc get builds | sed 1d |  fgrep 'Running'  | awk '{print $1}')

Please see [releases](https://github.com/OpenLiberty/open-liberty-s2i/releases) for details.

### visit

* container [http://HOST/](http://maven-ear-example-demo-app-s2i-from-git.apps-crc.testing/webui/)
* credentials: admin/admin, webuser/webuser


### trigger a new soure build

This triggers a source build from the git:

```bash

curl -X POST -k https://api.crc.testing:6443/apis/build.openshift.io/v1/namespaces/demo-app-s2i/buildconfigs/maven-ear-example/webhooks/SECRET/generic
```

### TODO

Unlike s2i binary "--scripts-url" doesn't work as expected.


## openshift with external image

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

* container [http://HOST/webui/](http://maven-ear-example-demo-image.apps-crc.testing/webui/)
* credentials: admin/admin, webuser/webuser


## custom s2i base image
```bash
oc new-project custom-image
user=jost2boekemeier
passwd=*****
podman login -u "$user" -p "$passwd" docker.io

name=open-liberty-s2i-webhooks
ver=1.0-SNAPSHOT
img=$name:$ver

podman build -f kubernetes/Dockerfile -t $img
podman tag $img $user/$img
podman push $user/$img
```

### create new app
```bash
oc create secret docker-registry docker --docker-server hub.docker.com --docker-username=$user --docker-password=*****
oc secrets link default docker --for=pull

oc tag docker.io/$user/$img $img
oc import-image docker.io/$user/$img --confirm
oc new-app . --name=$app --image=$user/$img

app_endpoint=maven-ear-example
api_endpoint=$app_endpoint-webhooks-api
oc expose service $app --port=9080 --path=/webui --name=$app_endpoint
oc expose service $app --port=9000 --path=/hooks --name=$api_endpoint
```
### test

```bash
curl -H "Content-Type:application/json" -X POST -d "{\"binary\":\"$(echo hello | base64 -)\"}" http://$api_endpoint-$(oc project -q).apps-crc.testing/hooks/run-cmd-webhook
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
