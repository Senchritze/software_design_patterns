public class TriangleMarker {
    private float a;
    private float b;
    private float c;

    public TriangleMarker(float a, float b, float c) {
        if (!checkExistence(a, b, c)) {
            throw new IllegalArgumentException("Triangle does not exist");
        }
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public static boolean checkExistence(float a, float b, float c) {
        return a > 0 && b > 0 && c > 0
                && a + b > c
                && a + c > b
                && b + c > a;
    }

    public void setA(float a) {
        if (checkExistence(a, b, c)) {
            this.a = a;
        } else {
            System.out.println("Error: value is not set");
        }
    }

    public void setB(float b) {
        if (checkExistence(a, b, c)) {
            this.b = b;
        } else {
            System.out.println("Error: value is not set");
        }
    }

    public void setC(float c) {
        if (checkExistence(a, b, c)) {
            this.c = c;
        } else {
            System.out.println("Error: value is not set");
        }
    }

    public float perimeter() {
        return a + b + c;
    }

    public float square() {
        float p = perimeter() / 2;
        return (float) Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

    public TriangleMarkerMemento save() {
        return new Memento(a, b, c);
    }

    public void restore(TriangleMarkerMemento memento) {
        if (!(memento instanceof Memento)) {
            throw new IllegalArgumentException("Wrong memento type");
        }

        Memento state = (Memento) memento;
        this.a = state.a;
        this.b = state.b;
        this.c = state.c;
    }

    @Override
    public String toString() {
        return String.format("TriangleMarker{a=%.2f, b=%.2f, c=%.2f}", a, b, c);
    }

    private static class Memento implements TriangleMarkerMemento {
        private final float a;
        private final float b;
        private final float c;

        private Memento(float a, float b, float c) {
            this.a = a;
            this.b = b;
            this.c = c;
        }
    }
}
