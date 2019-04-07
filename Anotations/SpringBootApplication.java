The entry point of the Spring Boot Application is the class contains 
@SpringBootApplication annotation. This class should have the main method to run the Spring Boot application.
@SpringBootApplication annotation includes Auto- Configuration, Component Scan, and Spring Boot Configuration.

If you added @SpringBootApplication annotation to the class, 
you do not need to add the @EnableAutoConfiguration, @ComponentScan and @SpringBootConfiguration annotation. 
The @SpringBootApplication annotation includes all other annotations.

Observe the following code for a better understanding −

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {
   public static void main(String[] args) {
      SpringApplication.run(DemoApplication.class, args);
   }
}
