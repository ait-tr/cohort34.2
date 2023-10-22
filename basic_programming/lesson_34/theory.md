<details style="margin-top: 16px">
  <summary style="cursor: pointer; color: blue;"><b>English</b></summary>

### Anonymous Classes in Java

**What Are They?**

Anonymous classes are classes without a name, declared and instantiated in a single expression. They are used for creating a class instance for one-time use.

**Example:**

```java
public class Example {
    public static void main(String[] args) {

        Comparator<Integer> comparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1 - o2;
            }
        };

        Arrays.sort(array, comparator);
    }
}
```

### Lambda Expressions in Java

#### What Are They?

Lambda expressions are a concise way to represent instances of anonymous classes implementing a functional interface. A functional interface is an interface with a single abstract method.

#### Syntax

The basic syntax of a lambda expression is as follows:

```
(parameters) -> expression
```

or (with a body)

```
(parameters) -> { statements; }
```

- **parameters**: Method parameters (types can be omitted, parentheses are needed if more than one parameter).
- **expression**: An expression that returns a result.
- **statements**: A block of code if multiple operations need to be executed.

#### Examples

1. Without parameters:

```
() -> System.out.println("Hello, world!")
```

2. With one parameter:

```
x -> x * x
```

3. With multiple parameters and a body:

```
(x, y) -> {
    int sum = x + y;
    return sum;
}
```

#### Usage

Lambda expressions are often used in combination with methods from the standard library, such as `sort`, etc.

```
        // Sort array in descending order
        Arrays.sort(array, (o1, o2) -> o2 - o1);
```

#### Remarks

- Lambda expressions do not have access to non-final or effectively final method variables.
- New variables with names already in scope cannot be defined in lambda expressions.

#### Why Is This Useful?

Lambda expressions make the code shorter and more readable, especially when working with functional interfaces, collections, and data streams.

### Predicates in Java

**What Are They?**  
Predicates are functional interfaces used for testing conditions. The `Predicate<T>` interface has a `test` method, which takes an object of type `T` and returns `boolean`.

**Example with Lambda:**

```
        Predicate<Integer> isEven = n -> n % 2 == 0; // lambda
        System.out.println(isEven.test(4)); // true
        System.out.println(isEven.test(3)); // false
```

**Example with Anonymous Class:**

```java
public class Main {
    public static void main(String[] args) {
        Predicate<Integer> isEven = new Predicate<Integer>() { // anonymous class
            @Override
            public boolean test(Integer n) {
                return n % 2 == 0;
            }
        };

        System.out.println(isEven.test(4)); // true
        System.out.println(isEven.test(3)); // false
    }
}
```

**Example with Interface Implementation:**

```java
import java.util.function.Predicate;

public class IsEvenPredicate implements Predicate<Integer> { // interface implementation
    @Override
    public boolean test(Integer n) {
        return n % 2 == 0;
    }
}

public class Main {
    public static void main(String[] args) {
        Predicate<Integer> isEven = new IsEvenPredicate();
        System.out.println(isEven.test(4)); // true
        System.out.println(isEven.test(3)); // false
    }
}
```

### Arrays Class

In Java, the `Arrays` class from the `java.util` package provides a set of static methods for working with arrays. Here are some of them:

1. **Sorting**: `Arrays.sort(array)` sorts the array in ascending order.
    - Arrays.sort(int[] a): Sorts the integer array in ascending order.
    - Arrays.sort(int[] a, int fromIndex, int toIndex): Sorts part of the array from fromIndex to toIndex-1.
    - Arrays.sort(Object[] a): Sorts objects that implement the **Comparable** interface.
        - public static void sort(Object[] a, int fromIndex, int toIndex): This overload sorts part of the array of objects that implement the Comparable interface, from index fromIndex to toIndex-1. Objects are compared based on their natural order.
        - public static <T> void sort(T[] a, int fromIndex, int toIndex, Comparator<? super T> c): This version allows sorting part of the array using a special comparator. Comparator<? super T> c determines how the objects will be compared.
        - public static <T> void sort(T[] a, Comparator<? super T> c): This version sorts the entire array of objects using the given comparator. This is convenient when the natural order of sorting objects is not suitable for you.

2. **Searching**: `Arrays.binarySearch(array, value)` performs a binary search for the value in the sorted array.
3. **Copying**: `Arrays.copyOf(array, newLength)` creates a copy of the array with a new length.
4. **Filling**: `Arrays.fill(array, value)` fills all array elements with the specified value.
5. **Comparing**: `Arrays.equals(array1, array2)` checks whether two arrays are equal.
6. **String Representation**: `Arrays.toString(array)` returns a string representation of the array.

`Arrays.copyOf` and `System.arraycopy` methods are both intended for array copying, but there are several key differences:

### Arrays.copyOf:

