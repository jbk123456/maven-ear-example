FROM icr.io/appcafe/open-liberty:kernel-slim-java8-openj9-ubi

ARG VERSION=1.0
ARG REVISION=SNAPSHOT

#ENV http_proxy "http://host.crc.testing:8888"
#ENV https_proxy "https://host.crc.testing:8888"

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
COPY --chown=1001:0 . /tmp/src
RUN chmod +x /tmp/src/.s2i/bin/assemble
RUN /tmp/src/.s2i/bin/assemble true

RUN features.sh

RUN configure.sh

