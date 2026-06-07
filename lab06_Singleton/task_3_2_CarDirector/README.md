```mermaid
classDiagram
    class Director {
        -instance: Director$
        -engineBuilder: EngineBuilder
        -wheelBuilder: WheelBuilder
        -transmissionBuilder: TransmissionBuilder
        -carBuilder: CarBuilder
        -Director()
        +getInstance(): Director$
        +buildEconomySedan(): Car
        +buildBusinessSedan(): Car
        +buildOffRoadSUV(): Car
    }
    Director --> Director : instance
    Director --> CarBuilder
    Director --> EngineBuilder
    Director --> WheelBuilder
    Director --> TransmissionBuilder