import java.util.ArrayDeque;
import java.util.Deque;

public class History {
    private final Deque<Originator.Memento> history = new ArrayDeque<>();

    public void push(Originator.Memento memento) {
        history.push(memento);
    }

    public Originator.Memento pop() {
        if (history.isEmpty()) {
            return null;
        }
        return history.pop();
    }

    public boolean isEmpty() {
        return history.isEmpty();
    }
}