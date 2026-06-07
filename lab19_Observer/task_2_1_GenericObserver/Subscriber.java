public class Subscriber implements Observer {
    private final String name;
    private String lastNews;

    public Subscriber(String name) {
        this.name = name;
    }

    @Override
    public void update(String news) {
        lastNews = news;
        System.out.println(name + " received: " + news);
    }

    public String getName() {
        return name;
    }

    public String getLastNews() {
        return lastNews;
    }
}
