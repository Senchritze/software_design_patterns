public class Espresso extends Beverage {
    public Espresso() { super("Espresso"); }

    @Override
    public double cost() { return 15.0; } // beans + water

    @Override public double price() { return 45.0; }
}
