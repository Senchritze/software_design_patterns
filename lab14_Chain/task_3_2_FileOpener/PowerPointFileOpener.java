public class PowerPointFileOpener extends AbstractFileOpener {
    @Override
    protected boolean canOpen(String fileName) {
        String extension = getExtension(fileName);
        return "ppt".equals(extension) || "pptx".equals(extension);
    }

    @Override
    protected void openFile(String fileName) {
        System.out.println("Microsoft PowerPoint відкриває файл " + fileName);
    }
}
