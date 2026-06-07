public interface GroceryVisitor<T> {
    T visitBread(Bread bread);
    T visitMilk(Milk milk);
    T visitGroceryList(GroceryList groceryList);
}
