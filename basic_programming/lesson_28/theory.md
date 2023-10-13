<details style="margin-top: 16px">
  <summary style="cursor: pointer; color: blue;"><b>English</b></summary>



</details>

<hr>

<details style="margin-top: 16px">
  <summary style="cursor: pointer; color: blue;"><b>На русском</b></summary>

## Классы Wrapper:

Классы-оболочки (Wrapper classes) используются для оборачивания примитивных типов данных в объекты. В Java существуют
следующие классы-оболочки:

- `Integer` для `int`
- `Double` для `double`
- `Boolean` для `boolean`
- `Character` для `char`
  и так далее.

## Методы класса String:

Класс `String` в Java предоставляет множество методов для работы со строками. Вот некоторые из них:

- `length()` - возвращает длину строки.
- `charAt(int index)` - возвращает символ по указанному индексу.
- `substring(int beginIndex, int endIndex)` - возвращает подстроку из строки.
- `toUpperCase()` и `toLowerCase()` - изменяют регистр символов строки.
- `indexOf(String str)` и `lastIndexOf(String str)` - Возвращает индекс первого и последнего вхождения подстроки
  в строке соответственно.
- `replace(char oldChar, char newChar)` - Заменяет все вхождения символа `oldChar` на `newChar`.
- `trim()` - Удаляет пробелы в начале и в конце строки
- `split(String regex)`: Разбивает строку на массив подстрок, используя регулярное выражение.

## Unit Testing:

Unit Testing - это процесс проверки отдельных компонентов (или "юнитов") программы для убеждения в их правильной работы.
В Java, для тестирования используется фреймворк JUnit.

### Основные методы класса Assertions в JUnit:

Конечно, вот основные методы класса Assertions в виде таблицы:

| Метод                                           | Описание                                                           |
|-------------------------------------------------|--------------------------------------------------------------------|
| `assertEquals(expected, actual)`                | Проверяет, что `expected` равно `actual`.                          |
| `assertNotEquals(expected, actual)`             | Проверяет, что `expected` не равно `actual`.                       |
| `assertTrue(condition)`                         | Проверяет, что `condition` истинно.                                |
| `assertFalse(condition)`                        | Проверяет, что `condition` ложно.                                  |
| `assertNull(object)`                            | Проверяет, что `object` является `null`.                           |
| `assertNotNull(object)`                         | Проверяет, что `object` не является `null`.                        |
| `assertArrayEquals(expectedArray, actualArray)` | Проверяет, что два массива expected и actual равны по содержимому. |

**Задачи:**

1. Реализовать 5 методов для калькулятора (сложение, вычитание, умножение, деление с остатком, целая часть от деления), который работает с целыми числами. Покрыть все методы тестами.
3. Напишите программу, которая удаляет все вхождения определенного символа из строки и напишите тесты.
4. Напишите программу, которая определит, содержит ли строка только уникальные символы (без повторений) и напишите тесты.

### Техническое задание для программы проверки пароля

**Описание:**
Создайте класс `PasswordValidator` на Java для проверки пароля на соответствие требованиям, которые будут
устанавливаться через конструктор класса. Класс `PasswordValidator` должен быть протестирован.

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
2. В классе `PasswordValidator` создайте метод `isValid`, который принимает строку (пароль) для проверки и
   возвращает `true`, если пароль соответствует всем требованиям, и `false` в противном случае.

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
    public boolean isDigitsContains(String password) {

        return false;
    }

    /**
     * Проверяет, содержит ли пароль заданные символы из списка.
     *
     * @param password Пароль для проверки.
     * @return true, если пароль содержит заданное количество символов из списка, и false в противном случае.
     */
    public boolean isSymbolsContains(String password) {

        return false;
    }

    /**
     * Проверяет, содержит ли пароль заданное количество символов верхнего регистра.
     *
     * @param password Пароль для проверки.
     * @return true, если пароль содержит заданное количество символов верхнего регистра, и false в противном случае.
     */
    public boolean isUpperCaseContains(String password) {

        return false;
    }

    /**
     * Проверяет, содержит ли пароль заданное количество символов нижнего регистра.
     *
     * @param password Пароль для проверки.
     * @return true, если пароль содержит заданное количество символов нижнего регистра, и false в противном случае.
     */
    public boolean isLowerCaseContains(String password) {

        return false;
    }

    /**
     * Проверяет, является ли длина пароля достаточной.
     *
     * @param password Пароль для проверки.
     * @return true, если длина пароля больше или равна минимальной длине, и false в противном случае.
     */
    public boolean isLengthValid(String password) {
        return -1;
    }
}

````


</details>
