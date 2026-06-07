public class CarBuilder {
    private Car.Type type;
    private Car.CarColor carColor;
    private Engine engine;
    private Wheel wheel;

    public CarBuilder() {
        reset();
    }

    public CarBuilder setType(Car.Type type) {
        this.type = type;
        return this;
    }

    public CarBuilder setCarColor(Car.CarColor carColor) {
        this.carColor = carColor;
        return this;
    }

    public CarBuilder setEngine(Engine engine) {
        this.engine = engine;
        return this;
    }

    public CarBuilder setWheel(Wheel wheel) {
        this.wheel = wheel;
        return this;
    }

    public CarBuilder reset() {
        type = Car.Type.Sedan;
        carColor = Car.CarColor.White;
        engine = EngineFlyweightFactory.getEngine(105, Engine.Fuel.Petrol);
        wheel = WheelFlyweightFactory.getWheel(17);
        return this;
    }

    public Car build() {
        if (type == null || carColor == null || engine == null || wheel == null) {
            throw new IllegalArgumentException("All car fields must be set");
        }
        return new Car(type, carColor, engine, wheel);
    }
}
