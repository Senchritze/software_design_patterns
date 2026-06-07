public class Main {
    public static void main(String[] args) throws Exception {
        FileProcessor fp1 = FileProcessor.getInstance();
        FileProcessor fp2 = FileProcessor.getInstance();

        System.out.println("Same instance? " + (fp1 == fp2));

        
        System.out.println();

        String file = "sample.txt";

        System.out.println("Lines: " + fp1.countLines(file));


        System.out.println("Words: " + fp1.countWords(file));

        System.out.println("\nLines with 'Pattern':");
        fp1.findLines(file, "Pattern").forEach(l -> System.out.println("  " + l));

        System.out.println("\nFull content:");
        System.out.print(fp2.readAll(file));
    }
}