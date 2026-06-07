public interface DocumentState {
    void publish(Document document, String user);

    void abandon(Document document, String user);

    String getName();
}
