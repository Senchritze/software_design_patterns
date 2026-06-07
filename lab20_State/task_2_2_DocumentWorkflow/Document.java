public class Document {
    private DocumentState state;
    private String text = "";

    public Document() {
        this.state = new DraftState();
        System.out.println("Document created. Current state: " + state.getName());
    }

    public void publish(String user) {
        System.out.println("Publish requested by " + user + ".");
        state.publish(this, user);
    }

    public void abandon(String user) {
        System.out.println("Abandon requested by " + user + ".");
        state.abandon(this, user);
    }

    public void changeState(DocumentState newState) {
        String oldStateName = state.getName();
        this.state = newState;
        System.out.println("State changed: " + oldStateName + " -> " + newState.getName());
    }

    public boolean isAdmin(String user) {
        return "admin".equalsIgnoreCase(user);
    }

    public String getStateName() {
        return state.getName();
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
        System.out.println("Text updated: " + text);
    }
}
