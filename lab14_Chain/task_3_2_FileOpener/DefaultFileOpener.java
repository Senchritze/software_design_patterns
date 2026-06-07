public class DefaultFileOpener extends AbstractFileOpener {
    @Override
    protected boolean canOpen(String fileName) {
        return true;
    }

    @Override
    protected void openFile(String fileName) {
        System.out.println("Немає програми для відкриття файлу " + fileName);
    }
}
