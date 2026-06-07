import java.util.ArrayList;
import java.util.List;

public class WeatherDataCenter implements WeatherSubject {
    private final WeatherReader weatherReader;
    private final List<WeatherObserver> observers = new ArrayList<>();

    public WeatherDataCenter() {
        weatherReader = new WeatherReader("lab19_Observer/task_2_2/input01.txt");
    }

    @Override
    public void addObserver(WeatherObserver observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(WeatherObserver observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers(WeatherEvent event) {
        for (WeatherObserver observer : observers) {
            observer.update(event);
        }
    }

    public boolean update() {
        WeatherEvent weatherEvent = weatherReader.getEvent();
        if (weatherEvent == null) {
            sleepShortly();
            return false;
        }

        if ("end".equals(weatherEvent.getLocation())) {
            return true;
        }

        System.out.println("Update data: city: " + weatherEvent.getLocation()
                + ", temperature = " + weatherEvent.getTemperature()
                + ", humidity = " + weatherEvent.getHumidity()
                + ", pressure = " + weatherEvent.getPressure());

        notifyObservers(weatherEvent);
        return false;
    }

    private void sleepShortly() {
        try {
            Thread.sleep(50);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
