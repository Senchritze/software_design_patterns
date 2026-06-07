```mermaid
classDiagram
    class Equation {
        <<abstract>>
        #coeffs: double[]
        +solve(): List~Double~
        +toExpression(): String
        +clone(): Equation
    }
    class LinearEquation {
        -b: double
        -c: double
        +solve(): List~Double~
        +clone(): LinearEquation
    }
    class QuadraticEquation {
        #a: double
        #b: double
        #c: double
        +solve(): List~Double~
        +clone(): QuadraticEquation
    }
    class BiQuadraticEquation {
        -a: double
        -b: double
        -c: double
        +solve(): List~Double~
        +clone(): BiQuadraticEquation
    }

    Equation <|-- LinearEquation
    Equation <|-- QuadraticEquation
    Equation <|-- BiQuadraticEquation
    Equation ..|> Cloneable