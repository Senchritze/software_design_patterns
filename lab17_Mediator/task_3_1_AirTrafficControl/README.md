# Симулятор польотів

У цьому завданні виконано рефакторинг стартового коду за патерном **Mediator**.
Клас `FlightControlTower` централізує взаємодію між `Plane`, `Runway`, `PlanesInFlight` і `PlanesOnGround`, тому літак не керує цими об’єктами напряму.

GitHub-папка: https://github.com/oleksandrvatamaniuk2003/software_design_patterns/tree/main/lab17_Mediator/task_3_1

## Запуск

```bash
javac *.java
java Main
```

## Mermaid UML

```mermaid
classDiagram
    class FlightMediator {
        <<interface>>
        +registerPlane(plane: Plane)
        +requestTakeOff(plane: Plane)
        +requestLanding(plane: Plane)
    }

    class FlightControlTower {
        -Runway runway
        -PlanesInFlight planesInFlight
        -PlanesOnGround planesOnGround
        +registerPlane(plane: Plane)
        +requestTakeOff(plane: Plane)
        +requestLanding(plane: Plane)
    }

    class Plane {
        -boolean isInTheAir
        -int id
        -FlightMediator mediator
        +Plane(id: int, mediator: FlightMediator)
        +takeOff()
        +land()
        +getIsInTheAir() boolean
        +setIsInTheAir(isInTheAir: boolean)
        +getId() int
    }

    class Runway {
        -boolean isAvailable
        +setIsAvailable(isAvailable: boolean)
        +getIsAvailable() boolean
    }

    class PlanesInFlight {
        -List~Plane~ planes
        +addPlane(plane: Plane)
        +removePlane(plane: Plane)
        +toString() String
    }

    class PlanesOnGround {
        -List~Plane~ planes
        +addPlane(plane: Plane)
        +removePlane(plane: Plane)
        +toString() String
    }

    FlightMediator <|.. FlightControlTower
    Plane --> FlightMediator
    FlightControlTower --> Runway
    FlightControlTower --> PlanesInFlight
    FlightControlTower --> PlanesOnGround
    PlanesInFlight --> Plane
    PlanesOnGround --> Plane
```
