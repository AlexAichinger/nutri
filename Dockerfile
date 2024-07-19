FROM amazoncorretto:22-alpine-jdk
RUN addgroup -S nutri && adduser -S nutri -G nutri
USER nutri:nutri
ARG JAR_FILE=build/libs/*.jar
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar","/app.jar"]