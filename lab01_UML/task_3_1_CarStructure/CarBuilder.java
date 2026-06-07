public class CarBuilder {
    private Car.Type type;


    private Car.CarColor carColor;
    private Engine engine;

    private Wheel wheel;


    public CarBuilder reset() {
        type = Car.Type.Sedan;
        carColor = Car.CarColor.White;
        engine = new Engine(105, Engine.Fuel.Petrol);
        wheel = new Wheel(17);
        return this;
    }

    public CarBuilder setType(Car.Type t) { this.type = t; return this; }

    public CarBuilder setCarColor(Car.CarColor color) {
      this.carColor = color;
      return this;
    }



    public CarBuilder setEngine(Engine engine) { this.engine = engine; return this; }

    public CarBuilder setWheel(Wheel w) {
      this.wheel = w; return this;
    }


    public Car build() {
        if (type == null || carColor == null || engine == null || wheel == null)
            throw new IllegalArgumentException("All car fields must be set!");
        return new Car(type, carColor, engine, wheel);
    }
}


