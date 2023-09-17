# Increment and Decrement in Java

## Definition

### Increment

Increment is an operation that increases the value of a variable by one. In Java, the `++` operator is used for this
purpose.

### Decrement

Decrement is an operation that decreases the value of a variable by one. In Java, the `--` operator is used for this
purpose.

## Prefix and Postfix Forms

### Prefix Increment (`++i`)

In this form, the value of the variable is first increased by 1, and then it is used in the expression.

#### Example:

```java
public class IncidentCounterexample {
    public static void main(String[] args) {
        int counter = 123;              // 123
        counter++;                      // 123 (+1 after this line, i.e., becomes 124)
        System.out.println(++counter);  // 125 (because ++counter, i.e., 1 was added to the previous value (124))
    }
}
```

**Again:**

- In the case of ++i (prefix increment), the value of i is increased by 1 before the operation, and this new value is
  used in the expression.
- In the case of i++ (postfix increment), the current value of i is used in the expression, and only after that is i
  increased by 1.
- The same applies to decrement (--i and i--).

# Loops: `while` / `do ... while`

**Loops** allow you to execute some code several times in a row.
Each such repetition is called an **iteration**.

### `while` Loop - Loop with **_Precondition_**

The `while` loop runs as long as the given condition is true (has the value **true**):

```
// loop with precondition
while (expression) { // expression - predicate
...
// Loop body
...
}
```

```java
public class WhileLoop {
    public static void main(String[] args) {
        int j = 6;
        while (j > 0) {
            System.out.println(j);
            j--;
        }
    }
}
```

**Predicate** — the condition specified in parentheses after the while keyword and evaluated on each iteration.
**Loop body** — a block of code in curly braces, similar to a code block in a method. All constants or variables defined
inside this block will only be visible inside this block.

### Practice:

- Print 10 lines: “Task1”. “Task2”. … “Task10”. _Use the `while` loop_
- Print all numbers from 1 to 100 that are divisible by 5 without a remainder. _Use the `do-while` loop_
- Print only 7 numbers from 1 to 100 that are divisible by 5 without a remainder. _Use the `while` loop_
- Even numbers: Write a program that prints all even numbers from **A** to **B**. _Use the `do-while` loop_
- Countdown: Write a program that starts a countdown from **A** to 0 with a pause of 1 second between numbers. (Hint:
  use Thread.sleep(1000); for the pause). _Use the `while` loop_
- Multiplication Table: Write a program that prints the multiplication table for the number 5 (from 1 to 10). _Use
  the `do-while` loop_

```java
// Print 10 lines: “Task1”. “Task2”. … “Task10”. Use the `while` loop
public class Main {
    public static void main(String[] args) {
        int i = 1;
        while (i <= 10) {
            System.out.println("Task" + i);
            i++;
        }
    }
}
```

```java
// Print all numbers from 1 to 100 that are divisible by 5 without a remainder. Use the `do-while` loop
public class Main {
    public static void main(String[] args) {
        int i = 1;
        do {
            if (i % 5 == 0) {
                System.out.println(i);
            }
            i++;
        } while (i <= 100);
    }
}
```

```java
// Print only 7 numbers from 1 to 100 that are divisible by 5 without a remainder. Use the `while` loop
public class Main {
    public static void main(String[] args) {
        int i = 1;
        int count = 0;
        while (count < 7) {
            if (i % 5 == 0) {
                System.out.println(i);
                count++;
            }
            i++;
        }
    }
}
```

### `do-while` Loop - Loop with **_Postcondition_**

- The `do` loop first executes the loop code, and then checks the condition in the `while` statement. And as long as
  this condition is true, the loop repeats.

``` 
// loop with postcondition
  do {
  ...
  // Loop body
  ...
  } while (expression) //expression - predicate
```

```java
public class DoLoop {
    public static void main(String[] args) {
        int j = 6;
        do {
            System.out.println(j);
            j--;
        } while (j > 0);
    }
}
```

**It is important to note that the `do` loop guarantees at least one execution of the actions, even if the condition in
the `while` statement is not true.**

# Инкремент и декремент в Java

## Определение

### Инкремент

Инкремент — это операция, которая увеличивает значение переменной на единицу. В Java для этого используется
оператор `++`.

### Декремент

Декремент — это операция, которая уменьшает значение переменной на единицу. В Java для этого используется оператор `--`.

## Префиксная и постфиксная формы

### Префиксный инкремент (`++i`)

В этой форме сначала увеличивается значение переменной на 1, а затем оно используется в выражении.

#### Пример:

