public class RemoteController {
    private Command onCommand;
    private Command offCommand;
    private Command volumeUpCommand;
    private Command volumeDownCommand;
    private Command nextChanelCommand;
    private Command prevChanelCommand;
    private Command allDevicesOffCommand;

    public void setDeviceCommands(Command onCommand,
                                  Command offCommand,
                                  Command volumeUpCommand,
                                  Command volumeDownCommand,
                                  Command nextChanelCommand,
                                  Command prevChanelCommand) {
        this.onCommand = onCommand;
        this.offCommand = offCommand;
        this.volumeUpCommand = volumeUpCommand;
        this.volumeDownCommand = volumeDownCommand;
        this.nextChanelCommand = nextChanelCommand;
        this.prevChanelCommand = prevChanelCommand;
    }

    public void setAllDevicesOffCommand(Command allDevicesOffCommand) {
        this.allDevicesOffCommand = allDevicesOffCommand;
    }

    public void deviceOn() {
        executeCommand(onCommand);
    }

    public void deviceOff() {
        executeCommand(offCommand);
    }

    public void deviceVolumeUp() {
        executeCommand(volumeUpCommand);
    }

    public void deviceVolumeDown() {
        executeCommand(volumeDownCommand);
    }

    public void deviceNextChanel() {
        executeCommand(nextChanelCommand);
    }

    public void devicePrevChanel() {
        executeCommand(prevChanelCommand);
    }

    public void allDevicesOff() {
        executeCommand(allDevicesOffCommand);
    }

    private void executeCommand(Command command) {
        if (command == null) {
            System.out.println("Command is not set");
            return;
        }
        command.execute();
    }
}
