import java.io.*;
import java.util.*;

public class EquationAnalyzer {

    public void analyze(String filename) {
        System.out.println("\n--- " + filename + " ---");

        List<Equation> equations;
        try {
            equations = readEquations(filename);
        } catch (IOException e) {
            System.out.println("  ERROR: Cannot open file " + filename);
            return;
        }

        System.out.println("  Total equations read: " + equations.size());

        List<Equation> noSolution = new ArrayList<>();
        List<Equation> oneSolution = new ArrayList<>();
        List<Equation> twoSolutions = new ArrayList<>();
        List<Equation> threeSolutions = new ArrayList<>();
        List<Equation> fourSolutions = new ArrayList<>();
        List<Equation> infiniteSolutions = new ArrayList<>();

        for (Equation eq : equations) {
            List<Double> sols = eq.solve();
            if (sols == null) infiniteSolutions.add(eq);
            else switch (sols.size()) {
                case 0 -> noSolution.add(eq);
                case 1 -> oneSolution.add(eq);
                case 2 -> twoSolutions.add(eq);
                case 3 -> threeSolutions.add(eq);
                case 4 -> fourSolutions.add(eq);
            }
        }

        printGroup("No solutions", noSolution);
        printGroup("1 solution", oneSolution);
        printGroup("2 solutions", twoSolutions);
        printGroup("3 solutions", threeSolutions);
        printGroup("4 solutions", fourSolutions);
        printGroup("Infinite solutions", infiniteSolutions);

        if (!oneSolution.isEmpty()) {
            Equation minEq = null, maxEq = null;
            double minVal = Double.MAX_VALUE, maxVal = -Double.MAX_VALUE;

            for (Equation eq : oneSolution) {
                double sol = eq.solve().get(0);
                if (sol < minVal) { minVal = sol; minEq = eq; }
                if (sol > maxVal) { maxVal = sol; maxEq = eq; }
            }
            System.out.printf("%n  Smallest single solution: %10.4f  from: %s%n", minVal, minEq);
            System.out.printf("  Largest single solution:  %10.4f  from: %s%n", maxVal, maxEq);
        }
    }

    private void printGroup(String label, List<Equation> group) {
        System.out.printf("  %-22s: %d equations%n", label, group.size());
        group.stream().limit(2).forEach(eq ->
            System.out.printf("      %s  →  solutions: %s%n", eq, eq.solve()));
    }

    private List<Equation> readEquations(String filename) throws IOException {
        List<Equation> result = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = br.readLine()) != null) {
                line = line.trim();
                if (line.isEmpty()) continue;
                String[] parts = line.split("\\s+");
                if (parts.length != 2 && parts.length != 3 && parts.length != 5) continue;
                try {
                    double[] coeffs = new double[parts.length];
                    for (int i=0; i < parts.length; i++)
                        coeffs[i] = Double.parseDouble(parts[i]);
                    result.add(EquationFactory.create(coeffs));
                } catch (NumberFormatException | IllegalArgumentException ignored) {}
            }
        }
        return result;
    }
}
