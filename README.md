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

### setup

install openshift local and start it, e.g.:

```bash
./crc start -p ./pull-secret.txt


eval $(crc oc-env)
#oc login -u kubeadmin https://api.crc.testing:6443
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

### deploy

In maven-ear-example run:

```bash
app=maven-ear-example
oc apply -f deploy.yaml

oc get OpenLibertyApplications
oc describe olapps/$app # "olapps" is short for OpenLibertyApplications 8)

```

## visit

```bash
oc get routes
```

Example output:

```bash
NAME     HOST/PORT                                                     PATH   SERVICES   PORT       TERMINATION   WILDCARD
maven-ear-example   maven-ear-example-demo-app.2886795274-80-kota02.environments.katacoda.com          maven-ear-example     9091-tcp                 None
```


* container [http://HOST:9092/webui/](http://HOST:9092/webui/)
* credentials: admin/admin, webuser/webuser

