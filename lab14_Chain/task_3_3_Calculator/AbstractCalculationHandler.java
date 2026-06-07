public abstract class AbstractCalculationHandler implements CalculationHandler {
    private CalculationHandler nextHandler;

    @Override
    public CalculationHandler setNext(CalculationHandler nextHandler) {
        this.nextHandler = nextHandler;
        return nextHandler;
    }

    @Override
    public double handle(CalculationRequest request) {
        if (canHandle(request.getOperation())) {
            return calculate(request);
        }

        if (nextHandler != null) {
            return nextHandler.handle(request);
        }

        throw new IllegalArgumentException("Unsupported operation: " + request.getOperation());
    }

    protected abstract boolean canHandle(Operation operation);

    protected abstract double calculate(CalculationRequest request);
}
