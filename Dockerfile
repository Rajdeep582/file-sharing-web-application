# Use official Java 17 runtime as base image
FROM eclipse-temurin:17-jdk-jammy

# Set working directory inside container
WORKDIR /app

# Copy the built JAR to the container
COPY target/FileSharingApp-0.0.1-SNAPSHOT.jar app.jar

# Copy the .env file into the container
COPY .env .env

# Expose the Spring Boot port
EXPOSE 9090

# Run the Spring Boot application
ENTRYPOINT ["java", "-jar", "app.jar"]