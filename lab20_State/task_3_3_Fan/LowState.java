public class LowState implements FanState {

    @Override
    public void turnUp(Fan fan) {
        fan.setState(new MediumState());
        System.out.println("Fan is on medium");
    }

    @Override public void turnDown(Fan fan) {
    }

    @Override
    public String getName() {
        return "low";
    }
}
