<details style="margin-top: 16px">
  <summary style="cursor: pointer; color: blue;"><b>English</b></summary>

### Task 1

Create a class named "User" (**User**) with private fields:

- **name** (username, string value)
- **age** (user age, integer value)
- **email** (user's email, string value)
  Add a class constructor that takes parameters for all fields and initializes the object when it is created.

Create getters and setters for each field of the User class.

In the main method, create objects of the User class and initialize them using a constructor and setters. Then
use getters to get information about each user and print it to the console.

Try changing object field values using setters and output the updated information to the console.

**Note:**

- Make sure you respect the principle of encapsulation by making the fields of the "User" class private and providing access to
  him through getters and setters.
- Practice creating objects, initializing them, and manipulating data using getters and setters.

### Task 2

Creating the "**Book**" class

Create a class called "Book" with private fields:

- **title** (book title, string value)
- **author** (author of the book, string value)
- **year** (year of book release, integer value)
- **isbn** (book ISBN, string value)

Add a class constructor that takes parameters for all fields and initializes the object when it is created.

Create getters and setters for each field of the Book class.

In the main method, create several Book class objects and initialize them with a constructor and setters. Then use getters to get information about each book and print it to the console.

Try changing object field values using setters and output the updated information to the console.

## Task 3*: Accounting for bank accounts

**Goal:** Create a Bank Account class using encapsulation and implement methods for depositing and withdrawing funds.


Create a class named "BankAccount" (**BankAccount**) with private fields:

- **accountNumber** (account number, string value)
- **balance** (account balance, decimal number with two decimal places)

Add a class constructor that takes parameters for the account number and opening balance and initializes the object when it is created.

Create getters and setters for account number and balance.

- Create a **deposit** method that accepts the deposit amount and increases the account balance by that amount.
- Create a **withdraw** method that takes the amount to withdraw and reduces the account balance by that amount if there are enough funds in the account. If the withdrawal amount is greater than the balance, display an error message.

In the **main** method, create objects of the "**BankAccount**" class, initialize them using the constructor and display information about accounts, balances and perform deposits and withdrawals.

Try different deposits and withdrawals, including when there are insufficient funds in your account.

</details>

<hr>

<details style="margin-top: 16px">
  <summary style="cursor: pointer; color: blue;"><b>На русском</b></summary>

### Задача 1

Создайте класс с именем "Пользователь" (**User**) с приватными полями:

- **name** (имя пользователя, строковое значение)
- **age** (возраст пользователя, целочисленное значение)
- **email** (электронная почта пользователя, строковое значение)
Добавьте конструктор класса, который принимает параметры для всех полей и инициализирует объект при его создании.

Создайте геттеры и сеттеры для каждого поля класса "Пользователь".

В методе main создайте объекты класса "Пользователь" и инициализируйте их с помощью конструктора и сеттеров. Затем
используйте геттеры для получения информации о каждом пользователе и выведите ее в консоль.

Попробуйте изменить значения полей объектов с использованием сеттеров и выведите обновленную информацию в консоль.

**Примечание:**

- Убедитесь, что вы соблюдаете принцип инкапсуляции, делая поля класса "Пользователь" приватными и предоставляя доступ к
  ним через геттеры и сеттеры.
- Практикуйтесь в создании объектов, их инициализации и управлении данными с использованием геттеров и сеттеров.

### Задача 2

Создание класса "**Книга**"

Создайте класс с именем "Книга" (Book) с приватными полями:

- **title** (название книги, строковое значение)
- **author** (автор книги, строковое значение)
- **year** (год выпуска книги, целочисленное значение)
- **isbn** (ISBN книги, строковое значение)

Добавьте конструктор класса, который принимает параметры для всех полей и инициализирует объект при его создании.

Создайте геттеры и сеттеры для каждого поля класса "Книга".

В методе main создайте несколько объектов класса "Книга" и инициализируйте их с помощью конструктора и сеттеров. Затем используйте геттеры для получения информации о каждой книге и выведите ее в консоль.

Попробуйте изменить значения полей объектов с использованием сеттеров и выведите обновленную информацию в консоль.

## Задача 3*: Учет банковских счетов

**Цель:** Создать класс "Банковский счет" с использованием инкапсуляции и реализовать методы для внесения и снятия средств.


Создайте класс с именем "БанковскийСчет" (**BankAccount**) с приватными полями:

- **accountNumber** (номер счета, строковое значение)
- **balance** (баланс счета, десятичное число с двумя знаками после запятой)

Добавьте конструктор класса, который принимает параметры для номера счета и начального баланса и инициализирует объект при его создании.

Создайте геттеры и сеттеры для номера счета и баланса.

- Создайте метод **deposit**, который принимает сумму для внесения и увеличивает баланс счета на эту сумму.
- Создайте метод **withdraw**, который принимает сумму для снятия и уменьшает баланс счета на эту сумму, если на счету достаточно средств. Если сумма для снятия больше баланса, выведите сообщение об ошибке.

В методе **main** создайте объекты класса "**BankAccount**", инициализируйте их с помощью конструктора и выведите информацию о счетах, балансах и произведите операции по внесению и снятию средств.

Попробуйте разные операции с внесением и снятием средств, включая случаи, когда на счету недостаточно средств.
</details>
