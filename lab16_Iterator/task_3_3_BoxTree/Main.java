import java.util.Iterator;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random(42);
        final Box root = new Box(-999);

        for (int j = 0; j < 10; j++) {
            final Box box = new Box(j);
            root.add(box);

            for (int i = 0; i < 10; i++) {
                String name = String.format("Item_%s", j * 10 + i);
                int value = random.nextInt(1000);
                final Item item = new Item(name, value);
                box.add(item);
            }
        }

        System.out.println("Composite execution:");
        root.execute();

        System.out.println();
        System.out.println("DFS traversal:");
        printTraversal(root.depthFirstIterator());
        System.out.println("Cheapest item (DFS): " + ItemSearch.findCheapest(root.depthFirstIterator()));
        System.out.println("Most expensive item (DFS): " + ItemSearch.findMostExpensive(root.depthFirstIterator()));

        System.out.println();
        System.out.println("BFS traversal:");
        printTraversal(root.breadthFirstIterator());
        System.out.println("Cheapest item (BFS): " + ItemSearch.findCheapest(root.breadthFirstIterator()));
        System.out.println("Most expensive item (BFS): " + ItemSearch.findMostExpensive(root.breadthFirstIterator()));
    }

    private static void printTraversal(Iterator<Component> iterator) {
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
