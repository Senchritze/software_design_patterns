import java.util.List;

public class UniversalOffCommand implements Command {
    private final List<Lamp> lamps;

    public UniversalOffCommand(List<Lamp> lamps) {
        this.lamps = lamps;
    }

    @Override
    public void execute() {
        for (Lamp lamp : lamps) {
            lamp.lightOff();
        }
    }
}
