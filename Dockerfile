FROM java:8-jdk-alpine

COPY ./target/employeeservices-0.0.1-SNAPSHOT.jar /usr/app/

WORKDIR /usr/app

RUN sh -c 'touch employeeservices.jar'

ENTRYPOINT ["java","-jar","employeeservices.jar"]

