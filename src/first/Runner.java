package first;

public class Runner {
  public static void main(String[] args) {

    Service service = new Service();
    Controller controller = new Controller(service);
    controller.run();

  }
}
