import java.util.List;

public class Main {
    public static void main(String[] args) {
        final int N = 365;

        List<CoffeeMachineFactory> factories = List.of(
                new JuraFactory(),
                new DeLonghiFactory(),
                new BoschFactory()
        );

        System.out.println("Coffee Shop Analysis — " + N + " days");
        System.out.println("--------------------------------------------");

        CoffeeMachineFactory bestFactory = null;
        double bestProfit = Double.NEGATIVE_INFINITY;

        for (CoffeeMachineFactory f : factories) {
            CoffeeShop shop = new CoffeeShop(f);
            shop.printReport(N);
            double profit = shop.calculateNetProfit(N);
            if (profit > bestProfit) {
                bestProfit = profit;
                bestFactory = f;
            }
        }

        String winner = bestFactory != null ? bestFactory.getManufacturerName() : "N/A";
        System.out.printf("%nBest choice: %s  (net profit: %.0f UAH in %d days)%n",
                winner, bestProfit, N);
    }
}
