<details style="margin-top: 16px">
  <summary style="cursor: pointer; color: blue;"><b>English</b></summary>

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



---

## Типы вложенных классов

### 1. Статические Вложенные Классы (Static Nested Classes)

#### Что это?

Это статический класс, объявленный внутри другого класса. Он имеет доступ только к статическим членам внешнего класса.

#### Пример кода

```java
public class Car {
    // Статический вложенный класс
    public static class Wheel {
        public void rotate() {
            System.out.println("Wheel is rotating...");
        }
    }
}
```

#### Пример из жизни

Представьте, что у вас есть класс `Car`, и у каждой машины есть колеса. Колеса (`Wheel`) не могут существовать без машины, но их поведение (вращение) не зависит от конкретного экземпляра машины. В этом случае `Wheel` может быть статическим вложенным классом.

#### Как использовать?

```java
Car.Wheel wheel = new Car.Wheel();
wheel.rotate();
```

---

### 2. Внутренние Классы (Inner Classes)

#### Что это?

Это класс, объявленный внутри другого класса без модификатора `static`. Он имеет доступ ко всем членам внешнего класса, даже к приватным.

#### Пример кода

```java
public class OuterClass {
    private int x = 10;

    class InnerClass {
        public void display() {
            System.out.println("x = " + x);
        }
    }
}
```

#### Пример из жизни

Представьте объект `Building` (здание), в котором есть объект `Elevator` (лифт). Лифт не может существовать без здания и имеет доступ к его внутренней структуре (например, количеству этажей).

#### Как использовать?

```java
OuterClass outer = new OuterClass();
OuterClass.InnerClass inner = outer.new InnerClass();
inner.display();
```

---

### 3. Локальные Вложенные Классы (Local Inner Classes)

#### Что это?

Это класс, объявленный внутри метода.

#### Пример кода

```java
public class OuterClass {
    public void myMethod() {
        class LocalInnerClass {
            public void display() {
                System.out.println("Inside local inner class");
            }
        }

        LocalInnerClass local = new LocalInnerClass();
        local.display();
    }
}
```

#### Пример из жизни

Допустим, у вас есть метод, который выполняет сложный алгоритм, и вам нужно определить вспомогательный класс для промежуточных вычислений, который нигде больше не нужен. В этом случае этот класс можно определить прямо в методе.

---

### 4. Анонимные Вложенные Классы (Anonymous Inner Classes)

#### Что это?

Это класс без имени, объявленный "на лету", обычно для реализации интерфейсов или наследования классов.

#### Пример кода

```java
new Thread(new Runnable() {
    public void run() {
        System.out.println("Thread is running...");
    }
}).start();
```

#### Пример из жизни

Если вам нужно быстро реализовать какой-либо интерфейс (например, для обработки событий в графическом интерфейсе), анонимные классы предлагают быстрый и удобный способ это сделать.

</details>


