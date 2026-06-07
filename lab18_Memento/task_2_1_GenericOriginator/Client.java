public class Client {
    public static void main(String[] args) {
        final Originator originator = new Originator();
        originator.updateState("Hello");
        originator.updateState(", ");
        originator.updateState("World");
        originator.updateState("!");
        originator.printState();
        originator.undo();
        originator.printState();
        originator.undo();
        originator.printState();
        originator.undo();
        originator.printState();
        originator.undo();
        originator.printState();
        originator.undo();
        originator.printState();
    }
}
