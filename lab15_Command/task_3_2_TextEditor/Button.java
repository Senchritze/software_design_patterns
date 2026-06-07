public class Button {
    private Command command;

    public Button() { this.command = new NoCommand(); }

    public void setCommand(Command command) {
        this.command = command;
    }

    public void click() {
        command.execute();
    }
}
