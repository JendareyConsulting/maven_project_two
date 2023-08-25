FROM openjdk:8
COPY . .
EXPOSE 8080
ADD target/devops-a23.jar devops-a23.jar
ENTRYPOINT ["java","-jar","/devops-a23.jar"]
