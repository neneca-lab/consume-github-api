FROM openjdk:21

WORKDIR /app

COPY target/github-api-0.0.1-SNAPSHOT.jar github-api-0.0.1-SNAPSHOT.jar

EXPOSE 8080

ENTRYPOINT [ "java", "-jar", "github-api-0.0.1-SNAPSHOT.jar" ]