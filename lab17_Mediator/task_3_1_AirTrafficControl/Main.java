public class Main {
    public static void main(String[] args) {
        FlightMediator tower = new FlightControlTower();

        Plane plane1 = new Plane(123, tower);
        Plane plane2 = new Plane(456, tower);
        Plane plane3 = new Plane(789, tower);

        plane1.takeOff();
        plane2.takeOff();
        plane1.land();
        plane3.takeOff();
        plane2.land();
        plane3.land();
    }
}
