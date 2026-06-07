public class Client {
    public static void main(String[] args) {
        Lamp lamp = new Lamp();
        Command lightOnCommand = new LightOnCommand(lamp);
        Command lightOffCommand = new LightOffCommand(lamp);
        Controller controller = new Controller(lightOnCommand, lightOffCommand);

        controller.on();
        controller.on();
        controller.off();
        controller.off();
        controller.on();
        controller.on();
        controller.off();
    }
}
