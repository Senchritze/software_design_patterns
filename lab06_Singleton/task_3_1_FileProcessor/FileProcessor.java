import java.io.*;
import java.util.*;

public class FileProcessor {

    private static volatile FileProcessor instance;

    private FileProcessor() {}

    public static FileProcessor getInstance() {
        if (instance == null) {
            synchronized (FileProcessor.class) {
                if (instance == null) {
                    instance = new FileProcessor();
                }
            }
        }
        return instance;
    }

    public List<String> readLines(String filename) throws IOException {
        List<String> lines = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = reader.readLine()) != null) {
                lines.add(line);
            }
        }
        return lines;
    }

    public String readAll(String filename) throws IOException {
        StringBuilder sb = new StringBuilder();
        for (String line : readLines(filename)) {
            sb.append(line).append(System.lineSeparator());
        }
        return sb.toString();
    }

    public int countWords(String filename) throws IOException {
        int count = 0;
        for (String line : readLines(filename)) {
            if (!line.trim().isEmpty())
                count += line.trim().split("\\s+").length;
        }
        return count;
    }

    public int countLines(String filename) throws IOException {
        return readLines(filename).size();
    }

    public List<String> findLines(String filename, String keyword) throws IOException {
        List<String> result = new ArrayList<>();
        for (String line : readLines(filename)) {
            if (line.contains(keyword)) result.add(line);
        }
        return result;
    }
}