public class TransmissionBuilder {
    private Transmission.TransmissionType type = Transmission.TransmissionType.Manual;
    private int gears = 5;

    public TransmissionBuilder setType(Transmission.TransmissionType type) {
        this.type = type; return this;
    }

    public TransmissionBuilder setGears(int n) { this.gears = n; return this; }

    public Transmission build() {
        return new Transmission(type, gears);
    }
}
