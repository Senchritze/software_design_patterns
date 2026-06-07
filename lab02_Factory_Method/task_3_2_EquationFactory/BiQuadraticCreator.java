public class BiQuadraticCreator extends EquationCreator {
    @Override
    public Equation createEquation(double[] coeffs) {
        return new BiQuadraticEquation(coeffs[0], coeffs[2], coeffs[4]); // indices 0,2,4
    }
}
