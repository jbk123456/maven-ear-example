#!/usr/bin/env bash
set -euo pipefail

HOST="heise.de"
PORT="443"
STORE="heise-truststore.jks"
STOREPASS="changeit"

rm -f "$STORE" cert-*.pem chain.pem

# Capture all certificates from the server
openssl s_client -servername "$HOST" -connect "$HOST:$PORT" -showcerts </dev/null 2>/dev/null \
| awk '
  /-----BEGIN CERTIFICATE-----/{n++; out=sprintf("cert-%02d.pem", n)}
  { if (out) print > out }
  /-----END CERTIFICATE-----/{out=""}
'

# Import each cert into the keystore
for pem in cert-*.pem; do
  alias="${HOST}-$(basename "$pem" .pem)"
  keytool -importcert -noprompt -alias "$alias" \
    -file "$pem" \
    -keystore "$STORE" \
    -storepass "$STOREPASS"
done