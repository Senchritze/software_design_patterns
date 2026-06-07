```mermaid
classDiagram
    class Car {
        -type: Type
        -carColor: CarColor
        -engine: Engine
        -wheel: Wheel
        -transmission: Transmission
        +clone(): Car
    }
    class Engine {
        -power -torque -fuel -volume
        +clone(): Engine
    }
    class Wheel {
        -material -diameter
        +clone(): Wheel
    }
    class Transmission {
        -type -gears
        +clone(): Transmission
    }

    Car ..|> Cloneable
    Engine ..|> Cloneable
    Wheel ..|> Cloneable
    Transmission ..|> Cloneable
    Car *-- Engine
    Car *-- Wheel
    Car *-- Transmission