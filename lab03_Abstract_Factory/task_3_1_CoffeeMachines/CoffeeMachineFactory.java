public interface CoffeeMachineFactory {
    String getManufacturerName();
    double getMachineCost();
    double getDailyMaintenanceCost();

    Espresso createEspresso();
    Cappuccino createCappuccino();
    Latte createLatte();
}
