

```mermaid
classDiagram
    class BeverageCreator {
        <<abstract>>
        +createBeverage(): Beverage
        +orderBeverage(): Beverage
    }
    class Beverage {
        <<abstract>>
        -name: String
        +cost(): double
        +price(): double
        +profit(): double
    }
    class EspressoCreator { +createBeverage(): Beverage }
    class AmericanoCreator { +createBeverage(): Beverage }
    class CappuccinoCreator { +createBeverage(): Beverage }
    class LatteCreator { +createBeverage(): Beverage }
    class HotChocolateCreator { +createBeverage(): Beverage }
    class TeaCreator { +createBeverage(): Beverage }
    class Espresso { +cost() +price() }
    class Americano { +cost() +price() }
    class Cappuccino { +cost() +price() }
    class Latte { +cost() +price() }
    class HotChocolate { +cost() +price() }
    class Tea { +cost() +price() }
    class CoffeeShop {
        -creators: Map
        -totalRevenue: double
        +order(type): Beverage
        +printReport(): void
    }
    BeverageCreator <|-- EspressoCreator
    BeverageCreator <|-- AmericanoCreator
    BeverageCreator <|-- CappuccinoCreator
    BeverageCreator <|-- LatteCreator
    BeverageCreator <|-- HotChocolateCreator
    BeverageCreator <|-- TeaCreator
    Beverage <|-- Espresso
    Beverage <|-- Americano
    Beverage <|-- Cappuccino
    Beverage <|-- Latte
    Beverage <|-- HotChocolate
    Beverage <|-- Tea
    EspressoCreator ..> Espresso : creates
    AmericanoCreator ..> Americano : creates
    CappuccinoCreator ..> Cappuccino : creates
    LatteCreator ..> Latte : creates
    HotChocolateCreator ..> HotChocolate : creates
    TeaCreator ..> Tea : creates
    CoffeeShop --> BeverageCreator : uses
