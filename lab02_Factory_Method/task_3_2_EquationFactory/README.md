```mermaid
classDiagram
    class Equation {
        <<abstract>>
        #coeffs: double[]
        +solve(): List~Double~
        +toExpression(): String
    }
    class LinearEquation { -b -c +solve() }
    class QuadraticEquation { #a #b #c +solve() }
    class BiQuadraticEquation { -a -b -c +solve() }
    class EquationCreator {
        <<abstract>>
        +createEquation(coeffs: double[]): Equation
    }
    class LinearCreator { +createEquation() }
    class QuadraticCreator { +createEquation() }
    class BiQuadraticCreator { +createEquation() }
    class EquationFactory {
        -creators: Map~Integer, EquationCreator~
        +create(coeffs: double[]): Equation
    }
    class EquationAnalyzer {
        +analyze(filename: String): void
        -readEquations(filename): List~Equation~
    }

    Equation <|-- LinearEquation
    Equation <|-- QuadraticEquation
    Equation <|-- BiQuadraticEquation
    EquationCreator <|-- LinearCreator
    EquationCreator <|-- QuadraticCreator
    EquationCreator <|-- BiQuadraticCreator
    LinearCreator ..> LinearEquation : creates
    QuadraticCreator ..> QuadraticEquation : creates
    BiQuadraticCreator ..> BiQuadraticEquation : creates
    EquationFactory --> EquationCreator : uses
    EquationAnalyzer --> EquationFactory : uses
