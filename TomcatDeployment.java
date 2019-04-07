------------------------------------------------------------------------------------------------------------------------------------------------
configuration in tomcat
-------------------------------------------------------------------------------------------------------------------------------------------------
package com.tutorialspoint.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

@SpringBootApplication
public class DemoApplication  extends SpringBootServletInitializer {
   @Override
   protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
      return application.sources(DemoApplication.class);
   }
   public static void main(String[] args) {
      SpringApplication.run(DemoApplication.class, args);
   }
}

Setting Main Class
In Spring Boot, we need to mention the main class that should start in the build file. For this purpose, you can use the following pieces of code −

For Maven, add the start class in pom.xml properties as shown below −

<start-class>com.tutorialspoint.demo.DemoApplication</start-class>


Update packaging JAR into WAR
We have to update the packaging JAR into WAR using the following pieces of code −

For Maven, add the packaging as WAR in pom.xml as shown below −

<packaging>war</packaging>


package com.tutorialspoint.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DemoApplication  extends SpringBootServletInitializer {
   @Override
   protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
      return application.sources(DemoApplication.class);
   }
   public static void main(String[] args) {
      SpringApplication.run(DemoApplication.class, args);
   }

   @RequestMapping(value = "/")
   public String hello() {
      return "Hello World from Tomcat";
   }
}
