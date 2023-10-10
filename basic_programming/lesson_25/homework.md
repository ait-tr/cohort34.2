<details style="margin-top: 16px">
  <summary style="cursor: pointer; color: blue;"><b>English</b></summary>


### Task 1. Implement a method that counts the number of digits in a string.

**Example 1:** Given the string "I am agent 007", Result: There are 3 digit(s) in the string.

**Example 2:** Given the string "In 2022, I went to the sea twice", Result: There are 4 digit(s) in the string.

**Example 3:** Given the string "I was in Berlin 3 times in 2023, and in 2022 I was there twice", Result: There are 9 digit(s) in the string.

- Try different approaches, such as splitting the string into an array of characters and using `charAt`.

### Task 2. Implement a method that counts only uppercase letters in a string from A to Z.

**Example 1:** Given the string "Hello World", Result: 2 uppercase letter(s)

**Example 2:** Given the string "In 2022, I went to the sea twice", Result: 2 uppercase letter(s)

**Example 3:** Given the string "I was in Berlin 3 times in 2023, and in 2022 I was there twice", Result: 3 uppercase letter(s)

### Task 3*. Implement a method that takes a string and returns a new string where all words are reversed, but the order of words remains the same.

**Example 1:** Given the string "Hello World", Result: "olleH dlroW"

**Example 2:** Given the string "Java Programming", Result: "avaJ gnimmargorP"

**Example 3:** Given the string "Easy come easy go", Result: "ysaE emoc ysae og"

### Task 4: Understand the solution to this problem:

#### Changing the Case of Characters

Write a program that takes an uppercase character and converts it to lowercase, and vice versa.

**Pay attention to these lines:**

```
   if (inputChar >= 'A' && inputChar <= 'Z')
   else if (inputChar >= 'a' && inputChar <= 'z')
```

```java
public class CharUtils {

    public static char toUpperCase(char inputChar) {
        char outputChar = inputChar;

        if (inputChar >= 'A' && inputChar <= 'Z') {             // Pay attention!
            outputChar = (char) (inputChar + 'a' - 'A');
        } else if (inputChar >= 'a' && inputChar <= 'z') {      // Pay attention!
            outputChar = (char) (inputChar - ('a' - 'A'));
        } else {
            outputChar = inputChar;
        }

        return outputChar;
    }

}
```

<details style="margin-top: 16px">
  <summary style="cursor: pointer; color: blue;"><b>Explanation 1</b></summary>

1. Each letter in Unicode has a numeric code. For example, the symbol `'A'` has a numeric code of 65, and `'a'` has a numeric code of 97 in the decimal system.

2. It checks whether the entered character is in the range from 65 to 90 (uppercase). If so, it adds the difference between the numeric codes of `'a'` (97) and `'A'` (65), which is 32, to the numeric code of the character. This converts the character to lowercase.

   For example, for `'A'` (numeric code 65): `65 + (97 - 65) = 65 + 32 = 97`, which is the numeric code for `'a'`.

3. Similarly, if the character is in lowercase (numeric code between 97 and 122), it subtracts 32 to convert it to uppercase.

   For example, for `'a'` (numeric code 97): `97 - (97 - 65) = 97 - 32 = 65`, which is the numeric code for `'A'`.

4. If the numeric code of the character does not match either of these ranges, the character remains unchanged.

</details>

<details style="margin-top: 16px">
  <summary style="cursor: pointer; color: blue;"><b>Explanation 2</b></summary>

1. To do this, it first checks whether the character is an uppercase letter (`inputChar >= 'A' && inputChar <= 'Z'`).

2. If it is, the character is converted to the corresponding lowercase character. This is done by adding the difference between `'a'` and `'A'` to the character. For example, if `inputChar` is `'A'`, then `'A' + ('a' - 'A')` will be `'a'`.

3. Similarly, if the character is in lowercase (`inputChar >= 'a' && inputChar <= 'z'`), it is converted to uppercase by subtracting the difference between `'a'` and `'A'`.

4. If the character is not an alphabet letter, it remains unchanged.

This approach uses arithmetic operations with characters, which is possible because in Java, characters are represented by their numeric Unicode values.

</details>

</details>

<hr>

<details style="margin-top: 16px">
  <summary style="cursor: pointer; color: blue;"><b>На русском</b></summary>

### Задача 1. Реализуйте метод, который подсчитает количество цифр в строке.

