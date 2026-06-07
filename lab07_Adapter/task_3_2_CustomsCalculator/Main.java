import com.vehiclecalculator.CarCalculator;
import com.vehiclecalculator.TruckCalculator;
import com.vehiclecalculator.Vehicle;

import com.vehiclecalculator.VehicleCalculator;

public class Main {
    public static void main(String[] args) {

        System.out.println("American Auction (USD):");
        Vehicle vehicle = new Vehicle(5, "Audi", 0.2f, 100_000);


        VehicleCalculator calculator = new CarCalculator();
        calculator.setVehicle(vehicle);
        System.out.println("Price: " + calculator.calculatePrice());


        System.out.println("\nUkrainian Customs (UAH):");

        Auto car = new Auto("Audi", 5, false, 100_000);
        Customs customsCar = new VehicleCalculatorAdapter(new CarCalculator());

        System.out.println("Vehicle: " + car);
        System.out.printf("Vehicle price: %.2f UAH%n", customsCar.vehiclePrice(car));



        
        System.out.printf("Customs tax:   %.2f UAH%n", customsCar.tax(car));

        System.out.printf("Total cost:    %.2f UAH%n", customsCar.totalCost(car));

        System.out.println();

        Auto truck = new Auto("Volvo FH", 7, true, 500_000);
        Customs customsTruck = new VehicleCalculatorAdapter(new TruckCalculator());

        System.out.println("Vehicle: " + truck);
        System.out.printf("Vehicle price: %.2f UAH%n", customsTruck.vehiclePrice(truck));
        System.out.printf("Customs tax:   %.2f UAH%n", customsTruck.tax(truck));
        System.out.printf("Total cost:    %.2f UAH%n", customsTruck.totalCost(truck));
    }
}




