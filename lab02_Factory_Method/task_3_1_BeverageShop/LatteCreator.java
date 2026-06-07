public class LatteCreator extends BeverageCreator {
    @Override
    public Beverage createBeverage() {
        return new Latte();
    }
}