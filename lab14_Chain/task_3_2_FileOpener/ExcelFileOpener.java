public class ExcelFileOpener extends AbstractFileOpener {
    @Override
    protected boolean canOpen(String fileName) {
        String ext = getExtension(fileName);
        return "xls".equals(ext) || "xlsx".equals(ext);
    }

    @Override
    protected void openFile(String fileName) {
        System.out.println("Microsoft Excel відкриває файл " + fileName);
    }
}
