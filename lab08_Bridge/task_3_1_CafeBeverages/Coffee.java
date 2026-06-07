public class Coffee extends Beverage {
    public Coffee(int sugar, BeverageAddition addition, ServingMode servingMode) {
        super(sugar, addition, servingMode);
    }

    @Override
    public void prepare() {
        System.out.println("Put some coffee...");
        addition.add(sugar);
    }

    @Override public String drinkName() { return "coffee"; }
    @Override public int baseCost() { return 10; }
}