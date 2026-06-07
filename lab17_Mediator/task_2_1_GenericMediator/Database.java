public class Database extends Colleague {
    public Database(String name) {
        super(name);
    }

    @Override
    public void receiveMessage(String message, String senderName) {
        System.out.println(getName() + " stored request from " + senderName + ": " + message);
    }
}
