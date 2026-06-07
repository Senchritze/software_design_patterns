public class Customer {
    private PaymentStrategy paymentStrategy;

    public Customer(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
      this.paymentStrategy = paymentStrategy;
    }

    public void makePayment(int amount) {
        if (paymentStrategy == null) {
            System.out.println("Payment strategy is not selected.");
            return;
        }

        paymentStrategy.pay(amount);
    }
}
