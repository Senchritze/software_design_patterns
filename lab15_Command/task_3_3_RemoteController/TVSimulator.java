import java.util.List;

public class TVSimulator {
    public static void main(String[] args) {
        Device tv = new Television();
        Device radio = new Radio();

        RemoteController tvController = new RemoteController();
        tvController.setDeviceCommands(
                new DeviceOnCommand(tv),
                new DeviceOffCommand(tv),
                new VolumeUpCommand(tv),
                new VolumeDownCommand(tv),
                new NextChanelCommand(tv),
                new PrevChanelCommand(tv)
        );

        RemoteController radioController = new RemoteController();
        radioController.setDeviceCommands(
                new DeviceOnCommand(radio),
                new DeviceOffCommand(radio),
                new VolumeUpCommand(radio),
                new VolumeDownCommand(radio),
                new NextChanelCommand(radio),
                new PrevChanelCommand(radio)
        );

        RemoteController universalRemote = new RemoteController();
        universalRemote.setAllDevicesOffCommand(new AllDevicesOffCommand(List.of(tv, radio)));

        System.out.println("TV control:");
        tvController.deviceOn();
        for (int i = 0; i < 3; i++) {
            tvController.deviceNextChanel();
        }
        tvController.deviceVolumeUp();
        tvController.deviceVolumeUp();
        tvController.devicePrevChanel();

        System.out.println();
        System.out.println("Radio control:");
        radioController.deviceOn();
        radioController.deviceNextChanel();
        radioController.deviceNextChanel();
        radioController.deviceVolumeDown();

        System.out.println();
        System.out.println("Universal remote:");
        universalRemote.allDevicesOff();
    }
}
