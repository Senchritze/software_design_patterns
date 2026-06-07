import java.util.Locale;

public class Client {
    public static void main(String[] args) {
        Triangle triangle = new Triangle(3, 3, 3);
        TriangleHistory history = new TriangleHistory(triangle);

        String[] edges = {
                "b",
                "c",
                "a",
                "duplicateA",
                "c",
                "b",
                "halfA"
        };

        float[] values = {
                4,
                5,
                4,
                1,
                6,
                3,
                1
        };

        System.out.println("Initial: " + triangle + ", square = " + format(triangle.square()));

        for (int index = 0; index < edges.length; index++) {
            OperationType type = OperationType.fromCode(edges[index]);
            Command command = new TriangleCommand(triangle, type, values[index]);
            boolean success = history.executeCommand(command);

            System.out.println("Command: " + command.getName() + (success ? " -> applied" : " -> rejected"));
            System.out.println("Current: " + triangle + ", square = " + format(triangle.square()));
        }

        System.out.println();
        history.printHistory();

        TriangleMemento smallest = history.findSmallestSquareMemento();
        System.out.println();
        System.out.println("State with smallest square: " + history.findSmallestSquareLabel());
        System.out.println("Smallest state: " + smallest + ", square = " + format(smallest.square()));

        history.restoreSmallestSquareState();
        System.out.println("After restore: " + triangle + ", square = " + format(triangle.square()));
    }

    private static String format(float value) {
        return String.format(Locale.US, "%.2f", value);
    }
}
