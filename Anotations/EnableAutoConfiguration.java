iSpring Boot Auto Configuration automatically configures your Spring application based on the JAR 
dependencies you added in the project. For example, if MySQL database is on your class path, but 
you have not configured any database connection, then Spring Boot auto configures an in-memory database.

For this purpose, you need to add @EnableAutoConfiguration annotation or @SpringBootApplication

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;

@EnableAutoConfiguration
public class DemoApplication {
   public static void main(String[] args) {
      SpringApplication.run(DemoApplication.class, args);
   }