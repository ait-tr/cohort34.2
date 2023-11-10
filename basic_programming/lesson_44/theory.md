<details style="margin-top: 16px">
  <summary style="cursor: pointer; color: blue;"><b>English</b></summary>

- Java Collection Framework (JCF) is a set of classes and interfaces that implement the most commonly used data structures. JCF consists of two major sections: Map and Collection. We begin our study with collections.
- The Collection interface extends the Iterable interface, meaning that all collections are iterable. The Collection interface defines a basic set of methods for working with data collections. For example, adding, removing, searching, getting the number of elements in the collection, and so on.
- There are many interfaces that extend the Collection interface. We will look at the Set and List interfaces. Let's start with the List interface. The List interface defines collections whose elements have indices, somewhat similar to an array but without size restrictions. Accordingly, in the List interface, in addition to methods inherited from Iterable and Collection, there are methods that work with indices. For example, inserting by index, deleting by index, getting an element by index, searching for the index of a specified argument, and so on.
- One of the implementations of the List interface is the ArrayList class. To implement the functionality of the List interface, ArrayList encapsulates an array of some initial size. When this array is fully filled, its elements are copied into a new, larger array. Now we wait for the new array to fill up. And so on. In simple terms, ArrayList represents a "resizable array."

### Implementing a Custom ArrayList

For a practical exercise, we can take a simple data structure similar to ArrayList in Java as a basis, which we'll call MyArrayList. Here is a basic outline of the class for implementation:

```java
public interface MyList<E> {

  // Add an element and increase the array size if necessary
  void add(E o);

  // Get an element by index
  E get(int index);

  // Set an object by index, shifting objects
  void set(E o, int index);

  // Return the size of the collection
  int size();
  boolean contains(E o);

  // Remove an element by value
  boolean remove(E o);

  // Remove an element by index
  E removeByIndex(int index);
}
```

- When elements are added to ArrayList and its current capacity is filled, ArrayList must increase its size to accommodate more elements. This is done by creating a new, larger array and copying the elements from the old array to the new one.
- The process of increasing the size is called "resizing" or "reallocating," and while it is relatively efficient, it can be performance-intensive when adding a large number of elements since every expansion involves copying all elements. Therefore, it is recommended that if the number of elements or an approximate upper limit is known, initialize the ArrayList with this initial capacity:

```java
List<String> list = new ArrayList<>(initial_capacity);
```

This will help avoid unnecessary expansions and improve performance when adding a large number of elements.

</details>

<hr>

<details style="margin-top: 16px">
  <summary style="cursor: pointer; color: blue;"><b>На русском</b></summary>

- Java Collection Framework (JCF) - множество классов и интерфейсов которые реализуют наиболее часто используемые
  структуры данных. JCF состоит из двух больших подразделов: Map и Collection. Мы начинаем наше изучение с коллекций.
- Интерфейс Collection расширяет интерфейс Iterable, т. е. все коллекции итерируемые. Интерфейс Collection определяет
  некоторый основной набор методов для работы с коллекциями данных. Например добавление, удаление, поиск, получение
  колличества элементов в коллекции и т. д.
- Есть множество интерфейсов расширяющих интерфейс Collection. Мы рассмотрим интерфейсы Set и List. И начнем с
  интерфейса
  List. Интерфейс List определяет коллекции элементы которых имеют индексы, т. е. некий аналог массива, но не имеющий
  ограничения по размеру. Соответственно в интерфейсе List, помимо методов унаследованных от Iterable и Collection,
  определены методы работающие с индексами. Например вставка по индексу, удаление по индексу, получение элемента по
  индексу, поиск индекса заданного аргумента и т. п.
- Одной из имплементаций интерфейса List является класс ArrayList. Для реализации функциональности интерфейса List,
- ArrayList инкапсулирует в себе массив некоторого начального размера. Когда этот массив полностью заполняется, то его
  элементы копируются в новый массив, но уже большего размера. И теперь ждем когда заполнится новый массив. И т. д. Т.
  е. простым языком ArrayList представляет из себя "резиновый массив".

### Реализация собственной версии ArrayList

Для практического занятия мы можем взять за основу простую структуру данных, аналогичную ArrayList в Java, которую
назовем MyArrayList.
Вот базовый контур класса для реализации:

````java
public interface MyList<E> {

  // Добавляем элемент и увеличиваем размер массива, если нужно
  void add(E o);

  // Получаем элемент по индексу
  E get (int index);

  // устанавливает объект по индексу, смещая объекты
  void set(E o, int index);

  // Возвращаем размер коллекции
  int size();
  boolean contains(E o);

  // Удаляем элемент по значению
  boolean remove(E o);

  // Удаляем элемент по индексу
  E removeByIndex(int index);
}
````

- Когда элементы добавляются в ArrayList и его текущая емкость заполняется, ArrayList должен увеличить свой размер,
  чтобы вместить больше элементов. Это происходит за счет создания нового массива большего размера и копирования
  элементов из старого массива в новый.
- Процесс увеличения размера называется "расширением" (resizing) или "перераспределением" (reallocating), и хотя он
  относительно эффективен, он может быть дорогостоящим с точки зрения производительности при добавлении большого
  количества элементов, так как при каждом расширении происходит копирование всех элементов. Поэтому рекомендуется, если
  известно количество элементов или примерный верхний предел, инициализировать ArrayList с этой начальной емкостью:


````
List<String> list = new ArrayList<>(начальная_емкость);
````

Это позволит избежать лишних расширений и увеличить производительность при добавлении большого количества элементов.

#### Код с урока в github:

- https://github.com/AR1988/Ait-34_2_ArrayList
- https://github.com/AR1988/Game21_AIT


</details>
