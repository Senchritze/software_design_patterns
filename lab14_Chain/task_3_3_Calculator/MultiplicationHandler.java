public class MultiplicationHandler extends AbstractCalculationHandler {
    @Override
    protected boolean canHandle(Operation operation) {
        return operation == Operation.MULTIPLY;
    }

    @Override
    protected double calculate(CalculationRequest request) {
        return request.getFirstNumber()*request.getSecondNumber();
    }
}
