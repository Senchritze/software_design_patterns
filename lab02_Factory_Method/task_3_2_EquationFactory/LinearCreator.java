public class LinearCreator extends EquationCreator {
    @Override
    public Equation createEquation(double[] c) {
        return new LinearEquation(c[0], c[1]);
    }
}
