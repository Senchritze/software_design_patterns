public class TextEditor {
    private Document document;
    private final Button saveButton;
    private final Button printButton;
    private final MenuItem saveMenuItem;
    private final MenuItem printMenuItem;
    private final MenuItem showInfoMenuItem;
    private final Shortcut saveShortcut;
    private final Shortcut printShortcut;

    public TextEditor() {
        saveButton = new Button();
        printButton = new Button();
        saveMenuItem = new MenuItem();
        printMenuItem = new MenuItem();
        showInfoMenuItem = new MenuItem();
        saveShortcut = new Shortcut();
        printShortcut = new Shortcut();
    }

    public void newDocument(String name) {
        document = new Document(name);

        Command saveCmd = new SaveCommand(document);
        Command printCmd = new PrintCommand(document);
        Command infoCmd = new ShowInfoCommand(document);

        saveButton.setCommand(saveCmd);
        printButton.setCommand(printCmd);
        saveMenuItem.setCommand(saveCmd);
        printMenuItem.setCommand(printCmd);
        showInfoMenuItem.setCommand(infoCmd);
        saveShortcut.setCommand(saveCmd);
        printShortcut.setCommand(printCmd);
    }

    public void clickSaveButton() {
        saveButton.click();
    }

    public void clickPrintButton() {
        printButton.click();
    }

    public void selectSaveMenuItem() {
        saveMenuItem.select();
    }

    public void selectPrintMenuItem() {
        printMenuItem.select();
    }

    public void selectShowInfoMenuItem() {
        showInfoMenuItem.select();
    }

    public void pressSaveShortcut() {
        saveShortcut.press();
    }

    public void pressPrintShortcut() {
        printShortcut.press();
    }
}
