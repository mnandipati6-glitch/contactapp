FROM openjdk:17-jdk-slim-bullseye

WORKDIR /app

COPY target/contactapp-0.0.1-SNAPSHOT.jar app.jar

EXPOSE 8080

ENTRYPOINT ["java","-jar","/app/app.jar"]