public class Wheel {
    public enum Material {
        Steel,
        Alloy
    }

    private final Material material;
    private final int diameter;

    public Wheel(int diameter) {
        this(Material.Steel, diameter);
    }

    public Wheel(Material material, int diameter) {
        if (material == null) {
            throw new IllegalArgumentException("Material must not be null");
        }
        if (diameter <= 0) {
            throw new IllegalArgumentException("Diameter must be positive");
        }
        this.material = material;
        this.diameter = diameter;
    }

    public Material getMaterial() {
        return material;
    }

    public int getDiameter() {
        return diameter;
    }

    @Override
    public String toString() {
        return "Wheel{" +
                "material=" + material +
                ", diameter=" + diameter +
                '}';
    }
}
