public class Client {
    public static void main(String[] args) {
        Context context = new Context(new ConcreteStateA());

        System.out.println("Initial state: " + context.getState().getName());
        System.out.println();

        context.request();
        System.out.println();

        context.request();
        System.out.println();

        context.request();
    }
}
