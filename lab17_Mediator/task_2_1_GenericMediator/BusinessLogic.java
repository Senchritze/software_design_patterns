public class BusinessLogic extends Colleague {
    public BusinessLogic(String name) {
        super(name);
    }

    @Override
    public void receiveMessage(String message, String senderName) {
      System.out.println(getName() + " processed message from " + senderName + ": " + message);
    }
}
