<details style="margin-top: 16px">
  <summary style="cursor: pointer; color: blue;"><b>English</b></summary>

## The `static` Modifier

The `static` modifier in Java is applied to variables, methods, and inner classes to make them associated with the class
rather than specific instances of the class. Here's how it works:

### 1. Static Variables (Fields)

- Static variables belong to the class, not to instances of the class. They are shared among all objects of that class.
- Example:

```java
class MyClass {
    static int count = 0; // Static variable
}
```

### 2. Static Methods

- Static methods also belong to the class, not instances. They can be called without creating an object of the class.
- Example:

```java
class MathUtils {
    static int add(int a, int b) {
        return a + b;
    }
}
```

### 3. Static Initialization Blocks

- Static initialization blocks are executed when the class is loaded and can be used to initialize static variables.
- Example:

```java
class MyClass {
    static {
        // This block is executed when the class is loaded
        System.out.println("Class MyClass is loaded.");
    }
}
```

## Running a Java Application from the Console

### For a Single Class:

1. Save your code in a file with a `.java` extension, e.g., `MyApp.java`.

2. Open the command prompt (console) and navigate to the directory where your `.java` file is located.

3. Compile the class using the `javac` command, for example:

```bash
javac MyApp.java
```

4. Run the application using the `java` command, specifying the class name with
   the `public static void main(String[] args)` method:

```bash
java MyApp
```

### Application with Packages

Suppose your application consists of two packages: `javac` and `javac.model`, and two classes: `MyApp` and `Auto`. Let's
see how to compile and run it from the command line.

Assuming your project structure is as follows:

```
myproject/
    src/
        javac/
            MyApp.java
        javac/model/
            Auto.java
```

Here's how to compile and run your application:

1. Open the command prompt (console) and navigate to the root folder of your project `myproject`.

2. Compile your application using the `javac` command, specifying the path to the `src` root folder:

```bash
javac -d . src/javac/*.java src/javac/model/*.java
```

3. After successful compilation, navigate back to the `myproject` folder where the compiled `.class` files are located:

```bash
cd ..
```

4. Now, you can run your application by specifying the full class name `MyApp`:

```bash
java -cp . javac.MyApp
```

After running this command, your application will start, and you will be prompted to enter the make and model of a car.
It will then output "Bla bla bla!" as the `toString()` method in the `Auto` class always returns this string.

Make sure you execute these commands from the root folder of your project, and you should be able to compile and run
your Java application successfully.

## Command Line Arguments

In the `public static void main(String[] args)` method, the `args` parameter is an array of strings that contains the
arguments passed when launching the application from the command line. For example:

```java
public class MyApp {
    public static void main(String[] args) {
        for (int i = 0; i < args.length; i++) {
            String arg = args[i];
            System.out.println("Argument: " + arg);
        }
    }
}
```

When running the application with arguments:

```bash
java MyApp arg1 arg2 arg3
```

You will see:

```
Argument: arg1
Argument: arg2
Argument: arg3
```

This allows you to pass parameters to your application from the command line and use them in your program.

</details>

<hr>

<details style="margin-top: 16px">
  <summary style="cursor: pointer; color: blue;"><b>На русском</b></summary>

## Модификатор `static`

Модификатор `static` в Java применяется к переменным, методам и внутренним классам, чтобы они стали связанными с
классом, а не с конкретными экземплярами класса. Вот как это работает:

### 1. Статические переменные (поля)

- Статические переменные принадлежат классу, а не экземплярам класса. Они общие для всех объектов этого класса.
- Пример:

```java
class MyClass {
    static int count = 0; // Статическая переменная
}
```

### 2. Статические методы

- Статические методы тоже принадлежат классу, а не экземплярам. Они могут быть вызваны без создания объекта класса.
- Пример:

```java
class MathUtils {
    static int add(int a, int b) {
        return a + b;
    }
}
```

### 3. Статические блоки инициализации

- Статические блоки инициализации выполняются при загрузке класса и могут использоваться для инициализации статических
  переменных.
- Пример:

```java
class MyClass {
    static {
        // Этот блок выполняется при загрузке класса
        System.out.println("Класс MyClass загружен.");
    }
}
```

### Модификатор `final` в Java

