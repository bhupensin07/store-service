FROM openjdk:17
EXPOSE 8080
ADD target/store-repo.jar store-repo.jar
ENTRYPOINT ["java","-jar","/store-repo.jar"]
