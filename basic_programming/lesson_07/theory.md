# Scanner

## Theory

The Scanner class in Java is used for obtaining user input.

- Initializing a scanner: `Scanner scanner = new Scanner(System.in);`

| Description          | Method Call             | Return Type | Example Usage                           | Example Console Input |
|----------------------|-------------------------|-------------|-----------------------------------------|-----------------------|
| Read a line          | `scanner.nextLine()`    | `String`    | `String line = scanner.nextLine();`     | `my name is`          |
| Read a word          | `scanner.next()`        | `String`    | `String word = scanner.next();`         | `Hello`               |
| Read an integer      | `scanner.nextInt()`     | `int`       | `int number = scanner.nextInt();`       | `5`                   |
| Read a double        | `scanner.nextDouble()`  | `double`    | `double value = scanner.nextDouble();`  | `3.14`                |
| Read a boolean value | `scanner.nextBoolean()` | `boolean`   | `boolean flag = scanner.nextBoolean();` | `true`                |

#### next vs. nextLine

- **scanner.next()**: This method reads a word from the input. If there are spaces in the input, **next()** will return
  only the first
  word until the nearest space. Spaces after that word will remain in the input queue. Example:

```
Scanner scanner = new Scanner(System.in);
String word = scanner.next();
System.out.println(word);
```

If you input "Hello World," word will contain "Hello."

- **scanner.nextLine()**: This method reads the entire line until the newline character _('\n')_. This means it reads

````
Scanner scanner = new Scanner(System.in);
String line = scanner.nextLine();
System.out.println(line);
````

If you input "Hello World," `line` will contain "Hello World."

```java
import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number:");
        int x = scanner.nextInt();
        System.out.println("You entered: " + x);
    }
}
```

- If the user inputs an incorrect value, the behavior of the **nextInt()**, **nextDouble()**, and **nextBoolean()**
  methods will result in an exception (error).

- To avoid exceptions, it is recommended to perform checks before calling these methods to ensure that the user's input
  matches the expected format. You can use the **hasNextInt()**, **hasNextDouble()**, and **hasNextBoolean()** methods
  to verify whether it is safe to read a value of a specific type and take additional actions in case of incorrect
  input.

| Description                         | Method Call               | Return Type | Example Usage                          |
|-------------------------------------|---------------------------|-------------|----------------------------------------|
| Checking the presence of an integer | `scanner.hasNextInt()`    | `boolean`   | `if (scanner.hasNextInt()) { ... }`    |
| Checking the presence of a double   | `scanner.hasNextDouble()` | `boolean`   | `if (scanner.hasNextDouble()) { ... }` |

---

## Workshop (if-else, if-else_if-else, switch-case)

### Using Different Types of switch-case

**Key Points to Know**

* Each **case** branch should end with a `break` statement to prevent the execution of other branches.
* **default** is a block that executes if none of the **case** options match the expression.
* The expression in a switch can be of different types: **integer** (`byte, short, int, long`), **strings** (`String`),
  **characters** (`char`), **enumerations** (`enum`), and even **objects**.
* It's essential to use the **break** statement to avoid "falling through" to other **case** options.
* If **break** is omitted, code execution will continue in the next **case**.

```
String choice = "tea"; // Let's assume the user chose tea

switch (choice) {
    case "coffee":
        System.out.println("You chose coffee.");
        break;
    case "tea":
        System.out.println("You chose tea.");
        break;
    case "soda":
        System.out.println("You chose soda.");
        break;
    default:
        System.out.println("Invalid choice.");
}
```

### Operators &, &&, |, and || in Java

- Operators &, &&, |, and || are used for performing logical operations.

**`&` (Bitwise AND) `&&` (Logical AND)**

- `&`, `&&` perform a logical **AND** operation between two conditions.
- Returns true only if **both** conditions are true (equal to true).

**`|` (Bitwise OR) `||` (Logical OR)**

- `|`, `||` perform a logical **OR** operation between two conditions.
- Returns true if **at least one** of the conditions is true (equal to true).

#### Differences between & and &&, | and ||

- `&&` and `||` have short-circuiting behavior. This means that if the result can be determined based on the first
  operand, the second operand is not evaluated.

## Tasks

- Write a program where the user first enters their first name, last name, and how to address them. After entering these
  three values, the program should greet the user.
  ```
  Example:
  Input in the console:
  Andrej
  Reutow
  Herr

  Output:
  Hello, Herr Andre Reutow
  ```


- The user enters a number from 1 to 12, and the program tells which season corresponds to the entered month.

```
Example:
Input in the console:
7

Output:
You entered month 7, which is summer.
```

- The user enters a number from 1 to 12, and the program tells both the season and the name of the month corresponding
  to the entered number.

```
Example:
Input in the console:
8

Output:
You entered 8, August, which is summer.
```

- Write a program to calculate the payment to an employee with consideration of their years of service, assuming a base
  salary of $500. For 3 years of service, there's a 10% bonus, for 5 years - a 50% bonus, for 10 years - a 100% bonus,
  and for 15 years - a 150% bonus. The number of years of service is entered by the user via the keyboard. (You can use
  if or switch at your discretion)
- Rewrite the tasks from the previous lecture's homework using Scanner.

## Scanner

### Теория

Класс Scanner в Java используется для получения ввода пользователя.

- подготовка сканера: `Scanner scanner = new Scanner(System.in);`

