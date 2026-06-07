public class MilkAddition implements BeverageAddition {
    private final int milkVolume; // ml

    public MilkAddition(int milkVolume) {
        this.milkVolume = milkVolume;
    }

    @Override
    public void add(int sugar) {
        System.out.printf("Put some milk: %d ml...%n", milkVolume);
        if (sugar > 0) System.out.printf("Put some sugar: %d pieces...%n", sugar);
    }

    @Override
    public int extraCost() { return milkVolume / 20; }
}