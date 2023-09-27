<details style="margin-top: 16px">
  <summary style="cursor: pointer; color: blue;"><b>English</b></summary>
### What is inheritance?

Inheritance is an object-oriented programming mechanism that allows you to create a new class based on
based on an existing class. In Java, inheritance allows one class (subclass or child class) to inherit
properties and methods of another class (superclass or parent class).

A subclass can use all public and protected members of the superclass.

### Benefits of inheritance:

* Code reuse: You can use already existing code from the parent class in the subclass, which
  helps save time and reduce code duplication.
* Class Hierarchy: Inheritance allows you to create a hierarchy of classes, making your code easier to organize and
  understand.
* Functionality extension: You can add new fields and methods to a subclass, extending the functionality of the base one
  class.

### extends keyword

Java uses the extends keyword to create inheritance. The syntax is as follows:

````java
class ChildClass extends ParentClass {
    // additional fields and methods
}

````

In this example, ChildClass is a subclass that inherits properties and methods from ParentClass.

### Examples

#### Example 1: Shapes

Let's consider the class hierarchy for geometric shapes. We have a superclass "Shape" which contains general properties,
such as area and perimeter. From this superclass we create subclasses: "Circle", "Rectangle" and "Triangle". Every
a subclass has its own unique properties and methods, but inherits common characteristics from the superclass.

#### Example 2: Cars

Let's say we have a class called "Car" that describes the general characteristics of cars. We create subclasses for
different types of cars such as "Car" and "Truck". Each subclass can have its own unique
properties and methods, but will also inherit common features from the superclass.

### Keyword super

**super** is a keyword that is used to refer to members of a superclass (parent class) from
subclass.
It allows a subclass to access methods, fields, or constructors inherited from the superclass.

### Using super to call a superclass constructor

One of the most common ways to use super is to call the superclass's constructor from within the constructor
subclass. This is useful when a subclass wants to perform initialization defined in the superclass before adding
its own initialization.

````java

class SuperClass {
    int value;

    SuperClass(int value) {
        this.value = value;
    }
}

class SubClass extends SuperClass {
    int counter;

    Subclass(int value, int counter) {
        super(value); // Call the superclass constructor
        this.counter = counter;
    }
}

````

In this example, the SubClass constructor calls the superclass constructor using super(value). This allows
set the value of the value field in the superclass.

### The principle of inheritance

* A subclass can inherit all non-private fields and methods from the superclass.
* A subclass can override methods of a superclass to change their behavior.
* A subclass can add its own fields and methods.

### The parent of all classes in Java is Object

In Java, all classes implicitly inherit from the Object class. This means that every class you create in Java
automatically becomes a subclass of Object, even if you don't explicitly specify extends Object. This inheritance
mechanism
provides a common set of methods and functionality for all objects in Java.

Here are a few key aspects related to inheriting from the Object class:

The Object class defines several methods that are inherited by all classes in Java. Some of the most common
Object methods used include:

- toString(): This method returns the string representation of the object. By default, unless you override it in
  in its own class, it returns a string containing the class name and the hash code of the object.
- equals(Object obj): This method is used to compare objects for equality. By default, it compares objects
  based on references, but you can override it in your class to define your own comparison rule.
- hashCode(): This method returns the hash code of the object. Hash code is used in hash tables and for process
  optimization
  searching for objects.
- getClass(): This method returns an object of type Class that represents the class of the object.
- clone(): This method is used to create a copy of an object. It requires the class to implement the Cloneable interface
  and
  overridden the clone() method.

### Basic concepts:

1. Superclass (parent class)
   A superclass is a class from which inheritance occurs. It contains common properties and methods that can be
   used in subclasses. For example, let's look at the Animal class:

````java
public class Animal {
    String name;

    public void eat() {
        System.out.println(name + " eat.");
    }
}

````

2. Subclass (child class)
   A subclass is a class that inherits properties and methods from a superclass. It can also add new properties and
   methods or change inherited ones. For example, let's create a subclass "Dog":

