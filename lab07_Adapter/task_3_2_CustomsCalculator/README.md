```mermaid
classDiagram
    class Customs {
        <<interface>>
        +vehiclePrice(auto: Auto): float
        +tax(auto: Auto): float
        +totalCost(auto: Auto): float
    }
    class VehicleCalculator {
        <<interface>>
        +setVehicle(v: Vehicle)
        +calculatePrice(): String
    }
    class VehicleCalculatorAdapter {
        -calculator: VehicleCalculator
        -USD_TO_UAH: float
        -TAX_RATE: float
        +vehiclePrice(auto): float
        +tax(auto): float
        +totalCost(auto): float
        -toVehicle(auto): Vehicle
        -parsePriceUsd(str): float
    }
    class Auto {
        -model: String
        -age: int
        -damaged: boolean
        -mileage: int
    }
    class Vehicle { -model -age -damaged -mileage }
    class CarCalculator
    class TruckCalculator

    Customs <|.. VehicleCalculatorAdapter
    VehicleCalculator <|.. CarCalculator
    VehicleCalculator <|.. TruckCalculator
    VehicleCalculatorAdapter o-- VehicleCalculator
    VehicleCalculatorAdapter ..> Auto : uses
    VehicleCalculatorAdapter ..> Vehicle : creates