public abstract class Beverage {
    protected final int sugar;

    protected final BeverageAddition addition;
    protected final ServingMode servingMode;



    public Beverage(int sugar, BeverageAddition addition, ServingMode servingMode) {


        this.sugar = sugar;
        this.addition = addition;

        this.servingMode = servingMode;
    }

    public abstract void prepare();
    public abstract String drinkName();
    public abstract int baseCost();

    public void drink() {
        System.out.printf("Drink %s! [%s]%n", drinkName(), servingMode.label());
        servingMode.serve();
    }

    public int cost() {

        return baseCost() + addition.extraCost();
    }
}