1. **Creates a new array**: `Arrays.copyOf` returns a new array, which can have a different length.
2. **Type of the returned array**: Can be changed if an overloaded version with a type parameter is used.
3. **Ease of use**: Very easy to use, as you only need to specify the source array and the new length.

```java
        int[] original = {1, 2, 3};
        int[] copied = Arrays.copyOf(original, 5); // [1, 2, 3, 0, 0]
```

### System.arraycopy:

1. **Uses an existing array**: This method does not create a new array, but copies data into an existing array.
2. **More parameters**: Requires specifying the source and target arrays, positions in these arrays, and the number of elements to be copied.
3. **Performance**: Usually faster as it directly works with memory.

```java
        int[] original = {1, 2, 3};
        int[] destination = new int[5];
        System.arraycopy(original, 0, destination, 0, original.length); // destination is now [1, 2, 3, 0, 0]
```

In general, `Arrays.copyOf` is more convenient and simpler to use for creating new arrays, while `System.arraycopy` is generally used for copying data into existing arrays and may be faster in some scenarios.

</details>

<hr>

<details style="margin-top: 16px">
  <summary style="cursor: pointer; color: blue;"><b>На русском</b></summary>

### Анонимные классы в Java

**Что это такое?**

Анонимные классы — это классы без имени, которые объявляются и создаются в одном выражении. Они используются, если нужно
создать экземпляр класса для одноразового использования.

**Пример:**

```java

public class Example {
    public static void main(String[] args) {

        Comparator<Interger> comparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1 - o2;
            }
        };

        Arrays.sort(array, comparator);
    }

}

```

### Лямбда-выражения в Java

#### Что это такое?

Лямбда-выражения — это сокращённый способ представления экземпляров анонимных классов, реализующих функциональный
интерфейс. Функциональный интерфейс — это интерфейс с одним абстрактным методом.

#### Синтаксис

Базовый синтаксис лямбда-выражения выглядит следующим образом:

```
(parameters) -> expression
```

или (с телом)

```
(parameters) -> { statements; }
```

- **parameters**: параметры метода (можно опустить типы, скобки нужны, если параметров больше одного).
- **expression**: выражение, возвращающее результат.
- **statements**: блок кода, если нужно выполнить несколько операций.

#### Примеры

1. Без параметров:

```
() -> System.out.println("Hello, world!")
```

2. С одним параметром:

```
x -> x * x
```

3. С несколькими параметрами и телом:

```
(x, y) -> {
    int sum = x + y;
    return sum;
}
```

#### Применение

Лямбда-выражения часто используются в комбинации с методами из стандартной библиотеки, такими как `sort` и
др.

```
        // Сортировка массива в обратном порядке
        Arrays.sort(array,(o1, o2) -> o2 - o1);
```

#### Замечания

- Лямбда-выражения не имеют доступа к переменным метода, которые изменяются (`non-final` или `effectively final`).
- В лямбда-выражениях нельзя определять новые переменные с именами, уже используемыми в области видимости.

#### Для чего это нужно?

Лямбда-выражения делают код более кратким и читаемым, особенно при работе с функциональными интерфейсами, коллекциями и
потоками данных.

### Предикаты в Java

**Что это такое?**  
Предикаты — это функциональные интерфейсы, которые используются для проверки условий. Интерфейс `Predicate<T>` имеет
метод `test`, который принимает объект типа `T` и возвращает `boolean`.

**Пример c лямбдой:**

```
        Predicate<Integer> isEven = n -> n % 2 == 0; // лямбда
        System.out.println(isEven.test(4)); // true
        System.out.println(isEven.test(3)); // false
```

**Пример c анонимным классом:**

```java
public class Main {
    public static void main(String[] args) {
        Predicate<Integer> isEven = new Predicate<Integer>() { // анонимный класс
            @Override
            public boolean test(Integer n) {
                return n % 2 == 0;
            }
        };

        System.out.println(isEven.test(4)); // true
        System.out.println(isEven.test(3)); // false
    }
}

```

**Пример c реализацией интерфейса:**

```java
import java.util.function.Predicate;


public class IsevenPredicate implements Predicate<Integer> { // реализацией интерфейса
    @Override
    public boolean test(Integer n) {
        return n % 2 == 0;
    }
}


public class Main {

    public static void main(String[] args) {
        Predicate<Integer> isEven = new IsevenPredicate();
        System.out.println(isEven.test(4)); // true
        System.out.println(isEven.test(3)); // false
    }
}
```

### класс Arrays

В Java класс `Arrays` из пакета `java.util` предоставляет набор статических методов для работы с массивами. Вот
некоторые из них:

