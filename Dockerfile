FROM openjdk:17
ADD target/logisticsApplication-0.0.1-SNAPSHOT.jar app.jar
VOLUME /simple.app
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "/app.jar"]
