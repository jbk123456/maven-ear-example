#!/bin/bash


# Source code provided to S2I is at /tmp/src
LOCAL_SOURCE_DIR=/tmp/src/module-ear
ARTIFACT_DIR=${ARTIFACT_DIR:-target}
SERVER_DIR=/opt/ol/wlp
SERVER_OUT_DIR=$SERVER_DIR/output/defaultServer
SERVER_CNF_DIR=$SERVER_DIR/usr/servers/defaultServer

sc=$(cat $LOCAL_SOURCE_DIR/$ARTIFACT_DIR/src/main/liberty/config/variables/password/ssl) || sc=${password_ssl:-changeid}
lk=$(cat $LOCAL_SOURCE_DIR/$ARTIFACT_DIR/src/main/liberty/config/variables/password/ltpa) || lk=${password_ltpa:-$sc}

umask=002
# create a tlpa key and chmod, so that the java process group (which has a randomized uid) can access it
mkdir -vp $SERVER_CNF_DIR/resources/security
find $SERVER_CNF_DIR/resources -type d -print | xargs chmod g+rwx

rm -vrf $SERVER_OUT_DIR/resources/security $SERVER_CNF_DIR/config/configDropins/defaults/keystore.xml
securityUtility createLTPAKeys       --server=defaultServer --password=$lk
securityUtility createSSLCertificate --server=defaultServer --password=$sc --validity=365
cp -v $SERVER_OUT_DIR/resources/security/ltpa.keys $SERVER_CNF_DIR/resources/security/ltpa.keys && chmod 660 $SERVER_CNF_DIR/resources/security/ltpa.keys
cp -v $SERVER_OUT_DIR/resources/security/key.p12   $SERVER_CNF_DIR/resources/security/key.p12   && chmod 440 $SERVER_CNF_DIR/resources/security/key.p12


# copy files using umask
cp -vr $LOCAL_SOURCE_DIR/$ARTIFACT_DIR/src/main/liberty/config/* $SERVER_CNF_DIR
cp -vr $LOCAL_SOURCE_DIR/$ARTIFACT_DIR/*.ear $SERVER_CNF_DIR/apps

