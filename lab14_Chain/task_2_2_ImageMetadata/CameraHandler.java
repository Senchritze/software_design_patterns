public class CameraHandler extends ImageAttributeHandler {
    private final String cameraModel;

    public CameraHandler(String cameraModel) { this.cameraModel = cameraModel; }

    @Override
    protected void process(Image image) {
        if (image.getCamera() == null || image.getCamera().isBlank()) {
            image.setCamera(cameraModel);
        }
    }
}
