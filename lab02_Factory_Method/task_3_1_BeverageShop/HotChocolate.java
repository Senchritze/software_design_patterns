public class HotChocolate extends Beverage {
    public HotChocolate() { super("Hot Chocolate"); }

    @Override public double cost()  { return 25.0; }
    @Override public double price() { return 70.0; }
}
