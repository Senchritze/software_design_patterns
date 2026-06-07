public interface Mediator {
    void registerColleague(Colleague colleague);

    void sendMessage(String message, Colleague sender, String receiverName);
}
