<details style="margin-top: 16px">
  <summary style="cursor: pointer; color: blue;"><b>English</b></summary>

1. Write a program that takes a string from the keyboard and determines whether it is a palindrome (a string that reads
   the same forwards and backward, ignoring spaces and character case) and write tests for it.
2. Write a program that compares two versions of string numbers (e.g., "1.2.3" and "2.0.1") and returns the comparison
   result, and write tests for it.

</details>

<hr>

<details style="margin-top: 16px">
  <summary style="cursor: pointer; color: blue;"><b>На русском</b></summary>

1. Напишите программу, которая принимает строку с клавиатуры и определяет, является ли она палиндромом (строкой, которая
   читается одинаково с начала и с конца, игнорируя пробелы и регистр символов) и напишите тесты.
2. Напишите программу, которая которая сравнивает две версии строковых чисел (например, "1.2.3" и "2.0.1") и
   возвращает результат сравнения и напишите тесты.

   Если 'version1' меньше чем 'version2', метод возвращает '-1'.
   Если 'version1' равен 'version2', метод возвращает '0'.
   Если 'version1' больше чем 'version2', метод '1'.

   **скелет метода:**

````

    public static int compareVersion(String version1, String version2) {
        //   Если 'version1' меньше чем 'version2', метод возвращает '-1'.
        //   Если 'version1' равен 'version2',      метод возвращает '0'.
        //   Если 'version1' больше чем 'version2', метод '1'.
    }
````

**Пример:**
compareVersion("1.2.3", "2.0.1") // метод должен вернуть -1

compareVersion("1.2.3", "1.2.3") // метод должен вернуть 0

compareVersion("2.0.1", "1.2.3") // метод должен вернуть 1

</details>
