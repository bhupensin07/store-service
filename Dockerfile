FROM openjdk:17
EXPOSE 8081
ADD target/store-repo.jar store-repo.jar
ENTRYPOINT ["java","-jar","/store-repo.jar"]
#docker run -p 8081:8081 bhupensin07/store-repo