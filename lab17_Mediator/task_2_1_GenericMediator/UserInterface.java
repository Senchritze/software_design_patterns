public class UserInterface extends Colleague {
    public UserInterface(String name) {
        super(name);
    }

    @Override public void receiveMessage(String message, String senderName) {
        System.out.println(getName() + " received from " + senderName + ": " + message);
    }
}
