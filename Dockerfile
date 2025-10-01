# Build | JDK 21
FROM gradle:8.14.3-jdk21 AS build
COPY --chown=gradle:gradle . /app
WORKDIR /app
RUN gradle bootJar --no-daemon

# Runtime
FROM eclipse-temurin:21-jdk
WORKDIR /app
COPY --from=build /app/build/libs/*.jar utr-voy.jar
EXPOSE 7777
ENTRYPOINT ["java", "-Dspring.profiles.active=prod","-jar","utr-voy.jar"]
