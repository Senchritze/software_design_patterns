public class Client {
    public static void main(String[] args) {
        Publisher publisher = new Publisher();

        Subscriber anna = new Subscriber("Anna");
        Subscriber petro = new Subscriber("Petro");
        Subscriber ivan = new Subscriber("Ivan");

        publisher.attach(anna);
        publisher.attach(petro);
        publisher.attach(ivan);

        publisher.publishNews("New issue of Design Patterns Journal");

        publisher.detach(petro);

        publisher.publishNews("Observer pattern lab was published");

        System.out.println("Anna last news: " + anna.getLastNews());
        System.out.println("Petro last news: " + petro.getLastNews());
        System.out.println("Ivan last news: " + ivan.getLastNews());
    }
}
