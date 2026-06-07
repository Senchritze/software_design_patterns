import java.util.ArrayList;
import java.util.List;

public class TransportPark {
    private final List<Bus> buses = new ArrayList<>();
    private final List<Tram> trams = new ArrayList<>();
    private final List<Trolleybus> trolleybuses = new ArrayList<>();
    private final TransportFactory factory;

    public TransportPark(TransportFactory factory) {
        this.factory = factory;
    }

    public void purchaseFleet(int numBuses, int numTrams, int numTrolleybuses) {
        for (int i=0; i < numBuses; i++) buses.add(factory.createBus());
        for (int i=0; i < numTrams; i++) trams.add(factory.createTram());
        for (int i=0; i < numTrolleybuses; i++)
            trolleybuses.add(factory.createTrolleybus());
    }

    public long calculateTotalCost(long distanceKm) {
        long total = 0;
        for (Bus b : buses) total += b.getCost() + b.getUsageCost()*distanceKm;
        for (Tram t : trams) total += t.getCost() + t.getUsageCost()*distanceKm;
        for (Trolleybus tr : trolleybuses) total += tr.getCost() + tr.getUsageCost()*distanceKm;
        return total;
    }

    public void printReport(long distanceKm) {
        long total = calculateTotalCost(distanceKm);
        System.out.printf("%-10s | Buses: %2d | Trams: %2d | Trolleybuses: %2d | Distance: %,d km | Total cost: %,d UAH%n",
                factory.getManufacturerName(), buses.size(), trams.size(), trolleybuses.size(),
                distanceKm, total);
    }
}
