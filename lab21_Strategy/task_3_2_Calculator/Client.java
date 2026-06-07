public class Client {
    public static void main(String[] args) {
        Calculator calculator = new Calculator(new SubtractStrategy());
        calculator.calculate(12, 13);

        calculator.setStrategy(new AddStrategy());
        calculator.calculate(12, 13);

        calculator.setStrategy(new MultiplyStrategy());
        calculator.calculate(12, 13);
    }
}
