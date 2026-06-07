public class EngineBuilder {
    private int power = 100;
    private int torque = 150;
    private Engine.Fuel fuel = Engine.Fuel.Petrol;
    private float volume = 1.6f;

    public EngineBuilder setPower(int power) { this.power = power; return this; }
    public EngineBuilder setTorque(int torque) { this.torque = torque; return this; }

    public EngineBuilder setFuel(Engine.Fuel fuel) {
      this.fuel = fuel; return this;
    }

    public EngineBuilder setVolume(float v) { this.volume = v; return this; }

    public Engine build() { return new Engine(power, torque, fuel, volume); }
}