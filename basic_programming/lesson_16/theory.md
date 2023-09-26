<details style="margin-top: 16px">
  <summary style="cursor: pointer; color: blue;"><b>English</b></summary>

# Introduction to OOP

## OOP: what is it?

**OOP** -
this is [paradigm](https://ru.wikipedia.org/wiki/%D0%9F%D0%B0%D1%80%D0%B0%D0%B4%D0%B8%D0%B3%D0%BC%D0%B0_%D0%BF%D1%80%D0%BE%D0%B3%D1%80%D0%B0%D0%BC%D0%BC%D0%B8%D1%80%D0%BE%D0%B2%D0%B0%D0%BD%D0%B8%D1%8F)
programming, based on the representation of a program as a set of interacting **objects**.

- **Object** is a software entity that has its own **state** and **behavior**.
- **The state of an object** is the data it contains.
- **An object's behavior** is the actions it can perform.

**Basic concepts of OOP:** classes, objects, methods, attributes

- **Class** is a **template** that describes the properties and behavior of an object.
- **Object** is an instance of a class that has its own property values and can perform actions,
  described
  methods.
- **Method** is a function that belongs to a class. Describing the behavior of an object, the actions it can perform
- **Class attribute/field** is a variable that belongs to a class. More often called **class field**

Programming is like building objects. Every program consists of many objects and OOP helps us
manage these objects better.

#### Examples of objects from life:

___
**Automobile**

**Object State/Attribute/Class Field**: Macra, model, power, fuel type, color...

**Object Behavior/Method**: For example, a car can drive, refuel, honk, turn, brake...
___
**File**

**Object State/Attribute/Class Field**: Size, type, name, location, creation date, modification date...

**Object Behavior/Method**: Open, change name or location, read, close....

**House**
**Object State/Attribute/Class Field**: address, number of floors, area, number of rooms...

**Property behavior/Method**: build, repair, sell, move in, leave....
___

### More details

**Car**

**Attributes:**

- Brand: a string containing the make of the car.
- Model: a string containing the machine model.
- Year of manufacture: an integer indicating the year of manufacture of the machine.
- Color: a string containing the color of the car.
- Mileage: an integer indicating the vehicle's mileage in kilometers.

**Methods:**

- Drive: a method that makes the car move.
- Turn: A method that makes the car turn.
- Brake: a method that causes the car to brake.
- Park: a method that forces the car to park.
- Refuel: a method that refills the car with fuel.
- Repair: a method that repairs a machine.

___

### There are four basic principles in OOP:

1. **ENCAPSULATION**
2. **INHERITANCE**
3. **POLYMORPHISM**
4. **ABSTRACTION**

**Today we will focus on encapsulation.**

# Encapsulation

## What is encapsulation?

**Encapsulation** is the combination of data and methods in one class.

**Encapsulation** is one of the key principles of OOP, which allows you to hide the implementation details of an object
and provide
only the necessary interface to interact with it. It's like wrapping a gift - you only see the outside, but
don't know what's inside.

## Access modifiers

In Java, to implement encapsulation, we use access modifiers. There are three main modifiers
access: `public`, `private` and `protected`.

- `public` is as if you gave everyone access to your gift.
- `private` is like locking a gift in a safe and giving access only to you.
- `protected` is a gift that you give only to your family and friends. (we'll look at it in more detail later)

## Getters and setters (Getters/Setters)

Getters and setters are methods that allow you to manipulate the data of an object while respecting encapsulation.

- **Getters** are methods that allow you to get the data values of an object. With their help, like through a window in
  a bank,
  you can view the balance in your account.
- **Setters** are methods that allow you to set the values of an object's data. They are like a way to deposit or
  withdraw
  money from the account.
- **Getters and setters** must be accessible to everyone, i.e. have access modifier `public`

## Constructor

Besides getters and setters, another important aspect of encapsulation is constructors. The constructor is special
a method that is executed when an object of a class is created.

It is used to set the initial values of an object. For example, if we have a class "User", the constructor
can initialize the username and password when it is created.

## The this keyword in Java

**this** is a keyword in Java that is used inside class methods to refer to the current object.

It means that we are accessing the attributes or methods of the object in which the code is running.

**this** can be used to resolve naming conflicts between method arguments and class fields if they have the same name.

___

## An example of a class/template that describes a planet.

The planet has the attributes name `name` and size `size`

This template allows you to set the values of all attributes when it is initialized, and we can also **change** the
values via `setters` and **get** their values via `getters`

**Example:**

````java

public class Planet { // class describing the planet, planet template

    // class fields
    private String name; // planet name
    private long size; // planet size


    public Planet(String name, long size) { // constructor for setting the values of class fields when creating a class
        this.name = name; // setting the value for the name class field
        this.size = size; // setting the value for the size class field
    }

    // setter for the name field
    public void setName(String name) {
        this.name = name; // setting/changing the value for the name class field
    }

    // getter for the name field
    public String getName() {
        return this.name; // return the value of the name class field
    }

    // setter for the size field
    public void setSize(long size) {
        this.size = size; // setting/changing the value for the size class field
    }


    // getter for the name field
    public long getSize() {
        return this.size; // return the value of the size class field
    }
}

````

- now if someone decides to change the name of the planet, he can do this by calling the `setName` method with the new
  name
- the same with size, for example, if the size of the planet was initially calculated incorrectly. Only to change the
  size you need to call the `setSize` method and specify the desired size
- to access the current values of the name (`name`) and size (`size`) of the planet you need to use getters. For
  name `getName`, for size `getSize`

### Creating a Class (capsule)

**Objects** of a class are created using a **constructor** (standard class method), field values are set and/or
are changed using setters (these are standard class methods), field values are accessible using getters (these are
standard
class methods).

- Step 1: Create fields
  -- determine the list of variables and their types, make decisions about the values of modifiers
  --- public or private

-- when writing code, we go in the opposite direction, first we write:
--- modifier
--- then the variable type
--- then the variable name

- Step 2: Define Methods

-- standard methods:

--- constructor (allows you to create objects, instances of a class)
--- getters (allows you to get the values of an object's fields)
--- setters (allows you to set the values of object fields)
--- additional methods

**Example:** Car: - new data TYPE(!!!)

- **brand** - String brand
- **color** - String color
- **engine power** - double
- **fuel type** - String fuelType which includes all the listed fields.

**example of creating an object of type Car**

````java
public class Main {
    public static void main(String[] args) {
        // the new keyword is used to create objects
        // when creating an object, you need to determine its type. In your case it is the Car type (Car bmw)
        // initialization of the object, after the "=" sign new Car("BMW", "Black", 250, "disel");
        // when initializing an object, the constructor of the Car class is called with attributes in brackets ("BMW", "Black", 250, "disel")
        Car bmw = new Car("BMW", "Black", 250, "disel"); // creating an object of type Car

        // our car has the following values:
        // brand - "BMW"
        // color - "Black"
        // engine power - "250"
        // fuel type - "disel"

        // great, now you need to refuel the car and you can go on vacation!
    }
}
````

</details>

<hr>

<details style="margin-top: 16px">
  <summary style="cursor: pointer; color: blue;"><b>На русском</b></summary>

# Введение в ООП

## ООП: что это такое?

**ООП** -
это [парадигма](https://ru.wikipedia.org/wiki/%D0%9F%D0%B0%D1%80%D0%B0%D0%B4%D0%B8%D0%B3%D0%BC%D0%B0_%D0%BF%D1%80%D0%BE%D0%B3%D1%80%D0%B0%D0%BC%D0%BC%D0%B8%D1%80%D0%BE%D0%B2%D0%B0%D0%BD%D0%B8%D1%8F)
программирования, основанная на представлении программы как совокупности взаимодействующих **объектов**.

- **Объект** - это программная сущность, которая имеет свое **состояние** и **поведение**.
- **Состояние объекта** - это данные, которые он содержит.
- **Поведение объекта** - это действия, которые он может выполнять.

**Основные понятия ООП:** классы, объекты, методы, атрибуты

- **Класс** - это **шаблон**, описывающий свойства и поведение объекта.
- **Объект** - это экземпляр класса, который имеет свои собственные значения свойств и может выполнять действия,
  описанные
  методами.
- **Метод** - это функция, принадлежащая классу. Описывающее поведение объекта, действия, которые он может выполнять
- **Атрибут/поле класса** - это переменная, принадлежащая классу. Чаще называют **полем класса**

Программирование - это как строительство объектов. Каждая программа состоит из множества объектов, и ООП помогает нам
лучше управлять этими объектами.

#### Примеры объектов из жизни:

___
**Автомобиль**

**Состояние объекта/Атрибут/поле класса**: Макра, модель, мощность, тип топлива, цвет ...

**Поведение объекта/Метод**: К примеру автомобиль может ехать, заправляться, сигналить, поворачивать, тормозить ...
___
**Файл**

**Состояние объекта/Атрибут/поле класса**: Размер, тип, имя, расположение, дата создания, дата изменения ...

**Поведение объекта/Метод**: Открыть, изменить имя или раположение, прочитать, закрыть ....

**Дом**
**Состояние объекта/Атрибут/поле класса**: адрес, количество этажей, площадь, количество комнат ...

**Поведение объекта/Метод**: построить, отремонтировать, продать, заселить, покинуть ....
___

### Более подробнее

**Машина**

**Атрибуты:**

- Марка: строка, содержащая марку машины.
- Модель: строка, содержащая модель машины.
- Год выпуска: целое число, указывающее год выпуска машины.
- Цвет: строка, содержащая цвет машины.
- Пробег: целое число, указывающее пробег машины в километрах.

**Методы:**

- Ехать: метод, который заставляет машину двигаться.
- Поворачивать: метод, который заставляет машину поворачивать.
- Тормозить: метод, который заставляет машину тормозить.
- Парковаться: метод, который заставляет машину парковаться.
- Заправляться: метод, который заправляет машину топливом.
- Ремонтировать: метод, который ремонтирует машину.

___

### В ООП есть четыре основных принципа:

1. **ИНКАПСУЛЯЦИЯ**
2. **НАСЛЕДОВАНИЕ**
3. **ПОЛИМОРФИЗМ**
4. **АБСТРАКЦИЯ**

**Сегодня мы сосредоточимся на инкапсуляции.**

# Инкапсуляция

## Что такое инкапсуляция?

**Инкапсуляция** - это объединение данных и методов в одном классе.

**Инкапсуляция** - это один из ключевых принципов ООП, который позволяет скрыть детали реализации объекта и предоставить
только необходимый интерфейс для взаимодействия с ним. Это подобно упаковке подарка - вы видите только внешний вид, но
не знаете, что внутри, но можете узнать что внутри и действовать через методы.

## Модификаторы доступа

В Java, для реализации инкапсуляции, мы используем модификаторы доступа. Есть три основных модификатора
доступа: `public`, `private` и `protected`.

- `public` - это, как если бы вы дали всем доступ к вашему подарку.
- `private` - это как запереть подарок в сейфе и дать доступ только вам.
- `protected` - это подарок, который вы даете только своей семье и друзьям. _(более подробнее рассмотрим позже)_

## Геттеры и сеттеры (Getters/Setters)

Геттеры и сеттеры - это методы, которые позволяют управлять данными объекта, соблюдая инкапсуляцию.

- **Геттеры** - это методы, которые позволяют получать значения данных объекта. С помощью них, как через окно в банке,
  можно посмотреть баланс на вашем счету.
- **Сеттеры** - это методы, которые позволяют устанавливать значения данных объекта. Они как способ внести или снять
  деньги со счета.
- **Геттеры и сеттеры** должны быть доступны всем, т.е. иметь модификатор доступа `public`

## Конструктор

Помимо геттеров и сеттеров, есть еще один важный аспект инкапсуляции - это конструкторы. Конструктор - это специальный
метод, который выполняется при создании объекта класса.

Он используется для установки начальных значений объекта. Например, если у нас есть класс "Пользователь", конструктор
может инициализировать имя и пароль пользователя при его создании.

## Ключевое слово this в Java

**this** - это ключевое слово в Java, которое используется внутри методов класса для ссылки на текущий объект.

Оно обозначает, что мы обращаемся к атрибутам или методам объекта, в котором выполняется данный код.

**this** может быть использовано для разрешения конфликта имён между аргументами метода и полями класса, если они имеют
одинаковые имена.

___

## Пример класса/шаблона который описывает планету.

У планеты есть атрибуты название `name` и размер `size`

Данный шаблон позволяет установить значения всех атрибутов при его инициализации, а так же мы можем **изменить**
значения через `setters` и **получить** их значения через `getters`

**Пример:**

````java

public class Planet { // класс описывающий планету, шаблон планеты

    // поля класса
    private String name;  // имя планеты
    private long size;    // размер планеты


    public Planet(String name, long size) { // конструтор для установки значений полей класса при создании класса
        this.name = name;   // установка значения для поля класса name
        this.size = size;   // установка значения для поля класса size
    }

    // сеттер для поля name
    public void setName(String name) {
        this.name = name;       // установка/изменение значения для поля класса name
    }

    // геттер для поля name
    public String getName() {
        return this.name;      // вернуть значение поля класса name
    }

    // сеттер для поля size
    public void setSize(long size) {
        this.size = size;       // установка/изменение значения для поля класса size
    }


    // геттер для поля name
    public long getSize() {
        return this.size;     // вернуть значение поля класса size
    }
}

````

- теперь если кто то решит изменить имя планеты, он может сделать это вызвав метод `setName` это с новым именем
- так же и с размером, к примеру если изначально размер планеты был не верно расчитан. Только для изменения размера
  нужно вызвать метод `setSize` и указать нужный размер
- для доступа к текущим значениям имени (`name`) и размеру (`size`) планеты нужно использовать getters. Для
  имени `getName`, для размера `getSize`

### Создание Класса (капсулы)

**Объекты** класса создают с помощью **конструктора** (стандартного метода класса), значения полей устанавливают и/или
изменяются с помощью сеттеров (это стандартные методы класса), значения полей доступны с помощью геттеров (это
стандартные
методы класса).

- Шаг 1: создание полей
  - определяем перечень переменных и их типов, принимаем решения о значениях модификаторов
    - public или private
  - при написании кода идем в обратном направлении, сначала пишем:
    - модификатор
    - потом тип переменной
    - потом имя переменной
- Шаг 2: определение методов
  - стандартные методы:
    - конструктор (позволяет создавать объекты, экземпляры класса)
    - геттеры (позволяет получить значения полей объекта)
    - сеттеры (позволяет установить значения полей объекта)
    - дополнительные методы

**Пример:** Автомобиль (Car): - новый ТИП данных(!!!)

- **марка** - String brand
- **цвет** - String color
- **мощность двигателя** - double
- **тип топлива** - String fuelType который включает в себя все перечисленные поля.

**пример создания объекта типа Car**

````java
public class Main {
    public static void main(String[] args) {
        // для создания объектов используется ключевое слово new
        // при создании объекта необходимо определить его тип. В вашем случае это тип Car (Car bmw)
        // инициализация объекта, после знака "=" new Car("BMW", "Black", 250, "disel");
        // при инициализации объекта вызывается конструктор класса Car с атрибутами в скобках ("BMW", "Black", 250, "disel")
        Car bmw = new Car("BMW", "Black", 250, "disel"); // создание объекта типа Car

        //  нашему автомобилу установленны значения:
        //  марка - "BMW"
        //  цвет - "Black"
        //  мощность двигателя - "250"
        //  тип топлива - "disel"

        // прекрасно, теперь нужно заправить автомобиль и можно ехать в отпуск!
    }
}
````

</details>
