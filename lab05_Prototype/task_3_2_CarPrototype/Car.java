public class Car implements Cloneable {
    public enum CarColor { White, Black, Red, Grey }
    public enum Type { Sedan, Hatchback, SUV }

    private final Type type;
    private final CarColor carColor;
    private final Engine engine;
    private final Wheel wheel;
    private final Transmission transmission;

    public Car(Type type, CarColor carColor,
               Engine engine, Wheel wheel, Transmission transmission) {
        this.type = type;
        this.carColor = carColor;
        this.engine = engine;
        this.wheel = wheel;
        this.transmission = transmission;
    }

    @Override
    public Car clone() {
        try {
            Car copy = (Car) super.clone();
            // fields are final — reconstruct with cloned components
            return new Car(
                    this.type,
                    this.carColor,
                    this.engine.clone(),
                    this.wheel.clone(),
                    this.transmission.clone()
            );
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    @Override
    public String toString() {
        return "Car:\n"
                + "  type         = " + type + "\n"
                + "  carColor     = " + carColor + "\n"
                + "  engine       = " + engine + "\n"
                + "  wheel        = " + wheel + "\n"
                + "  transmission = " + transmission + "\n";
    }
}