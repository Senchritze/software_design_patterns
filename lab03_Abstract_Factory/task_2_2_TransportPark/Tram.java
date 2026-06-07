public abstract class Tram {
    protected final long cost;
    protected final long usageCost;

    protected Tram(long cost, long usageCost) {
        this.cost = cost;
        this.usageCost = usageCost;
    }

    public long getCost() { return cost; }
    public long getUsageCost() { return usageCost; }

    public void goByRails() { System.out.println(getClass().getSimpleName() + " runs!"); }
}
