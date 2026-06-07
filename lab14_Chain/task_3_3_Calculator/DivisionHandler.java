public class DivisionHandler extends AbstractCalculationHandler {
    @Override
    protected boolean canHandle(Operation operation) {
        return operation == Operation.DIVIDE;
    }

    @Override
    protected double calculate(CalculationRequest request) {
        if (request.getSecondNumber() == 0) {
            throw new ArithmeticException("Division by zero is not allowed");
        }

        return request.getFirstNumber() / request.getSecondNumber();
    }
}
