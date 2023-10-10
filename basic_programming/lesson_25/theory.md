<details style="margin-top: 16px">
  <summary style="cursor: pointer; color: blue;"><b>English</b></summary>

### The `String` Class in Java

Strings in Java are represented by the `String` class. This class provides numerous methods for various string operations.

#### Creating Strings

Strings can be created in different ways:

```java
String str1 = "Hello, world!";
String str2 = new String("Hello, world!");
```

#### Key Methods

- **`length()`**: Returns the length of the string.

   ```java
   int len = str1.length();  // 12
   ```

- **`charAt(int index)`**: Returns the character at the specified index of the string.

   ```java
   char ch = str1.charAt(0);  // 'H'
   ```

- **`substring(int beginIndex, int endIndex)`**: Returns a substring starting from `beginIndex` to `endIndex - 1`.

   ```java
   String sub = str1.substring(0, 5);  // "Hello"
   ```

- **`concat(String str)`**: Concatenates strings.

   ```java
   String newStr = str1.concat(" How are you?");  // "Hello, world! How are you?"
   ```

- **`indexOf(String str)`** and **`lastIndexOf(String str)`**: Returns the index of the first and last occurrence of a substring in the string, respectively.

   ```java
   int first = str1.indexOf('o');  // 4
   int last = str1.lastIndexOf('l');  // 10
   ```

- **`replace(char oldChar, char newChar)`**: Replaces all occurrences of `oldChar` with `newChar`.

   ```java
   String replaced = str1.replace(' ', '_');  // "Hello,_world!"
   ```

- **`toLowerCase()`** and **`toUpperCase()`**: Returns a new string with all characters converted to lowercase or uppercase.

   ```java
   String lower = str1.toLowerCase();  // "hello, world!"
   String upper = str1.toUpperCase();  // "HELLO, WORLD!"
   ```

- **`trim()`**: Removes leading and trailing whitespace from the string.

   ```java
   String trimmed = "  Hello, world!  ".trim();  // "Hello, world!"
   ```

- **`split(String regex)`**: Splits the string into an array of substrings using a regular expression.

   ```java
   String[] words = str1.split(" ");  // ["Hello,", "world!"]
   ```

These are just some of the many methods provided by the `String` class. With these methods, you can efficiently manipulate strings and perform various operations.


## Working with the `char` Data Type and Unicode in Java

#### Description of the `char` Data Type

In Java, `char` is a primitive data type used to store a single Unicode character. It occupies 16 bits and can represent characters in the range from `\u0000` (0) to `\uffff` (65,535).

**Example:**
```java
char myChar = 'A'; // or char myChar = '\u0041';
```

#### Boxing and Unboxing of `char`

A primitive `char` can be boxed into an object of type `Character`.

**Example of boxing and unboxing:**
```java
char primitiveChar = 'B';
Character wrappedChar = Character.valueOf(primitiveChar); // Boxing
char anotherPrimitiveChar = wrappedChar.charValue(); // Unboxing
```

#### Converting to a String

A `char` can easily be converted to a string in various ways:

1. Concatenation with an empty string: `myChar + ""`
2. Using `String.valueOf(myChar)`
3. Using the `String` constructor: `new String(new char[]{myChar})`

#### Logical Operators

Characters can be compared using standard logical operators (`<`, `>`, `<=`, `>=`, `==`, `!=`) because their numeric Unicode values are used in comparisons.

#### Unicode and Code Points

Unicode is a character encoding standard that represents text in computers. Each character corresponds to a unique code point represented in hexadecimal. For example, the character "A" has the code point U+0041.

#### Why Use `\u`?

The `\u` symbol is used to escape Unicode characters, allowing you to work with characters that are not available on the keyboard or may not be displayed in a text editor.

### Technical Specification for Password Validation Program

**Description:**
Create a `PasswordValidator` class in Java to validate passwords according to requirements that will be set via the class constructor.

**Requirements:**
1. The password must contain at least a specified number of lowercase letters.
2. The password must contain at least a specified number of uppercase letters.
3. The password must contain at least a specified number of digits.
4. The password must have a specified minimum length.
5. The password must contain at least one of the characters specified in the character list.
6. The count of characters from the list must be at least a specified value.

