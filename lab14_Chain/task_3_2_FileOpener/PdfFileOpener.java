public class PdfFileOpener extends AbstractFileOpener {
    @Override
    protected boolean canOpen(String fileName) {
        return "pdf".equals(getExtension(fileName));
    }

    @Override
    protected void openFile(String fileName) {
        System.out.println("PDF Reader відкриває файл " + fileName);
    }
}
