public class Calculator {
    private final CalculationHandler chain;

    public Calculator() {
        CalculationHandler add = new AdditionHandler();
        CalculationHandler sub = new SubtractionHandler();
        CalculationHandler mul = new MultiplicationHandler();
        CalculationHandler div = new DivisionHandler();

        add.setNext(sub)
           .setNext(mul)
           .setNext(div);

        this.chain = add;
    }

    public double calculate(double firstNumber, double secondNumber, Operation operation) {
        return chain.handle(new CalculationRequest(firstNumber, secondNumber, operation));
    }

    public double calculate(CalculationRequest request) {
        return chain.handle(request);
    }
}
