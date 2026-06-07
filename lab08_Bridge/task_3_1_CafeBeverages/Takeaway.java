public class Takeaway implements ServingMode {
    @Override
    public void serve() { System.out.println("Packed in a takeaway cup with lid."); }



    @Override
    public String label() { return "Takeaway"; }
}



