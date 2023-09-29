<details style="margin-top: 16px">
  <summary style="cursor: pointer; color: blue;"><b>English</b></summary>

## Object-Oriented Programming (OOP)

Object-Oriented Programming (OOP) is a programming paradigm based on the concept of objects. It is a methodology for developing programs where objects are the central elements. Objects can have properties (attributes) and methods (functions) and can interact with each other.

### Key Concepts of OOP:

1. **Classes and Objects**:
   - **Class** is a template or blueprint that defines the structure and behavior of objects. It describes the attributes and methods that will be available to objects of that class.
   - **Object** is a specific instance of a class created based on its description. Objects can interact with each other, call methods, and exchange data.

2. **Encapsulation**:
   - Encapsulation is a concept where data (attributes) and methods that work with that data are encapsulated within a class. This hides the implementation details, providing only the necessary interface for interaction with the outside world.

3. **Inheritance**:
   - Inheritance allows the creation of new classes based on existing classes. It promotes code reuse and establishes a hierarchy of classes where child classes inherit properties and methods from parent classes.

4. **Polymorphism**:
   - Polymorphism enables objects of different classes to respond differently to the same method call. This simplifies a common interface for working with various types of objects.

### Advantages of OOP:

- **Modularity**: Programs are divided into small, independent objects, making the code more understandable and maintainable.
- **Code Reusability**: Inheritance allows the reuse of existing code to create new classes and objects.
- **Simplified Testing**: Classes and methods can be tested independently, facilitating code verification and debugging.
- **Improved Development Productivity**: OOP promotes effective project organization, reducing development time.

Object-Oriented Programming is widely used in modern programming and is a powerful tool for developing complex software systems.

## What Are Objects?

The world we live in is filled with various objects. If you look around, you'll see buildings, natural formations, cars, furniture, appliances, computers, and more. All these things can be considered as objects, each having its set of characteristics, functionality, and purpose.

We are accustomed to using objects to accomplish various tasks in our daily lives. For example, we use a car to commute to work, kitchenware to prepare food, and comfortable furniture for relaxation.

This object-oriented way of thinking has also found its place in programming. The approach that revolves around the use of objects is called Object-Oriented Programming (OOP).

### Example

Let's consider an example. Imagine that you've designed a new model of a smartphone and plan to start its mass production. As a developer, you know how it will function, the components it consists of (casing, microphone, speaker, wires, buttons, etc.), and how these components are interconnected.

However, you won't be assembling each smartphone yourself; you have a team of workers for that. To ensure uniformity in production and avoid having to provide instructions at every step, you need to create a detailed description of the smartphone's design. In object-oriented programming, this description is called a class, and objects are created from it during the program's execution.

A **class** is a kind of blueprint or description of an object that has not yet been created, but it defines its characteristics, methods, and the way it is constructed. An **object**, on the other hand, is a specific instance of a class created based on this description.

## Encapsulation in Java

Encapsulation is a concept in object-oriented programming that allows you to hide the internal implementation details of an object and provide only the necessary interface for interacting with it. In Java, encapsulation is achieved using access modifiers (private, protected, public) and getter and setter methods to access object attributes.

Example of encapsulation in Java:

```java
public class Person {
    private String name; // Private field

    public String getName() {
        return name; // Getter for reading the value of name
    }

    public void setName(String newName) {
        name = newName; // Setter for setting the value of name
    }
}

public class Main {
    public static void main(String[] args) {
        Person person = new Person();
        person.setName("John");
        System.out.println("Name: " + person.getName());
    }
}
```

In this example, the `name` attribute of the `Person` class is private, and we use a getter and setter to access this attribute. This way, we hide the implementation details of `name` and provide controlled access to it.

## Static Polymorphism (Method Overloading) in Java

Static polymorphism is a concept where the same method can have different implementations depending on the number and types of its arguments. This is achieved in Java through method overloading.

Example of static polymorphism (method overloading) in Java:

```java
public class Calculator {
    public int add(int a, int b) {
        return a + b;
    }

    public double add(double a, double b) {
        return a + b;
    }

    public String add(String a, String b) {
        return a + b;
    }
}

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println("Sum of integers: " + calculator.add(5, 10));
        System.out.println("Sum of doubles: " + calculator.add(2.5, 3.5));
        System.out.println("Concatenation of strings: " + calculator.add("Hello", " World"));
    }
}
```

In this code, the `add` method is overloaded to work with different data types (integers, doubles, and strings). Depending on the arguments passed, the appropriate version of the `add` method is called. This is known as static polymorphism or method overloading.



</details>

<hr>

<details style="margin-top: 16px">
  <summary style="cursor: pointer; color: blue;"><b>На русском</b></summary>


## объектно-ориентированное программирование (ООП)

Объектно-ориентированное программирование (ООП) - это парадигма программирования, которая базируется на концепции
объектов. Она представляет собой методологию разработки программ, где центральными элементами являются объекты, которые
могут иметь свойства (атрибуты) и методы (функции), а также взаимодействовать друг с другом.

### Основные концепции ООП:

