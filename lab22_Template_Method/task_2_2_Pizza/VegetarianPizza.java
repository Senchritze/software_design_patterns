public class VegetarianPizza extends Pizza {
    @Override
    protected void addToppings() {
        System.out.println("Add tomato");
        System.out.println("Add cheese");
        System.out.println("Add peppers");
        System.out.println("Add olives");
    }

    @Override
    protected void cook() {
        System.out.println("Cook in the oven for 15 minutes");
    }
}
