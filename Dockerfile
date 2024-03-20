FROM openjdk:17-jdk-slim
WORKDIR /exam
COPY target/exam-0.0.1-SNAPSHOT.jar exam.jar
EXPOSE 8080
CMD ["java", "-jar", "exam.jar"]