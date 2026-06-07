public class Transmission {
    public enum TransmissionType { Manual, Automatic, CVT }

    private final TransmissionType type;
    private final int gears;

    public Transmission(TransmissionType type, int gears) {
      this.type = type;
      this.gears = gears;
    }

    @Override
    public String toString() {
        return "Transmission{type=" + type + ", gears=" + gears + "}";
    }
}
