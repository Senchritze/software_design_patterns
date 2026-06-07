import java.util.EnumMap;
import java.util.Map;

public class CoffeeShop {
    private final String name;
    private double totalRevenue = 0;
    private double totalCost = 0;
    private int ordersCount = 0;

    private final Map<BeverageType, BeverageCreator> creators = new EnumMap<>(BeverageType.class);

    public CoffeeShop(String name) {
        this.name = name;
        creators.put(BeverageType.ESPRESSO, new EspressoCreator());
        creators.put(BeverageType.AMERICANO, new AmericanoCreator());
        creators.put(BeverageType.CAPPUCCINO, new CappuccinoCreator());
        creators.put(BeverageType.LATTE, new LatteCreator());
        creators.put(BeverageType.HOT_CHOCOLATE, new HotChocolateCreator());
        creators.put(BeverageType.TEA, new TeaCreator());
    }

    public Beverage order(BeverageType type) {
        BeverageCreator creator = creators.get(type);
        if (creator == null) throw new IllegalArgumentException("Unknown type: " + type);
        Beverage bev = creator.orderBeverage();
        totalRevenue += bev.price();
        totalCost += bev.cost();
        ordersCount++;
        return bev;
    }

    public void printReport() {
        System.out.println("\n╔══════════════════════════════════╗");
        System.out.println("║  " + name + " — Financial Report  ║");
        System.out.println("╚══════════════════════════════════╝");
        System.out.printf("  Orders:   %d%n", ordersCount);
        System.out.printf("  Revenue:  %.2f UAH%n", totalRevenue);
        System.out.printf("  Costs:    %.2f UAH%n", totalCost);
        double profit = totalRevenue - totalCost;
        System.out.printf("  Profit:   %.2f UAH%n", profit);
    }
}
