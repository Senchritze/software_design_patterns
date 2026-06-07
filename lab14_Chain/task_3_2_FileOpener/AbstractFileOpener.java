public abstract class AbstractFileOpener implements FileOpener {
    private FileOpener next;

    @Override
    public void setNext(FileOpener next) {
        this.next = next;
    }

    @Override
    public void open(String fileName) {
        if (canOpen(fileName)) {
            openFile(fileName);
        } else if (next != null) {
            next.open(fileName);
        } else {
            System.out.println("Не вдалося відкрити файл: " + fileName);
        }
    }

    protected String getExtension(String fileName) {
        int dotIndex = fileName.lastIndexOf('.');
        if (dotIndex == -1 || dotIndex == fileName.length() - 1) {
            return "";
        }
        return fileName.substring(dotIndex + 1).toLowerCase();
    }

    protected abstract boolean canOpen(String fileName);

    protected abstract void openFile(String fileName);
}
