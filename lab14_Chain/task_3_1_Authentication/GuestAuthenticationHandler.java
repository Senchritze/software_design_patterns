public class GuestAuthenticationHandler extends AuthenticationHandler {
    @Override
    protected boolean canHandle(Account account) {
        return account.getAccessType() == Account.AccessType.Guest;
    }

    @Override
    protected String checkAccess(Account account) {
        return "Guest access provided!";
    }
}
