public class BlackAddition implements BeverageAddition {
    private final int waterVolume; // ml

    public BlackAddition(int waterVolume) {
        this.waterVolume = waterVolume;
    }

    @Override
    public void add(int sugar) {
        System.out.printf("Put some hot water: %d ml...%n", waterVolume);
        if (sugar > 0) System.out.printf("Put some sugar: %d pieces...%n", sugar);
    }

    @Override
    public int extraCost() { return 0; }
}