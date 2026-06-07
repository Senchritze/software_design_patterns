public class Driver {
  public void receiveMessage(String message) {
    System.out.println("Driver: " + message);
  }

  public void deliver(String item, int quantity, Customer customer) {
    System.out.println(quantity + " " + item + " out for delivery to " + customer.getAddress());
  }
}
