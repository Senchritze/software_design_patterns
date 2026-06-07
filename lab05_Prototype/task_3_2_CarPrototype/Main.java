public class Main {
    public static void main(String[] args) {
        System.out.println("Prototype Pattern — Car\n");

        Engine engine = new Engine(105, 140, Engine.Fuel.Petrol, 1.4f);
        Wheel wheel = new Wheel(Wheel.Material.Steel, 14);
        Transmission trans = new Transmission(Transmission.TransmissionType.Manual, 5);
        Car original = new Car(Car.Type.Sedan, Car.CarColor.White, engine, wheel, trans);

        System.out.println("Original:");
        System.out.println(original);

        Car copy = original.clone();
        System.out.println("-- Clone --");
        System.out.println(copy);

        System.out.println("deep copy check:");
        System.out.println("Same Car?    " + (original == copy));
        System.out.println("Same Engine? " + (engine == copy.engine));
        System.out.println("Same Wheel?  " + (wheel == copy.wheel));

        Engine engineCopy = engine.clone();
        System.out.println("\nEngine clone:");
        System.out.println("  original: " + engine);
        System.out.println("  clone:    " + engineCopy);
        System.out.println("  same obj? " + (engine == engineCopy));

        Wheel wheelCopy = wheel.clone();
        System.out.println("\nWheel clone:");
        System.out.println("  original: " + wheel);
        System.out.println("  clone:    " + wheelCopy);
        System.out.println("  same obj? " + (wheel == wheelCopy));
    }
}