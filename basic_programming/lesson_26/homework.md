<details style="margin-top: 16px">
  <summary style="cursor: pointer; color: blue;"><b>English</b></summary>

### Task 1

Given the sentence:

```
What is Java technology and what is its application?
Java is a programming language and a computing platform that was first released by Sun Microsystems in 1995. The technology has evolved from modest development to a tool that plays a significant role
in the modern digital world, providing a reliable platform for a multitude of services and applications. Innovative products
and digital services developed for the future will also be based on Java.

Despite the fact that most modern Java applications combine the Java environment and application, there are still many applications and even some websites that will not work if the desktop
version of Java is not installed on the computer. Java.com is a website designed for users who may still need Java
for desktop applications, especially for Java 8 applications. For more detailed information for developers and
users who would like to learn Java programming, see the dev.java website, for
business users, see the oracle.com/java website.
```

- Write a method that answers how many characters are in this sentence.
- Count how many letters (not characters, digits, or signs!) are in this sentence.
- Count how many letters of the Latin alphabet are in this sentence.
- Count how many letters of the Cyrillic alphabet are in this sentence.

### Task 2* Password Encoding and Decoding Program

#### Technical Specification

#### Goal:

Develop a Java program for encoding and decoding passwords using the following conditions:

- Every even index of a password character is shifted 1000 characters to the right in Unicode.
- Every odd index of a password character is shifted 10 characters to the left in Unicode.
- 6 random characters from the Unicode table are added to the encoded password.

### Functional Requirements:

1. The program should have two main methods: `encodePassword` for encoding a password and `decodePassword` for decoding a password.
2. The `encodePassword` method should take a string with the password as input and return the encoded password as a string.
3. The `decodePassword` method should take the encoded password as a string and return the original password as a string.
4. The program should add 6 random Unicode characters to the encoded password each time a password is encoded.

### Non-functional Requirements:

1. The program should be easy to use through a text-based console interface.
2. The program should be easily readable and maintainable.
3. The program should be tested (smoke test https://en.wikipedia.org/wiki/Smoke_testing_(software)).

</details>

<hr>

<details style="margin-top: 16px">
  <summary style="cursor: pointer; color: blue;"><b>На русском</b></summary>

### Задание 1

Дано предложение:

````text
Что такое технология Java и каково ее применение?
Java представляет собой язык программирования и платформу вычислений, которая была впервые выпущена компанией Sun
Microsystems в 1995 г. Технология эволюционировала из скромной разработки до инструмента, который играет серьезную роль
в современном цифровом мире, предоставляя надежную платформу для множества сервисов и приложений. Инновационные продукты
и цифровые услуги, разрабатываемые для будущего, также будут создаваться на основе Java.

Несмотря на то что большинство современных приложений Java объединяет в себе среду и приложение Java, все еще существует
множество приложений и даже некоторые веб-сайты, которые не будут работать, если на компьютере не установлена настольная
версия Java. Java.com — это веб-сайт, предназначенный для пользователей, которым, возможно, Java по-прежнему требуется
для настольных приложений, в частности для приложений на Java 8. Более подробную информацию для разработчиков и
пользователей, которые хотели бы научиться программированию на Java, см. на веб-сайте dev.java, для
бизнес-пользователей — на веб-странице oracle.com/java.
````

- Напишите метод, который отвечает на вопрос сколько cимволов в этом предложении.
- Подсчитайте, сколько букв (не символов и не цифр и не знаков!) в этом предложении.
- Подсчитайте, сколько букв латиского алфавита в этом предложении.
- Подсчитайте, сколько букв кирилического алфавита в этом предложении.

### Задание 2* Программа кодирования и декодирования пароля

### Техническое задание

#### Цель:

Разработать программу на Java для кодирования и декодирования пароля с использованием следующих условий:

- Каждый четный индекс символа пароля сдвигается на 1000 символов вправо в Unicode.
- Каждый нечетный индекс символа пароля сдвигается на 10 символов влево в Unicode.
- В закодированный пароль добавляются 6 случайных символов из таблицы Unicode.

### Функциональные требования:

1. Программа должна иметь два основных метода: `encodePassword` для кодирования пароля и `decodePassword` для
   декодирования пароля.
2. Метод `encodePassword` должен принимать строку с паролем в качестве входных данных и возвращать закодированный пароль
   в виде строки.
3. Метод `decodePassword` должен принимать закодированный пароль в виде строки и возвращать исходный пароль в виде
   строки.
4. Программа должна добавлять 6 случайных символов из Unicode в закодированный пароль при каждой кодировке пароля.

### Нефункциональные требования:

1. Программа должна быть простой в использовании через текстовый интерфейс в консоли.
2. Программа должна быть легко читаемой и поддерживаемой.
3. Программа должна быть протестирована (smoke test - https://ru.wikipedia.org/wiki/Smoke_test).

</details>
