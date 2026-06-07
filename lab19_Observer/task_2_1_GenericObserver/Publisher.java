import java.util.ArrayList;
import java.util.List;

public class Publisher implements Subject {
    private final List<Observer> observers = new ArrayList<>();
    private String latestNews;

    @Override
    public void attach(Observer observer) {
        if (observer != null && !observers.contains(observer)) {
            observers.add(observer);
        }
    }

    @Override
    public void detach(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(latestNews);
        }
    }

    public void publishNews(String news) {
        latestNews = news;
        System.out.println("Publisher published: " + news);
        notifyObservers();
        System.out.println();
    }

    public String getLatestNews() {
        return latestNews;
    }
}
