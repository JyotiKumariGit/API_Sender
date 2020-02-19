FROM openjdk:8
ADD target/api-file.jar api-file.jar
EXPOSE 8085
ENTRYPOINT ["java", "-jar", "api-file.jar"]