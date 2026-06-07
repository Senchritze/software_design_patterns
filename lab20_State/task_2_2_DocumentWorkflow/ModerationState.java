public class ModerationState implements DocumentState {
    @Override
    public void publish(Document document, String user) {
        if (document.isAdmin(user)) {
            document.changeState(new PublishedState());
        } else {
            System.out.println("Only admin can publish a document after moderation.");
        }
    }

    @Override
    public void abandon(Document document, String user) {
        if (document.isAdmin(user)) {
            document.changeState(new DraftState());
        } else {
            System.out.println("Only admin can return the document to draft.");
        }
    }

    @Override
    public String getName() {
        return "Moderation";
    }
}
