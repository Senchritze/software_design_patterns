public interface CalculationHandler {
    CalculationHandler setNext(CalculationHandler nextHandler);

    double handle(CalculationRequest request);
}
