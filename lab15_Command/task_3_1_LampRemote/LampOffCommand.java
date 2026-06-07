public class LampOffCommand implements Command {
    private final Lamp lamp;

    public LampOffCommand(Lamp lamp) {
        this.lamp = lamp;
    }

    @Override public void execute() {
  lamp.lightOff();
    }
}
