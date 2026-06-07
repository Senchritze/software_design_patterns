public class DeviceOffCommand implements Command {
    private final Device device;

    public DeviceOffCommand(Device device) {
        this.device = device;
    }

    @Override
    public void execute() {
        device.off();
    }
}
