public class PostComaDecorator extends PrintableStringDecorator {
    public PostComaDecorator(PrintableString printableString) {
        super(printableString);
    }

    @Override
    protected String buildString() {
        return printableString.buildString() + ",";
    }
}
