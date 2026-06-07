public interface Groceries {
    <T> T accept(GroceryVisitor<T> visitor);

    default double getPrice() {
        return accept(new PriceVisitor());
    }
}
