public class PostWordDecorator extends PrintableStringDecorator {
    private final String word;

    public PostWordDecorator(PrintableString printableString, String word) {
        super(printableString);
        this.word = word;
    }

    @Override
    protected String buildString() {
        return printableString.buildString() + word;
    }
}
