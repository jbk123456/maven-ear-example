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

Visit:

## podman

build:

```bash
app=maven-ear-example
ver=1.0-SNAPSHOT

mvn clean package 
podman build -t $app:$ver module-ear/. -f Dockerfile 
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


## URL
* local: [http://localhost:9080/webui/](http://localhost:9080/webui/)
* container [http://localhost:9091/webui/](http://localhost:9091/webui/)

* credentials: admin/admin, webuser/webuser


