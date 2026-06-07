import com.vehiclecalculator.Vehicle;
import com.vehiclecalculator.VehicleCalculator;

public class VehicleCalculatorAdapter implements Customs {

    private static final float USD_TO_UAH = 41.0f;
    private static final float TAX_RATE = 0.30f; // 10% duty + 20% VAT

    private final VehicleCalculator calculator;

    public VehicleCalculatorAdapter(VehicleCalculator calculator) {
        this.calculator = calculator;
    }

    private Vehicle toVehicle(Auto auto) {
        float damageFactor = auto.isDamaged() ? 0.3f : 0.0f;
        return new Vehicle(auto.getAge(), auto.getModel(), damageFactor, auto.getMileage());
    }

    private float parsePriceUsd(String priceStr) {
        // format: "$12345.67"
        String cleaned = priceStr.replaceAll("[^\\d.]", "");
        return Float.parseFloat(cleaned);
    }

    @Override
    public float vehiclePrice(Auto auto) {
        calculator.setVehicle(toVehicle(auto));
        float priceUsd = parsePriceUsd(calculator.calculatePrice());
        return priceUsd * USD_TO_UAH;
    }

    @Override
    public float tax(Auto auto) {
        return vehiclePrice(auto) * TAX_RATE;
    }

    @Override
    public float totalCost(Auto auto) {
        float price = vehiclePrice(auto);
        return price + price * TAX_RATE;
    }
}