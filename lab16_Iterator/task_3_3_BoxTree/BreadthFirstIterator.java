import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Queue;

public class BreadthFirstIterator implements Iterator<Component> {
    private final Queue<Component> queue = new ArrayDeque<>();

    public BreadthFirstIterator(Box root) {
        queue.add(root);
    }

    @Override
    public boolean hasNext() {
        return !queue.isEmpty();
    }

    @Override
    public Component next() {
        if (!hasNext()) {
            throw new NoSuchElementException("No more components");
        }

        Component current = queue.remove();

        if (current instanceof Box) {
            for (Component child : ((Box) current).getChildren()) {
                queue.add(child);
            }
        }

        return current;
    }
}
