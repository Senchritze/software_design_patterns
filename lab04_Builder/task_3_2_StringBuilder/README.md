```mermaid
classDiagram
    class IStringBuilder {
        <<interface>>
        +append(s: String): IStringBuilder
        +insert(position: int, s: String): IStringBuilder
        +appendLine(s: String): IStringBuilder
        +prepend(s: String): IStringBuilder
        +build(): StringProduct
        +reset(): void
    }
    class CustomStringBuilder {
        -buffer: StringBuilder
        +append(s): IStringBuilder
        +insert(pos, s): IStringBuilder
        +appendLine(s): IStringBuilder
        +prepend(s): IStringBuilder
        +build(): StringProduct
        +reset(): void
        +peek(): String
    }
    class StringProduct {
        -value: String
        +getValue(): String
        +length(): int
        +toString(): String
    }

    IStringBuilder <|.. CustomStringBuilder
    CustomStringBuilder ..> StringProduct : builds