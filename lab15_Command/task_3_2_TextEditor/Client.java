public class Client {
    public static void main(String[] args) {
        TextEditor textEditor = new TextEditor();
        textEditor.newDocument("blank.txt");

        textEditor.clickSaveButton();
        textEditor.clickPrintButton();
        textEditor.selectShowInfoMenuItem();
        textEditor.selectPrintMenuItem();
        textEditor.selectSaveMenuItem();
        textEditor.pressSaveShortcut();
        textEditor.pressPrintShortcut();
    }
}
