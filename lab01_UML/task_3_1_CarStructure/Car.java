public class Car {
    public enum CarColor { White, Black, Red, Grey, Blue }
    public enum Type { Sedan, Hatchback, SUV }

    private final Type type;
    private final CarColor carColor;
    private final Engine engine;
    private final Wheel wheel;

    public Car(Type type, CarColor carColor, Engine engine, Wheel wheel) {
      this.type = type;
      this.carColor = carColor;
      this.engine = engine;
      this.wheel = wheel;
    }


    public void showInfo() {
        System.out.println("Car: type=" + type + ", color=" + carColor
                + ", " + engine + ", " + wheel);
    }
}
