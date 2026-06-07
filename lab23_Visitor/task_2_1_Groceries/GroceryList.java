import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class GroceryList implements Groceries {
    private final List<Groceries> groceries = new ArrayList<>();

    public GroceryList() {
    }

    public void add(Groceries grocery) {
        groceries.add(grocery);
    }

    public List<Groceries> getGroceries() {
        return Collections.unmodifiableList(groceries);
    }

    @Override
    public <T> T accept(GroceryVisitor<T> visitor) {
        return visitor.visitGroceryList(this);
    }

    @Override
    public double getPrice() {
        return Groceries.super.getPrice();
    }
}
