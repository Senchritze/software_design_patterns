import java.util.NoSuchElementException;

public class ConcreteIterator implements Iterator {
    private final ConcreteAggregate aggregate;
    private int currentIndex;

    public ConcreteIterator(ConcreteAggregate aggregate) {
        this.aggregate = aggregate;
        this.currentIndex = 0;
    }

    @Override
    public void first() {
        currentIndex = 0;
    }

    @Override
    public void next() {
        if (currentIndex < aggregate.size()) {
            currentIndex++;
        }
    }

    @Override
    public boolean isDone() {
        return currentIndex >= aggregate.size();
    }

    @Override
    public Element currentItem() {
        if (isDone()) {
            throw new NoSuchElementException("No current element");
        }
        return aggregate.get(currentIndex);
    }
}
