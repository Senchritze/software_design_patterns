public abstract class Bus {
    protected final long cost;
    protected final long usageCost; // UAH per km

    protected Bus(long cost, long usageCost) {
      this.cost = cost;
      this.usageCost = usageCost;
    }

    public long getCost() { return cost; }
    public long getUsageCost() { return usageCost; }

    public void goByWay() { System.out.println(getClass().getSimpleName() + " runs!"); }
}
