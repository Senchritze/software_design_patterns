public abstract class Trolleybus {
    protected final long cost;
    protected final long usageCost;

    protected Trolleybus(long cost, long usageCost) {
      this.cost = cost;
      this.usageCost = usageCost;
    }

    public long getCost() { return cost; }

    public long getUsageCost() { return usageCost; }

    public void goByContactNetwork() { System.out.println(getClass().getSimpleName() + " runs!"); }
}
