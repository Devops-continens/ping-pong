FROM openjdk:8-jre-alpine
MAINTAINER devops-continens
COPY target/*.jar /opt/app.jar
ENTRYPOINT ["/usr/bin/java"]
CMD ["-jar", "/opt/app.jar"]
EXPOSE 8080