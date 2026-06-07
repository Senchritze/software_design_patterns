public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer(new BankAccountPaymentStrategy());
        customer.makePayment(100);

        customer.setPaymentStrategy(new PayPalPaymentStrategy());
        customer.makePayment(200);
    }
}
