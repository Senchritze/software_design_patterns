public interface State {
    void handle(Context context);
    String getName();
}
