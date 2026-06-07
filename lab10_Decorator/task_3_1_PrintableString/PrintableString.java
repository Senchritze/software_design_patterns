public class PrintableString {
    private final String value;

    public PrintableString(String value) {
        this.value = value;
    }

    protected String buildString() {
        return value;
    }

    public void print() {
        System.out.print(buildString());
    }
}
