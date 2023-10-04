<details style="margin-top: 16px">
  <summary style="cursor: pointer; color: blue;"><b>English</b></summary>

## Access Modifiers

**Access modifiers** in Java define the level of access to variables, methods, and classes. They are necessary to ensure
encapsulation.

In Java, there are four access modifiers:

1. `public`: Accessible everywhere.
2. `protected`: Accessible within the package and to all subclasses.
3. `default` (package-private): Accessible only within the package.
4. `private`: Accessible only within the class.

Here's how it looks:

| Modifier    | Within Class | Within Package | Subclasses | Outside Package |
|-------------|--------------|----------------|------------|-----------------|
| `public`    | Yes          | Yes            | Yes        | Yes             |
| `protected` | Yes          | Yes            | Yes        | No              |
| `default`   | Yes          | Yes            | No         | No              |
| `private`   | Yes          | No             | No         | No              |

### Examples:

#### For Variables

```
public int a;       // Accessible everywhere
protected int b;    // Accessible within the package and to subclasses
int c;              // Accessible within the package (default)
private int d;      // Accessible only within the class
```

#### For Methods

```
public void method1() {}        // Accessible everywhere
protected void method2() {}     // Accessible within the package and to subclasses
void method3() {}               // Accessible within the package (default)
private void method4() {}       // Accessible only within the class
```

## The `Object` Class in Java

The `Object` class is the base class for all objects in Java. All classes in Java implicitly inherit from the `Object`
class unless they explicitly specify another parent class. The `Object` class provides a set of methods and
functionality that are available to all objects in Java. Here are some key methods of the `Object` class:

### Commonly Used Object Methods

The Object class provides several built-in methods such as `equals()`, `hashCode()`, and `toString()`.

### The `equals()` Method

The `equals()` method is used to compare two objects for equality. In the `Object` class, this method is implemented to
compare object references, not their content. This means that two objects will be considered equal only if they
reference the same object in memory. Here's an example:

```
Object obj1 = new Object();
Object obj2 = new Object();

boolean areEqual = obj1.equals(obj2); // false, because obj1 and obj2 are different objects
```

### Overriding Methods

To use the `equals()`, `hashCode()`, and `toString()` methods more effectively for custom classes, they are often
overridden. In this case, you can define your own rules for comparison, generating hash codes, and providing a string
representation of the object.

### The `hashCode()` Method

The `hashCode()` method returns an integer value called a hash code associated with the object. By default, in
the `Object` class, this method generates a hash code based on the internal memory address of the object. Hash codes are
used, for example, when working with collections like hash tables. It's important that if two objects are equal (
according to the `equals()` method), their hash codes should also be equal. Here's an example:

```
Object obj = new Object();
int hashCode = obj.hashCode(); // returns the hash code of the object
```

### The `toString()` Method

The `toString()` method returns a string representation of the object. In the `Object` class, this method returns a
string containing the class name and the hash code of the object. It is often overridden in custom classes to provide a
more informative description of the object. Here's an example:

```
Object obj = new Object();
String str = obj.toString(); // returns the string representation of the object
```

### Example of Overriding `equals()`

```
class MyClass {
    private int value;

    // Constructor and other methods of the class

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MyClass myClass = (MyClass) o;
        return value == myClass.value;
    }
}
```

### Example of Overriding `hashCode()`

```
class MyClass {
    private int value;

    // Constructor and other methods of the class

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
```

### Example of Overriding `toString()`

```
class MyClass {
    private int value;

    // Constructor and other methods of the class

    @Override
    public String toString() {
        return "MyClass{" +
                "value=" + value +
                '}';
    }
}
```

## Important Points about `equals`

- If `a.equals(b)`, then `b.equals(a)`.
- If `a.equals(b)` and `b.equals(c)`, then `a.equals(c)`.
- Repeated calls to `a.equals(b)` return the same result.
- `a.equals(null)` always returns `false`.
- If `a.equals(b)`, then `a.hashCode() == b.hashCode()`.

## Practice Tasks

1. Create a class `Person` with fields `name` and `age`. Override the `equals()`, `hashCode()`, and `toString()` methods
   for this class.

2. Create a list of `Person` objects and test how the `equals()`, `hashCode()`, and `toString()` methods work in
   your `Person` class.

3. **Assignment Goal**

Understand how and why to use the `equals` method to compare objects in Java by modeling the operation of a bank and an
ATM.

### Process Description

- The user registers a bank card with the bank, providing their name and surname.
- The bank automatically assigns a unique card number based on the name and surname of the cardholder.
- After creating a card, the user can use the ATM for various operations: checking the balance, withdrawing, and
  depositing money.
