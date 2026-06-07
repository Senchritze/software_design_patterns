public class Main {
    public static void main(String[] args) {
        System.out.println("Prototype Pattern — Equations\n");

        LinearEquation linear = new LinearEquation(2, 4);
        LinearEquation linearCopy = linear.clone();
        System.out.println("Original: " + linear + "  → " + linear.solve());
        System.out.println("Clone:    " + linearCopy + "  → " + linearCopy.solve());
        System.out.println("Same obj? " + (linear == linearCopy));
        System.out.println();

        QuadraticEquation quadratic = new QuadraticEquation(1, -5, 6);
        QuadraticEquation quadraticCopy = quadratic.clone();
        System.out.println("Original: " + quadratic + "  → " + quadratic.solve());
        System.out.println("Clone:    " + quadraticCopy + "  → " + quadraticCopy.solve());
        System.out.println("Same?     " + (quadratic == quadraticCopy));
        System.out.println();

        BiQuadraticEquation biQuadratic = new BiQuadraticEquation(1, -5, 4);
        BiQuadraticEquation biQuadraticCopy = biQuadratic.clone();
        System.out.println("Original: " + biQuadratic + "  → " + biQuadratic.solve());
        System.out.println("Clone:    " + biQuadraticCopy + "  → " + biQuadraticCopy.solve());
        System.out.println("Same?     " + (biQuadratic == biQuadraticCopy));
        System.out.println();

        // deep copy check
        System.out.println("Coeffs same array? " + (linear.coeffs == linearCopy.coeffs));
    }
}