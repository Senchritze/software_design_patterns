public class Client {
    public static void main(String[] args) {
        String[] files = {
                "image.jpg",
                "image.png",
                "document.docx",
                "document.doc",
                "table.xls",
                "table.xlsx",
                "presentation.pptx",
                "document.pdf"
        };

        FileOpener imageOpener = new ImageFileOpener();
        FileOpener wordOpener = new WordFileOpener();
        FileOpener excelOpener = new ExcelFileOpener();
        FileOpener powerPointOpener = new PowerPointFileOpener();
        FileOpener pdfOpener = new PdfFileOpener();
        FileOpener defaultOpener = new DefaultFileOpener();

        imageOpener.setNext(wordOpener);
        wordOpener.setNext(excelOpener);
        excelOpener.setNext(powerPointOpener);
        powerPointOpener.setNext(pdfOpener);
        pdfOpener.setNext(defaultOpener);

        for (String file : files) {
            System.out.println("Спроба відкрити: " + file);
            imageOpener.open(file);
            System.out.println();
        }
    }
}
