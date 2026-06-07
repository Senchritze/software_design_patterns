public class RoadStrategy implements RouteStrategy {
    @Override public String buildRoute(String start, String finish) {
        return "Автомобільний маршрут з пункту " + start + " до пункту " + finish + " через основні дороги.";
    }
}
