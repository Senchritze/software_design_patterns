public abstract class AuthenticationHandler {
    private AuthenticationHandler next;

    public AuthenticationHandler linkWith(AuthenticationHandler next) {
        this.next = next;
        return next;
    }

    public String authenticate(Account account) {
        if (canHandle(account)) {
            return checkAccess(account);
        }

        if (next != null) {
            return next.authenticate(account);
        }

        return "Access denied: " + account.getLogin();
    }

    protected abstract boolean canHandle(Account account);

    protected abstract String checkAccess(Account account);
}
