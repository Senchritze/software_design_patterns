import java.util.HashMap;
import java.util.Map;

public class EquationFactory {
    private static final Map<Integer, EquationCreator> creators = new HashMap<>();

    static {
        creators.put(2, new LinearCreator());
        creators.put(3, new QuadraticCreator());
        creators.put(5, new BiQuadraticCreator());
    }

    public static Equation create(double[] coeffs) {
        EquationCreator cr = creators.get(coeffs.length);
        if (cr == null)
            throw new IllegalArgumentException("Cannot create equation from " + coeffs.length + " coeffs");
        return cr.createEquation(coeffs);
    }
}
