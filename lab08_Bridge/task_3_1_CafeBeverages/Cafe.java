public class Cafe {
    public static void main(String[] args) {

        ServingMode dineIn = new DineIn();
        ServingMode takeaway = new Takeaway();

        Beverage blackCoffee = new Coffee(3, new BlackAddition(200), dineIn);
        Beverage coffeeWithMilk = new Coffee(3, new MilkAddition(200), takeaway);
        Beverage blackTee = new Tee(0, new BlackAddition(300), dineIn);
        Beverage teeWithMilk = new Tee(2, new MilkAddition(300), takeaway);
        Beverage blackChocolate = new Chocolate(3, new BlackAddition(200), dineIn);
        Beverage milkChocolate = new Chocolate(3, new MilkAddition(200), takeaway);

        beverageInfo(blackCoffee);
        beverageInfo(coffeeWithMilk);
        beverageInfo(blackTee);
        beverageInfo(teeWithMilk);
        beverageInfo(blackChocolate);
        beverageInfo(milkChocolate);
    }

    private static void beverageInfo(Beverage beverage) {
        System.out.println("---");
        beverage.prepare();
        System.out.printf("Cost of beverage: %d grn%n", beverage.cost());
        beverage.drink();
    }
}