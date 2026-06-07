public class TransmissionBuilder {
    private Transmission.TransmissionType type = Transmission.TransmissionType.Manual;
    private int gears = 5;

    public TransmissionBuilder setType(Transmission.TransmissionType t) {
        this.type = t; return this;
    }

    public TransmissionBuilder setGears(int g) { this.gears = g; return this; }

    public Transmission build() { return new Transmission(type, gears); }
}