- The ATM, for each operation, contacts the bank to check if such a card exists, comparing all the card fields: number,
  balance, name, and surname.

### Tasks

1. **Create a `BankCard` Class**
    - Add fields to store the `card number`, `balance`, `name`, and `surname` of the cardholder.
    - The `card number` should not be set when creating the card.
    - Implement the `equals` method that compares cards based on the `balance`, `name`, and `surname` fields.

2. **Create a `Bank` Class**
    - Add an array (`BankCard[] cards`) to store `BankCard` objects.
    - Implement the `addCard` method, which adds a new card to the array. You can only add unique cards.
    - The card number should be automatically set based on the name and surname of the cardholder.
    - Implement the `findCard` method, which searches for a card in the array (`BankCard[] cards`) using the `equals`
      method.
    - Implement the `getCardNumber` method, which searches for a card in the array (`BankCard[] cards`) using the `
      equals

` method and returns the card number.

3. **Create an `ATM` Class**
    - Add a field to store a `Bank` object.
    - Implement methods for depositing (`deposit`) and withdrawing money (`withdraw`). These methods should use
      the `findCard` method from the `Bank` class to find the corresponding card.
    - Add a method to display the current balance of the current card (`showBalance`).

4. **Create a `Main` Class with a `main` Method**
    - Initialize `Bank` and `ATM` objects.
    - Perform operations: card registration, depositing, withdrawing money, getting information about the current
      balance, and the card number.

### Additional Tasks

- Add a check for the maximum number of cards in the bank.
- Add an interface for working with the ATM and the bank (`Scanner`).

### Discussion Questions

- Why is it important to override the `equals` method?
- What can be the issues if you don't override the `equals` method?

</details>


<hr>

<details style="margin-top: 16px">
  <summary style="cursor: pointer; color: blue;"><b>На русском</b></summary>

## Модификаторы доступа

**Модификаторы доступа** в Java определяют уровень доступа к переменным, методам и классам. Они нужны для обеспечения
инкапсуляции.

В Java есть четыре модификатора доступа:

1. `public`: Доступен отовсюду.
2. `protected`: Доступен внутри пакета и для всех подклассов.
3. `default` (пакетный): Доступен только внутри пакета.
4. `private`: Доступен только внутри класса.

Вот как это выглядит:

| Модификатор | Внутри класса | Внутри пакета | В подклассах | Вне пакета |
|-------------|---------------|---------------|--------------|------------|
| `public`    | Да            | Да            | Да           | Да         |
| `protected` | Да            | Да            | Да           | Нет        |
| `default`   | Да            | Да            | Нет          | Нет        |
| `private`   | Да            | Нет           | Нет          | Нет        |

### Примеры:

#### Для переменных

```
public int a;      // Доступен отовсюду
protected int b;   // Доступен внутри пакета и в подклассах
int c;             // Доступен внутри пакета (default)
private int d;     // Доступен только внутри класса
```

#### Для методов

```
public void method1() {}      // Доступен отовсюду
protected void method2() {}   // Доступен внутри пакета и в подклассах
void method3() {}             // Доступен внутри пакета (default)
private void method4() {}     // Доступен только внутри класса
```

## Класс `Object` в Java

Класс `Object` является базовым классом для всех объектов в Java. Все классы в Java неявно наследуются от
класса `Object`, если они явно не указывают другой родительский класс. Класс `Object` предоставляет ряд методов и
функциональности, которые доступны для всех объектов в Java. Вот некоторые из ключевых методов класса `Object`:

### Часто используемые методы класса Object

Класс Object предоставляет ряд встроенных методов, таких как `equals()`, `hashCode()`, `toString()`.

### Метод `equals()`

Метод `equals()` используется для сравнения двух объектов на равенство. В классе `Object`, этот метод реализован так,
что он сравнивает ссылки на объекты, а не их содержимое. Это означает, что два объекта будут считаться равными только в
том случае, если они ссылаются на один и тот же объект в памяти. Вот пример:

```
Object obj1=new Object();
        Object obj2=new Object();

        boolean areEqual=obj1.equals(obj2); // false, так как obj1 и obj2 разные объекты
```

### Переопределение методов

Чтобы более эффективно использовать методы `equals()`, `hashCode()` и `toString()` для пользовательских классов, их
часто переопределяют. В этом случае, вы можете определить собственные правила сравнения, генерации хэш-кода и строкового
представления объекта.

### Метод `hashCode()`

