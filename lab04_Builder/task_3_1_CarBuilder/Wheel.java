public class Wheel {
    public enum Material { Steel, Alloy, Forged }

    final private Material material;
    final int diameter; // inches

    public Wheel(Material material, int diameter) {
        this.material = material;
        this.diameter = diameter;
    }

    @Override
    public String toString() {
        return "Wheel{material=" + material + ", diameter=" + diameter + "\"}";
    }
}
