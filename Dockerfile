# ---- Stage 1: Build JAR ----
FROM maven:3.9.4-eclipse-temurin-17 as builder
WORKDIR /app
COPY . .
RUN mvn clean package -DskipTests

# ---- Stage 2: Run app ----
FROM eclipse-temurin:17
WORKDIR /home
COPY --from=builder /app/target/prime-service-0.0.1-SNAPSHOT.jar prime-service.jar
ENTRYPOINT ["java", "-jar", "prime-service.jar"]