public class WheelBuilder {
    private Wheel.Material material = Wheel.Material.Steel;
    private int diameter = 16;

    public WheelBuilder setMaterial(Wheel.Material m) {
        this.material = m;
        return this;
    }

    public WheelBuilder setDiameter(int diameter) { this.diameter = diameter; return this; }

    public Wheel build() {
        return new Wheel(material, diameter);
    }
}
