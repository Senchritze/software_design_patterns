public class TeaCreator extends BeverageCreator {
    @Override
    public Beverage createBeverage() {
      return new Tea();
    }
}