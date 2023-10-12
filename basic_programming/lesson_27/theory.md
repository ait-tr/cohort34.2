<details style="margin-top: 16px">
  <summary style="cursor: pointer; color: blue;"><b>English</b></summary>

## Intro

- Previously, we checked the correct operation of the methods we created by executing several times application, with
  different sets of source data, and comparing the result obtained in the console with the expected. It is very
  uncomfortable. For example, any code change requires repeating the entire repeat the above procedure. There are
  special
  libraries that make it easier and automate this process. One of the most popular for Java is JUnit

- Working with JUnit involves creating a class with tests and setting it up. In the class, we can specify objects to be
  tested and the necessary data as fields. In the method marked with the @BeforeEach annotation, we give initial
  settings
  to the object under test. And in methods marked with the @Test annotation, we write code that checks the object under
  test. Checks are carried out using methods starting with the word assert... (which exist a large number for all
  cases),
  and taking the obtained result and the expected one for comparison. All specified methods and annotations are provided
  by the JUnit library. Each method marked with the @Test annotation is essentially a separate “main”.

Sure, here is the updated lecture material in English:

## What is JUnit?

JUnit is a framework for unit testing in Java that helps developers verify the correctness of individual pieces of
code (units). It is designed to simplify the process of creating and running test scenarios for your code.

**Key Concepts of JUnit:**

1. **JUnit Annotations:** JUnit uses annotations to define test methods. Two main annotations are `@Test`, which marks a
   method as a test, and `@Before` / `@After`, which are executed before and after each test.

2. **Assertions:** To check expected test results, use methods from the `org.junit.Assert` class or its static imports,
   such as `assertEquals`, `assertTrue`, `assertFalse`, and others.

3. **Test Suites:** You can group tests into classes and packages using the `@RunWith` and `@Suite` annotations.

**Testing Scenarios**

**Positive Testing:**

Positive testing is a methodology for verifying the functionality of a program for correctness within expected and
permissible scenarios. In this case, tests are performed using input data that align with the expected conditions of the
program's usage.

Examples of positive tests:

- Checking the addition of two positive numbers.
- Verifying login to a system with correct credentials.
- Ensuring that a web page opens without errors with a valid URL.

**Negative Testing:**

Negative testing is aimed at examining how a program handles invalid or incorrect data and scenarios. The goal of
negative testing is to detect and verify the correctness of error handling and exceptional situations.

Examples of negative tests:

- Attempting division by zero.
- Trying to log in to a system with incorrect credentials.
- Attempting to open a non-existent web page.

Positive and negative testing together provide comprehensive test coverage and ensure that your software functions
correctly in both expected and unexpected scenarios.

## Key Methods of the Assertions Class in JUnit:**

Certainly, here are the main methods of the Assertions class in tabular form:

| Method                                          | Description                                                                    |
|-------------------------------------------------|--------------------------------------------------------------------------------|
| `assertEquals(expected, actual)`                | Checks that `expected` is equal to `actual`.                                   |
| `assertNotEquals(expected, actual)`             | Checks that `expected` is not equal to `actual`.                               |
| `assertTrue(condition)`                         | Checks that `condition` is true.                                               |
| `assertFalse(condition)`                        | Checks that `condition` is false.                                              |
| `assertNull(object)`                            | Checks that `object` is `null`.                                                |
| `assertNotNull(object)`                         | Checks that `object` is not `null`.                                            |
| `assertArrayEquals(expectedArray, actualArray)` | Checks that two arrays `expectedArray` and `actualArray` are equal in content. |

**Naming Test Methods (Test Cases) in JUnit:**

Good naming of test methods is important to understand their purpose without analyzing the code. Here are some
recommendations:

- Use meaningful names that reflect the essence of the test.
- Start test names with verbs like "test" or "verify."
- Use underscores or camelCase.
- Be specific and avoid generic names like "test1" or "test2."

Examples of correctly named test methods:

- `testAdditionWithPositiveNumbers`
- `testDivisionByZero`
- `testInvalidInputHandling`

## Practical Assignments for Learning

**Assignment 1:** Create a class `Calculator` that contains methods for performing mathematical operations (addition,
subtraction, multiplication, division, etc.). Write unit tests for these methods, checking the correctness of the
results using JUnit assertions.

**Assignment 2:** Create a class `StringUtils` that contains methods for working with strings (e.g., concatenating
strings, searching for substrings, etc.). Write tests for these methods with different input data and expected results.

**Remember**, good testing includes both positive and negative tests to ensure that your code works correctly in all
scenarios.

</details>

<hr>

