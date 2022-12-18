FROM openjdk:11
EXPOSE 8080
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["nohup","java","-jar","/app.jar","&"]