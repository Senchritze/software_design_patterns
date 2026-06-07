public class WordCountObserver implements FileObserver {
    private int wordCount;

    @Override
    public void onLineRead(String line) {
        String trimmedLine = line.trim();
        if (trimmedLine.isEmpty()) {
            return;
        }

        wordCount += trimmedLine.split("\\s+").length;
    }

    public int getWordCount() {
        return wordCount;
    }
}
