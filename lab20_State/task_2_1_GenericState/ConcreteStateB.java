public class ConcreteStateB implements State {
    @Override
    public void handle(Context context) {
      System.out.println("ConcreteStateB handles the request.");
      context.setState(new ConcreteStateA());
    }

    @Override public String getName() { return "ConcreteStateB"; }
}
