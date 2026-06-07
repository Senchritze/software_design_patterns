public class Shortcut {
    private Command command;

    public Shortcut() {
        this.command = new NoCommand();
    }

    public void setCommand(Command command) {
        this.command = command;
    }

    public void press() {
        command.execute();
    }
}
