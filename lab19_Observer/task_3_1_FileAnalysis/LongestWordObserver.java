public class LongestWordObserver implements FileObserver {
    private String longestWord = "";

    @Override
    public void onLineRead(String line) {
        String[] words = splitWords(line);
        for (String word : words) {
            if (word.length() > longestWord.length()) {
                longestWord = word;
            }
        }
    }

    public String getLongestWord() {
        return longestWord;
    }

    private String[] splitWords(String line) {
        String trimmedLine = line.trim();
        if (trimmedLine.isEmpty()) {
            return new String[0];
        }
        return trimmedLine.split("\\s+");
    }
}
