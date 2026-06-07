public class Fan {
    private FanState state;

    public Fan() {
        this.state = new LowState();
    }

    public void setState(FanState state) {
        this.state = state;
    }

    public String getState() {
        return state.getName();
    }

    public void turnUp() {
        state.turnUp(this);
    }

    public void turnDown() {
        state.turnDown(this);
    }
}
