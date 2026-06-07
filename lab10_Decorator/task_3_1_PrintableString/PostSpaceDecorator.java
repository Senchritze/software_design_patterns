public class PostSpaceDecorator extends PrintableStringDecorator {
    public PostSpaceDecorator(PrintableString printableString) {
        super(printableString);
    }

    @Override
    protected String buildString() {
        return printableString.buildString() + " ";
    }
}
