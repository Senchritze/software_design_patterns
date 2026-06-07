public class Tea extends Beverage {
    public Tea() { super("Tea"); }

    @Override
    public double cost() {
      return 8.0;
    }

    @Override public double price() { return 30.0; }
}
