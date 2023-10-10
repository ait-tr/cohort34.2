<details style="margin-top: 16px">
  <summary style="cursor: pointer; color: blue;"><b>English</b></summary>

### Task 1

Write a program that requests a string from the user and then:

- Reports the number of words in the string.
- Reports the number of characters in the string.
- Prints the string in reverse.
- Reports the number of uppercase letters.
- Reports the number of lowercase letters.
- Reports the number of digits in the string.

### Task 2

Given the text:

```
Java works on different platforms (Windows, Mac, Linux, Raspberry Pi, etc.);It is one of the most popular programming
languages in the world; It has a large demand in the current job market; It is easy to learn and simple to use; It is
open-source and free; It is secure, fast and powerful; It has a huge community support (tens of millions of developers);
Java is an object-oriented language which gives a clear structure to programs and allows code to be reused, lowering
development costs; As Java is close to C++ and C#, it makes it easy for programmers to switch to Java or vice versa;
```

You need to print this text to the console approximately in the following format along with the title `Why Use Java?`:

![img.png](https://raw.githubusercontent.com/ait-tr/cohort34.2/main/basic_programming/lesson_26/img.png)

### Task 3

Given the text (taken from https://en.wikipedia.org/wiki/Java_(programming_language)):

```
Java is a high-level, class-based, object-oriented programming language that is designed to have as few implementation
dependencies as possible. It is a general-purpose programming language intended to let programmers write once, run
anywhere (WORA), meaning that compiled Java code can run on all platforms that support Java without the need to
recompile. Java applications are typically compiled to bytecode that can run on any Java virtual machine (JVM)
regardless of the underlying computer architecture. The syntax of Java is similar to C and C++, but has fewer low-level
facilities than either of them. The Java runtime provides dynamic capabilities (such as reflection and runtime code
modification) that are typically not available in traditional compiled languages. As of 2019, Java was one of the most
popular programming languages in use according to GitHub, particularly for client–server web
applications, with a reported 9 million developers.

Java was originally developed by James Gosling at Sun Microsystems. It was released in May 1995 as a core component of
Sun Microsystems' Java platform. The original and reference implementation Java compilers, virtual machines, and class
libraries were originally released by Sun under proprietary licenses. As of May 2007, in compliance with the
specifications of the Java Community Process, Sun had relicensed most of its Java technologies under the GPL-2.0-only
license. Oracle offers its own HotSpot Java Virtual Machine, however the official reference implementation is the
OpenJDK JVM which is free open-source software and used by most developers and is the default JVM for almost all Linux
distributions.

As of September 2023, Java 21 is the latest version, while Java 17, 11 and 8 are the current long-term support (LTS)
versions.
```

- Extract the full sentence from the text that starts with `It` (up to `.`).
- Check if the text starts with `Java is a high-level` using the new method `startsWith()`.
- Check if the text ends with the substring `wikipedia` using the new method `endsWith()`.

### Task 4: Password Validation Program

#### Technical Specification for the Password Validation Program

#### Description:

Create a Java class `PasswordValidator` to validate passwords against requirements that will be set through the class
constructor.

#### Requirements:

1. The password must contain at least a specified number of lowercase letters.
2. The password must contain at least a specified number of uppercase letters.
3. The password must contain at least a specified number of digits.
4. The password must have a specified length.
5. The password must contain at least one of the characters listed in the character list.
6. The count of characters from the list should be at least a certain value.

#### Interface:

1. Create the class `PasswordValidator` with fields defined in the constructor:
    - `minLowerCase` (int): Minimum number of lowercase letters.
    - `minUpperCase` (int): Minimum number of uppercase letters.
    - `minDigits` (int): Minimum number of digits.
    - `minLength` (int): Minimum password length.
    - `symbolList` (String): List of characters that must be in the password.
    - `minSymbolCount` (int): Minimum count of characters from the list.
2. In the `PasswordValidator` class, create a method `isValid` that takes a string (password) to check and
   returns `true` if the password meets all the requirements, and `false` otherwise.
3. Use the methods of the `Character` class for the following checks:
    - To check if a character is a lowercase letter, use `Character.isLowerCase(char c)`.
    - To check if a character is an uppercase letter, use `Character.isUpperCase(char c)`.
    - To check if a character is a digit, use `Character.isDigit(char c)`.

**Example Usage:**

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
            System.out.println("The password is valid.");
        } else {
            System.out.println("The password does not meet the requirements.");
        }
    }
}
```

#### `PasswordValidator` Class Skeleton:

```java
/**
 * @author Andrej Reutow
 * created on 09.10.2023
 * <p>
 * Class to validate passwords against specified requirements.
 */
public class PasswordValidator {

    private final int minLowerCase;
    private final int minUpperCase;
    private final int minDigits;
    private final int minLength;
    private final String symbolList;
    private final int minSymbolCount;

