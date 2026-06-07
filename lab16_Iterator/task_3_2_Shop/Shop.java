import java.util.HashMap;
import java.util.Iterator;
import java.util.Objects;

public class Shop implements Iterable<ShopItem> {
    private final HashMap<String, ShopItem> items = new HashMap<>();

    public void putItem(ShopItem item) {
        Objects.requireNonNull(item, "item must not be null");
        items.put(item.getName(), item);
    }

    public Iterator<ShopItem> alphabeticalIterator() {
        return new AlphabeticalShopIterator(items.values());
    }

    public Iterator<ShopItem> quantityDescendingIterator() {
        return new QuantityDescendingShopIterator(items.values());
    }

    public Iterable<ShopItem> quantityDescendingIterable() {
        return this::quantityDescendingIterator;
    }

    @Override
    public Iterator<ShopItem> iterator() {
        return alphabeticalIterator();
    }
}
