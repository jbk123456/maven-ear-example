#!/bin/bash
set -x
mvn help:effective-settings

nohup webhook -logfile /usr/local/etc/logs/webhook.log -port 9000 -hotreload -hooks /usr/local/etc/hooks.json &
exec /opt/ol/helpers/runtime/docker-server.sh "$@"

