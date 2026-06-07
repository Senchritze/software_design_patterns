public class HumidityWarningService implements WeatherObserver {
    private static final float MIN_HUMIDITY = 20.0f;
    private static final float MAX_HUMIDITY = 80.0f;

    @Override
    public void update(WeatherEvent event) {
        float humidity = event.getHumidity();

        if (humidity < MIN_HUMIDITY || humidity > MAX_HUMIDITY) {
            System.out.println("Попередження [Вологість]: " + event.getLocation()
                    + " -> " + humidity + " % поза межами ["
                    + MIN_HUMIDITY + ", " + MAX_HUMIDITY + "]");
        }
    }
}
