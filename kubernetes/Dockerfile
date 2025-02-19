# run with:
# podman build -f kubernetes/Dockerfile -t open-liberty-s2i-webhooks
#
FROM openliberty/open-liberty-s2i

ARG VERSION=1.0
ARG REVISION=SNAPSHOT

LABEL \
  org.opencontainers.image.authors="Jost Boekemeier" \
  org.opencontainers.image.vendor="github.com" \
  org.opencontainers.image.url="local" \
  org.opencontainers.image.version="$VERSION" \
  org.opencontainers.image.revision="$REVISION" \
  version="$VERSION-$REVISION" \
  summary="Custom Liberty S2I Builder Image" \
  description="Liberty S2I builder image with a webhook listener on port 9000"

#ENV OPENJ9_SCC=false
ARG VERBOSE=true

USER root
RUN dnf -y install golang-bin wget
RUN go install github.com/adnanh/webhook@latest
RUN mv ~/go/bin/* /usr/local/bin/
RUN export local=/usr/local; wget https://dlcdn.apache.org/maven/maven-3/3.9.4/binaries/apache-maven-3.9.4-bin.tar.gz&& tar xzf apache-maven-3.9.4-bin.tar.gz && rm -f apache-maven-3.9.4-bin.tar.gz && ln -fs $(pwd)/apache-maven-3.9.4/bin/mvn $local/bin/mvn
RUN wget https://github.com/openshift/source-to-image/releases/download/v1.4.0/source-to-image-v1.4.0-d3544c7e-linux-amd64.tar.gz && tar xzf source-to-image-v1.4.0-d3544c7e-linux-amd64.tar.gz && mv s2i sti /usr/local/bin && rm -f source-to-image-v1.4.0-d3544c7e-linux-amd64.tar.gz
#RUN dnf -y remove golang-bin
COPY --chown=1001:0 --chmod=660 hooks.json /usr/local/etc/
COPY --chown=1001:0 --chmod=550 run-cmd /usr/local/bin/
COPY --chown=1001:0 --chmod=550 docker-server.sh /usr/local/bin/
RUN mkdir /usr/local/etc/logs && chmod 770 /usr/local/etc/logs

USER 1001
EXPOSE 9000
CMD /opt/ol/wlp/bin/server run defaultServer
ENTRYPOINT ["/usr/local/bin/docker-server.sh"]

