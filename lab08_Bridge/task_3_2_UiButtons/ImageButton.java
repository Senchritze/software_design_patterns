public class ImageButton extends Button {
    private final String imagePath;

    public ImageButton(ButtonSize size, String imagePath) {
        super(size);
        this.imagePath = imagePath;
    }

    @Override
    public void draw() {
        System.out.println("Setting size to " + size.getSizeLabel() + "...");
        System.out.println("Drawing an image button [icon: " + imagePath + "].\n");
    }
}