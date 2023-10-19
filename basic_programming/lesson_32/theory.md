<details style="margin-top: 16px">
  <summary style="cursor: pointer; color: blue;"><b>English</b></summary>

## Interfaces Comparator and Comparable

`Comparable` and `Comparator` are interfaces that allow you to **compare** objects in Java.

- `Comparable` allows you to define the **natural order** of comparison for objects of a particular class.
- `Comparator` provides the ability to define **multiple ways of comparison** for a single class.

### Using Comparable

To use `Comparable`, a class must implement this interface and override the `compareTo()` method. Example:

```java
public class Person implements Comparable<Person> {
    private String name;
    private int age;

    // Constructors, getters, setters

    @Override
    public int compareTo(Person other) {
        return this.age - other.age;
    }
}
```

### Using Comparator

`Comparator` allows you to create custom comparison rules for objects. Example:

```java
public class PersonAgeComparator implements Comparator<Person> {
    @Override
    public int compare(Person p1, Person p2) {
        return p1.getAge() - p2.getAge();
    }
}
```

### What's the Difference Between Comparator and Comparable in Java?

In Java, the `Comparator` and `Comparable` interfaces are used for object comparison, but they serve different purposes:

1. `Comparable`:

- The `Comparable` interface allows an object to compare itself with another object.
- A class implementing `Comparable` provides the `compareTo` method, which defines how one object compares to another.
- Objects implementing `Comparable` can be naturally ordered, such as numbers or strings, and can be compared using
  the `compareTo` method.

2. `Comparator`:

- The `Comparator` interface represents an external comparator that can be used to compare objects, even if the class
  itself does not implement `Comparable`.
- You can create different `Comparator` instances for sorting objects based on different criteria.
- `Comparator` implements the `compare` method, which takes two objects and determines which one should come first.

**It's important to remember** that `Comparable` defines the natural order of comparison for objects of the same class,
while `Comparator` allows you to create custom ways of comparing objects.

##### Practical Tasks

1. Create a `Student` class with `name` and `grade` fields. Implement the `Comparable` interface for it so that students
   can be sorted by grades.
2. Create a list of students and sort it using both `Comparator` and `Comparable`.

</details>

<hr>

<details style="margin-top: 16px">
  <summary style="cursor: pointer; color: blue;"><b>На русском</b></summary>

## Генерики

**Генерики** (generics) в Java представляют собой механизм, который позволяет создавать **классы**, **интерфейсы** и **методы**,
которые работают с параметризованными типами данных. Они позволяют написать код, который будет работать с разными типами
данных, обеспечивая типовую безопасность. Типовая безопасность гарантирует, что вы не сможете вставить объект
несовместимого типа данных.

**Пример использования генериков для классов:**

```java
public class Box<T> {
    private T content;

    public Box(T content) {
        this.content = content;
    }

    public T getContent() {
        return content;
    }
}
```

В этом примере `T` является параметром типа (type parameter), который может быть заменен на конкретный тип данных при
создании объекта класса `Box`. Например:

```
        Box<Integer> integerBox=new Box<>(42);
        Box<String> stringBox=new Box<>("Привет, мир!");

        Integer intValue=integerBox.getContent();
        String stringValue=stringBox.getContent();
```

- Использование обобщений делает код более гибким и безопасным.

**Примеры использования гейнериков для методов:**

```java
public class GenericExample {
    public static <T> void printArray(T[] array) {
        for (T item : array) {
            System.out.print(item + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Integer[] intArray = {1, 2, 3, 4, 5};
        String[] stringArray = {"Привет", "Мир", "Java"};

        System.out.println("Массив целых чисел:");
        printArray(intArray);

        System.out.println("Массив строк:");
        printArray(stringArray);
    }
}
```

### Практика:

- Напишите обобщенный интерфейс для калькулятора и несколько имплементаций с разными типами (Short, Double, Integer,
  Long) для интерфейса.

#### Пример:

````java
public class CalculatorImplDouble implements ICalculator<Double, Float> {

    @Override
    public Double add(Float a, Float b) {
        return a + b;
    }

