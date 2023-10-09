<details style="margin-top: 16px">
  <summary style="cursor: pointer; color: blue;"><b>English</b></summary>



</details>

<hr>

<details style="margin-top: 16px">
  <summary style="cursor: pointer; color: blue;"><b>На русском</b></summary>

## Это дз переносится на следующий день

### Требования: 
- Для выполнения дз создайте отдельный класс с именем StringTasks и реализуйте статичные методы для каждой задачи.
- Создайте класс Application с методом public static void main(String[] args)
- Все методы класса StringTasks должны вызваться из класса Application

<details style="margin-top: 16px">
  <summary style="cursor: pointer"><b>Пример</b></summary>
Пример:

````java
public class Application {

    public static void main(String[] args) {
        System.out.println(StringTasks.countDigits("I am agent 007"));
        System.out.println(StringTasks.countUppercaseLetters("Hello World"));
        System.out.println(StringTasks.reverseWords("Hello World"));
    }
}


public class StringTasks {
    
    // Задача 1. Реализуйте метод, который подсчитает количество цифр в строке.
    public static int countDigits(String value){
        // code
    } 
    
    // other methods
}
````

</details>

### Задача 1. Реализуйте метод, который подсчитает количество цифр в строке.

**Пример 1:** Дана строка "I am agent 007", Результат: В строке 3 цифр(ы)

**Пример 2:** Дана строка "In 2022, I went to the sea twice", Результат: В строке 4 цифр(ы)

**Пример 3:** Дана строка "I was in Berlin 3 times in 2023, and in 2022 I was there twice", Результат: В строке 9 цифр(
ы)

- попробуйте разные подходы, с разбиением стоки в массив символов и с использованием charAt

### Задача 2. Реализуйте метод, который подсчитает количество только верхнего регистра в строке от A до Z.

**Пример 1:** Дана строка "Hello World", Результат: 2 букв(ы) верхнего регистра

**Пример 2:** Дана строка "In 2022, I went to the sea twice", Результат: 2 букв(ы) верхнего регистра

**Пример 3:** Дана строка "I was in Berlin 3 times in 2023, and in 2022 I was there twice", Результат: 3 букв(ы)
верхнего регистра


### Задача 3*. Реализуйте метод, который принимает строку и возвращает новую строку, в которой все слова перевернуты, но порядок слов остается прежним.

**Пример 1:** Дана строка "Hello World", Результат: "olleH dlroW"

**Пример 2:** Дана строка "Java Programming", Результат: "avaJ gnimmargorP"

**Пример 3:** Дана строка "Easy come easy go", Результат: "ysaE emoc ysae og"

</details>
