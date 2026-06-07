public class Invoker {
    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void pressButton() {
        if (command == null) {
            System.out.println("No command is set.");
            return;
        }

        command.execute();
    }
}
