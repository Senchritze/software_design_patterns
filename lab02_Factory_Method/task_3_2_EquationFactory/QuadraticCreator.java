public class QuadraticCreator extends EquationCreator {
    @Override public Equation createEquation(double[] coeffs) {
        return new QuadraticEquation(coeffs[0], coeffs[1], coeffs[2]);
    }
}
