package second;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class Runner {
  public static void main(String[] args)  {

    ApplicationContext context = 
        new ClassPathXmlApplicationContext("second/spring-context.xml");

    // retrieve configured instance
    Controller controller = (Controller) context.getBean("controller");
    controller.run();

  }
}
