import java.util.List;

public class CoffeeShop {
    private final CoffeeMachineFactory factory;

    private static final int ESPRESSO_PER_DAY = 30;
    private static final int CAPPUCCINO_PER_DAY = 20;
    private static final int LATTE_PER_DAY = 15;

    public CoffeeShop(CoffeeMachineFactory factory) {
        this.factory = factory;
    }

    public double calculateDailyRevenue() {
        Espresso e = factory.createEspresso();
        Cappuccino c = factory.createCappuccino();
        Latte l = factory.createLatte();

        return e.price()*ESPRESSO_PER_DAY
             + c.price()*CAPPUCCINO_PER_DAY
             
             + l.price()*LATTE_PER_DAY;
    }

    public double calculateDailyIngredientCost() {
        Espresso e = factory.createEspresso();
        Cappuccino c = factory.createCappuccino();
        Latte l = factory.createLatte();

        return e.cost()*ESPRESSO_PER_DAY
             + c.cost()*CAPPUCCINO_PER_DAY
             + l.cost()*LATTE_PER_DAY;
    }

    public double calculateNetProfit(int days) {
        double daily = calculateDailyRevenue() - calculateDailyIngredientCost()
                     - factory.getDailyMaintenanceCost();
        return daily*days - factory.getMachineCost();
    }

    public void printReport(int days) {
        double revenue = calculateDailyRevenue();
        double ingCost = calculateDailyIngredientCost();
        double maint = factory.getDailyMaintenanceCost();
        double dailyNet = revenue - ingCost - maint;
        double netProfit = calculateNetProfit(days);
        System.out.printf( "│  Manufacturer: %-30s│%n", factory.getManufacturerName());

        List<Beverage> beverages = List.of(
                factory.createEspresso(), factory.createCappuccino(), factory.createLatte());
        for (Beverage b : beverages)

            System.out.printf("│  %s│%n", b);

        System.out.println("├──────────────────────────────────────────────┤");
        System.out.printf("│  Machine cost:        %10.0f UAH          │%n", factory.getMachineCost());
        System.out.printf("│  Daily maintenance:   %10.0f UAH/day       │%n", maint);
        System.out.printf("│  Daily revenue:       %10.0f UAH          │%n", revenue);


        System.out.printf("│  Daily ingredient:    %10.0f UAH          │%n", ingCost);

        System.out.printf("│  Daily net profit:    %10.0f UAH          │%n", dailyNet);
        System.out.printf("│  NET PROFIT (%4d d): %10.0f UAH          │%n", days, netProfit);
        System.out.println("└──────────────────────────────────────────────┘");
    }
}
