public class SkodaFactory implements TransportFactory {
    @Override
    public String getManufacturerName() { return "Skoda"; }
    @Override
    public Bus createBus() { return new SkodaBus(); }
    @Override
    public Tram createTram() { return new SkodaTram(); }
    @Override
    public Trolleybus createTrolleybus() { return new SkodaTrolleybus(); }
}