package fifth;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Runner {
  public static void main(String[] args)  {

    ApplicationContext context = 
        new AnnotationConfigApplicationContext(SpringConfiguration.class);

    Controller controller = (Controller) context.getBean("controller");
    controller.run();

  }
}
