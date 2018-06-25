FROM airhacks/payara
COPY ./target/micro.war ${DEPLOYMENT_DIR}
