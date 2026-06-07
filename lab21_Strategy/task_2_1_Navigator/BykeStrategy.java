public class BykeStrategy implements RouteStrategy {
    @Override
    public String buildRoute(String start, String finish) {
        return "Веломаршрут з пункту " + start + " до пункту " + finish + " через велодоріжки та парки.";
    }
}