1. **Классы и объекты**:
    - **Класс** - это шаблон или чертеж, определяющий структуру и поведение объектов. Он описывает атрибуты (свойства) и
      методы (функции), которые будут доступны объектам этого класса.
    - **Объект** - это конкретный экземпляр класса, который создается на основе его описания. Объекты могут
      взаимодействовать друг с другом, вызывать методы и обмениваться данными.

2. **Инкапсуляция**:
    - Инкапсуляция представляет собой концепцию, при которой данные (атрибуты) и методы, которые работают с этими
      данными, объединены внутри класса. Таким образом, объект скрывает детали реализации и предоставляет только
      необходимый интерфейс для взаимодействия с внешним миром.

3. **Наследование**:
    - Наследование позволяет создавать новые классы на основе существующих классов. Это способствует повторному
      использованию кода и созданию иерархии классов, где дочерние классы наследуют свойства и методы родительских
      классов.

4. **Полиморфизм**:
    - Полиморфизм позволяет объектам разных классов реагировать на одинаковые методы вызова по-разному. Это упрощает
      общий интерфейс для работы с различными типами объектов.

### Преимущества ООП:

- **Модульность**: Программа разбивается на небольшие, независимые объекты, что делает код более понятным и легко
  поддерживаемым.
- **Повторное использование кода**: Благодаря наследованию, можно повторно использовать существующий код для создания
  новых классов и объектов.
- **Упрощенное тестирование**: Классы и методы могут быть тестируемыми модулями, что облегчает проверку и отладку кода.
- **Увеличенная производительность разработки**: ООП способствует более эффективной организации работы над проектами и
  снижению времени разработки.

Объектно-ориентированное программирование широко используется в современном программировании и является мощным
инструментом для разработки сложных программных систем.

## Что такое объекты?

Мир, в котором мы существуем, насыщен разнообразными объектами. Если обратить внимание вокруг, можно увидеть, что нас
окружают здания, природные образования, автомобили, мебель, техника, компьютеры. Все эти вещи можно рассматривать как
объекты, и каждый из них обладает своим набором характеристик, функциональностью и предназначением.

Мы привыкли использовать объекты для выполнения разных задач в повседневной жизни. Например, для передвижения до места
работы мы используем автомобиль, для приготовления пищи – кухонную утварь, а для отдыха – удобную мебель.

Этот объектно-ориентированный способ мышления также нашел свое место в программировании. Подход, который основывается на
использовании объектов, называется объектно-ориентированным программированием (ООП).

### Пример

Давайте рассмотрим пример. Представьте, что вы создали новую модель смартфона и планируете начать его массовое
производство. Как разработчик, вы знаете, как он будет функционировать, из каких компонентов состоит (корпус, микрофон,
динамик, провода, кнопки и так далее). Вы знаете, как все эти компоненты соединяются друг с другом.

Однако вы не будете сами собирать каждый смартфон, у вас есть команда работников. Чтобы обеспечить однородность в
производстве и избежать необходимости давать инструкции на каждом этапе, вам нужно создать подробное описание устройства
смартфона. В объектно-ориентированном программировании, это описание называется классом, из которого создаются
конкретные экземпляры - объекты.

**Класс** - это своего рода чертеж, описание объекта, который еще не был создан, но определяет его характеристики,
методы и способ создания. **Объект**, в свою очередь, - это конкретный экземпляр класса, созданный на основе этого
описания.

## Инкапсуляция в Java:

Инкапсуляция - это концепция объектно-ориентированного программирования, которая позволяет скрыть внутренние детали реализации объекта и предоставить только необходимый интерфейс для взаимодействия с ним. В Java инкапсуляция достигается с помощью модификаторов доступа (private, protected, public) и методов получения (геттеров) и установки (сеттеров) для доступа к атрибутам объекта.

Пример инкапсуляции в Java:

```java
public class Person {
    private String name; // Приватное поле

    public String getName() {
        return name; // Геттер для чтения значения name
    }

    public void setName(String newName) {
        name = newName; // Сеттер для установки значения name
    }
}

public class Main {
    public static void main(String[] args) {
        Person person = new Person();
        person.setName("John");
        System.out.println("Имя: " + person.getName());
    }
}
```

В этом примере атрибут `name` класса `Person` является приватным, и мы используем геттер и сеттер для доступа к этому атрибуту. Таким образом, мы скрываем детали реализации `name` и обеспечиваем контролируемый доступ к нему.

## Статический полиморфизм (перегрузка методов) в Java:

Статический полиморфизм - это концепция, при которой один и тот же метод может иметь разные реализации, в зависимости от количества и типа его аргументов. Это достигается с помощью перегрузки методов в Java.

Пример статического полиморфизма (перегрузки методов) в Java:

```java
public class Calculator {
    public int add(int a, int b) {
        return a + b;
    }

    public double add(double a, double b) {
        return a + b;
    }

    public String add(String a, String b) {
        return a + b;
    }
}

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println("Сумма целых чисел: " + calculator.add(5, 10));
        System.out.println("Сумма дробных чисел: " + calculator.add(2.5, 3.5));
        System.out.println("Сумма строк: " + calculator.add("Hello", " World"));
    }
}
```

Здесь метод `add` перегружен для работы с разными типами данных (целыми числами, дробными числами и строками). В зависимости от переданных аргументов вызывается соответствующая версия метода `add`. Это называется статическим полиморфизмом или перегрузкой методов.

</details>
