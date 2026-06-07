import java.util.Collections;
import java.util.List;

// ax² + bx + c = 0
public class QuadraticEquation extends Equation {
    protected final double a, b, c;

    public QuadraticEquation(double a, double b, double c) {
        super(new double[]{a, b, c});
        this.a = a; this.b = b; this.c = c;
    }

    @Override
    public List<Double> solve() {
        if (a == 0) return new LinearEquation(b, c).solve();
        double D = b*b - 4*a*c;
        if (D < 0) return Collections.emptyList();
        if (D == 0) return List.of(-b / (2*a));
        double sqrtD = Math.sqrt(D);
        return List.of((-b - sqrtD) / (2*a), (-b + sqrtD) / (2*a));
    }

    @Override
    public String toExpression() {
        return a + "x\u00b2 + " + b + "x + " + c;
    }

    @Override
    public QuadraticEquation clone() {
        return (QuadraticEquation) super.clone();
    }
}