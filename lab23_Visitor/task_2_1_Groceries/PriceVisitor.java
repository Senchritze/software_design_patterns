public class PriceVisitor implements GroceryVisitor<Double> {
    @Override public Double visitBread(Bread bread) {
        return bread.getBasePrice();
    }

    @Override
    public Double visitMilk(Milk milk) {
        return milk.getBasePrice();
    }

    @Override
    public Double visitGroceryList(GroceryList groceryList) {
        double total = 0.0;
        for (Groceries grocery : groceryList.getGroceries()) {
            total += grocery.accept(this);
        }
        return total;
    }
}
