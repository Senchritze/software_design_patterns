public class Client {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        CalculationRequest[] requests = {
                new CalculationRequest(10, 5, Operation.ADD),
                new CalculationRequest(10, 5, Operation.SUBTRACT),
                new CalculationRequest(10, 5, Operation.MULTIPLY),
                new CalculationRequest(10, 5, Operation.DIVIDE)
        };

        System.out.println("Calculator demo:");

        for (CalculationRequest request : requests) {
            double result = calculator.calculate(request);
            System.out.println(request + " = " + result);
        }

        try {
            CalculationRequest invalidRequest = new CalculationRequest(10, 0, Operation.DIVIDE);
            System.out.println(invalidRequest + " = " + calculator.calculate(invalidRequest));
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
