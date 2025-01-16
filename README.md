maven ear example
=====================

#liberty dev mode

Start with:

```bash
mvn clean io.openliberty.tools:liberty-maven-plugin:3.10.3:dev
```
or:

```bash
mvn clean liberty:dev
```

Visit:

#podman

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
log="-e WLP_LOGGING_CONSOLE_FORMAT=JSON -e WLP_LOGGING_CONSOLE_LOGLEVEL=info -e WLP_LOGGING_CONSOLE_SOURCE=message,trace,accessLog,ffdc,audit"
#podman run --replace -d --name $app -e http.port=9091 $log -p 9091:9091 $app:$ver
podman run --replace -d --name $app $app:$ver
```

troubleshooting:

```bash
podman ps -a
=> df2ed0d903e0
#podman logs -f df2ed0d903e0
podman logs --latest
#podman attach df2ed0d903e0
#podman attach --latest
podman exec -it <Container ID> /bin/bash
podman top --latest

```



[http://localhost:9080/webui/](http://localhost:9080/webui/)

User/pass: admin/admin, webuser/webuser


