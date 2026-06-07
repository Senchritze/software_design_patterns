public class PostEndlDecorator extends PrintableStringDecorator {
    public PostEndlDecorator(PrintableString printableString) {
        super(printableString);
    }

    @Override
    protected String buildString() {
        return printableString.buildString() + System.lineSeparator();
    }
}
