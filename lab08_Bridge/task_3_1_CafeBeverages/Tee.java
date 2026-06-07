public class Tee extends Beverage {
    public Tee(int sugar, BeverageAddition addition, ServingMode servingMode) {
        super(sugar, addition, servingMode);
    }

    @Override
    public void prepare() {
        System.out.println("Put some tee...");
        addition.add(sugar);
    }

    @Override
    public String drinkName() { return "tee"; }

    @Override
    public int baseCost() { return 7; }
}