public class PreWordDecorator extends PrintableStringDecorator {
    private final String word;

    public PreWordDecorator(PrintableString printableString, String word) {
        super(printableString);
        this.word = word;
    }

    @Override
    protected String buildString() {
        return word + printableString.buildString();
    }
}
