public class Originator {
    private String state = "";

    public void printState() {
        System.out.println(state);
    }

    public void updateState(String toUpdate) {
        this.state += toUpdate;
    }

    public Memento save() {
        return new Snapshot(state);
    }

    public void restore(Memento memento) {
        if (!(memento instanceof Snapshot)) {
            throw new IllegalArgumentException("Unsupported memento type");
        }
        this.state = ((Snapshot) memento).state;
    }

    private static class Snapshot implements Memento {
        private final String state;

        private Snapshot(String state) {
            this.state = state;
        }
    }
}
