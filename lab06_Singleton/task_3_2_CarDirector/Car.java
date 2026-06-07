public class Car {
    public enum CarColor { White, Black, Red, Grey, Blue }
    public enum Type { Sedan, Hatchback, SUV }

    private final Type type;
    private final CarColor carColor;

    private final Engine engine;
    private final Wheel wheel;


    private final Transmission transmission;

    public Car(Type type, CarColor carColor, Engine engine,
               Wheel wheel, Transmission transmission) {
        this.type = type;
        this.carColor = carColor;

        
        this.engine = engine;
        this.wheel = wheel;

        this.transmission = transmission;
    }

    @Override
    public String toString() {
        return "Car:\n"
                + "  type         = " + type + "\n"
                + "  color        = " + carColor + "\n"
                + "  engine       = " + engine + "\n"
                + "  wheel        = " + wheel + "\n"
                + "  transmission = " + transmission + "\n";
    }
}