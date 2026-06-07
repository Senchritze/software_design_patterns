public class Cappuccino extends Beverage {
    public Cappuccino() { super("Cappuccino"); }

    @Override
    public double cost() {
      return 20.0; // milk + foam adds up
    }

    @Override public double price() { return 60.0; }
}
