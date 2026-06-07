public class Context {
    private State state;

    public Context(State state) {
        this.state = state;
    }

    public void setState(State state) {
        this.state = state;
        System.out.println("Context changed state to: " + state.getName());
    }

    public State getState() {
        return state;
    }

    public void request() {
        if (state == null) {
            System.out.println("State is not set.");
            return;
        }

        System.out.println("Request in state: " + state.getName());
        state.handle(this);
    }
}
