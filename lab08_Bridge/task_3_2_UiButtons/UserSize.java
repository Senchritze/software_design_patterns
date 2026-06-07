public class UserSize implements ButtonSize {
    private final int pixelSize;

    public UserSize(int pixelSize) {
        this.pixelSize = pixelSize;
    }

    @Override public String getSizeLabel() { return "user-defined(" + pixelSize + "px)"; }
    @Override public int getPixelSize() { return pixelSize; }
}