import java.util.ArrayList;
import java.util.List;

public class ConcreteAggregate implements Aggregate {
    private final List<Element> elements;

    public ConcreteAggregate() {
        this.elements = new ArrayList<>();
    }

    public void add(Element element) {
        elements.add(element);
    }

    public Element get(int index) {
        return elements.get(index);
    }

    public int size() {
        return elements.size();
    }

    @Override
    public Iterator createIterator() {
        return new ConcreteIterator(this);
    }
}
