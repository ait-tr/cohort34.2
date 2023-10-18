<details style="margin-top: 16px">
  <summary style="cursor: pointer; color: blue;"><b>English</b></summary>

## Task 1

Write an interface for CRUD (Create, Read, Update, Delete) operations. The interface should be generic.

Example of a non-generic interface:

```java
public interface ICrudService { // a non-generic interface with CRUD operations for objects of type Car

    Car add();

    Car get(Long id);

    Car[] getAll();

    Car edit(Long id);

    boolean remove(Long id);

}
```

Create several implementations of the generic interface for the classes: Book, Animal, BankCard.

Create a package called "entity" and within this package, create these classes:
- Book with fields: int id, String title
- Animal with fields: long id, String color
- BankCard with fields: String id, Double balance

In the end, you should have the following methods:

**For the Book class**

```java
private final Book[] SOURCE = new Book[10]; // Declare SOURCE explicitly without generics in each interface implementation

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

**For the Animal class**

```java
private final Animal[] SOURCE = new Animal[10]; // Declare SOURCE explicitly without generics in each interface implementation

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

**For the BankCard class**

```java
private final BankCard[] SOURCE = new BankCard[10]; // Declare SOURCE explicitly without generics in each interface implementation

public BankCard add(){
    // code here
}

public BankCard get(String id){
    // code here
}

public BankCard[] getAll(){
    // code here
}

public BankCard edit(String id){
    // code here
}

public boolean remove(String id){
    // code here
}
```

**Important:** Use a single interface for different classes and use generics for abstraction!

## Task 2*

Step 1 - Repeat the steps we did in class on your own, following the example of the `Book` class and the `Library` interface.

- Create a `Book` class with fields: `ISBN`, `author`, `book title`, `publication year`.
- Create an interface called `Library` with methods:
    - Add a book.
    - Remove a book.
    - Find a book.
    - Number of books.
    - Print a list of books.
- Create a class called `LibraryImpl` that `implements Library`.
- Create a class called `LibraryImplTest` where you create tests for the methods mentioned above.

</details>

<hr>

<details style="margin-top: 16px">
  <summary style="cursor: pointer; color: blue;"><b>На русском</b></summary>


## Задача 1

Напишите интерфейс для CRUD (С - Creat, R - Read, U - Update, D - Delete) операций. Интерфейс должен быть обобщенным

Пример **не** обобщенного интерфейса:

````java
public interface ICrudService { // не обобщенный интерфейс с CRUD операциями над объектом типа Car

    Car add();

    Car get(Long id);

    Car[] getAll();

    Car edit(Long id);

    boolean remove(Long id);

}
````

Создайте несколько имплементаций обобщенного интерфейса для классов: Book, Animal, BankCard. 


Создайте package entity и внутри этого package создайте эти класcы:
- Book c полями: int id, String title
- Animal, c полями: long id, String color
- BankCard, c полями: String id, Double balance

В итоге у вас должны получится следующие методы:

**Для класса Book**

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

**Для класса Animal**

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

**Для класса BankCard**

```
   private final Book[] SOURCE = new Book[10]; // SOURCE объявите явно без обобщения в каждой имплементации интерфейса 
    
   public BankCard add(){
        // code hier
    }

   public BankCard get(String id){
        // code hier
    }

   public BankCard[] getAll(){
        // code hier
    }

   public BankCard edit(String id){
        // code hier
    }

   public boolean remove(String id){
        // code hier
    }
```


**Важно**, используйте один интерфейс для разных классов и используйте гейнерики для обобщения!

## Задача 2*

Шаг 1 - повторите самостоятельно все те шаги, которые мы делали в классе на примере класса `Book` и интерфейса `Library`.

- создаем класс `Book` c полями `ISBN`, `автор`, `название книги`, `год издания`;
- создаем интерфейс `Library` с методами:
  - добавить книгу;
  - удалить книгу;
  - найти книгу;
  - кол-во книг;
  - напечатать список книг.
- создаем класс `LibraryImpl`, который `implements Library`;
- создаем класс `LibraryImplTest`, в котором создаем тесты для вышеперечисленных методов.

</details>
