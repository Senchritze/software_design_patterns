public class DraftState implements DocumentState {
    @Override
    public void publish(Document document, String user) {
        if (document.isAdmin(user)) {
            document.changeState(new PublishedState());
        } else {
            document.changeState(new ModerationState());
        }
    }

    @Override
    public void abandon(Document document, String user) {
        System.out.println("Draft document cannot be abandoned.");
    }

    @Override
    public String getName() {
        return "Draft";
    }
}
