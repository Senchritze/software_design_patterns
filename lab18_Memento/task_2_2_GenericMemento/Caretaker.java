import java.util.ArrayDeque;
import java.util.Deque;

public class Caretaker {
    private final Deque<Memento> history = new ArrayDeque<>();

    public void backup(Originator originator) {
        history.push(originator.save());
    }

    public void undo(Originator originator) {
        if (history.isEmpty()) {
            return;
        }

        Memento current = history.pop();
        if (history.isEmpty()) {
            history.push(current);
            originator.restore(current);
            return;
        }

        originator.restore(history.peek());
    }
}
