public class Engine {
    public enum Fuel { Petrol, Diesel, Electric }

    private final int power;
    private final Fuel fuel;

    public Engine(int power, Fuel fuel) {
      this.power = power;
      this.fuel = fuel;
    }

    @Override
    public String toString() {
        return "Engine{power=" + power + "hp, fuel=" + fuel + "}";
    }
}
