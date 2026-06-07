public class MediaPlayer {
    private State state;
    private String icon;

    public MediaPlayer() {
        this.state = new PausedState();
        this.icon = "play button";
    }

    public void setState(State state) {
        this.state = state;
    }

    public State getState() {
        return state;
    }

    public String getStateName() {
        return state.getName();
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public void play() {
        state.play(this);
    }

    public void pause() {
        state.pause(this);
    }
}
