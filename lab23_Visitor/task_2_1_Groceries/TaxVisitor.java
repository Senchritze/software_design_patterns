public class TaxVisitor implements GroceryVisitor<Double> {
    private static final double BREAD_TAX_RATE = 0.10;
    private static final double MILK_TAX_RATE = 0.15;

    @Override
    public Double visitBread(Bread bread) {
        return bread.getBasePrice() * BREAD_TAX_RATE;
    }

    @Override public Double visitMilk(Milk milk) {
        return milk.getBasePrice() * MILK_TAX_RATE;
    }

    @Override
    public Double visitGroceryList(GroceryList groceryList) {
        double totalTax = 0.0;
        for (Groceries grocery : groceryList.getGroceries()) {
            totalTax += grocery.accept(this);
        }
        return totalTax;
    }
}
