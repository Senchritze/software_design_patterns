public interface User {
    String getUserId();

    UserGroup getGroup();

    void sendMessageAll(String message);

    void sendMessage(String message, String userTo);

    void sendMessageToGroup(String message, UserGroup group);

    void receiveMassage(String message, String userFrom);
}
