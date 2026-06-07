public interface ChatMediator {
    void registerUser(User user);

    void sendMessageAll(String message, String userFrom);

    void sendMessage(String message, String userFrom, String userTo);
}
