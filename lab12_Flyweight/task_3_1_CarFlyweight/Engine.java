public class Engine {
    public enum Fuel {
        Petrol,
        Diesel,
        Electric
    }

    private final int power;
    private final Fuel fuel;

    public Engine(int power, Fuel fuel) {
        if (power <= 0) {
            throw new IllegalArgumentException("Power must be positive");
        }
        if (fuel == null) {
            throw new IllegalArgumentException("Fuel must not be null");
        }
        this.power = power;
        this.fuel = fuel;
    }

    public int getPower() {
        return power;
    }

    public Fuel getFuel() {
        return fuel;
    }

    @Override
    public String toString() {
        return "Engine{" +
                "power=" + power +
                ", fuel=" + fuel +
                '}';
    }
}