| описание                        | вызов                   | возвращаемый тип | пример  использования                   | пример ввода в консоль |
|---------------------------------|-------------------------|------------------|-----------------------------------------|------------------------|
| чтение строки                   | `scanner.nextLine()`    | `String`         | `String line = scanner.nextLine();`     | `my name is`           |
| Чтение слова                    | `scanner.next()`        | `String`         | `String word = scanner.next();`         | `Hello`                |
| Чтение целого числа             | `scanner.nextInt()`     | `int`            | `int number = scanner.nextInt();`       | `5`                    |
| Чтение числа с плавающей точкой | `scanner.nextDouble()`  | `double`         | `double value = scanner.nextDouble();`  | `3.14`                 |
| Чтение логического значения     | `scanner.nextBoolean()` | `boolean`        | `boolean flag = scanner.nextBoolean();` | `true`                 |

#### next vs nextLine

- **scanner.next()**: Этот метод читает слово из ввода. Если во вводе есть пробелы, то **next()** вернет только первое
  слово до ближайшего пробела. Пробелы после этого слова останутся во входной очереди. Пример:

````
Scanner scanner=new Scanner(System.in);
String word=scanner.next();
System.out.println(word);
````

Если вводите "Hello World", то word будет содержать "Hello".

- **scanner.nextLine()**: Этот метод читает всю строку до символа новой строки _('\n')_. Это означает, что он считает
  всю строку включая пробелы и другие символы, пока не встретит символ новой строки. Пример:

````
Scanner scanner = new Scanner(System.in);
String line = scanner.nextLine();
System.out.println(line);
````

Если вводите "Hello World", то line будет содержать "Hello World".

```java
import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number:");
        int x = scanner.nextInt();
        System.out.println("You entered: " + x);
    }
}
```

- Если пользователь вводит неверное значение, то поведение методов **nextInt()**, **nextDouble()**, и **nextBoolean()**
  вызовет исключение (ошибку)

- Чтобы избежать исключений, рекомендуется использовать проверки перед вызовом этих методов, чтобы убедиться, что ввод
  пользователя соответствует ожидаемому формату. Вы можете использовать методы **hasNextInt()**, **hasNextDouble()**, и
  **hasNextBoolean()**, чтобы проверить, можно ли безопасно прочитать значение определенного типа, и предпринять
  дополнительные действия в случае некорректного ввода.

| описание                                  | вызов                     | возвращаемый тип | пример использования                   |
|-------------------------------------------|---------------------------|------------------|----------------------------------------|
| Проверка наличия целого числа             | `scanner.hasNextInt()`    | `boolean`        | `if (scanner.hasNextInt()) { ... }`    |
| Проверка наличия числа с плавающей точкой | `scanner.hasNextDouble()` | `boolean`        | `if (scanner.hasNextDouble()) { ... }` |

---

## Практикум (if-else, if-else_if-else, switch-case)

### Использование разных типов switch-case

**Важно знать**

* Каждая ветвь **case** должна заканчиваться оператором break, чтобы предотвратить выполнение других ветвей.
* **default** - это блок, который выполняется, если ни один из вариантов case не соответствует выражению.
* Выражение в switch может быть различных типов: **целочисленные** (`byte, short, int, long`), **строки** (`String`),
  **символы** (`char`), **перечисления** (`enum`) и даже **объекты**.
* Необходимо использовать **break**, чтобы избежать "**_проваливания_**" в другие case.
* Если break пропущен, выполнение кода будет продолжено в следующем case.

````
String chose = "чай"; // Пусть пользователь выбрал чай

switch (chose) {
    case "кофе":
        System.out.println("Вы выбрали кофе.");
        break;
    case "чай":
        System.out.println("Вы выбрали чай.");
        break;
    case "газировка":
        System.out.println("Вы выбрали газировку.");
        break;
    default:
        System.out.println("Неверный выбор.");
}
````

### Операторы &, &&, | и || в Java

- операторы &, &&, | и ||, которые используются для выполнения логических операций.

**`&` (Побитовое И) `&&` (Логическое И)**

- `&`, `&&` выполняет логическое **И** между двумя условиями.
- возвращает true только в том случае, если **оба** условия истинны (равны true).

**`|` (Побитовое ИЛИ) `||` (Логическое ИЛИ)**

- `|`, `||` выполняет логическое **ИЛИ** между двумя условиями.
- возвращает true, если хотя бы **одно** из условий истинно (равно true).

#### Различия между & и &&, | и ||

- `&&` и `||` обладают короткой цепочкой вычислений. Это означает, что если значение результата
  можно определить на основе первого операнда, второй операнд не вычисляется.

**Задачи**

- Написать программу, в которой пользователь вводит сначала свое имя, потом фамилия и как к нему обращаться. После ввода
  этих 3 значений программа должна поприветствовать пользователя.
  ```
  Пример:
  Ввод в консоль:
  Andrej
  Reutow
  Herr
  
  Вывод:
  Здравствуйте, Herr Andre Reutow
  ```
- Пользователь с клавиатуры вводит число от 1 до 12, программа сообщает, какому времени года принадлежит введенный
  месяц.
  ```
  Пример:
  Ввод в консоль:
  7
  
  Вывод:
  Вы ввели 7 месяц, это лето
  ```

- Пользователь с клавиатуры вводит число от 1 до 12, программа сообщает, какому времени года принадлежит введенный
  месяц и какой это месяц.
  ```
  Пример:
  Ввод в консоль:
  8
  
  Вывод:
  Вы ввели 8, Август, это лето
  ```

- Напишите программу расчета выдачи денег работнику с учётом надбавки за стаж, если базовая зарплата 500$. За 3 года
  работы надбавка 10%, за 5 лет работы надбавка 50%, за 10 лет работы надбавка 100%, за 15 лет работы надбавка 150%.
  Сколько лет проработал работник вводится с клавиатуры. (используйте на усмотрение if или switch)
- переписать задачи из дз прошлой лекции с использованием Scanner
