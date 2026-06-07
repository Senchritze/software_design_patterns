public class WordFileOpener extends AbstractFileOpener {
    @Override protected boolean canOpen(String fileName) {
        String extension = getExtension(fileName);
        return "doc".equals(extension) || "docx".equals(extension);
    }

    @Override
    protected void openFile(String fileName) {
        System.out.println("Microsoft Word відкриває файл " + fileName);
    }
}
