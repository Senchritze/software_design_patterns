public class Main {
    public static void main(String[] args) {
        WeatherDataCenter dataCenter = new WeatherDataCenter();
        dataCenter.addObserver(new TemperatureWarningService());
        dataCenter.addObserver(new HumidityWarningService());
        dataCenter.addObserver(new PressureWarningService());

        while (true) {
            if (dataCenter.update()) {
                break;
            }
        }

        System.out.println("Finish of the simulation.");
    }
}
