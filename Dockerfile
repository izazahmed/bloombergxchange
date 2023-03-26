FROM alpine:latest
RUN apk update && apk upgrade && apk add openjdk11-jre-headless
VOLUME /tmp
EXPOSE 8080
ARG JAR_FILE=target/bloomberg-xchange-scheduler-0.0.1-SNAPSHOT.jar
COPY ${JAR_FILE} app.jar

ARG WSDL=src/main/resources/wsdl/dlws.wsdl
COPY ${WSDL} dlws.wsdl

ARG CERT_FILE=src/main/config/DLWSCert.p12
COPY ${CERT_FILE} DLWSCert.p12

ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","-Dspring.profiles.active=k8s", "/app.jar"]
