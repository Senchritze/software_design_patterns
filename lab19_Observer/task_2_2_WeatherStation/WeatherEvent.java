public class WeatherEvent {
    private final String location;
    private final float temperature;
    private final float humidity;
    private final float pressure;

    public WeatherEvent(String location, float temperature, float humidity, float pressure) {
        this.location = location;
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
    }

    public String getLocation() {
        return location;
    }

    public float getTemperature() {
        return temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }
}
