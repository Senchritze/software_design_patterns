import java.util.Locale;

public class Triangle {
    private float a;
    private float b;
    private float c;

    public static boolean checkExistence(float a, float b, float c) {
        return a > 0f && b > 0f && c > 0f && a + b > c && a + c > b && b + c > a;
    }

    public Triangle(float a, float b, float c) {
        if (!checkExistence(a, b, c)) {
            throw new IllegalArgumentException("Triangle does not exist");
        }
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public boolean setA(float a) { return update(a, b, c); }

    public boolean setB(float b) {
        return update(a, b, c);
    }

    public boolean setC(float c) {
      return update(a, b, c);
    }

    public boolean duplicateA() {
        return update(2f * a, b, c);
    }

    public boolean halfA() {
        return update(a / 2f, b, c);
    }

    public boolean duplicateB() {
        return update(a, 2f * b, c);
    }

    public boolean halfB() {
        return update(a, b / 2f, c);
    }

    public boolean duplicateC() {
        return update(a, b, 2f * c);
    }

    public boolean halfC() {
        return update(a, b, c / 2f);
    }

    public float perimeter() {
        return a + b + c;
    }

    public float square() {
        float p = perimeter() / 2f;
        float value = p * (p - a) * (p - b) * (p - c);
        return (float) Math.sqrt(Math.max(value, 0f));
    }

    public TriangleMemento createMemento() {
        return new TriangleMemento(a, b, c);
    }

    public void restore(TriangleMemento memento) {
        this.a = memento.getA();
        this.b = memento.getB();
        this.c = memento.getC();
    }

    private boolean update(float newA, float newB, float newC) {
        if (checkExistence(newA, newB, newC)) {
            this.a = newA;
            this.b = newB;
            this.c = newC;
            return true;
        }
        System.out.println("Error: value is not set");
        return false;
    }

    @Override
    public String toString() {
        return "Triangle[a=" + format(a) + ", b=" + format(b) + ", c=" + format(c) + "]";
    }

    private String format(float value) {
        return String.format(Locale.US, "%.2f", value);
    }
}
