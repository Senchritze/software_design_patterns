public class Client {
    public static void main(String[] args) {
        ConcreteAggregate aggregate = new ConcreteAggregate();
        aggregate.add(new Element("A1"));
        aggregate.add(new Element("A2"));
        aggregate.add(new Element("A3"));

        Iterator iterator = aggregate.createIterator();

        iterator.first();
        while (!iterator.isDone()) {
            System.out.println(iterator.currentItem());
            iterator.next();
        }
    }
}
