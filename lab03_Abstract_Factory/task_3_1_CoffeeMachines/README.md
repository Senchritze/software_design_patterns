```mermaid
classDiagram
    class CoffeeMachineFactory {
        <<interface>>
        +getManufacturerName(): String
        +getMachineCost(): double
        +getDailyMaintenanceCost(): double
        +createEspresso(): Espresso
        +createCappuccino(): Cappuccino
        +createLatte(): Latte
    }
    class Beverage { <<abstract>> +cost() +price() +profit() }
    class Espresso { <<abstract>> }
    class Cappuccino { <<abstract>> }
    class Latte { <<abstract>> }

    CoffeeMachineFactory <|.. JuraFactory
    CoffeeMachineFactory <|.. DeLonghiFactory
    CoffeeMachineFactory <|.. BoschFactory

    Beverage <|-- Espresso
    Beverage <|-- Cappuccino
    Beverage <|-- Latte

    Espresso <|-- JuraEspresso
    Espresso <|-- DeLonghiEspresso
    Espresso <|-- BoschEspresso
    Cappuccino <|-- JuraCappuccino
    Cappuccino <|-- DeLonghiCappuccino
    Cappuccino <|-- BoschCappuccino
    Latte <|-- JuraLatte
    Latte <|-- DeLonghiLatte
    Latte <|-- BoschLatte

    JuraFactory ..> JuraEspresso : creates
    JuraFactory ..> JuraCappuccino : creates
    JuraFactory ..> JuraLatte : creates
    CoffeeShop --> CoffeeMachineFactory : uses
