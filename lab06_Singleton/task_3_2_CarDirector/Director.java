public class Director {

    private static volatile Director instance;

    private Director() {}

    public static Director getInstance() {
        if (instance == null) {
            synchronized (Director.class) {
                if (instance == null) {
                    instance = new Director();
                }
            }
        }
        return instance;
    }

    private final EngineBuilder engineBuilder = new EngineBuilder();
    private final WheelBuilder wheelBuilder = new WheelBuilder();
    private final TransmissionBuilder transmissionBuilder = new TransmissionBuilder();
    private final CarBuilder carBuilder = new CarBuilder();

    public Car buildEconomySedan() {
        Engine engine = engineBuilder.setPower(105).setTorque(140)
                .setFuel(Engine.Fuel.Petrol).setVolume(1.4f).build();
        Wheel wheel = wheelBuilder.setMaterial(Wheel.Material.Steel).setDiameter(15).build();
        Transmission tr = transmissionBuilder
                .setType(Transmission.TransmissionType.Manual).setGears(5).build();
        return carBuilder.setType(Car.Type.Sedan).setColor(Car.CarColor.White)
                .setEngine(engine).setWheel(wheel).setTransmission(tr).build();
    }

    public Car buildBusinessSedan() {
        Engine e = engineBuilder.setPower(200).setTorque(280)
                .setFuel(Engine.Fuel.Petrol).setVolume(2.0f).build();
        Wheel w = wheelBuilder.setMaterial(Wheel.Material.Alloy).setDiameter(17).build();

        
        Transmission tr = transmissionBuilder
                .setType(Transmission.TransmissionType.Automatic).setGears(6).build();
        return carBuilder.setType(Car.Type.Sedan).setColor(Car.CarColor.Black)
                .setEngine(e).setWheel(w).setTransmission(tr).build();
    }

    public Car buildOffRoadSUV() {
        Engine engine = engineBuilder
                .setPower(250).setTorque(500)
                .setFuel(Engine.Fuel.Diesel).setVolume(3.0f).build();
        Wheel wheel = wheelBuilder.setMaterial(Wheel.Material.Forged).setDiameter(20).build();
        Transmission tr = transmissionBuilder
                .setType(Transmission.TransmissionType.Automatic).setGears(8).build();
        return carBuilder
                .setType(Car.Type.SUV).setColor(Car.CarColor.Grey)
                .setEngine(engine).setWheel(wheel).setTransmission(tr).build();
    }
}