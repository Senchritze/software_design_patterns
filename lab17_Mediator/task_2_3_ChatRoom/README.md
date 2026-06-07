# Месенджер

Реалізація патерну **Mediator** для чату, де обмін повідомленнями проходить через посередника `ChatRoom`.

GitHub-папка завдання:
https://github.com/oleksandrvatamaniuk2003/software_design_patterns/tree/main/lab17_Mediator/task_2_3

```mermaid
classDiagram
    class User {
        <<interface>>
        +sendMessageAll(String message)
        +sendMessage(String message, String userTo)
        +receiveMassage(String message, String userFrom)
        +getUserId() String
    }

    class ChatMediator {
        <<interface>>
        +registerUser(User user)
        +sendMessageAll(String message, String userFrom)
        +sendMessage(String message, String userFrom, String userTo)
    }

    class ChatRoom {
        -Map~String, User~ users
        +getInstance() ChatRoom
        +registerUser(User user)
        +sendMessageAll(String message, String userFrom)
        +sendMessage(String message, String userFrom, String userTo)
    }

    class ConcreteUser {
        -String userId
        -ChatMediator chatMediator
        +ConcreteUser(String userId)
        +sendMessageAll(String message)
        +sendMessage(String message, String userTo)
        +receiveMassage(String message, String userFrom)
        +getUserId() String
    }

    class Client {
        +main(String[] args)$
    }

    User <|.. ConcreteUser
    ChatMediator <|.. ChatRoom
    ConcreteUser --> ChatMediator
    Client --> ConcreteUser
```