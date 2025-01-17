FROM icr.io/appcafe/open-liberty:kernel-slim-java11-openj9-ubi

ARG VERSION=1.0
ARG REVISION=SNAPSHOT

ENV http_proxy "http://host.crc.testing:8888"
ENV https_proxy "https://host.crc.testing:8888"

LABEL \
  org.opencontainers.image.authors="Jost Boekemeier" \
  org.opencontainers.image.vendor="github.com" \
  org.opencontainers.image.url="local" \
  org.opencontainers.image.source="https://github.com/jbk123456/maven-ear-example" \
  org.opencontainers.image.version="$VERSION" \
  org.opencontainers.image.revision="$REVISION" \
  vendor="Open Liberty" \
  name="system" \
  version="$VERSION-$REVISION" \
  summary="maven ear example" \
  description="maven ear example"


ARG VERBOSE=true
COPY --chown=1001:0 src/main/liberty/config /config/

RUN features.sh

# set automatically, see: https://github.com/OpenLiberty/ci.maven/blob/main/docs/dev.md
ENV OPENJ9_SCC=false

COPY --chown=1001:0 target/*.ear /config/apps

RUN configure.sh
