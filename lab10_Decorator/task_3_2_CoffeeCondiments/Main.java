public class Main {
    public static void main(String[] args) {
        Beverage espresso = new Espresso();
        System.out.println(espresso);

        Beverage darkRoast = new Whip(
                new Milk(
                        new Mocha(new DarkRoast())));
        System.out.println(darkRoast);

        Beverage decaf = new Milk(new Whip(new Decaf()));
        System.out.println(decaf);

        Beverage doubleWhipEspresso = new Whip(new Whip(new Espresso()));
        System.out.println(doubleWhipEspresso);
    }
}
