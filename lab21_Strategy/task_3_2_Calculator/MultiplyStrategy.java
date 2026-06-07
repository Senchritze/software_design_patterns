public class MultiplyStrategy implements OperationStrategy {
    @Override
    public int execute(int a, int b) {
      return a * b;
    }

    @Override
    public String getSymbol() {
        return "*";
    }
}
