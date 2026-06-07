public class SubtractionHandler extends AbstractCalculationHandler {
    @Override
    protected boolean canHandle(Operation operation) {
        return operation == Operation.SUBTRACT;
    }

    @Override
    protected double calculate(CalculationRequest request) {
      return request.getFirstNumber() - request.getSecondNumber();
    }
}
