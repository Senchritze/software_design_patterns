import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

public class AscendingIntegerIterator implements Iterator<Integer> {
    private final List<Integer> sortedNumbers;
    private int index;

    public AscendingIntegerIterator(CollectionIntegers collection) {
        this.sortedNumbers = new ArrayList<>(collection.getArray());
        Collections.sort(this.sortedNumbers);
        index = 0;
    }

    @Override public boolean hasNext() {
        return index < sortedNumbers.size();
    }

    @Override
    public Integer next() {
        if (!hasNext()) {
            throw new NoSuchElementException("No more elements");
        }
        return sortedNumbers.get(index++);
    }
}