public interface FlightMediator {
    void registerPlane(Plane plane);

    void requestTakeOff(Plane plane);

    void requestLanding(Plane plane);
}
