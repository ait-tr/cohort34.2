<details style="margin-top: 16px">
  <summary style="cursor: pointer; color: blue;"><b>English</b></summary>

## What is Iterable?

In Java, `Iterable` is an interface that represents a collection of objects that can be iterated over, that is, sequentially moved from one element to another. This interface is defined in the `java.lang` package.

First and foremost, `Iterable` contains the method `iterator()`, which returns an iterator, another interface that allows traversing a collection of objects.

```java
public interface Iterable<T> {
    Iterator<T> iterator();
}
```

The iterator obtained from `Iterable`, in turn, must implement the methods `hasNext()` and `next()`, as well as `remove()` - which is optional.

- `hasNext()` checks if there is a next element.
- `next()` returns the next element.
- `remove()` (optional) removes the current element.

Example of an iterator:

```java
Iterator<String> iterator = someCollection.iterator();
while(iterator.hasNext()) {
    String element = iterator.next();
    // Process the element
}
```

## Real-life Examples

- Imagine `Iterable` as a restaurant menu. You can review all the dishes (`hasNext()`), choose a dish (`next()`), and if you wish, cancel the order (`remove()`).

- `Iterable` is like a playlist in a music application. You can move from song to song (iterate) until the songs run out (`hasNext()` returns `false`).

## Tasks

1. **"Bouquet" Task**: Create a `Bouquet` class that implements `Iterable`, containing a list of flowers. Implement an iterator that will allow you to go through all the flowers in the bouquet.

2. **"Bookshelf" Task**: Create a `Bookshelf` class with a collection of books. Implement `Iterable` so that you can iterate through the books using a for-each loop.

3. **"Smart Home" Task**: There is a set of smart home devices. Create a `SmartHome` class that implements `Iterable`, which will allow iterating through the devices and, for example, turning them on or off.

</details>

<hr>

<details style="margin-top: 16px">
  <summary style="cursor: pointer; color: blue;"><b>На русском</b></summary>

## Что такое Iterable?

В Java `Iterable` - это интерфейс, который представляет собой коллекцию объектов, по которой можно итерироваться, то есть пройтись последовательно от одного элемента к другому. Этот интерфейс определен в пакете `java.lang`.

Прежде всего, `Iterable` содержит метод `iterator()`, который возвращает итератор, еще один интерфейс, позволяющий проходить по коллекции объектов.

```java
public interface Iterable<T> {
    Iterator<T> iterator();
}
```

Итератор, получаемый из `Iterable`, в свою очередь, должен реализовывать методы `hasNext()` и `next()`, а также `remove()` - который является необязательным.

- `hasNext()` проверяет, есть ли следующий элемент.
- `next()` возвращает следующий элемент.
- `remove()` (необязательный) удаляет текущий элемент.

Пример итератора:

```java
Iterator<String> iterator = someCollection.iterator();
while(iterator.hasNext()) {
    String element = iterator.next();
    // Обрабатываем элемент
}
```

## Примеры из жизни

- Представьте `Iterable` как меню в ресторане. Вы можете просмотреть все блюда (`hasNext()`), выбрать блюдо (`next()`) и, если захотите, отменить заказ (`remove()`).

- `Iterable` - это как плейлист в музыкальном приложении. Вы можете переходить от песни к песне (итерироваться), пока песни не закончатся (`hasNext()` вернет `false`).

## Задачи

1. **Задача "Букет"**: Создайте класс `Bouquet`, реализующий `Iterable`, который будет содержать список цветов. Реализуйте итератор, который позволит пройтись по всем цветам в букете.

2. **Задача "Книжная полка"**: Создайте класс `Bookshelf` с коллекцией книг. Реализуйте `Iterable` так, чтобы можно было итерироваться по книгам с помощью for-each цикла.

3. **Задача "Умный дом"**: Имеется набор устройств умного дома. Создайте класс `SmartHome`, реализующий `Iterable`, который позволит итерироваться по устройствам и, например, включать или выключать их.

</details>
