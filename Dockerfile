FROM openjdk:8u111-jdk-alpine
VOLUME /tmp
ADD /target/material-requisition-demo-0.0.1-SNAPSHOT.jar material-requisition-demo.jar
ENTRYPOINT ["java","-jar","/material-requisition-demo.jar"]