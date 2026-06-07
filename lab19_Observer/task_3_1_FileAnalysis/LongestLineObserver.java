public class LongestLineObserver implements FileObserver {
    private String longestLine = "";

    @Override public void onLineRead(String line) {
        if (line.length() > longestLine.length()) {
            longestLine = line;
        }
    }

    public String getLongestLine() {
        return longestLine;
    }
}
