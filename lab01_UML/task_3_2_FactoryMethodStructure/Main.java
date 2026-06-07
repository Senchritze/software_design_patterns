public class Main {
    public static void main(String[] args) {
        Creator c1 = new ConcreteCreator1();
        c1.someOperation();

        Creator c2 = new ConcreteCreator2(); c2.someOperation();
    }
}
