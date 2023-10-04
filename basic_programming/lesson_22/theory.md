<details style="margin-top: 16px">
  <summary style="cursor: pointer; color: blue;"><b>English</b></summary>

## The `static` Modifier

The `static` modifier in Java is applied to variables, methods, and inner classes to make them associated with the class rather than specific instances of the class. Here's how it works:

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

4. Run the application using the `java` command, specifying the class name with the `public static void main(String[] args)` method:

```bash
java MyApp
```

### Application with Packages

Suppose your application consists of two packages: `javac` and `javac.model`, and two classes: `MyApp` and `Auto`. Let's see how to compile and run it from the command line.

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

After running this command, your application will start, and you will be prompted to enter the make and model of a car. It will then output "Bla bla bla!" as the `toString()` method in the `Auto` class always returns this string.

Make sure you execute these commands from the root folder of your project, and you should be able to compile and run your Java application successfully.

## Command Line Arguments

In the `public static void main(String[] args)` method, the `args` parameter is an array of strings that contains the arguments passed when launching the application from the command line. For example:

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

После выполнения этой команды, ваше приложение запустится, и вам будет предложено ввести марку и модель автомобиля. Затем оно выведет "Bla bla bla!", так как метод `toString()` в классе `Auto` всегда возвращает эту строку.

Убедитесь, что вы выполняете эти команды из корневой папки вашего проекта, и у вас должно получиться успешно скомпилировать и запустить ваше Java-приложение.

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
