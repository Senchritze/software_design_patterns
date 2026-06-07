public abstract class PrintableStringDecorator extends PrintableString {
    protected final PrintableString printableString;

    public PrintableStringDecorator(PrintableString printableString) {
        super("");
        this.printableString = printableString;
    }

    @Override
    protected abstract String buildString();
}
