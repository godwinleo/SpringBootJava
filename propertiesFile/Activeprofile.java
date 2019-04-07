Spring Boot Active Profile
Spring Boot supports different properties based on the Spring active profile. 
For example, we can keep two separate files for development and production to run the Spring Boot application.


application.properties
	server.port = 8080
	spring.application.name = demoservice


application-dev.properties
	server.port = 9090
	spring.application.name = demoservice

application-prod.properties
	server.port = 4431
	spring.application.name = demoservice



java -jar demo.snalshot.jar --spring.profiles.active=dev
java -jar demo.snalshot.jar --spring.profiles.active=prod




Spring active profile for application.yml

spring:
   application:
      name: demoservice
server:
   port: 8080

---
spring:
   profiles: dev
   application:
      name: demoservice
server:
   port: 9090

---
spring: 
   profiles: prod
   application:
      name: demoservice
server: 
   port: 4431