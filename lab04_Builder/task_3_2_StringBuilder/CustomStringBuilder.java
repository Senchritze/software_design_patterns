public class CustomStringBuilder implements IStringBuilder {
    private final StringBuilder buffer = new StringBuilder();

    @Override
    public IStringBuilder append(String s) {
        buffer.append(s);
        return this;
    }

    @Override
    public IStringBuilder insert(int position, String s) {
        if (position < 0 || position > buffer.length())
            throw new IndexOutOfBoundsException(
                "Position " + position + " out of range [0.." + buffer.length() + "]");
        buffer.insert(position, s);
        return this;
    }

    @Override
    public IStringBuilder appendLine(String s) {
        buffer.append(s).append(System.lineSeparator());
        return this;
    }

    @Override
    public IStringBuilder prepend(String s) {
        buffer.insert(0, s);
        return this;
    }

    @Override
    public StringProduct build() {
        return new StringProduct(buffer.toString());
    }

    @Override
    public void reset() { buffer.setLength(0); }

    public String peek() { return buffer.toString(); } // current state

    @Override
    public String toString() { return buffer.toString(); }
}