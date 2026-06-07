public class PressureWarningService implements WeatherObserver {
    private static final float MIN_PRESSURE = 730.0f;
    private static final float MAX_PRESSURE = 780.0f;

    @Override
    public void update(WeatherEvent event) {
      float pressure = event.getPressure();
      if (pressure < MIN_PRESSURE || pressure > MAX_PRESSURE) {
          System.out.println("Попередження [Тиск]: " + event.getLocation()
                  + " -> " + pressure + " мм рт. ст. поза межами ["
                  + MIN_PRESSURE + ", " + MAX_PRESSURE + "]");
      }
    }
}