**Interface:**
1. Create the `PasswordValidator` class with fields defined in the constructor:
    - `minLowerCase` (int): Minimum number of lowercase letters.
    - `minUpperCase` (int): Minimum number of uppercase letters.
    - `minDigits` (int): Minimum number of digits.
    - `minLength` (int): Minimum password length.
    - `symbolList` (String): List of characters that must be in the password.
    - `minSymbolCount` (int): Minimum count of characters from the list.

2. In the `PasswordValidator` class, create a `isValid` method that takes a string (password) to check and returns `true` if the password meets all the requirements, and `false` otherwise.

3. Usage of **Character** class methods:

    - To check if a character is a lowercase letter, use the `Character.isLowerCase(char c)` method.
    - To check if a character is an uppercase letter, use the `Character.isUpperCase(char c)` method.
    - To check if a character is a digit, use the `Character.isDigit(char c)` method.

**Example of Use:**
```java
public class Main {
    public static void main(String[] args) {
        int minLowerCase = 2;
        int minUpperCase = 2;
        int minDigits = 1;
        int minLength = 12;
        String symbolList = "!@#$%^";
        int minSymbolCount = 2;
        
        PasswordValidator validator = new PasswordValidator(minLowerCase, minUpperCase, minDigits, minLength, symbolList, minSymbolCount);
        
        String password = "MyP@ssword123";
        boolean isValid = validator.isValid(password);
        
        if (isValid) {
            System.out.println("Password is valid.");
        } else {
            System.out.println("Password does not meet the requirements.");
        }
    }
}
```

#### Skeleton of the `PasswordValidator` Class:

```java
/**
 * @author Andrej Reutow
 * created on 09.10.2023
 * <p>
 * Class for password validation according to specified requirements.
 */
public class PasswordValidator {

    private final int minLowerCase;
    private final int minUpperCase;
    private final int minDigits;
    private final int minLength;
    private final String symbolList;
    private final int minSymbolCount;

    /**
     * Constructor of the PasswordValidator class to initialize password validation parameters.
     *
     * @param minLowerCase   Minimum number of lowercase letters.
     * @param minUpperCase   Minimum number of uppercase letters.
     * @param minDigits      Minimum number of digits.
     * @param minLength      Minimum password length.
     * @param symbolList     List of characters that must be in the password.
     * @param minSymbolCount Minimum count of characters from the list.
     */
    public PasswordValidator(int minLowerCase,
                             int minUpperCase,
                             int minDigits,
                             int minLength,
                             String symbolList,
                             int minSymbolCount) {

    }

    /**
     * Checks whether the given password meets the requirements.
     *
     * @param password Password to be checked.
     * @return true if the password meets the requirements, false otherwise.
     */
    public boolean isValid(String password) {

        return false;
    }

    /**
     * Checks whether the password contains the specified number of digits.
     *
     * @param password Password to be checked.
     * @return true if the password contains the specified number of digits, false otherwise.
     */
    private boolean isDigitsContains(String password) {

        return false;
    }

    /**
     * Checks whether the password contains the specified characters from the list.
     *
     * @param password Password to be checked.
     * @return true if the password contains the specified number of characters from the list, false otherwise.
     */
    private boolean isSymbolsContains(String password) {

        return false;
    }

    /**
     * Checks whether the password contains the specified number of uppercase letters.
     *
     * @param password Password to be checked.
     * @return true if the password contains the specified number of uppercase letters, false otherwise.
     */
    private boolean isUpperCaseContains(String password) {

        return false;
    }

    /**
     * Checks whether the password contains the specified number of lowercase letters.
     *
     * @param password Password to be checked.
     * @return true if the password contains the specified number of lowercase letters, false otherwise.
     */
    private boolean isLowerCaseContains(String password) {

        return false;
    }

    /**
     * Checks whether the password length is sufficient.
     *
     * @param password Password to be checked.
     * @return true if the password length is greater than or equal to the minimum length, false otherwise.
     */
    private boolean isLengthValid(String password) {
        return -1;
    }
}
```

</details>

<hr>

<details style="margin-top: 16px">
  <summary style="cursor: pointer; color: blue;"><b>На русском</b></summary>

### Класс `String` в Java

Строки в Java представлены классом `String`. Этот класс предоставляет множество методов для различных операций со
строками.

#### Создание строк

Строки можно создавать разными способами:

```java
        String str1="Привет, мир!";
        String str2=new String("Привет, мир!");
```

