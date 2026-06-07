public class HighState implements FanState {
    @Override
    public void turnUp(Fan fan) {
    }

    @Override
    public void turnDown(Fan fan) {
        fan.setState(new MediumState());
        System.out.println("Fan is on medium");
    }

    @Override public String getName() {
        return "high";
    }
}
