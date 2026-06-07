# lab01_UML / task_3_3 — UML діаграма класів проекту

Завдання: **зобразити UML-діаграму класів проекту**. Проект реалізує патерн
**Composite (Компонувальник)**: клієнт працює з окремою книгою та з колекцією
книг через один інтерфейс `Readable`.

| Роль у патерні | Клас |
|---|---|
| Component | `Readable` (interface) |
| Leaf | `Book`, `FictionBook`, `NonfictionBook` |
| Composite | `BookCollection` |
| Client | `LibraryClient` |

`BookCollection` теж реалізує `Readable` і зберігає список `children`,
делегуючи `checkout()` / `returnBook()` усім дочірнім елементам.

## Діаграма класів

```mermaid
classDiagram
    class Readable {
        <<interface>>
        +checkout() void
        +returnBook() void
    }
    class Book {
        #name : String
        #checkedOut : boolean
        +Book(name, checkedOut)
        +checkout() void
        +returnBook() void
    }
    class FictionBook {
        -isAPlay : boolean
        +FictionBook(name, isAPlay)
    }
    class NonfictionBook {
        +NonfictionBook(name)
    }
    class BookCollection {
        -children : List~Readable~
        +getChildren() List~Readable~
        +add(Readable) void
        +remove(Readable) void
        +checkout() void
        +returnBook() void
    }
    class LibraryClient {
        +main(String[]) void$
        +checkoutReadable(Readable) void$
        +returnReadable(Readable) void$
    }
    Readable <|.. Book
    Readable <|.. BookCollection
    Book <|-- FictionBook
    Book <|-- NonfictionBook
    BookCollection o--> "0..*" Readable : children
    LibraryClient ..> Readable
```

Та сама діаграма як зображення: [`img/diagram.svg`](img/diagram.svg).

## Запуск

```bash
javac *.java && java LibraryClient
```
