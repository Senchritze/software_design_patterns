import java.util.Random;

public class Main {
    public static void main(String[] args) {
        CoffeeShop shop = new CoffeeShop("MechMat Mall Coffee");
        BeverageType[] types = BeverageType.values();
        Random rnd = new Random(42);

        System.out.println("Simulating 20 customer orders...");
        for (int i=1; i<=20; i++) {
            System.out.printf("%2d. ", i);
            BeverageType t = types[rnd.nextInt(types.length)];
            Beverage b = shop.order(t);
            System.out.println("    → " + b);
        }

        shop.printReport();
    }
}
