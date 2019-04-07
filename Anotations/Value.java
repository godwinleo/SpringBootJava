Value


@Value("${property_key_name}")


Look at the following example that shows the syntax to read the spring.application.name property value in Java variable by using @Value annotation.

@Value("${spring.application.name}")



import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DemoApplication {
   
   @Value("${spring.application.name}")
   private String name; //this is how they are assigning the value to the variable

   public static void main(String[] args) {
      SpringApplication.run(DemoApplication.class, args);
   }
   @RequestMapping(value = "/")
   public String name() {
      return name;
   }
}  


Note − If the property is not found while running the application, Spring Boot throws the Illegal Argument exception as Could not resolve placeholder 'spring.application.name' in value "${spring.application.name}".

To resolve the placeholder issue, we can set the default value for the property using thr syntax given below −

@Value("${property_key_name:default_value}")

@Value("${spring.application.name:demoservice}")