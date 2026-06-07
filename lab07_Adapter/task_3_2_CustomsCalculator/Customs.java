public interface Customs {
    float vehiclePrice(Auto auto);
    float tax(Auto auto);
    float totalCost(Auto auto); // vehiclePrice + tax
}