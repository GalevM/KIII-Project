FROM gradle:8.5-jdk21 AS build

WORKDIR /home/app

COPY . .

RUN gradle build --no-daemon

FROM eclipse-temurin:21-jdk

WORKDIR /app

COPY --from=build /home/app/build/libs/*.jar app.jar

EXPOSE 8080

CMD ["java", "-jar", "app.jar"]