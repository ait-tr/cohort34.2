<details style="margin-top: 16px">
  <summary style="cursor: pointer; color: blue;"><b>English</b></summary>

### Array Copying Tasks:

1. **Reverse Array**: Write a program that creates a new array containing the elements of the original array in reverse order, using `System.arraycopy()`.

2. **Merge Arrays**: Write a method that takes two arrays of integers and returns a new array that is the result of merging them. Use `System.arraycopy()`.

3. **Remove Duplicates**: Write a program that removes all duplicates from a sorted array. Again, use `System.arraycopy()` to shift elements.

### Binary Search Tasks:

**Find Median**: Create a sorted array of random numbers. Write a program that finds the median of this array using binary search.

**Median** of a set of numbers is the value that appears in the middle when the set is sorted. If the number of elements is odd, the median is the middle number. If the number of elements is even, the median is the average of the two middle numbers.

- Example 1. Find the median of the set of numbers: 5, 17, 3, 9, 14, 2.
    - **Solution**: Arrange the numbers in ascending order: 2, 3, **5, 9,** 14, 17. Since the number of elements is even, the median is the average of the two middle numbers: (5 + 9) / 2 = 7.

- Example 2. Find the median of the set of numbers: 5, 2, 18, 8, 3.
    - **Solution**: Arrange the numbers in ascending order: 2, 3, **5,** 8, 18. Since the number of elements is odd, the median is the middle number, which is 5.

### Comprehensive Task:

**Sort and Search in Student Array**: Create a `Student` class with fields `id`, `name`, and `GPA` (grade point average).

- Implement a method that sorts an array of students by their GPA and uses `System.arraycopy()` to create a new array with the top 5 students.
- Write a method that takes an average grade and finds the student with the closest grade point average to the given one, using binary search.

</details>

<hr>

<details style="margin-top: 16px">
  <summary style="cursor: pointer; color: blue;"><b>На русском</b></summary>

### Задачи на копирование массивов:

1. **Обратный массив**: Напишите программу, которая создает новый массив, содержащий элементы исходного массива в
   обратном порядке, используя `System.arraycopy()`.

2. **Слияние массивов**: Напишите метод, который принимает два массива целых чисел и возвращает новый массив, который
   является результатом их слияния. Используйте `System.arraycopy()`.

3. **Удаление дубликатов**: Напишите программу, которая удаляет все дубликаты из отсортированного массива. Снова
   используйте `System.arraycopy()` для сдвига элементов.

### Задачи на бинарный поиск:

**Поиск медианы**: Создайте отсортированный массив случайных чисел. Напишите программу, которая находит медиану этого
   массива с помощью бинарного поиска.

**Медианой ряда чисел** (или медианой числового ряда) называется число, стоящее посередине упорядоченного по возрастанию
ряда чисел — в случае, если количество чисел нечётное. Если же количество чисел в ряду чётно, то медианой ряда является
полусумма двух стоящих посередине чисел упорядоченного по возрастанию ряда.

- Пример 1. Найти медиану числового ряда 5, 17, 3, 9, 14, 2.
    - **Решение.** Записываем все числа ряда в порядке возрастания: 2, 3, **5, 9,** 14, 17. Количество чисел в ряду
      чётно, поэтому медиана этого ряда будет равна полусумме двух средних чисел: (5 + 9) / 2 = 7.

- Пример 2. Найти медиану числового ряда 5, 2, 18, 8, 3.
    - **Решение.** записываем все числа ряда в порядке возрастания: 2, 3, **5,** 8, 18. Количество чисел в ряду нечётно,
      поэтому медиана этого ряда будет равна стоящему посередине числу, то есть равна 5.

### Комплексная задача:

**Сортировка и поиск в массиве студентов**: Создайте класс `Student` с полями `id`, `name` и `GPA` (средний балл).

- Реализуйте метод, который сортирует массив студентов по GPA и использует `System.arraycopy()` для создания нового
  массива с топ-5 студентами.
- Напишите метод, который принимает средний балл и находит студента с ближайшим средним баллом к данному, используя
  бинарный поиск.

</details>
