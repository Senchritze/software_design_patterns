public class TriangleProtected {
    private float a;
    private float b;
    private float c;

    public interface SnapshotView {
        float getSquare();
        String getStateInfo();
    }

    private interface SnapshotState extends SnapshotView {
        float getA();
        float getB();
        float getC();
    }

    private static class Memento implements SnapshotState {
        private final float a;
        private final float b;
        private final float c;
        private final float square;

        private Memento(float a, float b, float c) {
            this.a = a;
            this.b = b;
            this.c = c;
            this.square = calculateSquare(a, b, c);
        }

        @Override public float getA() { return a; }

        @Override
        public float getB() {
            return b;
        }

        @Override
        public float getC() {
            return c;
        }

        @Override
        public float getSquare() {
            return square;
        }

        @Override
        public String getStateInfo() {
            return String.format("a=%.2f, b=%.2f, c=%.2f", a, b, c);
        }
    }

    public TriangleProtected(float a, float b, float c) {
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
        return calculateSquare(a, b, c);
    }

    public SnapshotView save() {
        return new Memento(a, b, c);
    }

    public void restore(SnapshotView memento) {
        if (!(memento instanceof SnapshotState)) {
            throw new IllegalArgumentException("Wrong memento type");
        }

        SnapshotState state = (SnapshotState) memento;
        this.a = state.getA();
        this.b = state.getB();
        this.c = state.getC();
    }

    @Override
    public String toString() {
        return String.format("TriangleProtected{a=%.2f, b=%.2f, c=%.2f}", a, b, c);
    }

    private static float calculateSquare(float a, float b, float c) {
        float p = (a + b + c) / 2;
        return (float) Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }
}
