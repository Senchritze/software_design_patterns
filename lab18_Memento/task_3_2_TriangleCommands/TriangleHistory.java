import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class TriangleHistory {
    private final Triangle triangle;
    private final List<TriangleMemento> history;
    private final List<String> labels;

    public TriangleHistory(Triangle triangle) {
        this.triangle = triangle;
        this.history = new ArrayList<>();
        this.labels = new ArrayList<>();
        saveState("initial");
    }

    public boolean executeCommand(Command command) {
        boolean success = command.execute();
        if (success) {
            saveState(command.getName());
        }
        return success;
    }

    public TriangleMemento findSmallestSquareMemento() {
        return history.get(findSmallestSquareIndex());
    }

    public String findSmallestSquareLabel() {
        return labels.get(findSmallestSquareIndex());
    }

    public void restoreSmallestSquareState() {
        triangle.restore(findSmallestSquareMemento());
    }

    public void printHistory() {
        System.out.println("Saved states:");
        for (int i = 0; i < history.size(); i++) {
            TriangleMemento memento = history.get(i);
            System.out.println((i + 1) + ". " + labels.get(i) + " -> " + memento + ", square = " + format(memento.square()));
        }
    }

    private void saveState(String label) {
        history.add(triangle.createMemento());
        labels.add(label);
    }

    private int findSmallestSquareIndex() {
        int bestIndex = 0;
        for (int i = 1; i < history.size(); i++) {
            if (history.get(i).square() < history.get(bestIndex).square()) {
                bestIndex = i;
            }
        }
        return bestIndex;
    }

    private String format(float value) {
        return String.format(Locale.US, "%.2f", value);
    }
}
