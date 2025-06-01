FROM openjdk:17-jdk-alpine
LABEL maintainer="A00822999@tec.mx"
VOLUME /tmp
EXPOSE 8080
ARG JAR_FILE=target/calidad_aire-0.0.1-SNAPSHOT.jar
ADD ${JAR_FILE} calidad_aire-api.jar
ENTRYPOINT ["java", "-Djava.security.edg=file:/dev/./urandom", "-jar", "/calidad_aire-api.jar"]