Метод `hashCode()` возвращает целочисленное значение, называемое хэш-кодом, которое ассоциируется с объектом. По
умолчанию, в классе `Object`, этот метод генерирует хэш-код, основанный на внутреннем адресе объекта в памяти. Хэш-коды
используются, например, при работе с коллекциями, такими как хеш-таблицы. Важно, чтобы если два объекта равны (согласно
методу `equals()`), их хэш-коды также были равны. Вот пример:

```
Object obj=new Object();
        int hashCode=obj.hashCode(); // возвращает хэш-код объекта
```

### 3. Метод `toString()`

Метод `toString()` возвращает строковое представление объекта. В классе `Object`, этот метод возвращает строку,
содержащую имя класса и хеш-код объекта. Он часто переопределяется в пользовательских классах для предоставления более
информативного описания объекта. Вот пример:

```
Object obj=new Object();
        String str=obj.toString(); // возвращает строковое представление объекта
```

### Пример переопределения `equals()`

```
class MyClass {
    private int value;

    // Конструктор и другие методы класса

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MyClass myClass = (MyClass) o;
        return value == myClass.value;
    }
}
```

### Пример переопределения `hashCode()`

```
class MyClass {
    private int value;

    // Конструктор и другие методы класса

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
```

### Пример переопределения `toString()`

```
class MyClass {
    private int value;

    // Конструктор и другие методы класса

    @Override
    public String toString() {
        return "MyClass{" +
                "value=" + value +
                '}';
    }
}
```

## Важные моменты equals

- Если `a.equals(b)`, то `b.equals(a)`.
- Если `a.equals(b)` и b.`equals(c)`, то `a.equals(c)`.
- Повторные вызовы `a.equals(b)` возвращают одинаковый результат.
- `a.equals(null)` всегда возвращает `false`.
- Если `a.equals(b)`, то `a.hashCode() == b.hashCode()`.

## Задачи для закрепления

1. Создайте класс `Person` с полями `name` и `age`. Переопределите методы `equals()`, `hashCode()`, и `toString()` для
   этого класса.

2. Создайте список объектов типа `Person` и проверьте, как работают методы `equals()`, `hashCode()` и `toString()` в
   вашей реализации класса `Person`.

### Цель задания

Понять, как и зачем использовать метод `equals` для сравнения объектов в Java на примере моделирования работы банка и
банкомата.

### Описание процесса

- Пользователь регистрирует банковскую карту в банке, указывая свои имя и фамилию.
- Банк автоматически устанавливает уникальный номер карты на основе имени и фамилии владельца.
- После создания карты, пользователь может воспользоваться банкоматом для различных операций: проверка баланса, снятие и
  внесение денег.
- Банкомат при каждой операции обращается к банку для проверки, существует ли такая карта, сравнивая все поля карты:
  номер, баланс, имя и фамилия.

### Задачи

1. **Создать класс `BankCard`**
    - Добавить поля для хранения `номера карты`, `баланса`, `имени` и `фамилии владельца`.
    - `номера карты` при создании не должен быть установлен.
    - Реализовать метод `equals`, который будет сравнивать карты по полям `баланс`, `имя` и `фамилия владельца`.


2. **Создать класс `Bank`**
    - Добавить массив (`BankCard[] cards`) для хранения объектов `BankCard`.
    - Реализовать метод `addCard`, который будет добавлять новую карту в массив. Добавлять можно только уникальные
      карты.
    - Номер карты должен устанавливаться автоматически на основе имени и фамилии владельца.
    - Реализовать метод `findCard`, который будет искать карту в массиве (`BankCard[] cards`) по объекту `BankCard`,
      используя метод `equals`.
    - Реализовать метод `getCardNumber`, который будет искать карту в массиве (`BankCard[] cards`) по
      объекту `BankCard`, используя метод `equals` и возвращать номер карты.


3. **Создать класс `ATM`**
    - Добавить поле для хранения объекта `Bank`.
    - Реализовать методы для внесения (`deposit`)  и снятия денег (`withdraw`). Эти методы должны использовать
      метод `findCard` из класса `Bank` для поиска соответствующей карты.
    - Добавить метод отображения текужего баланса текущей карты (`showBalance`).

4. **Создать класс `Main` с методом `main`**
    - Инициализировать объекты `Bank` и `ATM`.
    - Выполненть операций: регистрация карты, внесение, снятие денег, получение информации о текущем балансе и о нормере
      карты.

### Дополнительные задачи

- Добавить проверку на максимальное количество карт в банке.
- Добавить интерфейс для работы с банкоматом и банком (`Scanner`)

### Вопросы для обсуждения

- Почему важно переопределить метод `equals`?
- Какие могут быть проблемы, если не переопределить метод `equals`?

</details>
