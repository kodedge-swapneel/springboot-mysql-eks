FROM openjdk:17-jdk-slim
WORKDIR /app
COPY build/libs/springboot-mysql-eks.jar /app
EXPOSE 8080
CMD ["java", "-jar", "springboot-mysql-eks.jar"]
