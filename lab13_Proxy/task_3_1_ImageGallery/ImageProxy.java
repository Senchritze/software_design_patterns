public class ImageProxy implements DisplayObject {
    private final String path;
    private ImageFile realImage;

    public ImageProxy(String path) {
        this.path = path;
    }

    @Override
    public void display() {
        if (realImage == null) {
            System.out.println("Proxy: creating real image for " + path);
            realImage = new ImageFile(path);
        } else {
            System.out.println("Proxy: using cached image for " + path);
        }
        realImage.display();
    }
}
