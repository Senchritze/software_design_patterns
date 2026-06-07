import java.util.Map;
import java.util.Objects;

public class UserAuthenticationHandler extends AuthenticationHandler {
    private final Map<String, String> usersAccounts;

    public UserAuthenticationHandler(Map<String, String> usersAccounts) {
        this.usersAccounts = usersAccounts;
    }

    @Override
    protected boolean canHandle(Account account) {
        return account.getAccessType() == Account.AccessType.User;
    }

    @Override
    protected String checkAccess(Account account) {
        String passwordFromStorage = usersAccounts.get(account.getLogin());

        if (Objects.equals(account.getPassword(), passwordFromStorage)) {
            return "User access provided: " + account.getLogin();
        }

        return "Access denied: " + account.getLogin();
    }
}
