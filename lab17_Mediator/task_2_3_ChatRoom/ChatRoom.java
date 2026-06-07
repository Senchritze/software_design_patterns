import java.util.LinkedHashMap;
import java.util.Map;

public class ChatRoom implements ChatMediator {
    private static final ChatRoom INSTANCE = new ChatRoom();
    private final Map<String, User> users = new LinkedHashMap<>();

    private ChatRoom() {
    }

    public static ChatRoom getInstance() {
        return INSTANCE;
    }

    @Override
    public void registerUser(User user) {
        if (!users.containsKey(user.getUserId())) {
            users.put(user.getUserId(), user);
        }
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

        if (receiver != null) {
            receiver.receiveMassage(message, userFrom);
            return;
        }

        System.out.println("User " + userTo + " not found.");
    }
}
