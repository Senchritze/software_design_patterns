public class TemperatureWarningService implements WeatherObserver {
    private static final float MIN_TEMPERATURE = -30.0f;
    private static final float MAX_TEMPERATURE = 30.0f;

    @Override public void update(WeatherEvent event) {
        float temperature = event.getTemperature();
        if (temperature < MIN_TEMPERATURE || temperature > MAX_TEMPERATURE) {
            System.out.println("Попередження [Температура]: " + event.getLocation()
                    + " -> " + temperature + " °C поза межами ["
                    + MIN_TEMPERATURE + ", " + MAX_TEMPERATURE + "]");
        }
    }
}
