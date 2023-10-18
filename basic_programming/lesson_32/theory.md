<details style="margin-top: 16px">
  <summary style="cursor: pointer; color: blue;"><b>English</b></summary>

## Generics

**Generics** в Java is a mechanism that allows you to create classes, interfaces, and methods that work with parameterized data types. They enable you to write code that can work with different data types while ensuring type safety. Type safety guarantees that you cannot insert an object of an incompatible data type.

Here's a simple example of using generics:

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

In this example, `T` is a type parameter that can be replaced with a specific data type when creating an object of the `Box` class. For example:

```
        Box<Integer> integerBox = new Box<>(42);
        Box<String> stringBox = new Box<>("Hello, world!");

        Integer intValue = integerBox.getContent();
        String stringValue = stringBox.getContent();
```

Now let's create a practice task:

**Task:** Write a generic method `printArray` that takes an array of any data type and prints its content to the screen. Then create two arrays - one with integers and another with strings - and use `printArray` to display their contents.

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
        String[] stringArray = {"Hello", "World", "Java"};

        System.out.println("Array of integers:");
        printArray(intArray);

        System.out.println("Array of strings:");
        printArray(stringArray);
    }
}
```

## Practice:

- Write a generic interface for a calculator and implement it with several types (Short, Double, Integer, Long).

#### Example:

```java
public class CalculatorImplDouble implements ICalculator<Double, Float> {

    @Override
    public Double add(Float a, Float b) {
        return (double) (a + b);
    }

    //...
}

public class CalculatorImplLong implements ICalculator<Long, Integer> {

    @Override
    public Long add(Integer a, Integer b) {
        return (long) (a + b);
    }

    //...
}
```

- Write a generic method `printArray` that takes an array of any data type and prints its content to the screen. Then create two arrays - one with integers, another with strings, and an array of Car objects, and use `printArray` to display their contents.

```java
public class Car {

    private static int carIdCounter = 0;

    private final Integer ID;
    private String brand;
    private String model;

    public Car(String brand, String model) {
        carIdCounter++;
        this.ID = carIdCounter;
        this.brand = brand;
        this.model = model;
    }
}
```

```java
public class GenericExample {

    public static void main(String[] args) {
        Integer[] intArray = {1, 2, 3, 4, 5};
        String[] stringArray = {"Hello", "World", "Java"};
        Car[] carArray = {new Car("Toyota", "Camry"), new Car("Honda", "Civic")};

        System.out.println("Array of integers:");
        printArray(intArray);

        System.out.println("Array of strings:");
        printArray(stringArray);

        System.out.println("Array of cars:");
        printArray(carArray);
    }
}
```

</details>

<hr>

<details style="margin-top: 16px">
  <summary style="cursor: pointer; color: blue;"><b>На русском</b></summary>

## Генерики

**Генерики** (generics) в Java представляют собой механизм, который позволяет создавать классы, интерфейсы и методы,
которые
работают с параметризованными типами данных. Они позволяют написать код, который будет работать с разными типами данных,
обеспечивая типовую безопасность. Типовая безопасность гарантирует, что вы не сможете вставить объект несовместимого
типа данных.

Вот простой пример использования генериков:

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

Теперь давайте создадим задачу для тренировки:

**Задача:** Напишите обобщенный метод `printArray`, который принимает массив любого типа данных и выводит его содержимое
на экран. Затем создайте два массива - один с целыми числами, другой с строками, и используйте `printArray` для их
вывода.

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

## Практика:

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

    private final Integer ID; // коснтанта/финальная переменная. Id не должна быть изменяемой после инициализации в конструкторе 
    private String brand;
    private String model;

    public Car(String brand,
               String model) {
        carIdCounter++; // добавляем 1 к каждому новому созданному объекту. Если объект создается через этот конструктор
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

</details>
