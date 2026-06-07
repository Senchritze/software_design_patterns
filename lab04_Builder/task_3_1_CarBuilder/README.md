```mermaid
classDiagram
    class CarBuilder {
        -type: Car.Type
        -color: Car.CarColor
        -engine: Engine
        -wheel: Wheel
        -transmission: Transmission
        +setType(): CarBuilder
        +setColor(): CarBuilder
        +setEngine(): CarBuilder
        +setWheel(): CarBuilder
        +setTransmission(): CarBuilder
        +build(): Car
    }
    class EngineBuilder {
        -power -torque -fuel -volume
        +setPower() +setTorque() +setFuel() +setVolume()
        +build(): Engine
    }
    class WheelBuilder {
        -material -diameter
        +setMaterial() +setDiameter()
        +build(): Wheel
    }
    class TransmissionBuilder {
        -type -gears
        +setType() +setGears()
        +build(): Transmission
    }
    class Director {
        -engineBuilder -wheelBuilder -transmissionBuilder -carBuilder
        +buildEconomySedan(): Car
        +buildBusinessSedan(): Car
        +buildOffRoadSUV(): Car
        +buildElectricHatchback(): Car
    }
    class Car { -type -carColor -engine -wheel -transmission }
    class Engine { -power -torque -fuel -volume }
    class Wheel { -material -diameter }
    class Transmission { -type -gears }

    Director --> EngineBuilder
    Director --> WheelBuilder
    Director --> TransmissionBuilder
    Director --> CarBuilder
    CarBuilder ..> Car : builds
    EngineBuilder ..> Engine : builds
    WheelBuilder ..> Wheel : builds
    TransmissionBuilder ..> Transmission : builds
    Car *-- Engine
    Car *-- Wheel
    Car *-- Transmission