    /**
     * Constructor for the PasswordValidator class to initialize password validation parameters.
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
     * Checks if the given password meets the requirements.
     *
     * @param password The password to check.
     * @return true if the password meets the requirements, false otherwise.
     */
    public boolean isValid(String password) {

        return false;
    }

/**
```

 </details>

<hr>

<details style="margin-top: 16px">
  <summary style="cursor: pointer; color: blue;"><b>На русском</b></summary>

### Задача 1.

Напишите программу, которая запрашивает строку от пользователя и затем:

- сообщает сколько слов в строке
- сообщает сколько символов в строке
- печатает строку задом наперед.
- сообщает сколько букв верхнего регистра.
- сообщает сколько букв нижнего регистра.
- сообщает сколько цифр в строке.

## Задача 2

Дан текст:

````text
Java works on different platforms (Windows, Mac, Linux, Raspberry Pi, etc.);It is one of the most popular programming
language in the world; It has a large demand in the current job market; It is easy to learn and simple to use; It is
open-source and free; It is secure, fast and powerful; It has a huge community support (tens of millions of developers);
Java is an object oriented language which gives a clear structure to programs and allows code to be reused, lowering
development costs; As Java is close to C++ and C#, it makes it easy for programmers to switch to Java or vice versa;
````

Необходимо вывести этот текст в консоль (примерно) в таком виде вместе с заголовком `Why Use Java?`:

![img.png](https://raw.githubusercontent.com/ait-tr/cohort34.2/main/basic_programming/lesson_26/img.png)

___

## Задача 3

Дан текст (текст взят с https://en.wikipedia.org/wiki/Java_(programming_language)):

````text

Java is a high-level, class-based, object-oriented programming language that is designed to have as few implementation
dependencies as possible. It is a general-purpose programming language intended to let programmers write once, run
anywhere (WORA), meaning that compiled Java code can run on all platforms that support Java without the need to
recompile. Java applications are typically compiled to bytecode that can run on any Java virtual machine (JVM)
regardless of the underlying computer architecture. The syntax of Java is similar to C and C++, but has fewer low-level
facilities than either of them. The Java runtime provides dynamic capabilities (such as reflection and runtime code
modification) that are typically not available in traditional compiled languages. As of 2019, Java was one of the most
popular programming languages in use according to GitHub, particularly for client–server web
applications, with a reported 9 million developers.

Java was originally developed by James Gosling at Sun Microsystems. It was released in May 1995 as a core component of
Sun Microsystems' Java platform. The original and reference implementation Java compilers, virtual machines, and class
libraries were originally released by Sun under proprietary licenses. As of May 2007, in compliance with the
specifications of the Java Community Process, Sun had relicensed most of its Java technologies under the GPL-2.0-only
license. Oracle offers its own HotSpot Java Virtual Machine, however the official reference implementation is the
OpenJDK JVM which is free open-source software and used by most developers and is the default JVM for almost all Linux
distributions.

As of September 2023, Java 21 is the latest version, while Java 17, 11 and 8 are the current long-term support (LTS)
versions.

Quelle: wikipedia
````

* Вырезать из текста полное предложение, которое начинается с `It` (до `.`)
* Проверить, начинается ли текст с  `Java is a high-level` - новый метод - `startsWith()`.
* Проверить, заканчивается ли текст подстрокой `wikipedia` - новый метод - `endsWith()`.

___

## Задание 4: программы проверки пароля

### Техническое задание для программы проверки пароля

### Описание:

Создайте класс `PasswordValidator` на Java для проверки пароля на соответствие требованиям, которые будут
устанавливаться через конструктор класса.

### Требования:

1. Пароль должен содержать минимум заданное количество букв нижнего регистра.
2. Пароль должен содержать минимум заданное количество букв верхнего регистра.
3. Пароль должен содержать минимум заданное количество цифр.
4. Пароль должен иметь заданную длину.
5. Пароль должен содержать хотя бы один из символов, указанных в списке символов.
6. Количество символов из списка должно быть не менее определенного значения.

### Интерфейс:

1. Создайте класс `PasswordValidator` с полями, определенными в конструкторе:
    - `minLowerCase` (int): Минимальное количество букв нижнего регистра.
    - `minUpperCase` (int): Минимальное количество букв верхнего регистра.
    - `minDigits` (int): Минимальное количество цифр.
    - `minLength` (int): Минимальная длина пароля.
    - `symbolList` (String): Список символов, которые должны быть в пароле.
    - `minSymbolCount` (int): Минимальное количество символов из списка.
2. В классе `PasswordValidator` создайте метод `isValid`, который принимает строку (пароль) для проверки и
   возвращает `true`, если пароль соответствует всем требованиям, и `false` в противном случае.

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

