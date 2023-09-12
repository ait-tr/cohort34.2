# Java Lesson Plan

## Topics Covered

1. Constants and Variable Scope
2. if-else if Statements
3. switch-case Statements
4. Scanner for User Input
5. Practice

---

## Theoretical Part

### Constants and Variable Scope

#### Theory

Constants are variables whose values cannot be changed after initialization. In Java, the `final` keyword is used to
create constants.

```java
public class ConstantExample {
    static final int MY_CONSTANT = 10;  // Class-level constant

    public static void main(String[] args) {
    }
}
```

The scope of a variable defines where that variable is accessible in the code.

#### Example

```java
public class ScopeExample {
   static final int MY_CONSTANT = 10;  // Class-level constant

   public static void myMethod() {
      int x = 5;  // Method-level variable
   }
}
```

### if-else if Statements

#### Theory

The `if-else if` statement is used to execute one block of code among multiple blocks.

```java
public class IfElseIfExample {
    public static void main(String[] args) {
        int x = 7;
        if (x > 10) {
            System.out.println("x is greater than 10");
        } else if (x > 5) {
            System.out.println("x is greater than 5 but not greater than 10");
        } else {
            System.out.println("x is 5 or less");
        }
    }
}
```

### switch-case Statements

#### Theory

The `switch-case` statement is used to execute one block of code among many blocks.

```java
public class SwitchCaseExample {
    public static void main(String[] args) {
        int day = 2;
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            default:
                System.out.println("Invalid day");
        }
    }
}
```

### Scanner for User Input

#### Theory

The `Scanner` class is used to get user input.

```java
import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number:");
        int x = scanner.nextInt();
        System.out.println("You entered: " + x);
    }
}
```

# Java Урок

## Содержание

1. [Константы и область видимости](#константы-и-область-видимости)
2. [if-else if](#if-else-if)
3. [switch-case](#switch-case)
4. [Scanner](#scanner)
5. [Практика](#практика)

---

## Константы и область видимости

### Теория

Константы — это переменные, значения которых не могут быть изменены после инициализации. В Java для создания констант
используется ключевое слово `final`.

```java
public class ConstantExample {
   static final int MY_CONSTANT = 10; // костанта на уровне класса

   public static void main(String[] args) {
   }
}
```

Область видимости переменной определяет, где эта переменная доступна в коде.

### Пример

```java
public class MyClass {
   static final int MY_CONSTANT = 10;  // Константа на уровне класса

   public static void myMethod() {
      int x = 5;  // Переменная на уровне метода
   }
}
```

---

## if-else if

### Теория

if-else if используется для выполнения одного из нескольких блоков кода, в зависимости от условия.

````java
public class IfElseIfExample {
    public static void main(String[] args) {
        if (условие1) {
            // блок кода 1
        } else if (условие2) {
            // блок кода 2
        } else {
            // блок кода 3
        }
    }
}
````

```java
public class IfElseIfExample {
    public static void main(String[] args) {
        int x = 7;
        if (x > 10) {
            System.out.println("x is greater than 10");
        } else if (x > 5) {
            System.out.println("x is greater than 5 but not greater than 10");
        } else {
            System.out.println("x is 5 or less");
        }
    }
}
```

### Задача для объяснения

Напишите программу, которая принимает оценку студента и выводит соответствующую ей буквенную оценку.
- "A" для баллов от 90 до 100.
- "B" для баллов от 80 до 89.
- "C" для баллов от 70 до 79.
- "F" для баллов ниже 70.

<!--
````java
import java.util.Scanner;

public class GradeConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите оценку: ");
        int grade = scanner.nextInt();

        if (grade >= 90) {
            System.out.println("A");
        } else if (grade >= 80) {
            System.out.println("B");
        } else if (grade >= 70) {
            System.out.println("C");
        } else {
            System.out.println("F");
        }
    }
}

````
-->

### Задачи для закрепления

**Дни недели с вводом**: Напишите программу, которая принимает номер дня недели с консоли и выводит, является ли этот
день выходным или рабочим.

---

## switch-case

### Теория

switch-case используется для выполнения одного из нескольких блоков кода, в зависимости от значения переменной.

### Задача для объяснения

````java
public class SwitchCaseExample {
    public static void main(String[] args) {
        switch (переменная) {
            case значение1:
                // блок кода 1
                break;
            case значение2:
                // блок кода 2
                break;
            default:
                // блок кода 3
        }
    }
}
````

```java
public class SwitchCaseExample {
    public static void main(String[] args) {
        int day = 2;
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            default:
                System.out.println("Invalid day");
        }
    }
}
```

- Напишите программу, которая принимает номер месяца и выводит количество дней в этом месяце.

<!--
````java
import java.util.Scanner;

public class MonthDays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите номер месяца: ");
        int month = scanner.nextInt();

        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("В этом месяце 31 день.");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("В этом месяце 30 дней.");
                break;
            case 2:
                System.out.println("В этом месяце 28 или 29 дней.");
                break;
            default:
                System.out.println("Недопустимый номер месяца.");
        }
    }
}

````
-->
---

## Scanner

### Теория

Класс Scanner в Java используется для получения ввода пользователя.

```java
import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number:");
        int x = scanner.nextInt();
        System.out.println("You entered: " + x);
    }
}
```
---

## Практика

### Задачи на `if-else if`

1. **Калькулятор возраста с вводом**: Напишите программу, которая принимает возраст с консоли и выводит соответствующую
   категорию (ребенок, подросток, взрослый).
2. **Определение сезона с вводом**: Напишите программу, которая принимает месяц с консоли и выводит соответствующий
   сезон.

### Задачи на `switch-case`

1. **Калькулятор с вводом**: Напишите программу, которая принимает два числа и операцию с консоли, а затем выполняет эту
   операцию.
2. **Оценка дня с вводом**: Напишите программу, которая принимает день недели с консоли и выводит ваше настроение в этот
   день.

---
