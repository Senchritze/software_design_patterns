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
        List<Double> tRoots = sub.solve();

        if (tRoots == null) return null;

        List<Double> roots = new ArrayList<>();
        for (double t : tRoots) {
            if (t > 0) {
                double sqrtT = Math.sqrt(t);
                roots.add(-sqrtT);
                roots.add(sqrtT);
            } else if (t == 0) {
                roots.add(0.0);
            }
        }
        Collections.sort(roots);
        return roots;
    }

    @Override
    public String toExpression() {
        return a + "x\u2074 + " + b + "x\u00b2 + " + c;
    }
}
