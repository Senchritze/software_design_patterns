public class Controller {
    private Command onCommand;
    private Command offCommand;

    public Controller() {
        this.onCommand = new NoCommand();
        this.offCommand = new NoCommand();
    }

    public Controller(Command onCommand, Command offCommand) {
        this.onCommand = onCommand == null ? new NoCommand() : onCommand;
        this.offCommand = offCommand == null ? new NoCommand() : offCommand;
    }

    public void setOnCommand(Command onCommand) {
        this.onCommand = onCommand == null ? new NoCommand() : onCommand;
    }

    public void setOffCommand(Command offCommand) {
        this.offCommand = offCommand == null ? new NoCommand() : offCommand;
    }

    public void on() {
        onCommand.execute();
    }

    public void off() {
        offCommand.execute();
    }
}
