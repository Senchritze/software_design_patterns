public class Latte extends Beverage {
    public Latte() { super("Latte"); }

    @Override public double cost() { return 22.0; }

    @Override
    public double price() {
        return 65.0;
    }
}
