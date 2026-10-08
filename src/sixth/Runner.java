package sixth;

import org.springframework.boot.SpringApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = { "sixth" })
public class Runner {
  public static void main(String[] args) {

    ApplicationContext context = SpringApplication.run(Runner.class, args);

    Controller app = context.getBean(Controller.class);
    app.run();
  }

}