#### Основные методы

- **`length()`**: Возвращает длину строки.

   ```java
   int len = str1.length();  // 12
   ```

- **`charAt(int index)`**: Возвращает символ строки по указанному индексу.

   ```java
   char ch = str1.charAt(0);  // 'П'
   ```

- **`substring(int beginIndex, int endIndex)`**: Возвращает подстроку, начиная с `beginIndex` и
  заканчивая `endIndex - 1`.

   ```java
   String sub = str1.substring(0, 6);  // "Привет"
   ```

- **`indexOf(String str)`** и **`lastIndexOf(String str)`**: Возвращает индекс первого и последнего вхождения подстроки
  в строке соответственно.

   ```java
   int first = str1.indexOf('м');  // 8
   int last = str1.lastIndexOf('т');  // 5
   ```

- **`replace(char oldChar, char newChar)`**: Заменяет все вхождения символа `oldChar` на `newChar`.

   ```java
   String replaced = str1.replace(' ', '_');  // "Привет,_мир!"
   ```

- **`toLowerCase()`** и **`toUpperCase()`**: Возвращает новую строку, где все символы преобразованы к нижнему или
  верхнему регистру.

   ```java
   String lower = str1.toLowerCase();  // "привет, мир!"
   String upper = str1.toUpperCase();  // "ПРИВЕТ, МИР!"
   ```

- **`trim()`**: Удаляет пробелы в начале и в конце строки.

   ```java
   String trimmed = "  Привет, мир!  ".trim();  // "Привет, мир!"
   ```


- **`split(String regex)`**: Разбивает строку на массив подстрок, используя регулярное выражение.

    ```java
    String[] words = str1.split(" ");  // ["Привет,", "мир!"]
    ```

Это лишь некоторые из многочисленных методов, предоставляемых классом `String`. С их помощью можно эффективно
манипулировать строками и производить различные операции.


## Работа с типом данных `char` и Unicode в Java

#### Описание типа данных `char`

В Java, `char` — это примитивный тип данных, используемый для хранения одного символа Unicode. Он занимает 16 бит и может представлять символы в диапазоне от `\u0000` (0) до `\uffff` (65,535).

**Пример:**
```java
char myChar = 'A'; // или char myChar = '\u0041';
```

#### Упаковка и распаковка типа `char`

Примитивный `char` можно упаковать в объект типа `Character`.

**Пример упаковки и распаковки:**
```java
char primitiveChar = 'B';
Character wrappedChar = Character.valueOf(primitiveChar); // Упаковка
char anotherPrimitiveChar = wrappedChar.charValue(); // Распаковка
```

#### Приведение к строке

Char можно легко привести к строке различными способами:

1. Конкатенация с пустой строкой: `myChar + ""`
2. Использование `String.valueOf(myChar)`
3. Конструктор `String`: `new String(new char[]{myChar})`

#### Логические операторы

Символы можно сравнивать с помощью стандартных логических операторов (`<`, `>`, `<=`, `>=`, `==`, `!=`), поскольку их численные Unicode-значения используются в сравнениях.

#### Unicode и кодовые точки

Unicode — это стандарт кодирования, представляющий текст в компьютерах. Каждому символу соответствует уникальная кодовая точка, представленная в шестнадцатеричной системе счисления. Например, символ "A" имеет кодовую точку U+0041.

#### Зачем использовать `\u`?

Символ `\u` используется для экранирования Unicode-символов. Это позволяет работать с символами, которые недоступны на клавиатуре или не отображаются в текстовом редакторе.


### Техническое задание для программы проверки пароля

**Описание:**
Создайте класс `PasswordValidator` на Java для проверки пароля на соответствие требованиям, которые будут устанавливаться через конструктор класса.

**Требования:**
1. Пароль должен содержать минимум заданное количество букв нижнего регистра.
2. Пароль должен содержать минимум заданное количество букв верхнего регистра.
3. Пароль должен содержать минимум заданное количество цифр.
4. Пароль должен иметь заданную длину.
5. Пароль должен содержать хотя бы один из символов, указанных в списке символов.
6. Количество символов из списка должно быть не менее определенного значения.

