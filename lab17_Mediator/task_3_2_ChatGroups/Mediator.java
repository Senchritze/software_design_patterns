public interface Mediator {
    void registerUser(User user);

    void sendMessageAll(String message, String userFrom);

    void sendMessage(String message, String userFrom, String userTo);

    void sendMessageToGroup(String message, String userFrom, UserGroup group);
}