<details style="margin-top: 16px">
  <summary style="cursor: pointer; color: blue;"><b>На русском</b></summary>

## Intro

- Ранее мы проверяли правильность работы созданных нами методов, выполняя несколько раз аппликацию, с различными
  наборами
  исходных данных, и сравнивая результат полученный в консоли с ожидаемым. Это очень не удобно. Например любое изменение
  кода, требует повторения всей вышеописанной процедуры заново. Существуют специальные библиотеки, которые позволяют
  облегчить и автоматизировать этот процесс. Одна из самых популярных для Java, это JUnit

- Работа с JUnit заключается в создании класса с тестами и настройке его. В классе в качестве полей мы можем указать
  объекты для тестирования и необходимые данные. В методе помеченном аннотацией @BeforeEach мы даем начальные настройки
  тестируемому объекту. А в методах помеченных аннотацией @Test мы пишем код проверяющий тестируемый объект. Проверки
  осуществляются при помощи методов начинающихся со слова assert... (которых существует большое колличество на все
  случаи), и принимающих для сравнения полученный результат и ожидаемый. Все указанные методы и аннотации
  предоставляются
  библиотекой JUnit. Каждый метод помеченный аннотацией @Test, по сути является отдельным "мейном".

## Что такое JUnit?

JUnit - это фреймворк для юнит-тестирования в Java, который помогает разработчикам проверять правильность
функционирования отдельных частей кода (юнитов). Он спроектирован так, чтобы облегчить процесс создания и запуска
тестовых сценариев для вашего кода.

**Основные концепции JUnit:**

1. **Аннотации JUnit:** JUnit использует аннотации для определения тестовых методов. Две основные аннотации - `@Test`,
   которая помечает метод как тестовый, и `@Before` / `@After`, которые выполняются перед и после каждого теста.

2. **Утверждения (Assertions):** Для проверки ожидаемых результатов тестов используйте методы из
   класса `org.junit.Assert` или его статические импорты, например, `assertEquals`, `assertTrue`, `assertFalse` и
   другие.

3. **Тестовые наборы:** Вы можете группировать тесты в классы и пакеты с использованием аннотации `@RunWith` и `@Suite`.

## Сценарии тестирования

### Позитивное тестирование (Positive Testing):**

**Позитивное тестирование** - это методика проверки функциональности программы на правильность выполнения в рамках
ожидаемых
и допустимых сценариев. В этом случае тесты выполняются с использованием входных данных, которые соответствуют ожидаемым
условиям использования программы.

Примеры позитивных тестов:

- Проверка сложения двух положительных чисел.
- Проверка входа в систему с корректными учетными данными.
- Проверка, что веб-страница открывается без ошибок при корректном URL.

### Негативное тестирование (Negative Testing):

**Негативное тестирование** - это направлено на проверку того, как программа обрабатывает недопустимые или некорректные
данные и
сценарии. Целью негативного тестирования является обнаружение и проверка на корректность обработки ошибок и
исключительных ситуаций.

Примеры негативных тестов:

- Попытка деления на ноль.
- Попытка входа в систему с неправильными учетными данными.
- Попытка открыть несуществующую веб-страницу.

**Позитивное и негативное тестирование вместе обеспечивают полное покрытие тестами и помогают убедиться, что ваше
программное обеспечение работает как в ожидаемых, так и в непредвиденных сценариях.**

## Основные методы класса Assertions в JUnit:

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

**Именование тестовых методов (шестерни) в JUnit:**

Хорошее именование тестовых методов важно для понимания их назначения без необходимости анализа кода. Вот рекомендации:

- Используйте осмысленные имена, отражающие суть теста.
- Начинайте имена тестов с глаголов, таких как "test" или "verify".
- Используйте подчеркивания или camelCase.
- Будьте специфичны и избегайте общих имен, таких как "test1" или "test2".

Примеры правильного именования тестовых методов:

- `testAdditionWithPositiveNumbers`
- `testDivisionByZero`
- `testInvalidInputHandling`

## Практические задания для обучения

**Задание 1:** Создайте класс `Calculator`, который содержит методы для выполнения математических операций (сложение,
вычитание, умножение, деление и т. д.). Напишите юнит-тесты для этих методов, проверяя правильность результатов с
использованием утверждений JUnit.

**Задание 2:** Создайте класс `StringUtils`, который содержит методы для работы со строками (например, конкатенация
строк, поиск подстроки и т. д.). Напишите тесты для этих методов с разными входными данными и ожидаемыми результатами.

**Помните**, что хорошее тестирование включает в себя как позитивные, так и негативные тесты, чтобы убедиться, что ваш
код работает правильно во всех сценариях.

</details>
