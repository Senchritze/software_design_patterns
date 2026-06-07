public class Client {
    public static void main(String[] args) {
        final Originator originator = new Originator();
        final Caretaker caretaker = new Caretaker();

        caretaker.backup(originator);

        originator.updateState("Hello");
        caretaker.backup(originator);

        originator.updateState(", ");
        caretaker.backup(originator);

        originator.updateState("World");
        caretaker.backup(originator);

        originator.updateState("!");
        caretaker.backup(originator);

        originator.printState();
        caretaker.undo(originator);
        originator.printState();
        caretaker.undo(originator);
        originator.printState();
        caretaker.undo(originator);
        originator.printState();
        caretaker.undo(originator);
        originator.printState();
        caretaker.undo(originator);
        originator.printState();
    }
}
