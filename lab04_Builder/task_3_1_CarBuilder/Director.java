public class Director {
    private final EngineBuilder engineBuilder = new EngineBuilder();
    private final WheelBuilder wheelBuilder = new WheelBuilder();
    private final TransmissionBuilder transmissionBuilder = new TransmissionBuilder();
    private final CarBuilder carBuilder = new CarBuilder();

    public Car buildEconomySedan() {
        Engine engine = engineBuilder
                .setPower(105).setTorque(140)

                .setFuel(Engine.Fuel.Petrol).setVolume(1.4f).build();
        Wheel wheel = wheelBuilder
                .setMaterial(Wheel.Material.Steel).setDiameter(15).build();
        Transmission tr = transmissionBuilder

                .setType(Transmission.TransmissionType.Manual).setGears(5).build();
        return carBuilder
                .setType(Car.Type.Sedan).setColor(Car.CarColor.White)
                .setEngine(engine).setWheel(wheel).setTransmission(tr).build();
    }

    // 2.0L petrol, alloy 17", auto 6-speed
    public Car buildBusinessSedan() {
        Engine engine = engineBuilder
                .setPower(200).setTorque(280)
                .setFuel(Engine.Fuel.Petrol).setVolume(2.0f).build();
        Wheel wheel = wheelBuilder.setMaterial(Wheel.Material.Alloy).setDiameter(17).build();
        Transmission tr = transmissionBuilder


                .setType(Transmission.TransmissionType.Automatic).setGears(6).build();
        return carBuilder
                .setType(Car.Type.Sedan).setColor(Car.CarColor.Black)
                .setEngine(engine).setWheel(wheel).setTransmission(tr).build();
    }

    public Car buildOffRoadSUV() {
        Engine e = engineBuilder.setPower(250).setTorque(500)
                .setFuel(Engine.Fuel.Diesel).setVolume(3.0f).build();

        Wheel w = wheelBuilder.setMaterial(Wheel.Material.Forged).setDiameter(20).build();
        Transmission tr = transmissionBuilder

                .setType(Transmission.TransmissionType.Automatic).setGears(8).build();
        return carBuilder.setType(Car.Type.SUV).setColor(Car.CarColor.Grey)
                .setEngine(e).setWheel(w).setTransmission(tr).build();
    }

    public Car buildElectricHatchback() {
        Engine engine = engineBuilder
                .setPower(180).setTorque(350)
                .setFuel(Engine.Fuel.Electric).setVolume(0.0f).build();
        Wheel wheel = wheelBuilder
                .setMaterial(Wheel.Material.Alloy).setDiameter(18).build();
        Transmission tr = transmissionBuilder
                .setType(Transmission.TransmissionType.CVT).setGears(1).build();
        return carBuilder
                .setType(Car.Type.Hatchback).setColor(Car.CarColor.Blue)
                
                .setEngine(engine).setWheel(wheel).setTransmission(tr).build();

    }
}







