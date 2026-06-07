public class Bread implements Groceries {
    private double price = 1.0;

    public Bread() {
    }

    public Bread(double price) {
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
        return visitor.visitBread(this);
    }
}
