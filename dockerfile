FROM eclipse-temurin:17.0.11_9-jdk-jammy
RUN mkdir -p /opt/app
WORKDIR /opt/app
COPY target/dingdong-0.0.1-SNAPSHOT.jar dingdong.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "dingdong.jar"]

