```mermaid
classDiagram
    class TransportFactory {
        <<interface>>
        +getManufacturerName(): String
        +createBus(): Bus
        +createTram(): Tram
        +createTrolleybus(): Trolleybus
    }
    class Bus { <<abstract>> +getCost() +getUsageCost() }
    class Tram { <<abstract>> +getCost() +getUsageCost() }
    class Trolleybus { <<abstract>> +getCost() +getUsageCost() }

    TransportFactory <|.. VolvoFactory
    TransportFactory <|.. SkodaFactory
    TransportFactory <|.. HyundaiFactory

    Bus <|-- VolvoBus
    Bus <|-- SkodaBus
    Bus <|-- HyundaiBus
    Tram <|-- VolvoTram
    Tram <|-- SkodaTram
    Tram <|-- HyundaiTram
    Trolleybus <|-- VolvoTrolleybus
    Trolleybus <|-- SkodaTrolleybus
    Trolleybus <|-- HyundaiTrolleybus

    VolvoFactory ..> VolvoBus : creates
    VolvoFactory ..> VolvoTram : creates
    VolvoFactory ..> VolvoTrolleybus : creates
    SkodaFactory ..> SkodaBus : creates
    HyundaiFactory ..> HyundaiBus : creates

    TransportPark --> TransportFactory : uses