Модификатор `final` в Java может применяться к переменным, методам и классам. Он указывает на то, что элемент не может
быть изменен после его инициализации (присвоения значения переменной, определения метода или создания класса). Вот
как `final` применяется в различных контекстах:

#### 1. `final` для переменных:

- **Статические константы:** Переменные, объявленные как `final`, могут быть использованы для создания статических
  констант, которые остаются неизменными после их определения.

   ```
  public class MathConstants {
       static final double PI = 3.14159265359; // Статическая константа
   }
   ```

- **Локальные переменные:** Локальные переменные, объявленные как `final`, требуют, чтобы их значение было установлено
  только один раз и не могло быть изменено.

   ```
  public void process(int value) {
       final int limit = 10; // Локальная константа
       // ...
   }
   ```

### Статические переменные (поля):

1. **Общие данные для всех объектов класса:** Статические переменные используются, когда нужно хранить данные, которые
   должны быть общими для всех экземпляров класса. Например, счетчики объектов, общие настройки или константы.

   ```java
   class MyClass {
       static int count = 0; // Статическая переменная для подсчета экземпляров класса
   }
   ```

2. **Константы:** Статические переменные могут использоваться для хранения констант, которые не должны изменяться и
   могут использоваться без создания экземпляров класса.

   ```java
   class MathConstants {
       static final double PI = 3.14159265359; // Статическая константа
   }
   ```

### Статические методы:

1. **Утилитарные операции:** Статические методы часто используются для реализации утилитарных функций, которые не
   зависят от состояния объекта и могут быть вызваны без создания экземпляра класса.

   ```java
   class StringUtils {
       static boolean isEmpty(String str) {
           return str == null;
       }
   }
   ```

3. **Математические операции:** В классах, связанных с математикой или физикой, статические методы могут предоставлять
   математические операции без создания объектов.

   ```java
   class MathUtils {
       static double calculateDistance(Point p1, Point p2) {
           // Вычисление расстояния между точками
           // ...
       }
   }
   ```

**Пример:**

````java
public class MathUtils {

    static int add(int a, int b) { // объявление статического метода с модификатором досутпа default
        return a + b;
    }
}
````

````java
public class Application {

    public static void main(String[] args) {
        int result = MathUtils.add(1, 3); // Вызов статического метода
        System.out.println(result); // 4
    }
}
````

### Правила обращения к статическим методам и переменным в Java включают в себя следующие основные аспекты:

#### 1. Доступ к статическим переменным:

- Статические переменные доступны из любого места в коде, где виден класс, к которому они принадлежат.

```java
class MyClass {
    static int count = 0; // Статическая переменная
}
```

- Для доступа к статической переменной используется имя класса, за которым следует точка и имя переменной.

```
int myValue=MyClass.count; // Получение значения статической переменной
```

#### 2. Изменение статических переменных:

- Статическую переменную можно изменять так же, как и любую другую переменную, но изменения будут видны для всех
  экземпляров класса и из любого места, где виден класс.

```
MyClass.count=10; // Изменение значения статической переменной
```

#### 3. Доступ к статическим методам:

- Статические методы также доступны из любого места в коде, где виден класс и метод, к которому они принадлежат.

```java
public class MathUtils {
    static int add(int a, int b) {
        return a + b;
    }
}
```

- Для **вызова статического метода** используется имя класса, за которым следует точка и имя метода.

```
int result=MathUtils.add(5,3); // Вызов статического метода
```

#### 4. Ограничения статических элементов:

- Статические элементы **не имеют доступа к нестатическим** (обычным) элементам класса. То есть, они не могут
  использовать нестатические переменные или вызывать нестатические методы напрямую без создания объекта.

```java
class MyClass {
    int value; // Обычная переменная

    static void doSomething() {
        // Нельзя обратиться к value напрямую
        // value = 10; // Это вызовет ошибку компиляции
    }
}
```

### На заметку, важно!

- Важно помнить, что статические переменные и методы принадлежат классу, а не конкретным объектам, поэтому они доступны
  без создания экземпляров класса. Однако их использование должно быть оправданным и соответствовать требованиям
  конкретной задачи.

- Это означает, что изменения в статической переменной видны для всех экземпляров класса, и статические методы можно
  вызывать создания экземпляров класса. Они часто используются для реализации общих и универсальных функций, которые не
  требуют доступа к данным конкретных объектов.

