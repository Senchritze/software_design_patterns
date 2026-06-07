import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Box implements Component {
    private final int id;
    private final List<Component> children = new ArrayList<>();

    public Box(int id) {
        this.id = id;
    }

    public void add(Component component) {
        children.add(component);
    }

    public List<Component> getChildren() {
        return Collections.unmodifiableList(children);
    }

    public Iterator<Component> depthFirstIterator() {
        return new DepthFirstIterator(this);
    }

    public Iterator<Component> breadthFirstIterator() {
        return new BreadthFirstIterator(this);
    }

    @Override
    public void execute() {
        System.out.println(this);
        for (Component child : children) {
            child.execute();
        }
    }

    @Override
    public String toString() {
        return "Box{" +
                "id=" + id +
                ", children=" + children.size() +
                '}';
    }
}
