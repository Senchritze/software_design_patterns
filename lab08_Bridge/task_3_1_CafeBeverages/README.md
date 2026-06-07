```mermaid
classDiagram
    class Beverage {
        <<abstract>>
        #sugar: int
        #addition: BeverageAddition
        #servingMode: ServingMode
        +prepare()
        +drink()
        +cost(): int
    }
    class BeverageAddition {
        <<interface>>
        +add(sugar: int)
        +extraCost(): int
    }
    class ServingMode {
        <<interface>>
        +serve()
        +label(): String
    }

    Beverage <|-- Coffee
    Beverage <|-- Tee
    Beverage <|-- Chocolate
    BeverageAddition <|.. BlackAddition
    BeverageAddition <|.. MilkAddition
    ServingMode <|.. DineIn
    ServingMode <|.. Takeaway
    Beverage o-- BeverageAddition
    Beverage o-- ServingMode