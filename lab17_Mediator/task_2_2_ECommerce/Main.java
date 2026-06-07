public class Main {
    public static void main(String[] args) {
        Mediator site = new ECommerceSite();
        Customer customer = new Customer("123 Sunny Street", site);

        customer.buy("pens", 3);
        customer.buy("pencils", 60);
        customer.buy("erasers", 75);
        customer.buy("markers", 2);
    }
}
