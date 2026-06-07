import java.util.Locale;

public class TriangleMemento {
    private final float a;
    private final float b;
    private final float c;

    public TriangleMemento(float a, float b, float c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public float getA() {
        return a;
    }

    public float getB() {
        return b;
    }

    public float getC() {
        return c;
    }

    public float perimeter() {
        return a + b + c;
    }

    public float square() {
        float p = perimeter() / 2f;
        float value = p * (p - a) * (p - b) * (p - c);
        return (float) Math.sqrt(Math.max(value, 0f));
    }

    @Override
    public String toString() {
        return "Triangle[a=" + format(a) + ", b=" + format(b) + ", c=" + format(c) + "]";
    }

    private String format(float value) {
        return String.format(Locale.US, "%.2f", value);
    }
}
