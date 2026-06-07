import java.util.Iterator;

public class ItemSearch {
    private ItemSearch() {
    }

    public static Item findCheapest(Iterator<Component> iterator) {
        Item cheapest = null;

        while (iterator.hasNext()) {
            Component component = iterator.next();
            if (component instanceof Item) {
                Item item = (Item) component;
                if (cheapest == null || item.getValue() < cheapest.getValue()) {
                    cheapest = item;
                }
            }
        }

        return cheapest;
    }

    public static Item findMostExpensive(Iterator<Component> iterator) {
        Item mostExpensive = null;

        while (iterator.hasNext()) {
            Component component = iterator.next();
            if (component instanceof Item) {
                Item item = (Item) component;
                if (mostExpensive == null || item.getValue() > mostExpensive.getValue()) {
                    mostExpensive = item;
                }
            }
        }

        return mostExpensive;
    }
}
