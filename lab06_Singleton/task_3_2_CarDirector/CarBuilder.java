public class CarBuilder {
    private Car.Type type = Car.Type.Sedan;
    private Car.CarColor color = Car.CarColor.White;
    private Engine engine = new EngineBuilder().build();
    private Wheel wheel = new WheelBuilder().build();
    private Transmission transmission = new TransmissionBuilder().build();

    public CarBuilder setType(Car.Type t) { this.type = t; return this; }
    public CarBuilder setColor(Car.CarColor c) { this.color = c; return this; }
    public CarBuilder setEngine(Engine e) { this.engine = e; return this; }
    public CarBuilder setWheel(Wheel w) { this.wheel = w; return this; }

    public CarBuilder setTransmission(Transmission t) {
      this.transmission = t; return this;
    }

    public Car build() { return new Car(type, color, engine, wheel, transmission); }
}