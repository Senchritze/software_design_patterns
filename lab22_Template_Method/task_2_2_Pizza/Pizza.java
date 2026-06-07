public abstract class Pizza {
    protected void makeBase() {
        System.out.println("Mix flour, yeast and salt");
        System.out.println("Roll out the dough");
    }

    protected abstract void addToppings();

    protected abstract void cook();

    public final void printInstructions() {
        makeBase();
        addToppings();
        cook();
        System.out.println();
    }
}
