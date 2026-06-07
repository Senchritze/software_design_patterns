public class Account {
    public enum AccessType {
        Administrator,
        Guest,
        User
    }

    private final AccessType accessType;
    private final String login;
    private final String password;

    private Account(AccessType accessType, String login, String password) {
        this.accessType = accessType;
        this.login = login;
        this.password = password;
    }

    public static Account createAdmin(String login, String password) {
        return new Account(AccessType.Administrator, login, password);
    }

    public static Account createUser(String login, String password) {
        return new Account(AccessType.User, login, password);
    }

    public static Account createGuest() {
        return new Account(AccessType.Guest, "guest", "");
    }

    public AccessType getAccessType() {
        return accessType;
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }
}
