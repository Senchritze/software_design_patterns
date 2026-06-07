public class Main {
    public static void main(String[] args) {
        CollectionIntegers integers = new CollectionIntegers();
        integers.add(110);
        integers.add(312);
        integers.add(111);
        integers.add(813);
        integers.add(131);
        integers.add(140);

        System.out.println("Original collection: " + integers);
        System.out.println("Element at index 2: " + integers.get(2));
        System.out.println("Numbers in ascending order:");

        for (Integer integer : integers) {
            System.out.println(integer);
        }
    }
}