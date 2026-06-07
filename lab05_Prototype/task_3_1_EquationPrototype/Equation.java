import java.util.List;

public abstract class Equation implements Cloneable {
    protected double[] coeffs;

    public Equation(double[] coeffs) {
        this.coeffs = coeffs.clone();
    }

    public abstract List<Double> solve();
    public abstract String toExpression();

    @Override
    public Equation clone() {
        try {
            Equation copy = (Equation) super.clone();
            copy.coeffs = this.coeffs.clone();
            return copy;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    @Override
    public String toString() {
        return toExpression() + " = 0";
    }
}