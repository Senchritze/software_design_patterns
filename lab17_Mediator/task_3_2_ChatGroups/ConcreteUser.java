public class ConcreteUser implements User {
    private final String userId;
    private final UserGroup group;
    private final Mediator mediator;

    public ConcreteUser(String userId) {
        this(userId, UserGroup.USERS);
    }

    public ConcreteUser(String userId, UserGroup group) {
        this.userId = userId;
        this.group = group;
        this.mediator = ChatMediator.getInstance();
        this.mediator.registerUser(this);
    }

    @Override
    public String getUserId() {
        return userId;
    }

    @Override
    public UserGroup getGroup() {
        return group;
    }

    @Override
    public void sendMessageAll(String message) {
        mediator.sendMessageAll(message, userId);
    }

    @Override
    public void sendMessage(String message, String userTo) {
        mediator.sendMessage(message, userId, userTo);
    }

    @Override
    public void sendMessageToGroup(String message, UserGroup group) {
        mediator.sendMessageToGroup(message, userId, group);
    }

    @Override
    public void receiveMassage(String message, String userFrom) {
        System.out.println("User " + userId + " receives message: " + message + " from user " + userFrom);
    }
}
