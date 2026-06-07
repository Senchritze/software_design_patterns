public abstract class CondimentDecorator extends Beverage {
    protected final Beverage beverage;

    public CondimentDecorator(Beverage beverage) {
        this.beverage = beverage;
    }
}