**Интерфейс:**
1. Создайте класс `PasswordValidator` с полями, определенными в конструкторе:
    - `minLowerCase` (int): Минимальное количество букв нижнего регистра.
    - `minUpperCase` (int): Минимальное количество букв верхнего регистра.
    - `minDigits` (int): Минимальное количество цифр.
    - `minLength` (int): Минимальная длина пароля.
    - `symbolList` (String): Список символов, которые должны быть в пароле.
    - `minSymbolCount` (int): Минимальное количество символов из списка.
2. В классе `PasswordValidator` создайте метод `isValid`, который принимает строку (пароль) для проверки и возвращает `true`, если пароль соответствует всем требованиям, и `false` в противном случае.

3. Использование методов **Character** класса:

   - Для проверки, является ли символ буквой нижнего регистра, используйте метод `Character.isLowerCase(char c)`.
   - Для проверки, является ли символ буквой верхнего регистра, используйте метод `Character.isUpperCase(char c)`.
   - Для проверки, является ли символ цифрой, используйте метод `Character.isDigit(char c)`.


**Пример использования:**
```java
public class Main {
    public static void main(String[] args) {
        int minLowerCase = 2;
        int minUpperCase = 2;
        int minDigits = 1;
        int minLength = 12;
        String symbolList = "!@#$%^";
        int minSymbolCount = 2;
        
        PasswordValidator validator = new PasswordValidator(minLowerCase, minUpperCase, minDigits, minLength, symbolList, minSymbolCount);
        
        String password = "MyP@ssword123";
        boolean isValid = validator.isValid(password);
        
        if (isValid) {
            System.out.println("Пароль верный.");
        } else {
            System.out.println("Пароль не соответствует требованиям.");
        }
    }
}
```

#### Скелет класса `PasswordValidator`:

````java
/**
 * @author Andrej Reutow
 * created on 09.10.2023
 * <p>
 * Класс для проверки пароля на соответствие заданным требованиям.
 */
public class PasswordValidator {

    private final int minLowerCase;
    private final int minUpperCase;
    private final int minDigits;
    private final int minLength;
    private final String symbolList;
    private final int minSymbolCount;

    /**
     * Конструктор класса PasswordValidator для инициализации параметров проверки пароля.
     *
     * @param minLowerCase   Минимальное количество букв нижнего регистра.
     * @param minUpperCase   Минимальное количество букв верхнего регистра.
     * @param minDigits      Минимальное количество цифр.
     * @param minLength      Минимальная длина пароля.
     * @param symbolList     Список символов, которые должны быть в пароле.
     * @param minSymbolCount Минимальное количество символов из списка.
     */
    public PasswordValidator(int minLowerCase,
                             int minUpperCase,
                             int minDigits,
                             int minLength,
                             String symbolList,
                             int minSymbolCount) {

    }

    /**
     * Проверяет, соответствует ли заданный пароль требованиям.
     *
     * @param password Пароль для проверки.
     * @return true, если пароль соответствует требованиям, и false в противном случае.
     */
    public boolean isValid(String password) {

        return false;
    }

    /**
     * Проверяет, содержит ли пароль заданное количество цифр.
     *
     * @param password Пароль для проверки.
     * @return true, если пароль содержит заданное количество цифр, и false в противном случае.
     */
    private boolean isDigitsContains(String password) {

        return false;
    }

    /**
     * Проверяет, содержит ли пароль заданные символы из списка.
     *
     * @param password Пароль для проверки.
     * @return true, если пароль содержит заданное количество символов из списка, и false в противном случае.
     */
    private boolean isSymbolsContains(String password) {

        return false;
    }

    /**
     * Проверяет, содержит ли пароль заданное количество символов верхнего регистра.
     *
     * @param password Пароль для проверки.
     * @return true, если пароль содержит заданное количество символов верхнего регистра, и false в противном случае.
     */
    private boolean isUpperCaseContains(String password) {

        return false;
    }

    /**
     * Проверяет, содержит ли пароль заданное количество символов нижнего регистра.
     *
     * @param password Пароль для проверки.
     * @return true, если пароль содержит заданное количество символов нижнего регистра, и false в противном случае.
     */
    private boolean isLowerCaseContains(String password) {

        return false;
    }

    /**
     * Проверяет, является ли длина пароля достаточной.
     *
     * @param password Пароль для проверки.
     * @return true, если длина пароля больше или равна минимальной длине, и false в противном случае.
     */
    private boolean isLengthValid(String password) {
        return -1;
    }
}

````

</details>