```java
public class IncidentCounterexample {

    public static void main(String[] args) {
        int counter = 123;              // 123
        counter++;                      // 123 (+1 после этой сроки, т.е. станет 124)
        System.out.println(++counter);  // 125 (т.к. ++counter, т.е. к прошлому значению (124) сначала прибавили 1)
    }

    public static void prefixIncrement() {
        int i = 5;
        int j = ++i; // i = 6, j = 6
        System.out.println(j); // 6
        System.out.println(i); // 6
    }

    public static void postfixIncrement() {
        int i = 5;
        int j = i++; // i = 5 (+1), j = 5
        System.out.println(j); // 5
        System.out.println(i); // 6
    }

    public static void prefixDecrement() {
        int i = 5;
        int j = --i; // i = 4, j = 4
        System.out.println(j); // 4
        System.out.println(i); // 4
    }

    public static void postfixDecrement() {
        int i = 5;
        int j = i--; // i = 5 (-1), j = 5
        System.out.println(j); // 5
        System.out.println(i); // 4
    }
}
```

**еще раз:**

- В случае с ++i (префиксный инкремент), значение i увеличивается на 1 до выполнения операции, и это новое значение
  используется в выражении.
- В случае с i++ (постфиксный инкремент), текущее значение i используется в выражении, и только после этого i
  увеличивается на 1.
- То же самое относится и к декременту (--i и i--).

# Циклы: "while" / "do ... while"

**Циклы** позволяют выполнить некий код несколько раз подряд
Каждый такой повтор называется **итерацией**

### Цикл **while** - цикл с **_предусловием_**

Цикл **while** выполняется до тех пор, пока заданное условие является верным (имеет значение **true**):

```
// цикл с предусловием
while (expression) { // expression - предикат
...
// Тело цикла
...
}

```

```java
public class WhileLoop {
    public static void main(String[] args) {
        int j = 6;
        while (j > 0) {
            System.out.println(j);
            j--;
        }
    }
}
```

**Предикат** — условие, которое указывается в скобках после ключевого слова while и вычисляется на каждой итерации

**Тело цикла** — блок кода в фигурных скобках, аналогичный блоку кода в методе. Все константы или переменные,
определенные внутри этого блока, будут видны только внутри этого блока

### цикл **do-while** - цикл с **_постусловием_**

- Цикл do сначала выполняет код цикла, а потом проверяет условие в инструкции while. И пока это условие истинно, цикл
  повторяется.

```
// цикл с постусловием
do {
    ...
    // Тело цикла
    ...
} while (expression) //expression - предикат
```

```java
public class DoLoop {
    public static void main(String[] args) {
        int j = 6;
        do {
            System.out.println(j);
            j--;
        } while (j > 0);
    }
}
```

**Важно отметить, что цикл do гарантирует хотя бы однократное выполнение действий, даже если условие в инструкции while
не
будет истинно.**

### Практика:

- Распечатать 10 строк: “Task1”. “Task2”. … “Task10”. _Используем цикл while_
- Распечатать все числа от 1 до 100, которые делятся на 5 без остатка. _Используем цикл do-while_
- Распечатать только 7 чисел от 1 до 100, которые делятся на 5 без остатка. _Используем цикл while_
- Четные числа: Напишите программу, которая выводит все четные числа от **A** до **B**. _Используем цикл do-while_
- Обратный отсчет: Напишите программу, которая начинает обратный отсчет от **A** до 0 с паузой в 1 секунду между
  числами. (Подсказка: используйте Thread.sleep(1000); для паузы). _Используем цикл while_
- Таблица умножения: Напишите программу, которая выводит таблицу умножения для числа 5 (от 1 до 10). _Используем цикл
  do-while_

````java
// Распечатать 10 строк: “Task1”. “Task2”. … “Task10”. Используем цикл while
public class Main {
    public static void main(String[] args) {
        int i = 1;
        while (i <= 10) {
            System.out.println("Task" + i);
            i++;
        }
    }
}

````

````java
// Распечатать все числа от 1 до 100, которые делятся на 5 без остатка. Используем цикл do-while
public class Main {
    public static void main(String[] args) {
        int i = 1;
        do {
            if (i % 5 == 0) {
                System.out.println(i);
            }
            i++;
        } while (i <= 100);
    }
}
````

````java
// Распечатать только 7 чисел от 1 до 100, которые делятся на 5 без остатка. Используем цикл while
public class Main {
    public static void main(String[] args) {
        int i = 1;
        int count = 0;
        while (count < 7) {
            if (i % 5 == 0) {
                System.out.println(i);
                count++;
            }
            i++;
        }
    }
}
````
 
