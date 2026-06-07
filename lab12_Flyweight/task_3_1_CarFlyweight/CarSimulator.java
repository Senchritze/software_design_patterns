import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

public class CarSimulator {
    private static final List<Car> vehicles = new ArrayList<>();
    private static final CarBuilder carBuilder = new CarBuilder();
    private static final Random RANDOM = new Random();
    private static final int MAX_CARS = 10;

    public static void main(String[] args) {
        ScheduledExecutorService executor = Executors.newScheduledThreadPool(1);
        AtomicInteger createdCars = new AtomicInteger(0);

        Runnable createVehicles = () -> {
            int number = createdCars.incrementAndGet();
            createRandomCar(number);

            if (number >= MAX_CARS) {
                executor.shutdown();
                printSummary();
            }
        };

        executor.scheduleAtFixedRate(createVehicles, 0, 1, TimeUnit.SECONDS);

        try {
            executor.awaitTermination(MAX_CARS + 2L, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }

    private static void createRandomCar(int number) {
        Engine.Fuel fuel = Engine.Fuel.values()[RANDOM.nextInt(Engine.Fuel.values().length)];
        Wheel.Material material = Wheel.Material.values()[RANDOM.nextInt(Wheel.Material.values().length)];
        int wheelDiameter = 17 + RANDOM.nextInt(3);
        int power = (11 + RANDOM.nextInt(5)) * 10;
        Car.CarColor color = Car.CarColor.values()[RANDOM.nextInt(Car.CarColor.values().length)];
        Car.Type type = Car.Type.values()[RANDOM.nextInt(Car.Type.values().length)];

        Car car = carBuilder
                .reset()
                .setType(type)
                .setCarColor(color)
                .setEngine(EngineFlyweightFactory.getEngine(power, fuel))
                .setWheel(WheelFlyweightFactory.getWheel(material, wheelDiameter))
                .build();

        vehicles.add(car);

        System.out.println("Creating car #" + number);
        car.showInfo();
        System.out.println("Engine flyweights: " + EngineFlyweightFactory.getCachedObjectsCount());
        System.out.println("Wheel flyweights: " + WheelFlyweightFactory.getCachedObjectsCount());
        System.out.println();
    }

    private static void printSummary() {
        System.out.println("Simulation finished.");
        System.out.println("Cars created: " + vehicles.size());
        System.out.println("Unique engines in cache: " + EngineFlyweightFactory.getCachedObjectsCount());
        System.out.println("Unique wheels in cache: " + WheelFlyweightFactory.getCachedObjectsCount());
    }
}
