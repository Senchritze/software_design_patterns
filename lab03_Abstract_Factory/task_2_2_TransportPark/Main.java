import java.util.List;

public class Main {
    public static void main(String[] args) {
        final int A = 10;
        final int T = 5;
        final int Tr = 40;
        final long N = 200_000L;

        List<TransportFactory> factories = List.of(
                new VolvoFactory(),
                new SkodaFactory(),
                new HyundaiFactory()
        );

        System.out.println("Municipal Transport Park Cost Analysis");
        System.out.println("-----------------------------------");

        TransportFactory bestFactory = null;
        long bestCost = Long.MAX_VALUE;

        for (TransportFactory f : factories) {
            TransportPark park = new TransportPark(f);
            park.purchaseFleet(A, T, Tr);
            park.printReport(N);
            long cost = park.calculateTotalCost(N);
            if (cost < bestCost) {
                bestCost = cost;
                bestFactory = f;
            }
        }

        String winner = bestFactory != null ? bestFactory.getManufacturerName() : "N/A";
        System.out.println("-----------------------------------------");
        System.out.printf("Recommendation: %s  (total: %,d UAH)%n", winner, bestCost);
    }
}
