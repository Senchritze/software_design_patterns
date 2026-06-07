public class Chocolate extends Beverage {
    public Chocolate(int sugar, BeverageAddition addition, ServingMode servingMode) {
        super(sugar, addition, servingMode);
    }

    @Override
    public void prepare() {
        System.out.println("Put some cacao...");
        addition.add(sugar);
    }

    @Override public String drinkName() { return "chocolate"; }

    @Override
    public int baseCost() {
        return 15;
    }
}