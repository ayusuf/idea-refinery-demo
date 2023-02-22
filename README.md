Simple little and quick project to setup a demo of a Spring Boot app communicating with Kafka on Docker.

To run Kafka do the following:
'docker-compose up -d'

To create a Docker image of the Spring Boot app run the following:
'./mvnw clean spring-boot:build-image'

To run Spring Boot Docker app do:
'docker run -p 8080:8080 idea-refinery-demo:0.0.1-SNAPSHOT'