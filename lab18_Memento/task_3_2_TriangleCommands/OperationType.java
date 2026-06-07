public enum OperationType {
    SET_A("a"),
    SET_B("b"),
    SET_C("c"),
    DUPLICATE_A("duplicateA"),
    DUPLICATE_B("duplicateB"),
    DUPLICATE_C("duplicateC"),
    HALF_A("halfA"),
    HALF_B("halfB"),
    HALF_C("halfC");

    private final String code;

    OperationType(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }

    public static OperationType fromCode(String code) {
        for (OperationType type : values()) {
            if (type.code.equals(code)) {
                return type;
            }
        }
        throw new IllegalArgumentException("Unknown operation: " + code);
    }
}
