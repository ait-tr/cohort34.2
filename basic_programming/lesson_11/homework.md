## Task 1

**"Is the array symmetrical?"**
Check if the array is symmetrical. A symmetrical array looks the same when read from left to right and from right to
left.

## Task 2

**"Lottery Ticket"**
Create an array with numbers from 1 to 10. Let the user enter 3 numbers. Check how many numbers the user guessed
correctly.

## Task 3

**"Random Choice"**
Create an array with movie or book titles. The program randomly selects one of them for viewing or reading and displays
it to the user.

## Task 4 ***!!!

Create an array with numbers from 1 to 50. The program should randomly select one of these numbers, and the user should
guess it. After each attempt, the program should give a hint: whether the number is higher or lower than the guessed
one.
**Hint:**

- For this task, you will need a method that generates a random number:

### How to use Random in Java

To generate random numbers in Java, the Random class is often used. First, you need to import this class:

1. **Import the class:** At the beginning of your file, you need to import the Random class.

<details>
  <summary>Нажмите, чтобы открыть</summary>

```
import java.util.Random;
```

2. **Create an object:** Create an object of the Random class.

```
Random rand = new Random();
```

3. **Generate random numbers:** Now you can use the **rand** object to generate random numbers.

```
int randomNumber = rand.nextInt(50) + 1; // Random number from 1 to 50
```

Example:

```java
import java.util.Random;

public class MyRandom {
    public static void main(String[] args) {
        Random rand = new Random();
        int randomNumber = rand.nextInt(50) + 1; // Random number from 1 to 50
    }
}
```

**!!!** Note that nextInt(50) returns a number from **0** to **49**. By adding 1, we get a range from 1 to 50.

</details>

## Задача 1

**"Симметричный ли массив?"**

Проверьте, является ли массив симметричным. Симметричный массив выглядит одинаково при чтении слева направо и справа
налево.

## Задача 2

**"Лотерейный билет"**

Создайте массив с числами от 1 до 10. Пусть пользователь вводит 3 числа. Проверьте, сколько чисел пользователь угадал.

## Задача 3

**"Случайный выбор"**

Создайте массив с названиями фильмов или книг. Программа случайным образом выбирает одно из них для просмотра или чтения
и выводит это пользователю.

## Задача 4 ***!!!

Создайте массив с числами от 1 до 50. Программа должна случайно выбрать одно из этих чисел, а пользователь должен его
угадать. После каждой попытки программа должна подсказывать: число больше или меньше загаданного.
**Подсказка:**

- Для этой задачи вам понадобится метод, который генерирует рандомное число:

### Как использовать Random в Java

Для генерации случайных чисел в Java часто используется класс Random. Сначала необходимо импортировать этот класс:

1. **Импорт класса:** В начале вашего файла нужно импортировать класс Random.

<details>
  <summary>Нажмите, чтобы открыть</summary>

````
import java.util.Random;
````

2. **Создание объекта:** Создайте объект класса Random.

````
Random rand = new Random();
````

3. **Генерация случайных чисел:** Теперь вы можете использовать объект **rand** для генерации случайных чисел.

````
int randomNumber = rand.nextInt(50) + 1; // Случайное число от 1 до 50
````

Пример:

````java
import java.util.Random;

public class MyRandom {
    public static void main(String[] args) {
        Random rand = new Random();
        int randomNumber = rand.nextInt(50) + 1; // Случайное число от 1 до 50
    }
}
````

**!!!** Обратите внимание, что nextInt(50) возвращает число от **0** до **49**. Прибавляя 1, мы получаем диапазон от 1
до 50.
</details>