- Статические элементы могут вызывать другие статические методы и обращаться к статическим переменным.

- Статические элементы **не имеют доступа к нестатическим** (обычным) элементам класса. То есть, они не могут
  использовать
  нестатические переменные или вызывать нестатические методы напрямую без создания объекта.

- Статические элементы доступны без создания экземпляра класса и могут быть вызваны из статического контекста, например,
  из другого статического метода или через имя класса.


- Обращение к статическим переменным и методам является удобным способом хранения общих данных и функций, которые не
  зависят от состояния объектов. Они часто используются для создания статических констант, утилитарных методов и
  фабричных методов.

#### 2. `final` для методов:

- **Запрет переопределения:** Методы, объявленные как `final`, не могут быть переопределены в подклассах. Это полезно,
  когда вы хотите зафиксировать реализацию метода в классе и предотвратить ее изменение.

   ```java
   class Parent {
       final void doSomething() {
           // Этот метод нельзя переопределить в подклассах
       }
   }
   ```

Использование модификатора `final` имеет несколько важных преимуществ:

- Гарантия неизменности: Позволяет гарантировать, что значение переменной, реализация метода или класс остаются
  неизменными.
- Оптимизация: Компилятор может выполнять оптимизации при работе с `final` элементами, так как он знает, что их значение
  не изменится.
- Защита от переопределения: Защищает методы от случайного или нежелательного переопределения.

Однако следует использовать модификатор `final` осторожно, так как он ограничивает изменение элементов, и это может
привести к жестким ограничениям в коде. Выбор использования `final` должен зависеть от требований вашей программы и
дизайна классов.

## Запуск Java-приложения из консоли

### Для одного класса:

1. Сохраните свой код в файл с расширением `.java`. Например, `MyApp.java`.

2. Откройте командную строку (консоль) и перейдите в каталог, где находится ваш файл `.java`.

3. Компилируйте класс с помощью команды `javac`, например:

```bash
javac MyApp.java
```

4. Запустите приложение с помощью команды `java`, указав имя класса с методом `public static void main(String[] args)`:

```bash
java MyApp
```

### Приложение с пакетами

Приложение состоит из двух пакетов: `javac` и `javac.model`, а также двух классов: `MyApp` и `Auto`.
Давайте рассмотрим, как его скомпилировать и запустить из командной строки.

Допустим, ваш проект имеет следующую структуру:

```
myproject/
    src/
        javac/
            MyApp.java
        javac/model/
            Auto.java
```

Вот как скомпилировать и запустить ваше приложение:

1. Откройте командную строку (консоль) и перейдите в корневую папку вашего проекта `myproject`.

2. Скомпилируйте ваше приложение с помощью команды `javac`, указав путь к корневой папке `src`:

```bash
javac -d . src/javac/*.java src/javac/model/*.java
```

3. После успешной компиляции, перейдите в папку `myproject`, где находятся скомпилированные файлы `.class`.

```bash
cd ..
```

4. Теперь вы можете запустить ваше приложение, указав полное имя класса `MyApp`:

```bash
java -cp . javac.MyApp
```

После выполнения этой команды, ваше приложение запустится, и вам будет предложено ввести марку и модель автомобиля.
Затем оно выведет "Bla bla bla!", так как метод `toString()` в классе `Auto` всегда возвращает эту строку.

Убедитесь, что вы выполняете эти команды из корневой папки вашего проекта, и у вас должно получиться успешно
скомпилировать и запустить ваше Java-приложение.

## Аргументы приложения

В методе `public static void main(String[] args)`, параметр `args` представляет собой массив строк, который содержит
аргументы, переданные при запуске приложения из командной строки. Пример:

```java
public class MyApp {
    public static void main(String[] args) {
        for (int i = 0; i < args.length; i++) {
            String arg = args[i];
            System.out.println("Аргумент: " + arg);
        }
    }
}
```

При запуске приложения с аргументами:

```bash
java MyApp arg1 arg2 arg3
```

Вы увидите:

```
Аргумент: arg1
Аргумент: arg2
Аргумент: arg3
```

Это позволяет передавать параметры в приложение из командной строки и использовать их в вашей программе.


</details>
