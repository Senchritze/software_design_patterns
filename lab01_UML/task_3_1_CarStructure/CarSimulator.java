import java.util.ArrayList;
import java.util.Random;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class CarSimulator {
    private static final ArrayList<Car> vehicles = new ArrayList<>();
    private static final CarBuilder carBuilder = new CarBuilder();

    public static void main(String[] args) {
        Runnable createVehicle = CarSimulator::createRandomCar;
        ScheduledExecutorService executor = Executors.newScheduledThreadPool(1);
        executor.scheduleAtFixedRate(createVehicle, 0, 1, TimeUnit.SECONDS);
    }


    private static void createRandomCar() {
        Random rnd = new Random();
        Engine.Fuel fuel = Engine.Fuel.values()[rnd.nextInt(3)];
        int wheelDiameter=17 + rnd.nextInt(3);
        int power = 100 + rnd.nextInt(5)*10;
        Car.CarColor color = Car.CarColor.values()[rnd.nextInt(5)];

        Car car = carBuilder.reset()
            .setCarColor(color)
            .setEngine(new Engine(power,fuel))
            .setWheel(new Wheel(wheelDiameter))
            .build();

        System.out.print("Creating car: ");
        car.showInfo();
        vehicles.add(car);
    }
}