```java
public class Dog extends Animal {
    public void bark() {
        System.out.println(name + "barks.");
    }
}

````

3. Class hierarchy
   A class hierarchy is a hierarchical structure of classes, where one class can be a superclass for several
   subclasses, creating a tree-like inheritance structure.
4. **extends** Keyword: In Java, inheritance is implemented using the **extends** keyword.
5. **Single Inheritance**: In Java, a class can inherit only one superclass. This means that multiple
   class inheritance (when a class inherits several classes at once) **not supported**.
6. Calling Superclass Constructor: A subclass constructor can call a superclass constructor using a key
   words **super()**. This allows members of the superclass to be initialized before members of the subclass are
   initialized.
7. Constructors in a subclass: **The subclass must have at least one constructor**. If the superclass does not have a
   constructor without
   arguments, then in the subclass constructor you need to explicitly call the superclass constructor using **super()**.

</details>

<hr>

<details style="margin-top: 16px">
  <summary style="cursor: pointer; color: blue;"><b>На русском</b></summary>

## Наследование (Inheritance) в Java

### Что такое наследование?

Наследование - это механизм объектно-ориентированного программирования, который позволяет создавать новый класс на
основе существующего класса. В Java наследование позволяет одному классу (подклассу или дочернему классу) наследовать
свойства и методы другого класса (суперкласса или родительского класса).

Подкласс может использовать все открытые (public) и защищенные (protected) члены суперкласса.

### Преимущества наследования:

* Повторное использование кода: Вы можете использовать уже существующий код из родительского класса в подклассе, что
  способствует экономии времени и уменьшению дублирования кода.
* Иерархия классов: Наследование позволяет создавать иерархию классов, что упрощает организацию кода и его понимание.
* Расширение функциональности: Вы можете добавлять новые поля и методы в подкласс, расширяя функциональность базового
  класса.

### Ключевое слово extends

В Java для создания наследования используется ключевое слово extends. Синтаксис следующий:

````java
class ChildClass extends ParentClass {
    // дополнительные поля и методы
}

````

В этом примере ChildClass является подклассом, который наследует свойства и методы из ParentClass.

### Примеры

#### Пример 1: Фигуры

Рассмотрим иерархию классов для геометрических фигур. У нас есть суперкласс "Фигура", который содержит общие свойства,
такие как площадь и периметр. Из этого суперкласса мы создаем подклассы: "Круг", "Прямоугольник" и "Треугольник". Каждый
подкласс имеет свои уникальные свойства и методы, но наследует общие характеристики от суперкласса.

#### Пример 2: Автомобили

Предположим, у нас есть класс "Автомобиль", который описывает общие характеристики автомобилей. Мы создаем подклассы для
разных типов автомобилей, таких как "Легковой автомобиль" и "Грузовик". Каждый подкласс может иметь свои уникальные
свойства и методы, но также унаследует общие черты от суперкласса.

### Ключевое слово super

**super** - это ключевое слово, которое используется для обращения к членам суперкласса (родительского класса) из
подкласса.
Оно позволяет подклассу получать доступ к методам, полям или конструкторам, унаследованным от суперкласса.

### Использование super для вызова конструктора суперкласса

Одним из наиболее распространенных способов использования super является вызов конструктора суперкласса из конструктора
подкласса. Это полезно, когда подкласс хочет выполнить инициализацию, определенную в суперклассе, перед добавлением
своей собственной инициализации.

````java

class SuperClass {
    int value;

    SuperClass(int value) {
        this.value = value;
    }
}

class SubClass extends SuperClass {
    int counter;

    Подкласс(int value, int counter) {
        super(value); // Вызываем конструктор суперкласса
        this.counter = counter;
    }
}

````

В этом примере конструктор SubClass вызывает конструктор суперкласса с использованием super(значение). Это позволяет
установить значение поля значение в суперклассе.

### Принцип наследования

* Подкласс может наследовать все non-private поля и методы из суперкласса.
* Подкласс может переопределить (override) методы суперкласса, чтобы изменить их поведение.
* Подкласс может добавить свои собственные поля и методы.

### Прородитель всех классов в Java - Object

В Java все классы неявно наследуются от класса Object. Это означает, что каждый класс, который вы создаете в Java,
автоматически становится подклассом Object, даже если вы явно не указываете extends Object. Этот механизм наследования
обеспечивает общий набор методов и функциональность для всех объектов в Java.

Вот несколько ключевых аспектов связанных с наследованием от класса Object:

Класс Object определяет несколько методов, которые унаследованы всеми классами в Java. Некоторые из наиболее часто
используемых методов Object включают:

- toString(): Этот метод возвращает строковое представление объекта. По умолчанию, если вы не переопределяете его в
  своем собственном классе, он возвращает строку, содержащую имя класса и хэш-код объекта.
- equals(Object obj): Этот метод используется для сравнения объектов на равенство. По умолчанию, он сравнивает объекты
  на основе ссылок, но вы можете переопределить его в своем классе, чтобы определить собственное правило сравнения.
- hashCode(): Этот метод возвращает хэш-код объекта. Хэш-код используется в хэш-таблицах и для оптимизации процесса
  поиска объектов.
- getClass(): Этот метод возвращает объект типа Class, который представляет класс объекта.
- clone(): Этот метод используется для создания копии объекта. Он требует, чтобы класс реализовал интерфейс Cloneable и
  переопределил метод clone().

### Основные понятия:

1. Суперкласс (родительский класс)
   Суперкласс - это класс, от которого происходит наследование. Он содержит общие свойства и методы, которые могут быть
   использованы в подклассах. Например, давайте рассмотрим класс "Животное":

````java
public class Animal {
    String name;

    public void eat() {
        System.out.println(name + " ест.");
    }
}

````

2. Подкласс (дочерний класс)
   Подкласс - это класс, который наследует свойства и методы от суперкласса. Он может также добавлять новые свойства и
   методы или изменять унаследованные. Например, создадим подкласс "Собака":

```java
public class Dog extends Animal {
    public void bark() {
        System.out.println(name + " лает.");
    }
}

````

3. Иерархия классов
   Иерархия классов - это иерархическая структура классов, где один класс может быть суперклассом для нескольких
   подклассов, создавая древовидную структуру наследования.
4. Ключевое слово **extends**: В языке Java наследование реализуется с использованием ключевого слова **extends**
5. **Единичное наследование**: В Java класс может наследовать только один суперкласс. Это означает, что множественное
   наследование классов (когда класс наследует сразу несколько классов) **не поддерживается**.
6. Вызов конструктора суперкласса: Конструктор подкласса может вызывать конструктор суперкласса с помощью ключевого
   слова **super()**. Это позволяет инициализировать члены суперкласса перед инициализацией членов подкласса.
7. Конструкторы в подклассе: **Подкласс должен иметь хотя бы один конструктор**. Если в суперклассе нет конструктора без
   аргументов, то в конструкторе подкласса нужно явно вызвать конструктор суперкласса с помощью **super()**.

</details>
