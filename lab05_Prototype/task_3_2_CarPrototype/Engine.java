public class Engine implements Cloneable {
    public enum Fuel { Petrol, Diesel, Electric }

    final int power;
    final int torque;
    final Fuel fuel;
    final float volume;

    public Engine(int power, int torque, Fuel fuel, float volume) {
        this.power = power;
        this.torque = torque;
        this.fuel = fuel;
        this.volume = volume;
    }

    @Override
    public Engine clone() {
        try {
            return (Engine) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    @Override
    public String toString() {
        return "Engine{power=" + power + ", torque=" + torque
                + ", fuel=" + fuel + ", volume=" + volume + "}";
    }
}