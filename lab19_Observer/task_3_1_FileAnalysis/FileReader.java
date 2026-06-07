import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class FileReader {
    private final String filePath;
    private final List<FileObserver> observers = new ArrayList<>();
    private Thread readingThread;

    public FileReader(String filePath) {
        this.filePath = resolvePath(filePath);
    }

    public void addObserver(FileObserver observer) {
        observers.add(observer);
    }

    public void removeObserver(FileObserver observer) {
        observers.remove(observer);
    }

    public void startReading() {
        if (readingThread != null && readingThread.isAlive()) {
            return;
        }

        readingThread = new Thread(this::read);
        readingThread.start();
    }

    public void waitUntilFinished() {
        if (readingThread == null) {
            return;
        }

        try {
            readingThread.join();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }

    public void read() {
        try (BufferedReader reader = Files.newBufferedReader(Paths.get(filePath))) {
            reader.lines().forEach(this::onLineRead);
            notifyReadCompleted();
        } catch (IOException e) {
            System.out.println("Cannot read file: " + filePath);
            e.printStackTrace();
        }
    }

    void onLineRead(String line) {
        for (FileObserver observer : observers) {
            observer.onLineRead(line);
        }
    }

    private void notifyReadCompleted() {
        for (FileObserver observer : observers) {
            observer.onReadCompleted();
        }
    }

    private String resolvePath(String originalPath) {
        Path directPath = Paths.get(originalPath);
        if (Files.exists(directPath)) {
            return directPath.toString();
        }

        Path fallbackPath = Paths.get("resources", directPath.getFileName().toString());
        if (Files.exists(fallbackPath)) {
            return fallbackPath.toString();
        }

        return directPath.toString();
    }
}
