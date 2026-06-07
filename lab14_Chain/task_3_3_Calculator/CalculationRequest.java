public class CalculationRequest {
    private final double firstNumber;
    private final double secondNumber;
    private final Operation operation;

    public CalculationRequest(double firstNumber, double secondNumber, Operation operation) {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
        this.operation = operation;
    }

    public double getFirstNumber() {
        return firstNumber;
    }

    public double getSecondNumber() {
        return secondNumber;
    }

    public Operation getOperation() {
        return operation;
    }

    @Override
    public String toString() {
        return firstNumber + " " + operation.getSymbol() + " " + secondNumber;
    }
}
