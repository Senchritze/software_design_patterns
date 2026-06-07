import java.util.LinkedHashMap;
import java.util.Map;

public class ChatMediator implements Mediator {
    private static final ChatMediator INSTANCE = new ChatMediator();

    private final Map<String, User> users = new LinkedHashMap<>();

    private ChatMediator() {
    }

    public static ChatMediator getInstance() {
        return INSTANCE;
    }

    @Override
    public void registerUser(User user) {
        users.put(user.getUserId(), user);
    }

    @Override
    public void sendMessageAll(String message, String userFrom) {
        for (User user : users.values()) {
            if (!user.getUserId().equals(userFrom)) {
                user.receiveMassage(message, userFrom);
            }
        }
    }

    @Override
    public void sendMessage(String message, String userFrom, String userTo) {
        User receiver = users.get(userTo);

        if (receiver == null) {
            System.out.println("User " + userTo + " not found.");
            return;
        }

        receiver.receiveMassage(message, userFrom);
    }

    @Override
    public void sendMessageToGroup(String message, String userFrom, UserGroup group) {
        boolean delivered = false;

        for (User user : users.values()) {
            if (!user.getUserId().equals(userFrom) && user.getGroup() == group) {
                user.receiveMassage(message, userFrom);
                delivered = true;
            }
        }

        if (!delivered) {
            System.out.println("No recipients found in group " + group + ".");
        }
    }
}
