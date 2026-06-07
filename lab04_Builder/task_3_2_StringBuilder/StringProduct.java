public class StringProduct {
    private final String value;

    public StringProduct(String value) {
        this.value = value;
    }

    public String getValue() { return value; }
    public int length() { return value.length(); }

    @Override
    public String toString() { return value; }
}