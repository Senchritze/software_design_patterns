public abstract class Colleague {
    private final String name;
    protected Mediator mediator;

    public Colleague(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    public void sendMessage(String message, String receiverName) {
        if (mediator == null) {
            System.out.println("Mediator is not set for " + name);
            return;
        }

        System.out.println(name + " sends to " + receiverName + ": " + message);
        mediator.sendMessage(message, this, receiverName);
    }

    public abstract void receiveMessage(String message, String senderName);
}
