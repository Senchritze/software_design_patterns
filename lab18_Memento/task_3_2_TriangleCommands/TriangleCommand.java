public class TriangleCommand implements Command {
    private final Triangle triangle;
    private final OperationType type;
    private final float value;

    public TriangleCommand(Triangle triangle, OperationType type, float value) {
        this.triangle = triangle;
        this.type = type;
        this.value = value;
    }

    @Override
    public boolean execute() {
        switch (type) {
            case SET_A:
                return triangle.setA(value);
            case SET_B:
                return triangle.setB(value);
            case SET_C:
                return triangle.setC(value);
            case DUPLICATE_A:
                return triangle.duplicateA();
            case DUPLICATE_B:
                return triangle.duplicateB();
            case DUPLICATE_C:
                return triangle.duplicateC();
            case HALF_A:
                return triangle.halfA();
            case HALF_B:
                return triangle.halfB();
            case HALF_C:
                return triangle.halfC();
            default:
                throw new IllegalStateException("Unexpected value: " + type);
        }
    }

    @Override public String getName() {
        switch (type) {
            case SET_A:
            case SET_B:
            case SET_C:
                return type.getCode() + "=" + formatValue(value);
            default:
                return type.getCode();
        }
    }

    private String formatValue(float number) {
        if (number == (int) number) {
            return Integer.toString((int) number);
        }
        return Float.toString(number);
    }
}
