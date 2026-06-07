public class Car {
    public enum CarColor {
        White,
        Black,
        Red,
        Grey
    }

    public enum Type {
        Sedan,
        Hatchback,
        SUV
    }

    private final Type type;
    private final CarColor carColor;
    private final Engine engine;
    private final Wheel wheel;

    public Car(Type type, CarColor carColor, Engine engine, Wheel wheel) {
        if (type == null || carColor == null || engine == null || wheel == null) {
            throw new IllegalArgumentException("Car parameters must not be null");
        }
        this.type = type;
        this.carColor = carColor;
        this.engine = engine;
        this.wheel = wheel;
    }

    public void showInfo() {
        System.out.println("Car:\n" +
                "type=" + type +
                ",\ncarColor=" + carColor +
                ",\nengine=" + engine +
                " [id=" + System.identityHashCode(engine) + "]" +
                ",\nwheel=" + wheel +
                " [id=" + System.identityHashCode(wheel) + "]\n");
    }

    @Override
    public String toString() {
        return "Car{" +
                "type=" + type +
                ", carColor=" + carColor +
                ", engine=" + engine +
                ", wheel=" + wheel +
                '}';
    }
}
