public class NameHandler extends ImageAttributeHandler {
    @Override
    protected void process(Image image) {
        if (image.getName() == null || image.getName().isBlank()) {
            if (image.getCreationDate() != null && image.getCreationTime() != null && image.getType() != null) {
                String name = "IMG_" + image.getCreationDate() + "_" + image.getCreationTime() + "." + image.getType();
                image.setName(name);
            }
        }
    }
}
