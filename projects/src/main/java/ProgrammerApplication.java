

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class ProgrammerApplication extends SpringBootServletInitializer{
	   @Override
   protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
      return application.sources(ProgrammerApplication.class);
   }
   public static void main(String[] args) {
      SpringApplication.run(ProgrammerApplication.class, args);
   }

   @RequestMapping(value = "/")
   public String hello() {
      return "Hello World from Tomcat";
   }
}
