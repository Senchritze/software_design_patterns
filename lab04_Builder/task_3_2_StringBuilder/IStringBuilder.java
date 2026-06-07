public interface IStringBuilder {
    IStringBuilder append(String s);
    IStringBuilder insert(int position, String s);
    IStringBuilder appendLine(String s);
    IStringBuilder prepend(String s);
    StringProduct build();
    void reset();
}