**Пример 1:** Дана строка "I am agent 007", Результат: В строке 3 цифр(ы)

**Пример 2:** Дана строка "In 2022, I went to the sea twice", Результат: В строке 4 цифр(ы)

**Пример 3:** Дана строка "I was in Berlin 3 times in 2023, and in 2022 I was there twice", Результат: В строке 9 цифр(
ы)

- попробуйте разные подходы, с разбиением стоки на массив символов и с использованием charAt

### Задача 2. Реализуйте метод, который подсчитает количество только верхнего регистра в строке от A до Z.

**Пример 1:** Дана строка "Hello World", Результат: 2 букв(ы) верхнего регистра

**Пример 2:** Дана строка "In 2022, I went to the sea twice", Результат: 2 букв(ы) верхнего регистра

**Пример 3:** Дана строка "I was in Berlin 3 times in 2023, and in 2022 I was there twice", Результат: 3 букв(ы)
верхнего регистра


### Задача 3*. Реализуйте метод, который принимает строку и возвращает новую строку, в которой все слова перевернуты, но порядок слов остается прежним.

**Пример 1:** Дана строка "Hello World", Результат: "olleH dlroW"

**Пример 2:** Дана строка "Java Programming", Результат: "avaJ gnimmargorP"

**Пример 3:** Дана строка "Easy come easy go", Результат: "ysaE emoc ysae og"


### Задача 4: Разобраться с решением этой задачи:

#### Смена регистра символов

Напишите программу, которая принимает символ в верхнем регистре и преобразует его в нижний регистр, и наоборот.

**Обратите внимание на эти строки:**

````

   if (inputChar >= 'A' && inputChar <= 'Z')
   else if (inputChar >= 'a' && inputChar <= 'z')
   
````

````java
public class CharUtils {

    public static char toUpperCase(char inputChar) {
        char outputChar = inputChar;

        if (inputChar >= 'A' && inputChar <= 'Z') {             // Обратите внимание!
            outputChar = (char) (inputChar + 'a' - 'A');
        } else if (inputChar >= 'a' && inputChar <= 'z') {      // Обратите внимание!
            outputChar = (char) (inputChar - ('a' - 'A'));
        } else {
            outputChar = inputChar;
        }

        return outputChar;
    }

}
````

<details style="margin-top: 16px">
  <summary style="cursor: pointer; color: blue;"><b>Объяснение 1</b></summary>

1. Каждая буква в Unicode имеет числовой код. Для примера, символ `'A'` имеет числовой код 65, а `'a'` — 97 в десятичной
   системе.

2. Проверяем, находится ли введенный символ в диапазоне от 65 до 90 (верхний регистр). Если это так, то к числовому коду
   символа добавляем разницу между числовыми кодами `'a'` (97) и `'A'` (65), которая равна 32. Это преобразует символ в
   нижний регистр.

   Например, для `'A'` (числовой код 65): `65 + (97 - 65) = 65 + 32 = 97`, что является числовым кодом для `'a'`.

3. Аналогично, если символ в нижнем регистре (числовой код между 97 и 122), мы вычитаем 32, чтобы преобразовать его в
   верхний регистр.

   Например, для `'a'` (числовой код 97): `97 - (97 - 65) = 97 - 32 = 65`, что является числовым кодом для `'A'`.

4. Если числовой код символа не соответствует ни одному из этих диапазонов, символ остается без изменений.

</details>

<details style="margin-top: 16px">
  <summary style="cursor: pointer; color: blue;"><b>Объяснение 2</b></summary>

1. Для этого сначала проверяется, является ли символ буквой в верхнем регистре (`inputChar >= 'A' && inputChar <= 'Z')`.

2. Если это так, символ преобразуется в соответствующий символ в нижнем регистре. Это делается путем добавления разницы
   между `'a'` и `'A'` к символу. Например, если `inputChar` равен `'A'`, то `'A' + ('a' - 'A')` будет равно `'a'`.

3. Аналогично, если символ в нижнем регистре (`inputChar >= 'a' && inputChar <= 'z')`, он преобразуется в верхний
   регистр, вычитая разницу между `'a'` и `'A'`.

4. Если символ не является буквой алфавита, он остается без изменений.

Этот подход использует арифметические операции с символами, что возможно, потому что в Java символы представлены их
числовыми Unicode-значениями.

</details>

</details>
