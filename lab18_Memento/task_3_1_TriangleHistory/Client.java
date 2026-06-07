public class Client {
    private static final String[] EDGES = {
            "b",
            "c",
            "a",
            "c",
            "b"
    };

    private static final float[] VALUES = {
            4f,
            5f,
            4f,
            2f,
            3f
    };

    public static void main(String[] args) {
        runInnerClassVersion();
        runMarkerInterfaceVersion();
        runProtectedVersion();
    }

    private static void runInnerClassVersion() {
        System.out.println("--- Memento with inner class ---");
        Triangle triangle = new Triangle(3, 3, 3);
        TriangleHistory history = new TriangleHistory();

        history.add(triangle);
        printTriangle("Start", triangle);

        for (int i = 0; i < EDGES.length; i++) {
            applyChange(triangle, EDGES[i], VALUES[i]);
            history.add(triangle);
            printTriangle("After " + EDGES[i] + " = " + VALUES[i], triangle);
        }

        triangle.restore(history.getLargestSquareMemento());
        printTriangle("Restored max square", triangle);
        System.out.println();
    }

    private static void runMarkerInterfaceVersion() {
        System.out.println("--- Memento with empty interface ---");
        TriangleMarker triangle = new TriangleMarker(3, 3, 3);
        TriangleMarkerHistory history = new TriangleMarkerHistory();

        history.add(triangle);
        printTriangle("Start", triangle);

        for (int i = 0; i < EDGES.length; i++) {
            applyChange(triangle, EDGES[i], VALUES[i]);
            history.add(triangle);
            printTriangle("After " + EDGES[i] + " = " + VALUES[i], triangle);
        }

        triangle.restore(history.getLargestSquareMemento());
        printTriangle("Restored max square", triangle);
        System.out.println();
    }

    private static void runProtectedVersion() {
        System.out.println("--- Memento with enhanced protection ---");
        TriangleProtected triangle = new TriangleProtected(3, 3, 3);
        TriangleProtectedHistory history = new TriangleProtectedHistory();

        history.add(triangle);
        printTriangle("Start", triangle);

        for (int i = 0; i < EDGES.length; i++) {
            applyChange(triangle, EDGES[i], VALUES[i]);
            history.add(triangle);
            printTriangle("After " + EDGES[i] + " = " + VALUES[i], triangle);
        }

        TriangleProtected.SnapshotView bestState = history.getLargestSquareMemento();
        triangle.restore(bestState);
        printTriangle("Restored max square", triangle);
        System.out.println("Best snapshot info: " + bestState.getStateInfo());
        System.out.println();
    }

    private static void applyChange(Triangle triangle, String edge, float value) {
        switch (edge) {
            case "a":
                triangle.setA(value);
                break;
            case "b":
                triangle.setB(value);
                break;
            case "c":
                triangle.setC(value);
                break;
            default:
                throw new IllegalArgumentException("Unknown edge: " + edge);
        }
    }

    private static void applyChange(TriangleMarker triangle, String edge, float value) {
        switch (edge) {
            case "a": triangle.setA(value); break;
            case "b": triangle.setB(value); break;
            case "c": triangle.setC(value); break;
            default:
                throw new IllegalArgumentException("Unknown edge: " + edge);
        }
    }

    private static void applyChange(TriangleProtected triangle, String edge, float value) {
        switch (edge) {
            case "a":
                triangle.setA(value);
                break;
            case "b":
                triangle.setB(value);
                break;
            case "c":
                triangle.setC(value);
                break;
            default:
                throw new IllegalArgumentException("Unknown edge: " + edge);
        }
    }

    private static void printTriangle(String label, Triangle triangle) {
        System.out.printf("%s -> %s, perimeter = %.2f, square = %.2f%n",
                label, triangle, triangle.perimeter(), triangle.square());
    }

    private static void printTriangle(String label, TriangleMarker triangle) {
        System.out.printf("%s -> %s, perimeter = %.2f, square = %.2f%n",
                label, triangle, triangle.perimeter(), triangle.square());
    }

    private static void printTriangle(String label, TriangleProtected triangle) {
        System.out.printf("%s -> %s, perimeter = %.2f, square = %.2f%n",
                label, triangle, triangle.perimeter(), triangle.square());
    }
}
