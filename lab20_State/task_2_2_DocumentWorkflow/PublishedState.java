public class PublishedState implements DocumentState {
    @Override
    public void publish(Document document, String user) {
        System.out.println("Document is already published.");
    }

    @Override
    public void abandon(Document document, String user) {
        if (document.isAdmin(user)) {
            document.changeState(new DraftState());
        } else {
            System.out.println("Only admin can unpublish the document.");
        }
    }

    @Override
    public String getName() {
        return "Published";
    }
}
