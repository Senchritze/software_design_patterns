public class AdditionHandler extends AbstractCalculationHandler {
    @Override public boolean canHandle(Operation operation) {
        return operation == Operation.ADD;
    }

    @Override public double calculate(CalculationRequest request) {
        return request.getFirstNumber() + request.getSecondNumber();
    }
}
