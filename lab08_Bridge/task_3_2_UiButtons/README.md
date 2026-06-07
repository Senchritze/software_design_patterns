```mermaid
classDiagram
    class Button {
        <<abstract>>
        #size: ButtonSize
        +draw()
    }
    class ButtonSize {
        <<interface>>
        +getSizeLabel(): String
        +getPixelSize(): int
    }

    Button <|-- CheckboxButton
    Button <|-- RadioButton
    Button <|-- DropdownButton
    Button <|-- ImageButton

    ButtonSize <|.. SmallSize
    ButtonSize <|.. MediumSize
    ButtonSize <|.. LargeSize
    ButtonSize <|.. UserSize

    Button o-- ButtonSize