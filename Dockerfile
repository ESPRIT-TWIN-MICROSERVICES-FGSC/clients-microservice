FROM java:8
EXPOSE 8084
ADD /target/clients-microservice-0.0.1-SNAPSHOT.jar docker-client.jar
ENTRYPOINT ["java","-jar","docker-client.jar"]