public class FictionBook extends Book {
    private final boolean isAPlay;

    public FictionBook(String name, boolean isAPlay) {
        super(name, false);
        this.isAPlay = isAPlay;
    }

    public boolean isAPlay() {
        return isAPlay;
    }
}
