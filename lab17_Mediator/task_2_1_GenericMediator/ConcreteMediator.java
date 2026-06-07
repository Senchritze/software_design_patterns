import java.util.HashMap;
import java.util.Map;

public class ConcreteMediator implements Mediator {
    private final Map<String, Colleague> colleagues = new HashMap<>();

    @Override
    public void registerColleague(Colleague colleague) {
        colleagues.put(colleague.getName(), colleague);
        colleague.setMediator(this);
    }

    @Override
    public void sendMessage(String message, Colleague sender, String receiverName) {
        Colleague receiver = colleagues.get(receiverName);

        if (receiver == null) {
            System.out.println("Receiver " + receiverName + " not found.");
            return;
        }

        if (receiver == sender) {
            System.out.println("Sender and receiver are the same component.");
            return;
        }

        receiver.receiveMessage(message, sender.getName());
    }
}
