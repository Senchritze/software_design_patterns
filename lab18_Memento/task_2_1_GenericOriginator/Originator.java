import java.util.ArrayDeque;
import java.util.Deque;

public class Originator {
    private String state = "";
    private final Deque<Memento> history = new ArrayDeque<>();

    public void printState() {
        System.out.println(state);
    }

    public void updateState(String toUpdate) {
        history.push(new Memento(state));
        this.state += toUpdate;
    }

    public void undo() {
        if (!history.isEmpty()) {
            Memento memento = history.pop();
            this.state = memento.getSavedState();
        }
    }

    private class Memento {
        private final String savedState;

        private Memento(String savedState) {
            this.savedState = savedState;
        }

        private String getSavedState() {
            return savedState;
        }
    }
}
