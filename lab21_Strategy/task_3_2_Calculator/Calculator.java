public class Calculator {
    private OperationStrategy strategy;

    public Calculator() {
    }

    public Calculator(OperationStrategy strategy) {
        this.strategy = strategy;
    }

    public void setStrategy(OperationStrategy strategy) {
        this.strategy = strategy;
    }

    public int calculate(int a, int b) {
        if (strategy == null) {
            throw new IllegalStateException("Strategy is not set.");
        }

        int result = strategy.execute(a, b);
        System.out.printf("%d %s %d = %d%n", a, strategy.getSymbol(), b, result);
        return result;
    }
}
