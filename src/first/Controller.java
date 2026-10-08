package first;

public class Controller {

  Service service;

  public Controller(Service service) {
    this.service = service;
  }

  public void setService(Service service) {
    this.service = service;
  }

  public void run() {
    service.doService();
  }
  
}
