<details style="margin-top: 16px">
  <summary style="cursor: pointer; color: blue;"><b>English</b></summary>

## Task 1

Write an interface for CRUD (C - Create, R - Read, U - Update, D - Delete) operations. The interface should be generic.

**Example of a non-generic interface**:

```java
public interface ICrudService { // a non-generic interface with CRUD operations for objects of type Car

    Car add();

    Car get(Long id);

    Car[] getAll();

    Car edit(Long id);

    boolean remove(Long id);

}
```

- Create a `entity` package and within this package, create the following classes:
  - `Book` with fields: `int id`, `String title`
  - `Animal` with fields: `long id`, `String color`
- Create several implementations of the generic interface for the `Book` and `Animal` classes.
  - **Optional** - implement methods in the implementation classes.

In the end, you should have the following methods (_Achtung - these are cheats_):

<hr>

<details style="margin-top: 16px">
  <summary style="cursor: pointer; color: #ff003b;"><b>For the Book class</b></summary>

```
   private final Book[] SOURCE = new Book[10]; // SOURCE should be declared explicitly without generics in each implementation of the interface 
    
   public Book add(){
        // code here
    }

   public Book get(Integer id){
        // code here
    }

   public Book[] getAll(){
        // code here
    }

   public Book edit(Integer id){
        // code here
    }

   public boolean remove(Integer id){
        // code here
    }
```

</details>

<hr>

<details style="margin-top: 16px">
  <summary style="cursor: pointer; color: #ff003b;"><b>For the Animal class</b></summary>

```
   private final Animal[] SOURCE = new Animal[10]; // SOURCE should be declared explicitly without generics in each implementation of the interface 
   
   public Animal add(){
        // code here
    }

   public Animal get(Long id){
        // code here
    }

   public Animal[] getAll(){
        // code here
    }

   public Animal edit(Long id){
        // code here
    }

   public boolean remove(Long id){
        // code here
    }
```

</details>

**Important**: Use **one** interface for different classes and use generics for generalization!

<hr>

### Task 2:

Create a class `Student` with `name` and `grade` fields. Implement the `Comparable` interface for it so that students can be sorted by grades.

- Create an array of students and sort it using `Arrays.sort()`.

<hr>

<details style="margin-top: 16px">
  <summary style="cursor: pointer; color: blue;"><b>Reminder</b></summary>

```java
       // Sort the array of students, using the implementation of the interface in the Student class
        Arrays.sort(students);
```

</details>

### Task 3:

Homework: Create a class `Product` representing a product with fields `id`, `name`, and `price`.

- Write a `Comparator` that compares products by price.
- Write a `Comparator` that compares products by id.
- Create an array of products and sort it by price using `Arrays.sort()`.
- Sort the array by id using `Arrays.sort()`.

Use your own comparators for sorting.

<hr>

<details style="margin-top: 16px">
  <summary style="cursor: pointer; color: blue;"><b>Reminder</b></summary>

```java
       // Sort the array of products by price
        Arrays.sort(products, priceComparator);
        
       // Sort the array of products by id
        Arrays.sort(products, idComparator);
```

</details>

### Task 4** (Very Difficult!!!)

<details style="margin-top: 16px">
  <summary style="cursor: pointer; color: blue;"><b>Task Description:</b></summary>

# Take a Break !!!

</details>

</details>

</details>

<hr>

<details style="margin-top: 16px">
  <summary style="cursor: pointer; color: blue;"><b>На русском</b></summary>

## Задача 1

Напишите интерфейс для CRUD (С - Creat, R - Read, U - Update, D - Delete) операций. Интерфейс должен быть обобщенным

**Пример не** обобщенного интерфейса:

````java
public interface ICrudService { // не обобщенный интерфейс с CRUD операциями над объектом типа Car

    Car add();

    Car get(Long id);

    Car[] getAll();

    Car edit(Long id);

    boolean remove(Long id);

}
````

- Создайте package entity и внутри этого package создайте эти класcы:
    - Book c полями: int id, String title
    - Animal, c полями: long id, String color
- Создайте несколько имплементаций обобщенного интерфейса для классов: Book, Animal.
    - **!!! Опционально** - реализуйте методы в классах имплементаций

В итоге у вас должны получится следующие методы (_Achtung - это читы_):

<hr>

<details style="margin-top: 16px">
  <summary style="cursor: pointer; color: #ff003b;"><b>Для класса Book</b></summary>

```
   private final Book[] SOURCE = new Book[10]; // SOURCE объявите явно без обобщения в каждой имплементации интерфейса 
    
   public Book add(){
        // code hier
    }

   public Book get(Integer id){
        // code hier
    }

   public Book[] getAll(){
        // code hier
    }

   public Book edit(Integer id){
        // code hier
    }

   public boolean remove(Integer id){
        // code hier
    }
```

</details>

<hr>

<details style="margin-top: 16px">
  <summary style="cursor: pointer; color: #ff003b;"><b>Для класса Animal</b></summary>

```
   private final Animal[] SOURCE = new Animal[10]; // SOURCE объявите явно без обобщения в каждой имплементации интерфейса 
   
   public Animal add(){
        // code hier
    }

   public Animal get(Long id){
        // code hier
    }

   public Animal[] getAll(){
        // code hier
    }

   public Animal edit(Long id){
        // code hier
    }

   public boolean remove(Long id){
        // code hier
    }
```

</details>


**Важно**, используйте **один** интерфейс для разных классов и используйте **гейнерики** для обобщения!

<hr>

### Задача 2:

Создайте класс `Student` с полями `name` и `grade`. Реализуйте для него интерфейс `Comparable` так, чтобы студенты
сортировались
по оценкам.

- создайте массив студентов и отсортируйте используя `Arrays.sort()`

<hr>

<details style="margin-top: 16px">
  <summary style="cursor: pointer; color: blue;"><b>Напоминалка</b></summary>

````
       // Сортируем массив студентов, для сортировки используется имлементация интерфейса в классе Student
        Arrays.sort(studends);
````

</details>

### Задача 3:

Домашнее задание: Создайте класс `Product`, представляющий товар с полями `id`, `name` и `price`.

- Напишите `Comparator`, который сравнивает товары по цене.
- Напишите `Comparator`, который сравнивает товары по id.
- создайте массив товаров и отсортируйте его по цене используя `Arrays.sort()`
- отсортируйте массив его по id `Arrays.sort()`

Для сортировки используйте свои компараторы.


<hr>

<details style="margin-top: 16px">
  <summary style="cursor: pointer; color: blue;"><b>Напоминалка</b></summary>

````
       // Сортируем массив товаров по цене
        Arrays.sort(products, priceComparator);
        
       // Сортируем массив товаров по id
        Arrays.sort(products, idComparator);
````

</details>

### Задача 4** (Очень сложная!!!)

<details style="margin-top: 16px">
  <summary style="cursor: pointer; color: blue;"><b>Описание задачи:</b></summary>

# Отдохните !!!

</details>

</details>
