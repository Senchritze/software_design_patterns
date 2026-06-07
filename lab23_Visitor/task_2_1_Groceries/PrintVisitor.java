public class PrintVisitor implements GroceryVisitor<String> {
    @Override
    public String visitBread(Bread bread) {
        return String.format("Bread - %.2f", bread.getBasePrice());
    }

    @Override
    public String visitMilk(Milk milk) {
        return String.format("Milk - %.2f", milk.getBasePrice());
    }

    @Override
    public String visitGroceryList(GroceryList groceryList) {
        String lineSeparator = System.lineSeparator();
        StringBuilder builder = new StringBuilder();
        builder.append("Grocery list:").append(lineSeparator);

        int index = 1;
        for (Groceries grocery : groceryList.getGroceries()) {
            builder.append(index)
                   .append(". ")
                   .append(grocery.accept(this))
                   .append(lineSeparator);
            index++;
        }

        builder.append(String.format("Total price: %.2f", groceryList.getPrice()))
               .append(lineSeparator)
               .append(String.format("Total tax: %.2f", groceryList.accept(new TaxVisitor())));

        return builder.toString();
    }
}
