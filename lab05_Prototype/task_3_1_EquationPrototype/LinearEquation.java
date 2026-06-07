import java.util.Collections;
import java.util.List;

// bx + c = 0
public class LinearEquation extends Equation {
    private final double b, c;

    public LinearEquation(double b, double c) {
        super(new double[]{b, c});
        this.b = b; this.c = c;
    }

    @Override
    public List<Double> solve() {
        if (b == 0 && c == 0) return null; // infinite
        if (b == 0) return Collections.emptyList();
        return List.of(-c / b);
    }

    @Override
    public String toExpression() {
        return b + "x + " + c;
    }

    @Override
    public LinearEquation clone() {
        return (LinearEquation) super.clone();
    }
}