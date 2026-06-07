public class TypeHandler extends ImageAttributeHandler {
    private final Image.Type defaultType;

    public TypeHandler(Image.Type defaultType) {
        this.defaultType = defaultType;
    }

    @Override
    protected void process(Image image) {
        if (image.getType() == null) {
            image.setType(defaultType);
        }
    }
}
