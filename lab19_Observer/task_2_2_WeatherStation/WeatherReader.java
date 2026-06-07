import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class WeatherReader {
    private final Queue<WeatherEvent> eventQueue = new ArrayDeque<>();
    private final Lock lock = new ReentrantLock(true);
    private final String filePath;

    public WeatherReader(String filePath) {
        this.filePath = filePath;
        Thread thread = new Thread(this::read);
        thread.setDaemon(true);
        thread.start();
    }

    public void read() {
        try (BufferedReader reader = openReader()) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] s = line.trim().split("\\s+");
                if (s.length == 4) {
                    WeatherEvent event = new WeatherEvent(
                            s[0],
                            Float.parseFloat(s[1]),
                            Float.parseFloat(s[2]),
                            Float.parseFloat(s[3])
                    );

                    lock.lock();
                    try {
                        eventQueue.add(event);
                    } finally {
                        lock.unlock();
                    }
                }
                Thread.sleep(100);
            }
        } catch (IOException e) {
            System.out.println("Cannot read weather data: " + e.getMessage());
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        } finally {
            WeatherEvent event = new WeatherEvent("end", 0, 0, 0);
            lock.lock();
            try {
                eventQueue.add(event);
            } finally {
                lock.unlock();
            }
        }
    }

    private BufferedReader openReader() throws FileNotFoundException {
        String[] paths = {
                filePath,
                "input01.txt",
                "lab19_Observer/task_2_2/input01.txt"
        };

        for (String path : paths) {
            File file = new File(path);
            if (file.exists()) {
                return new BufferedReader(new FileReader(file));
            }
        }

        throw new FileNotFoundException(filePath);
    }

    public WeatherEvent getEvent() {
        lock.lock();
        try {
            return eventQueue.poll();
        } finally {
            lock.unlock();
        }
    }
}
