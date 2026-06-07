public class Client {
    public static void main(String[] args) {
        final Originator originator = new Originator();
        final History history = new History();

        history.push(originator.save());
        originator.updateState("Hello");

        history.push(originator.save());
        originator.updateState(", ");

        history.push(originator.save());
        originator.updateState("World");

        history.push(originator.save());
        originator.updateState("!");

        originator.printState();
        undo(originator, history);
        originator.printState();
        undo(originator, history);
        originator.printState();
        undo(originator, history);
        originator.printState();
        undo(originator, history);
        originator.printState();
        undo(originator, history);
        originator.printState();
    }

    private static void undo(Originator originator, History history) {
        Originator.Memento previousState = history.pop();
        if (previousState != null) {
            originator.restore(previousState);
        }
    }
}