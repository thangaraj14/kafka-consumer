FROM openjdk:11-jdk-slim
EXPOSE 8080
WORKDIR /app
COPY ./build/libs/kafka-load-*.jar app.jar
ENTRYPOINT ["java", "-jar", "app.jar"]
