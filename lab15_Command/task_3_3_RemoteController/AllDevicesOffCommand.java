import java.util.List;

public class AllDevicesOffCommand implements Command {
    private final List<Device> devices;

    public AllDevicesOffCommand(List<Device> devices) {
        this.devices = devices;
    }

    @Override
    public void execute() {
        System.out.println("Turning off all devices...");
        for (Device device : devices) {
            device.off();
        }
    }
}
