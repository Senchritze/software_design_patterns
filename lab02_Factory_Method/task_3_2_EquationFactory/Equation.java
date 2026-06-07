import java.util.List;

public abstract class Equation {
    protected final double[] coeffs;

    public Equation(double[] coeffs) {
      this.coeffs = coeffs;
    }

    public abstract List<Double> solve();
    public abstract String toExpression();

    @Override
    public String toString() {
        return toExpression() + " = 0";
    }
}
