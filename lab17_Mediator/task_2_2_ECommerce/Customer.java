public class Customer {
    private final String address;
    private final Mediator mediator;

    public Customer(String address, Mediator mediator) {
        this.address = address;
        this.mediator = mediator;
    }

    public String getAddress() {
        return address;
    }

    public void buy(String item, int quantity) {
        mediator.placeOrder(item, quantity, this);
    }

    public void receiveMessage(String message) {
        System.out.println("Customer: " + message);
    }
}
