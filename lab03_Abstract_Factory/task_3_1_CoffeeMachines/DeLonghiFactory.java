public class DeLonghiFactory implements CoffeeMachineFactory {
    @Override
    public String getManufacturerName() { return "DeLonghi"; }
    @Override
    public double getMachineCost() { return 35_000; }
    @Override
    public double getDailyMaintenanceCost() { return 150; }

    @Override public Espresso createEspresso() { return new DeLonghiEspresso(); }
    @Override public Cappuccino createCappuccino() { return new DeLonghiCappuccino(); }
    @Override
    public Latte createLatte() {
      return new DeLonghiLatte();
    }
}