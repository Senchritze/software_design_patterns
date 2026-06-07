import java.util.Map;
import java.util.Objects;

public class AdministratorAuthenticationHandler extends AuthenticationHandler {
    private final Map<String, String> adminsAccounts;

    public AdministratorAuthenticationHandler(Map<String, String> adminsAccounts) {
        this.adminsAccounts = adminsAccounts;
    }

    @Override
    protected boolean canHandle(Account account) {
        return account.getAccessType() == Account.AccessType.Administrator;
    }

    @Override
    protected String checkAccess(Account account) {
        String passwordFromStorage = adminsAccounts.get(account.getLogin());

        if (Objects.equals(account.getPassword(), passwordFromStorage)
                && account.getPassword().length() >= 8) {
            return "Administrator access provided: " + account.getLogin();
        }

        return "Access denied: " + account.getLogin();
    }
}
