package second;

public class Controller {

  Service service;

  public void setService(Service service) {
    this.service = service;
  }
  
  public void run() {
    service.doService();
  }
  
}
