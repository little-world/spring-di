package third;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfiguration {

  @Bean
  public Service service(){
     return new Service();
  }
  
  @Bean 
  public Controller controller(){
    Controller controller = new Controller();
    controller.setService(service());
     return controller;
  }
  

   
}