1. **Сортировка**: `Arrays.sort(array)` сортирует массив в порядке возрастания.
    - Arrays.sort(int[] a): Сортирует целочисленный массив в порядке возрастания.
    - Arrays.sort(int[] a, int fromIndex, int toIndex): Сортирует часть массива от fromIndex до toIndex-1.
    - Arrays.sort(Object[] a): Сортирует объекты, реализующие интерфейс **Comparable**
        - public static void sort(Object[] a, int fromIndex, int toIndex): Эта перегрузка сортирует часть массива
          объектов, реализующих интерфейс Comparable, от индекса fromIndex до toIndex-1. Объекты сравниваются на основе
          их естественного порядка.
        - public static <T> void sort(T[] a, int fromIndex, int toIndex, Comparator<? super T> c): Эта версия позволяет
          сортировать часть массива с использованием специального компаратора. Comparator<? super T> c определяет, как
          будут сравниваться объекты.
        - public static <T> void sort(T[] a, Comparator<? super T> c): Эта версия сортирует весь массив объектов с
          использованием заданного компаратора. Это удобно, когда естественный порядок сортировки объектов вам не
          подходит.

2. **Поиск**: `Arrays.binarySearch(array, value)` выполняет бинарный поиск значения в отсортированном массиве.
3. **Копирование**: `Arrays.copyOf(array, newLength)` создаёт копию массива с новой длиной.
4. **Заполнение**: `Arrays.fill(array, value)` заполняет все элементы массива заданным значением.
5. **Сравнение**: `Arrays.equals(array1, array2)` проверяет, равны ли два массива.
6. **Преобразование в строку**: `Arrays.toString(array)` возвращает строковое представление массива.

Методы `Arrays.copyOf` и `System.arraycopy` оба предназначены для копирования массивов, но есть несколько ключевых
различий:

### Arrays.copyOf:

1. **Создание нового массива**: `Arrays.copyOf` возвращает новый массив, который может иметь другую длину.
2. **Тип возвращаемого массива**: Может быть изменён, если используется перегрузка с параметром типа.
3. **Простота использования**: Очень прост в использовании, так как вам нужно указать только исходный массив и новую
   длину.

```java
        int[]original={1,2,3};
        int[]copied=Arrays.copyOf(original,5); // [1, 2, 3, 0, 0]
```

### System.arraycopy:

1. **Использует существующий массив**: Этот метод не создаёт новый массив, а копирует данные в уже существующий массив.
2. **Больше параметров**: Требует указания исходного и целевого массивов, позиций в этих массивах и количества
   копируемых элементов.
3. **Быстродействие**: Обычно быстрее, так как работает напрямую с памятью.

```java
        int[]original={1,2,3};
        int[]destination=new int[5];
        System.arraycopy(original,0,destination,0,original.length); // destination теперь [1, 2, 3, 0, 0]
```

В общем, `Arrays.copyOf` удобнее и проще в использовании для создания новых массивов, тогда как `System.arraycopy`
обычно используется для копирования данных в уже существующие массивы и может быть быстрее в некоторых сценариях.

### Перегрузки методов Arrays.copyOf и System.arraycopy, детально

Методы `Arrays.copyOf` и `System.arraycopy` оба предназначены для копирования массивов, но есть несколько ключевых
различий:

### Arrays.copyOf:

1. **Создание нового массива**: `Arrays.copyOf` возвращает новый массив, который может иметь другую длину.
2. **Тип возвращаемого массива**: Может быть изменён, если используется перегрузка с параметром типа.
3. **Простота использования**: Очень прост в использовании, так как вам нужно указать только исходный массив и новую
   длину.

```java
        int[]original={1,2,3};
        int[]copied=Arrays.copyOf(original,5); // [1, 2, 3, 0, 0]
```

### System.arraycopy:

1. **Использует существующий массив**: Этот метод не создаёт новый массив, а копирует данные в уже существующий массив.
2. **Больше параметров**: Требует указания исходного и целевого массивов, позиций в этих массивах и количества
   копируемых элементов.
3. **Быстродействие**: Обычно быстрее, так как работает напрямую с памятью.

```java
        int[]original={1,2,3};
        int[]destination=new int[5];
        System.arraycopy(original,0,destination,0,original.length); // destination теперь [1, 2, 3, 0, 0]
```

В общем, `Arrays.copyOf` удобнее и проще в использовании для создания новых массивов, тогда как `System.arraycopy`
обычно используется для копирования данных в уже существующие массивы и может быть быстрее в некоторых сценариях.

### Практика:

### 1 спринт

#### Написать метод сортировки рабочих используя Comparator и Comparable.

- написать Comparator для полей
    - id
        - Для поля id используйте интерфейс Comparable
    - hireYear
        - Используйте анонимный класс для поля hireYear
    - name
        - Используйте лямбду для поле name
- написать метод фильтрации массива рабочих по условиям:
    - найти всех рабочих чья зарплата в диапазоне от и до.
    - найти всех рабочих кто был устроен в определенный период времени (fromHireYear, toHireYear).
    - и так далее для всех полей.

#### 2 спринт

#### Применить полученные знания по Predicate

- внесите изменения в код, где это необходимо
- удалите не нужный код

</details>
