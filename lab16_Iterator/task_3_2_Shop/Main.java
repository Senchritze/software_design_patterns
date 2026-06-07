public class Main {
    public static void main(String[] args) {
        ShopItem pens = new ShopItem("pen", 175);
        ShopItem pencils = new ShopItem("pencil", 0);
        ShopItem paper = new ShopItem("paper", 500);
        ShopItem notebook = new ShopItem("notebook", 120);
        ShopItem eraser = new ShopItem("eraser", 80);

        Shop shop = new Shop();
        shop.putItem(pens);
        shop.putItem(pencils);
        shop.putItem(paper);
        shop.putItem(notebook);
        shop.putItem(eraser);

        System.out.println("Alphabetical order:");
        for (ShopItem item : shop) {
            System.out.println(item);
        }

        System.out.println();
        System.out.println("Quantity descending:");
        for (ShopItem item : shop.quantityDescendingIterable()) {
            System.out.println(item);
        }
    }
}
