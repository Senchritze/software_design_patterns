public class JuraFactory implements CoffeeMachineFactory {
    @Override public String getManufacturerName() { return "Jura"; }
    @Override public double getMachineCost() { return 50_000; }
    @Override public double getDailyMaintenanceCost() { return 200; }

    @Override public Espresso createEspresso() { return new JuraEspresso(); }
    @Override public Cappuccino createCappuccino() { return new JuraCappuccino(); }
    @Override public Latte createLatte() { return new JuraLatte(); }
}