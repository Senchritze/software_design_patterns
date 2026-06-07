public class Client {
    public static void main(String[] args) {
        GroceryList groceryList = new GroceryList();

        Bread bread1 = new Bread();
        Bread bread2 = new Bread();
        bread2.setPrice(1.30);

        Milk milk = new Milk();
        milk.setPrice(2.50);

        groceryList.add(bread1);
        groceryList.add(bread2);
        groceryList.add(milk);

        PrintVisitor printVisitor = new PrintVisitor();
        TaxVisitor taxVisitor = new TaxVisitor();

        System.out.println(groceryList.accept(printVisitor));
        System.out.println("Total price of grocery list: " + groceryList.getPrice());
        System.out.println("Total tax of grocery list: " + groceryList.accept(taxVisitor));
    }
}