    //...
}

public class CalculatorImplDouble implements ICalculator<Long, Integer> {

    @Override
    public Long add(Integer a, Integer b) {
        return a + b;
    }

    //...
}
````

- Напишите обобщенный метод `printArray`, который принимает массив любого типа данных и выводит его содержимое на экран.
  Затем создайте два массива - один с целыми числами, другой с строками, и объектом Car и используйте `printArray` для
  их вывода

````java
public class Car {

    /**
     * Статический счетчик. В этом примере используется для автоматической установки id в конструкторе
     */
    private static int carIdCounter = 0;

    private final Integer ID; // Константа/финальная переменная. Id не должна быть изменяемой после инициализации в конструкторе 
    private String brand;
    private String model;

    public Car(String brand,
               String model) {
        carIdCounter++; // Добавляем +1 к каждому новому созданному объекту. Если объект создается через этот конструктор
        this.ID = carIdCounter; // присвоение значения для ID на основе счетчика
        this.brand = brand;
        this.model = model;
    }
}
````

````java
public class GenericExample {

    public static void main(String[] args) {
        Integer[] intArray = {1, 2, 3, 4, 5};
        String[] stringArray = {"Привет", "Мир", "Java"};
        Car[] carArray = {new Car("Toyota", "Camry"), new Car("Honda", "Civic")};

        System.out.println("Массив целых чисел:");
        printArray(intArray); // вызов обобщенного метода

        System.out.println("Массив строк:");
        printArray(stringArray); // вызов обобщенного метода 

        System.out.println("Массив машин:");
        printArray(carArray); // вызов обобщенного метода
    }
}
````

## Интерфейсы Comparator и Comparable

`Comparable` и `Comparator` - это интерфейсы, которые позволяют **сравнивать** объекты в Java.

- `Comparable` позволяет определить **естественный порядок** сравнения для объектов данного класса.
- `Comparator` предоставляет возможность определить **несколько способов сравнения** для одного класса.

### Использование Comparable

Чтобы использовать `Comparable`, класс должен реализовать этот интерфейс и переопределить метод `compareTo()`. Пример:

```java
public class Person implements Comparable<Person> {
    private String name;
    private int age;

    // Конструкторы, геттеры, сеттеры

    @Override
    public int compareTo(Person other) {
        return this.age - other.age;
    }
}
```

### Использование Comparator

`Comparator` позволяет создавать собственные правила сравнения для объектов. Пример:

```java
public class PersonAgeComparator implements Comparator<Person> {
    @Override
    public int compare(Person p1, Person p2) {
        return p1.getAge() - p2.getAge();
    }
}
```

### Чем отличается в Java Comparator от Comparable?

В Java интерфейсы `Comparator` и `Comparable` используются для сравнения объектов, но они имеют разные назначения:

1. `Comparable`:

- Интерфейс `Comparable` позволяет объекту сравнивать себя с другим объектом.
- Класс, реализующий `Comparable`, предоставляет метод `compareTo`, который определяет, как один объект сравнивается с
  другим.
- Объекты, реализующие `Comparable`, могут быть естественно упорядочены, например, числа или строки, их можно сравнивать
  с использованием метода `compareTo`.


2. `Comparator`:

- Интерфейс `Comparator` представляет собой внешний компаратор, который можно использовать для сравнения объектов, даже
  если класс сам по себе не реализует `Comparable`.
- Вы можете создать различные `Comparator` для сортировки объектов по разным критериям.
- `Comparator` реализует метод `compare`, который принимает два объекта и определяет, какой из них должен идти первым.

**Важно помнить**, что `Comparable` определяет естественный порядок сравнения для объектов данного класса, в то время
как `Comparator` позволяет создавать пользовательские способы сравнения объектов.

##### Практические задачи

1. Создайте класс `Student` с полями `name` и `grade`. Реализуйте для него интерфейс `Comparable` так, чтобы студенты
   сортировались по оценкам.
2. Создайте список студентов и отсортируйте его с использованием `Comparator` и `Comparable`.

</details>
