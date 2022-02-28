FROM openjdk:17-alpine

WORKDIR /app
COPY ./build/libs/*.jar .
ENTRYPOINT ["java","-jar","producto-service-0.0.1-SNAPSHOT.jar"]