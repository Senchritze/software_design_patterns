public class ConcreteStateA implements State {
    @Override public void handle(Context context) {
        System.out.println("ConcreteStateA handles the request.");
        context.setState(new ConcreteStateB());
    }

    @Override
    public String getName() {
        return "ConcreteStateA";
    }
}
