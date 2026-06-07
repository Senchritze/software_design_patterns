public class DineIn implements ServingMode {
    @Override
    public void serve() { System.out.println("Served in a ceramic cup for dine-in."); }
    @Override
    public String label() { return "Dine-in"; }
}