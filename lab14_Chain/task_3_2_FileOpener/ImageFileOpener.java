public class ImageFileOpener extends AbstractFileOpener {
    @Override
    protected boolean canOpen(String fileName) {
      String ext = getExtension(fileName);
      return "jpg".equals(ext) || "jpeg".equals(ext) || "png".equals(ext);
    }

    @Override
    protected void openFile(String fileName) {
        System.out.println("Image Viewer відкриває файл " + fileName);
    }
}
