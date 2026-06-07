public class Main {
    public static void main(String[] args) {
        Director director = new Director();

        System.out.println("Car Manufacturing — Builder Pattern");

        Car economySedan = director.buildEconomySedan();
        System.out.println("Economy Sedan:");

        System.out.println(economySedan);




        Car businessSedan = director.buildBusinessSedan();
        System.out.println("Business Sedan:");
        System.out.println(businessSedan);


        Car suv = director.buildOffRoadSUV();
        System.out.println("-- Off-Road SUV --");
        System.out.println(suv);


        Car electric = director.buildElectricHatchback();
        System.out.println("Electric Hatchback:");
        System.out.println(electric);



        System.out.println("Custom build:");
        Car custom = new CarBuilder()
                .setType(Car.Type.Hatchback)
                .setColor(Car.CarColor.Red)
                .setEngine(new EngineBuilder()
                        .setPower(130).setTorque(180)
                        .setFuel(Engine.Fuel.Petrol).setVolume(1.6f).build())
                .setWheel(new WheelBuilder()
                        .setMaterial(Wheel.Material.Alloy).setDiameter(16).build())
                .setTransmission(new TransmissionBuilder()
                        .setType(Transmission.TransmissionType.Manual).setGears(6).build())
                .build();
        System.out.println(custom);
    }
}




