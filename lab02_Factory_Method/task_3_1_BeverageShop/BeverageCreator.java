public abstract class BeverageCreator {

    public abstract Beverage createBeverage();

    public Beverage orderBeverage() {
        Beverage bev = createBeverage();
        System.out.println("  Preparing: " + bev.getName() + "...");
        return bev;
    }
}
