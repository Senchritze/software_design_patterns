public class Wheel implements Cloneable {
    public enum Material { Steel, Alloy, Forged }

    final private Material material;
    final int diameter;

    public Wheel(Material material, int diameter) {
        this.material = material;
        this.diameter = diameter;
    }

    @Override
    public Wheel clone() {
        try {
            return (Wheel) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    @Override
    public String toString() {
        return "Wheel{material=" + material + ", diameter=" + diameter + "}";
    }
}