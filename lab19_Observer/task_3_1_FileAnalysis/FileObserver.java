public interface FileObserver {
    void onLineRead(String line);

    default void onReadCompleted() {
    }
}
