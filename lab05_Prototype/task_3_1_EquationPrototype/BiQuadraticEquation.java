import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// ax⁴ + bx² + c = 0
public class BiQuadraticEquation extends Equation {
    private final double a, b, c;

    public BiQuadraticEquation(double a, double b, double c) {
        super(new double[]{a, 0, b, 0, c});
        this.a = a; this.b = b; this.c = c;
    }

    @Override
    public List<Double> solve() {
        QuadraticEquation sub = new QuadraticEquation(a, b, c);
        List<Double> tSolutions = sub.solve();
        if (tSolutions == null) return null;

        List<Double> result = new ArrayList<>();
        for (double t : tSolutions) {
            if (t > 0) {
                double sqrtT = Math.sqrt(t);
                result.add(-sqrtT);
                result.add(sqrtT);
            } else if (t == 0) {
                result.add(0.0);
            }
        }
        Collections.sort(result);
        return result;
    }

    @Override
    public String toExpression() {
        return a + "x\u2074 + " + b + "x\u00b2 + " + c;
    }

    @Override
    public BiQuadraticEquation clone() {
        return (BiQuadraticEquation) super.clone();
    }
}