public class Client {
    public static void main(String[] args) {
        ConcreteUser user1 = new ConcreteUser("User1", UserGroup.USERS);
        ConcreteUser user2 = new ConcreteUser("User2", UserGroup.ADMINISTRATORS);
        ConcreteUser user3 = new ConcreteUser("User3", UserGroup.MODERATORS);
        ConcreteUser user4 = new ConcreteUser("User4", UserGroup.ADMINISTRATORS);

        user1.sendMessageAll("Hello, world!");
        user2.sendMessage("Hello!", "User1");
        user1.sendMessageToGroup("Message for administrators.", UserGroup.ADMINISTRATORS);
        user4.sendMessageToGroup("Message for moderators.", UserGroup.MODERATORS);
    }
}
