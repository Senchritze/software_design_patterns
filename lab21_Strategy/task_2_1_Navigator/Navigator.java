public class Navigator {
    private RouteStrategy strategy;

    public void setStrategy(RouteStrategy strategy) {
        this.strategy = strategy;
    }

    public void buildRoute(String start, String finish) {
        if (strategy == null) {
            System.out.println("Стратегія не вибрана");
            return;
        }

        String route = strategy.buildRoute(start, finish);
        System.out.println("Маршрут побудовано: " + route);
    }
}
