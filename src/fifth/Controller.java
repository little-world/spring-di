package fifth;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Controller {

  @Autowired
  Service service;

  public void run() {
    service.doService();
  }
  
}
