public abstract class Beverage {
    protected final String name;

    public Beverage(String name) { this.name = name; }

    public abstract double cost();

    
    public abstract double price();

    public double profit() { return price() - cost(); }
    public String getName() { return name; }


    @Override
    public String toString() {
        return String.format("%-12s cost=%5.1f  price=%5.1f  profit=%5.1f",
                name, cost(), price(), profit());
    }
}
