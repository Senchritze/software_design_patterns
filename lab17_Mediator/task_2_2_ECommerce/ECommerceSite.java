import java.util.HashMap;
import java.util.Map;

public class ECommerceSite implements Mediator {
    private final Driver driver;
    private final Map<String, Integer> stock;

    public ECommerceSite() {
        this.driver = new Driver();
        this.stock = new HashMap<>();
        stock.put("pens", 100);
        stock.put("pencils", 50);
        stock.put("erasers", 75);
    }

    @Override
    public void placeOrder(String item, int quantity, Customer customer) {
        if (quantity <= 0) {
            customer.receiveMessage("Quantity must be greater than zero.");
            return;
        }

        Integer available = stock.get(item);
        if (available == null) {
            customer.receiveMessage("Item \"" + item + "\" is not available.");
            return;
        }

        if (available < quantity) {
            customer.receiveMessage("Not enough " + item + " in stock. Available: " + available + ".");
            return;
        }

        stock.put(item, available - quantity);
        customer.receiveMessage("Order confirmed: " + quantity + " " + item + ".");
        driver.receiveMessage("Prepare delivery for " + quantity + " " + item + ".");
        driver.deliver(item, quantity, customer);
    }
}
