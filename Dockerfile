FROM amazoncorretto:22-alpine-jdk
RUN addgroup -S nutri && adduser -S nutri -G nutri
USER nutri:nutri
ENTRYPOINT ["java","-jar","app.jar"]