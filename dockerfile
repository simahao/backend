FROM eclipse-temurin:17.0.11_9-jdk-jammy
RUN mkdir /opt/app
COPY target/dingdong-0.0.1-SNAPSHOT.jar /opt/app/dingdong.jar
EXPOSE 8080
CMD ["java", "-jar", "/opt/app/dingdong.jar"]

