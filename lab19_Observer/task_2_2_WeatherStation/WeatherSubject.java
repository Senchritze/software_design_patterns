public interface WeatherSubject {
    void addObserver(WeatherObserver observer);

    void removeObserver(WeatherObserver observer);

    void notifyObservers(WeatherEvent event);
}
