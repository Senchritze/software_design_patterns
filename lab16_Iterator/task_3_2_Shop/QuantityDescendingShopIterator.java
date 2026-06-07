import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

public class QuantityDescendingShopIterator implements Iterator<ShopItem> {
    private final List<ShopItem> sortedItems;
    private int index = 0;

    public QuantityDescendingShopIterator(Collection<ShopItem> items) {
        sortedItems = new ArrayList<>(items);
        sortedItems.sort(
                Comparator.comparingInt(ShopItem::getQuantity)
                        .reversed()
                        .thenComparing(ShopItem::getName)
        );
    }

    @Override
    public boolean hasNext() {
        return index < sortedItems.size();
    }

    @Override
    public ShopItem next() {
        if (!hasNext()) {
            throw new NoSuchElementException("No more items");
        }
        return sortedItems.get(index++);
    }
}
