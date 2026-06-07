public class MenuItem {
    private Command command;

    public MenuItem() {
        command = new NoCommand();
    }

    public void setCommand(Command command) { this.command = command; }

    public void select() {
      command.execute();
    }
}
