public class AmericanoCreator extends BeverageCreator {
    @Override
    public Beverage createBeverage() {
      return new Americano();
    }
}