public class Main {
    public static void main(String[] args) {
        Director d1 = Director.getInstance();
        Director d2 = Director.getInstance();

        System.out.println("Same instance? " + (d1 == d2));
        System.out.println();

        System.out.println("Economy Sedan:");
        System.out.println(d1.buildEconomySedan());

        System.out.println("-- Business Sedan --");
        System.out.println(d2.buildBusinessSedan());

        System.out.println("Off-Road SUV:");
        System.out.println(d1.buildOffRoadSUV());
    }
}