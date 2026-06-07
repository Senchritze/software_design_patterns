public class BoschFactory implements CoffeeMachineFactory {
    @Override public String getManufacturerName() { return "Bosch"; }
    @Override public double getMachineCost() { return 25_000; }

    @Override
    public double getDailyMaintenanceCost() {
        return 120;
    }

    @Override public Espresso createEspresso() { return new BoschEspresso(); }
    @Override public Cappuccino createCappuccino() { return new BoschCappuccino(); }
    @Override public Latte createLatte() { return new BoschLatte(); }
}