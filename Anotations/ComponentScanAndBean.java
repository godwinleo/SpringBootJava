The following example provides an idea about Auto wiring the Rest Template object and creating a Bean for the same −

@Bean
public RestTemplate getRestTemplate() {
   return new RestTemplate();
}
The following code shows the code for auto wired Rest Template object and Bean creation object in main Spring Boot Application class file −

package com.tutorialspoint.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class DemoApplication {
@Autowired
   RestTemplate restTemplate;
   
   public static void main(String[] args) {
      SpringApplication.run(DemoApplication.class, args);
   }
   @Bean
   public RestTemplate getRestTemplate() {
      return new RestTemplate();   
   }
}

/*--------------------second example------------------------*/

Component Scan
Spring Boot application scans all the beans and package declarations when the application initializes. 
You need to add the @ComponentScan annotation for your class file to scan your components added in your project.

Observe the following code for a better understanding −

import org.springframework.boot.SpringApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan
public class DemoApplication {
   public static void main(String[] args) {
      SpringApplication.run(DemoApplication.class, args);
   }
}