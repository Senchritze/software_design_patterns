public class CarBuilder {
    private Car.Type type = Car.Type.Sedan;
    private Car.CarColor color = Car.CarColor.White;
    private Engine engine = new EngineBuilder().build();
    private Wheel wheel = new WheelBuilder().build();

    private Transmission transmission = new TransmissionBuilder().build();

    public CarBuilder setType(Car.Type type) { this.type = type; return this; }


    public CarBuilder setColor(Car.CarColor color) { this.color = color; return this; }

    public CarBuilder setEngine(Engine engine) {
      this.engine = engine; return this;

    }

    public CarBuilder setWheel(Wheel wheel) { this.wheel = wheel; return this; }

    public CarBuilder setTransmission(Transmission tr) {
        this.transmission = tr;
        return this;
    }

    public Car build() {
        return new Car(type, color, engine, wheel, transmission);
    }
}



