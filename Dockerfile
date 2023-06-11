FROM eclipse-temurin:17-jdk-alpine
VOLUME /spring-boot-tmp
COPY target/*.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]