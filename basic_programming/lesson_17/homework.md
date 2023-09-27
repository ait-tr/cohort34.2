<details style="margin-top: 16px">
  <summary style="cursor: pointer; color: blue;"><b>English</b></summary>

## Task 1

Create a **Cube** class that describes a cube with side a. Implement in it methods for determining area s (sum of areas
all faces) and volume v.
Create an application **CubeAppl**, in which create several instances of the Cube class. For each instance call
methods of the Cube class and calculate s and v.

## Problem 2**

Task: It is necessary to develop an application for a library that allows you to manage a list of books. Each book has
the following characteristics: title, author, year of publication, ISBN, and a flag indicating whether the book is borrowed by someone.

Primary requirements:

Create a **Book** class representing a book, with fields to store **title**, **author**, **year of publication**, **ISBN**
and a flag (`boolean isBorrowed`) indicating whether the book is borrowed by someone.

Create a **Library** class representing a library, with methods for managing the list of books. Methods should include
**adding a book**, **removing a book**, **getting a list of all books**, **checking if a book is taken**, and **installing
flag that book
taken or returned**.

- Implement the main application class **LibraryApp**, which creates a library object, adds books to the library,
  checks the status of the book (borrowed or not), and sets flags when books are checked out or returned.

The application should provide the user with the ability to manage the list of books, add new books, find out the status
books and set flags when books are taken or returned.

<details style="margin-top: 16px">
   <summary style="cursor: pointer; color: blue;"><b>Instructions</b></summary>

### Step 1: Create the Book class

Create a Book class with private fields for title, author, year, ISBN, and flag.
indicating whether the book is borrowed (isBorrowed).
Define a constructor for the Book class that takes parameters to initialize the fields.
Implement getters and setters for the fields of the Book class, including a getter and setter for the isBorrowed flag.

### Step 2: Create the Library class

- Create a Library class with a private field books, which will represent a list of books in the library. Initialize
  it in the constructor.
- Define a method addBook(Book book) that adds a book to the library list.
- Define a method removeBook(Book book) that removes a book from the library list.
- Define a getAllBooks() method that returns a list of all books in the library.
- Define a method isBookBorrowed(String title, String author) that checks whether a book is borrowed by its title and
  auto RU.
- Define a borrowBook(String title, String author) method that sets a flag that the book is borrowed.
- Define a returnBook(String title, String author) method that sets a flag that the book has been returned.

### Step 3: Create the main LibraryApp class

- Create a LibraryApp class to carry out the main application logic.
- In the main method, create a Library object to represent the library.
- Create multiple Book objects and use the addBook methods to add them to the library.
- Use the isBookBorrowed, borrowBook and returnBook methods to check the status of books and set the borrow and return flags
  return.

### Step 4: Test the application

- Launch the application and check that you can successfully add, delete and check the status of books in the library.

### Step 5: Extending functionality (optional)

- Expand the functionality of the application by adding additional methods and options, such as searching for books by various
  criteria, displaying a list of available books, etc.

</details>

</details>

<hr>

<details style="margin-top: 16px">
  <summary style="cursor: pointer; color: blue;"><b>На русском</b></summary>

## Задача 1

Создать класс **Cube**, описывающий куб cо стороной a. Реализовать в нем методы определения площади s (сумма площадей
всех граней) и объема v.
Создать приложение **CubeAppl**, в котором создать несколько экземпляров класса Cube. Для каждого экземпляра вызвать
методы класса Cube и рассчитать s и v.

## Задача 2**

Задача: Необходимо разработать приложение для библиотеки, которое позволяет управлять списком книг. Каждая книга имеет
следующие характеристики: название, автор, год издания, ISBN и флаг, указывающий, взята ли книга кем-то.

Основные требования:

Создать класс **Book**, представляющий книгу, с полями для хранения **названия**, **автора**, **года издания**, **ISBN**
и флага (`boolean isBorrowed`), указывающего, взята ли книга кем-то.

Создать класс **Library**, представляющий библиотеку, с методами для управления списком книг. Методы должны включать
**добавление книги**, **удаление книги**, **получение списка всех книг**, **проверку, взята ли книга**, и **установку
флага, что книга
взята или возвращена**.

- Реализовать основной класс приложения **LibraryApp**, который создает объект библиотеки, добавляет книги в библиотеку,
  проверяет статус книги (взята или нет), и устанавливает флаги, когда книги берутся или возвращаются.

Приложение должно предоставлять пользователю возможность управлять списком книг, добавлять новые книги, узнавать статус
книг и устанавливать флаги, когда книги берутся или возвращаются.

<details style="margin-top: 16px">
  <summary style="cursor: pointer; color: blue;"><b>Инструкиця</b></summary>

### Шаг 1: Создание класса Book

Создайте класс Book с приватными полями для названия (title), автора (author), года издания (year), ISBN (isbn) и флага,
указывающего, взята ли книга (isBorrowed).
Определите конструктор класса Book, который принимает параметры для инициализации полей.
Реализуйте геттеры и сеттеры для полей класса Book, включая геттер и сеттер для флага isBorrowed.

### Шаг 2: Создание класса Library

- Создайте класс Library с приватным полем books, которое будет представлять список книг в библиотеке. Инициализируйте
  его в конструкторе.
- Определите метод addBook(Book book), который добавляет книгу в список библиотеки.
- Определите метод removeBook(Book book), который удаляет книгу из списка библиотеки.
- Определите метод getAllBooks(), который возвращает список всех книг в библиотеке.
- Определите метод isBookBorrowed(String title, String author), который проверяет, взята ли книга по ее названию и
  автору.
- Определите метод borrowBook(String title, String author), который устанавливает флаг, что книга взята.
- Определите метод returnBook(String title, String author), который устанавливает флаг, что книга возвращена.

### Шаг 3: Создание основного класса LibraryApp

- Создайте класс LibraryApp для выполнения основной логики приложения.
- В методе main создайте объект Library для представления библиотеки.
- Создайте несколько объектов Book и используйте методы addBook, чтобы добавить их в библиотеку.
- Используйте методы isBookBorrowed, borrowBook и returnBook, чтобы проверить статус книг и установить флаги взятия и
  возврата.

### Шаг 4: Тестирование приложения

- Запустите приложение и проверьте, что вы можете успешно добавлять, удалять и проверять статус книг в библиотеке.

### Шаг 5: Расширение функциональности (по желанию)

- Расширьте функциональность приложения, добавив дополнительные методы и опции, такие как поиск книг по различным
  критериям, вывод списка доступных книг и т. д.

</details>
</details>
