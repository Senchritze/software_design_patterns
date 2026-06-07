public class Milk implements Groceries {
    private double price = 2.0;

    public Milk() {
    }

    public Milk(double price) {
        this.price = price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getBasePrice() {
        return price;
    }

    @Override
    public <T> T accept(GroceryVisitor<T> visitor) {
        return visitor.visitMilk(this);
    }
}
