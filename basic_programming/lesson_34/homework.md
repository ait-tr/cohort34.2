<details style="margin-top: 16px">
  <summary style="cursor: pointer; color: blue;"><b>English</b></summary>

1. Create an anonymous class that implements `Comparator<String>`. Compare strings based on the number of vowel letters.
    - **Hint**: Use the `charAt()` method to iterate through each character in the string and count the vowels.

2. Using a lambda expression, implement a `Comparator<String>` that compares strings based on the number of consonant
   letters.
    - **Hint**: You can also use the `charAt()` method to count consonants.

3. **Predicates**: Create a predicate that checks whether an integer is a power of two.
    - **Hint**: A number is a power of two if `n & (n - 1) == 0` and `n > 0`.

4.

**Task**:  
You have a `Student` class with fields `name` (name), `age` (age), and `gpa` (grade point average). Your task is to
write a program that can filter and sort a list of students based on various criteria.

**Subtasks**:

1. **Predicate**: Create a predicate that checks whether the student is of legal age (age 18 and above).
2. **Lambda Expression and Comparator**: Using a lambda expression, create a comparator that sorts the students based on
   their grade point average (GPA) in descending order.
3. **Final Task**: Create a method that takes an array of students and uses the predicate and comparator to:
    - Filter the list, leaving only students who are of legal age.
    - Sort the filtered list based on grade point average in descending order.

</details>

<hr>

<details style="margin-top: 16px">
  <summary style="cursor: pointer; color: blue;"><b>На русском</b></summary>

1. Создайте анонимный класс, реализующий `Comparator<String>`. Сравнивайте строки по количеству гласных букв.
    - **Подсказка**: Используйте метод `charAt()` для прохода по каждому символу строки и подсчета гласных.
2. Используя лямбда-выражение, реализуйте `Comparator<String>`, который сравнивает строки по количеству согласных букв.
    - **Подсказка**: Также можно использовать метод `charAt()` для подсчета согласных.
~~3. **Предикаты**: Создайте предикат, который проверяет, является ли целое число степенью двойки.
    - **Подсказка**: Число является степенью двойки, если `n & (n - 1) == 0` и `n > 0`.~~
4. У вас есть класс `Student` с полями `name` (имя), `age` (возраст), и `gpa` (средний балл). Ваша задача — написать
   программу, которая сможет фильтровать и сортировать список студентов по различным критериям.

**Подзадачи:**

~~1. **Предикат**: Создайте предикат, который проверяет, является ли студент совершеннолетним (возраст 18 и выше).~~
1. Создайте метод, который проверяет, является ли студент совершеннолетним (возраст 18 и выше).
2. **Лямбда-выражение и Comparator**: Используя лямбда-выражение, создайте компаратор, который сортирует студентов по
   среднему баллу (GPA) в убывающем порядке.
3. **Итоговая задача**: Создайте метод, который принимает массив студентов и использует предикат и компаратор для:
    - Фильтрации списка, оставляя только совершеннолетних студентов.
    - Сортировки отфильтрованного списка по среднему баллу в убывающем порядке.

</details>
