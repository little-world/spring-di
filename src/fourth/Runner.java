package fourth;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class Runner {
  public static void main(String[] args)  {

    ApplicationContext context = 
        new ClassPathXmlApplicationContext("fourth/spring-context.xml");

    Controller controller = (Controller) context.getBean("controller");
    controller.run();

  }
}
