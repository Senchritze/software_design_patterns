public interface TransportFactory {
    String getManufacturerName();
    Bus createBus();
    Tram createTram();
    Trolleybus createTrolleybus();
}
