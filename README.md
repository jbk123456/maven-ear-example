maven ear example
=====================

## Eclipse integration

* Download and start Eclipse 2024-06 jee

* disable automatic build (Project -> Build automatically)

* Download maven 3.9.9 and extract it (e.g. to ~/apache-maven-3.9.9)

* Download and install java11 e.g. to /usr/lib/jvm/java-11-openjdk-11.0.25.0.9-2.el8.x86_64

* In Eclipse open  Window -> Preferences 

* open java -> installed jres => choose java11

* open maven -> installations -> choose maven 3.9.9 and select default

* open maven -> annotation processing -> select "automatically configure ... "

* open maven -> jee integration -> [ ] Enable java ee integration (all off!)

* open help -> eclipse marketplace and drag drop [liberty tools](https://marketplace.eclipse.org/marketplace-client-intro?mpc_install=5571241) to install it, then restart eclipse

* open Window -> Preferences -> Liberty -> choose maven 3.9.9 (make sure there's no space in the path)

* clone maven-ear-example.git and open it (file -> import -> maven -> existing maven projects -> maven-ear-example)


```bash
git clone git@github.com:jbk123456/maven-ear-example.git
```

* right-click on maven-ear-example/pom.xml and run as maven ... type "clean install"

* open "liberty dashboard" and click application -> debug

* open console view and select maven console

* enable automatic build. The maven console shall stay empty until a file is changed

* edit ExampleService.java, change "i'm an ExampleService" to "I'm an ExampleService" and visit http://localhost:9080/webui (webuser / webuser)

* output should start with "I'm an ExampleService"

* revert the change and watch both, the maven console and the liberty terminal. The console shall recompile the changed file and liberty dev shall pick it up

* stop liberty dev mode (type q <enter> in the terminal window)

* change ExampleService.java to "I am an Example Service", open the target folder and examine its content 

```bash
strings -- 'module-ejb/target/classes/com/example/service/impl/ExampleService.class'  | fgrep "an ExampleService"
# => 
```

## liberty dev mode

Start with:

```bash
mvn clean io.openliberty.tools:liberty-maven-plugin:3.11.3:dev
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


oc start-build $app  --from-dir=. --exclude='pom\.xml' # -v9 

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


## openshift s2i with init-container


### setup

```bash
eval $(crc oc-env)
oc login -u developer https://api.crc.testing:6443
```

create a new project:


```bash
oc new-project demo-app-init-container
```


### package, build and deploy

In maven-ear-example run:

```bash
img=open-liberty-s2i:24.0.0.12-java11
app=maven-ear-example

oc import-image openliberty/$img --confirm
```

Modify server.xml to include
```xml
    <!-- Automatically expand WAR files and EAR files -->
    <applicationManager autoExpand="true"/>
```

Build
```bash
JAVA_HOME=/usr/java/jdk-11.0.15

mvn clean package
oc new-build . --name=$app --image-stream=$img  -o json |  oc apply -f-
oc start-build $app  --from-dir=. --exclude='pom\.xml' # -v9 

Deploy

```bash
oc apply -f kubernetes/init-container.yaml
oc expose service $app --path=/webui

```

### visit

* container [http://HOST/](http://maven-ear-example-demo-app-s2i-from-git.apps-crc.testing/webui/)
* credentials: admin/admin, webuser/webuser



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

Create and push a docker image

```bash
oc new-project custom-image
user=jost2boekemeier
passwd=*****
podman login -u "$user" -p "$passwd" docker.io

name=open-liberty-s2i-webhooks
ver=1.4-SNAPSHOT
img=$name:$ver

podman build -f kubernetes/Dockerfile -t $img
podman tag $img $user/$img
podman push $user/$img
```

Import the created docker image

```bash
oc create secret docker-registry docker --docker-server hub.docker.com --docker-username=$user --docker-password=*****
oc secrets link default docker --for=pull

oc import-image docker.io/$user/$img --confirm
oc tag docker.io/$user/$img $img
```
### create new app

Build an app from source code


```bash
# in maven-ear-example
mvn clean

oc new-app . --name=$app --image=$user/$img  --build-env='MAVEN_ARGS=-e -s /home/default/.m2/settings.xml -Popenshift -Dcom.redhat.xpaas.repo.redhatga package'

app_endpoint=maven-ear-example
api_endpoint=$app_endpoint-webhooks-api
oc expose service $app --port=9080 --path=/webui --name=$app_endpoint
oc expose service $app --port=9000 --path=/hooks --name=$api_endpoint
```
### test

```bash
curl -H "Content-Type:application/json" -X POST -d "{\"binary\":\"$(echo hello | base64 -)\"}" http://$api_endpoint-$(oc project -q).apps-crc.testing/hooks/run-cmd-webhook
```

## devspace-operator

Follow the instructions at [openshift without olm](https://github.com/devfile/devworkspace-operator/blob/main/docs/installation/openshift-without-olm.md):

```bash
oc create namespace devworkspace-controller
oc apply -f https://raw.githubusercontent.com/devfile/devworkspace-operator/refs/heads/main/deploy/deployment/openshift/combined.yaml
oc wait --namespace devworkspace-controller --timeout 90s  --for=condition=ready pod  --selector=app.kubernetes.io/part-of=devworkspace-operator
```

Create workspace

```bash
oc create namespace devworkspace-maven-ear-example
oc apply -f kubernetes/devworkspace.yaml
```
### Start the workspace

Start the workspace and check if it has been started (may take several minutes):

```bash
oc patch devworkspace git-clone-sample-devworkspace -n devworkspace-maven-ear-example --type merge -p '{"spec": {"started": true}}'
oc get devworkspace -n devworkspace-maven-ear-example
```


# ConfigMap

```bash
(cd kubernetes
oc delete configmap config.variables
oc delete configmap config.dir --from-file=config


oc create configmap config.variables --from-file=config/variables
oc create configmap config.dir --from-file=config

oc describe configmaps config.dir config.variables

oc apply -f kubernetes.yaml

)

```
