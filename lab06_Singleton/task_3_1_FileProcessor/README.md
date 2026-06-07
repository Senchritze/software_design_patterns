```mermaid
classDiagram
    class FileProcessor {
        -instance: FileProcessor$
        -FileProcessor()
        +getInstance(): FileProcessor$
        +readLines(filename): List~String~
        +readAll(filename): String
        +countWords(filename): int
        +countLines(filename): int
        +findLines(filename, keyword): List~String~
    }
    FileProcessor --> FileProcessor : instance