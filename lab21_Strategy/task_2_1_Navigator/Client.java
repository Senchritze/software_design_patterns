public class Client {
    public static void main(String[] args) {
        Navigator navigator = new Navigator();

        navigator.buildRoute("Троєщина", "Теремки");

        navigator.setStrategy(new RoadStrategy());
        navigator.buildRoute("Троєщина", "Теремки");

        navigator.setStrategy(new BykeStrategy());
        navigator.buildRoute("Троєщина", "Теремки");
    }
}
