public class ConcreteUser implements User {
    private final String userId;
    private final ChatMediator chatMediator;

    public ConcreteUser(String userId) {
        this.userId = userId;
        this.chatMediator = ChatRoom.getInstance();
        this.chatMediator.registerUser(this);
    }

    @Override public String getUserId() {
        return userId;
    }

    @Override
    public void sendMessageAll(String message) {
        System.out.println("User " + userId + " sends to all: " + message);
        chatMediator.sendMessageAll(message, userId);
    }

    @Override
    public void sendMessage(String message, String userTo) {
        System.out.println("User " + userId + " sends to " + userTo + ": " + message);
        chatMediator.sendMessage(message, userId, userTo);
    }

    @Override
    public void receiveMassage(String message, String userFrom) {
        System.out.println("User " + userId + " receives message: " + message + " from user " + userFrom);
    }
}
