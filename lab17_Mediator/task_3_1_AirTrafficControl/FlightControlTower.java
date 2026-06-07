public class FlightControlTower implements FlightMediator {
    private final Runway runway;
    private final PlanesInFlight planesInFlight;
    private final PlanesOnGround planesOnGround;

    public FlightControlTower() {
        runway = new Runway();
        planesInFlight = new PlanesInFlight();
        planesOnGround = new PlanesOnGround();
    }

    @Override
    public void registerPlane(Plane plane) {
        if (plane.getIsInTheAir()) {
            planesInFlight.addPlane(plane);
        } else {
            planesOnGround.addPlane(plane);
        }
    }

    @Override
    public void requestTakeOff(Plane plane) {
        System.out.println("Takeoff request from plane " + plane.getId());

        if (plane.getIsInTheAir()) {
            System.out.println("Plane " + plane.getId() + " is already in the air.");
            System.out.println();
            return;
        }

        if (!runway.getIsAvailable()) {
            System.out.println("Takeoff denied for plane " + plane.getId() + ". Runway is busy.");
            System.out.println();
            return;
        }

        runway.setIsAvailable(false);
        System.out.println("Plane " + plane.getId() + " is taking off...");

        planesOnGround.removePlane(plane);
        planesInFlight.addPlane(plane);
        plane.setIsInTheAir(true);

        runway.setIsAvailable(true);
        printStatus();
    }

    @Override
    public void requestLanding(Plane plane) {
        System.out.println("Landing request from plane " + plane.getId());

        if (!plane.getIsInTheAir()) {
            System.out.println("Plane " + plane.getId() + " is already on the ground.");
            System.out.println();
            return;
        }

        if (!runway.getIsAvailable()) {
            System.out.println("Landing denied for plane " + plane.getId() + ". Runway is busy.");
            System.out.println();
            return;
        }

        runway.setIsAvailable(false);
        System.out.println("Plane " + plane.getId() + " is landing...");

        planesInFlight.removePlane(plane);
        planesOnGround.addPlane(plane);
        plane.setIsInTheAir(false);

        runway.setIsAvailable(true);
        printStatus();
    }

    private void printStatus() {
        System.out.println("Runway available: " + runway.getIsAvailable());
        System.out.println("Planes in flight: " + planesInFlight);
        System.out.println("Planes on ground: " + planesOnGround);
        System.out.println();
    }
}
