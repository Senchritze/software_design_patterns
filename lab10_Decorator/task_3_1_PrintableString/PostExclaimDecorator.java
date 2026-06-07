public class PostExclaimDecorator extends PrintableStringDecorator {
    public PostExclaimDecorator(PrintableString printableString) {
        super(printableString);
    }

    @Override
    protected String buildString() {
        return printableString.buildString() + "!";
    }
}
