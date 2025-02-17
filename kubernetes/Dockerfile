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

USER root
RUN dnf -y install golang-bin
RUN go install github.com/adnanh/webhook@latest
RUN mv ~/go/bin/webhook /usr/local/bin/
RUN dnf -y remove golang-bin
COPY --chown=1001:0  hooks.json /usr/local/etc/
COPY --chown=1001:0 --chmod=551 run-cmd /usr/local/bin/
EXPOSE 9000
ENTRYPOINT ["webhook", "-hooks", "/usr/local/etc/hooks.json", "-verbose"]


