public class Plane {
    private boolean isInTheAir;
    private final int id;
    private final FlightMediator mediator;

    public Plane(int id, FlightMediator mediator) {
        this.id = id;
        this.mediator = mediator;
        isInTheAir = false;
        mediator.registerPlane(this);
    }

    public void takeOff() {
        mediator.requestTakeOff(this);
    }

    public void land() {
        mediator.requestLanding(this);
    }

    public boolean getIsInTheAir() {
        return isInTheAir;
    }

    public void setIsInTheAir(boolean isInTheAir) {
        this.isInTheAir = isInTheAir;
    }

    public int getId() {
        return id;
    }
}
