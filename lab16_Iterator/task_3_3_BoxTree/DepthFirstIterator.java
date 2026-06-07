import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

public class DepthFirstIterator implements Iterator<Component> {
    private final Deque<Component> stack = new ArrayDeque<>();

    public DepthFirstIterator(Box root) {
        stack.push(root);
    }

    @Override
    public boolean hasNext() {
        return !stack.isEmpty();
    }

    @Override
    public Component next() {
        if (!hasNext()) {
            throw new NoSuchElementException("No more components");
        }

        Component current = stack.pop();

        if (current instanceof Box) {
            List<Component> children = ((Box) current).getChildren();
            for (int i = children.size() - 1; i >= 0; i--) {
                stack.push(children.get(i));
            }
        }

        return current;
    }
}
