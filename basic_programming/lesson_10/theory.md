# Increment and Decrement in Java

## Definition

### Increment

Increment is an operation that increases the value of a variable by one. In Java, the `++` operator is used for this.

### Decrement

Decrement is an operation that decreases the value of a variable by one. In Java, the `--` operator is used for this.

## Prefix and Postfix Forms

### Prefix Increment (`++i`)

In this form, the value of the variable is first increased by 1, and then it is used in the expression.

#### Example:

```java
public class IncidentCounterexample {
    public static void main(String[] args) {
        int counter = 123;              // 123
        counter++;                      // 123 (+1 after this line, i.e., becomes 124)
        System.out.println(++counter);  // 125 (because ++counter, i.e., added 1 to the previous value (124))
    }
}
```

**Note:**

- In the case of ++i (prefix increment), the value of i is increased by 1 before the operation, and this new value is
  used in the expression.
- In the case of i++ (postfix increment), the current value of i is used in the expression, and only after that is i
  increased by 1.
- The same applies to decrement (--i and i--).

# Type Conversion in Java

## Overview

Each primitive data type occupies a certain amount of memory.

```
int x=4;
short y=x; // Error
```

### Explanation:

- The **short** and **int** types represent integers.
- The value of the variable **x**, which is assigned to a **short** type variable, fits well within the range of values
  for the **short** type (from -128 to 127).
- The error occurs because we are trying to assign some data that occupies 4 bytes (**int**) to a variable that only
  occupies 2 bytes (**short**).

### Solution: Type Casting

- Using the type casting operation (**()**).

```
int x=4;
short y=(short)x;       // Type casting: from int to short
System.out.println(y); // 4
```

- The type casting operation involves specifying the type to which the value should be converted in parentheses. For
  example, in the operation (short)x, the data of type **int** is converted to type **short**. As a result, we get a
  value of type **short**.
  **Note**
- Expanding conversions are automatically performed without any problems - they expand the object's representation in
  memory. For example:

```
byte b=7;
int d=b;  // Conversion from byte to int (from smaller to larger)
```

# Data Type Overflow in Java

## Overview

Data type overflow occurs when the value that should be stored in a variable exceeds the allowable range for that type.
In Java, as in most other programming languages, overflow usually does not cause an error at compile or runtime but can
lead to unexpected and incorrect results.

### Example of Overflow for `byte` Type

```
byte a=127; // maximum value for byte
a++;        // now a is -128, overflow occurred
```

In this example, the variable `a` has the maximum value for the `byte` type, which is 127. When attempting to increase
this value by 1 (`a++`), overflow occurs, and the value of `a` becomes -128.

### How to Avoid Overflow

1. **Use Larger Data Types**: If you know that a variable may store very large (or very small) values, use a data type
   with a larger range, such as `long` instead of `int`.
2. **Check Before Operation**: Before performing operations that may lead to overflow, you can check whether the result
   of the operation will exceed the allowable range.

# For Loop in Java

## Overview

Loops allow you to perform a specific action multiple times depending on certain conditions. Java has the following
types of loops:

* while
* do...while
* for
  The `for` loop has the following definition:

```
for([counter initialization];[condition];[counter change])
        {
        // actions
        }
```

```java
public class ForLoopExample {
    public static void main(String[] args) {
        for (int i = 1; i < 9; i++) {
            System.out.println("The square of " + i + " is " + (i * i));
        }
    }
}
```

### First Part `for (int i = 1; ...)`

- The first part of the loop declaration - **int i = 1** creates and initializes the counter **i**.
- The counter **does not necessarily** have to be of type int. It can also be any other numeric type, for example,
  float.
- Before the loop is executed, the counter value will be **1**. In this case, it is the same as declaring a variable.

### Second Part `(... i < 9; ...)`

- **condition**, under which the loop will be executed. In this case, the loop will be executed until **i** reaches **9
  **.

### Third Part `for (... i++)`

- **increment** the counter by **one**. Again, we do not necessarily have to increase by one. We can also decrease: *
  *i--**.
  In the end, the loop block will work **8** times until the value of **i** becomes **9**. And each time this value will
  increase by **1**.

## Variants of Use

**It is not necessary** to specify all conditions when declaring a loop. For example, we can write like this:

```
for(;;){
        // code
        }
```

- The loop definition remains the same, only now the blocks in the definition are empty: 'for (; ;)'. Now **there is no
  ** initialized counter variable, **no** condition, so the loop will work **forever** - **infinite loop**.

# Practice Exercises in Java

## Overview

Below are some practice exercises to help you understand Java concepts better.

### Exercise 1: Print Numbers from 0 to n

```
If n=5
        0
        1
        2
        3
        4
        5
```

### Exercise 2: Print Numbers from n to 0

```
If n=5
        5
        4
        3
        2
        1
        0
```

### Exercise 3: Display Multiplication Table for n

```
If n=3
        3*1=3
        3*2=6
        3*3=9
        3*4=12
        3*5=15
        3*6=18
        3*7=21
        3*8=24
        3*9=27
        3*10=30
```

### Exercise 4: Sum of Numbers from 1 to n

```
For example:
        if the user enters the number 3.The program should calculate the sum of numbers from 1to 3,i.e.,1+2+3and give the answer 6.
        if the user enters the number 5.The program should calculate the sum of numbers from 1to 5,i.e.,1+2+3+4+5and give the answer 15.
```

### Exercise 5: Print a Specific Sequence

```
The program should display the following sequence:
        7 14 21 28 35 42 49 56 63 70 77 84 91 98
```

### Exercise 6: Multiplication of Two User-Entered Numbers

```
In the loop,the program asks the user to enter two numbers and displays the result of their multiplication.
        After displaying the multiplication result,the program asks whether to terminate the execution.If the user enters the number 777,the program terminates.If any other number is entered,the program continues to ask the user for two numbers and multiplies them.
```

---

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

# Преобразования базовых типов данных

- Каждый базовый тип данных занимает определенное количество байт памяти

````
int x = 4;
short y = x; // ! Ошибка
````

### Разбор:

- тип **short**, и тип **int** представляют целые числа.
- значение переменной **x**, которое присваивается переменной типа **short**, вполне укладывается в диапазон значений
  для
  типа **short** (от -128 до 127)
- Ошибка возникает поскольку в данном случае мы пытаемся присвоить некоторые данные, которые занимают 4 байта (**int**),
  переменной, которая занимает всего 2 байт (**short**)

### Решение: Преобразование

- использование операции преобразования типов (операция **()**)

````
int x = 4;
short y = (short)x;  // преобразование типов: от типа int к типу short
System.out.println(y); // 4
````

- Операция преобразования типов предполагает указание в скобках того типа, к которому надо преобразовать значение.
  Например, в случае операции (short)x, идет преобразование данных типа **int** в тип **short**. В итоге мы получим
  значение типа
  **short**.

**Заметка**

- Автоматически без каких-либо проблем производятся **расширяющие преобразования** - они расширяют представление объекта
  в памяти. Например:

````
byte b = 7;
int d = b;  // преобразование от byte к int (от меньшего к большему)
````

# Переполнение типов данных

Переполнение типа данных происходит, когда значение, которое должно быть сохранено в переменной, выходит за пределы
допустимого диапазона для этого типа. В Java, как и в большинстве других языков программирования, переполнение обычно не
вызывает ошибку на этапе компиляции или выполнения, но может привести к неожиданным и некорректным результатам.

### Пример переполнения для типа `byte`

```
byte a = 127; // максимальное значение для byte
a++;          // теперь a равно -128, произошло переполнение
```

В этом примере переменная `a` имеет максимальное значение для типа `byte`, которое равно 127. При попытке увеличить это
значение на 1 (`a++`), происходит переполнение, и значение `a` становится -128.

### Как избежать переполнения

1. **Использование больших типов данных**: Если вы знаете, что переменная может хранить очень большие (или очень
   маленькие) значения, используйте тип данных с большим диапазоном, например, `long` вместо `int`.

2. **Проверка перед операцией**: Перед выполнением операций, которые могут привести к переполнению, можно проверить, не
   приведет ли результат операции к выходу за границы допустимого диапазона.

# Цикл for

Циклы позволяют в зависимости от определенных условий выполнять определенное действие множество раз. В языке Java есть
следующие виды циклов:

* while
* do...while
* for

Цикл for имеет следующее определение:

```
for ([инициализация счетчика]; [условие]; [изменение счетчика])
{
    // действия
}
```

````java
public class ForLoopExample {
    public static void main(String[] args) {
        for (int i = 1; i < 9; i++) {
            System.out.println("Квадрат числа " + i + " равен " + (i * i));
        }
    }
}
````

### Первая часть `for (int i = 1; ...)`

- Первая часть объявления цикла - **int i = 1** создает и инициализирует счетчик **i**.
- Счетчик **необязательно** должен представлять тип int. Это может быть и любой другой числовой тип, например, float.
- Перед выполнением цикла значение счетчика будет **равно 1**. В данном случае это то же самое, что и объявление
  переменной.

### Вторая часть `(... i < 9; ...)`

- **условие**, при котором будет выполняться цикл. В данном случае цикл будет выполняться, пока **i** не достигнет **9
  **.

### Третья часть for (... i++)

- **приращение** счетчика на **единицу**. Опять же нам необязательно увеличивать на единицу. Можно уменьшать: **i--**.

В итоге блок цикла сработает **8** раз, пока значение **i** не станет равным **9**. И каждый раз это значение будет
увеличиваться на **1**.

## Варианты использования

**Необязательно** указывать все условия при объявлении цикла. Например, мы можем написать так:

```
for (; ;){
    // code
}
```

- Определение цикла осталось тем же, только теперь блоки в определении у нас пустые: 'for (; ;)'. Теперь **нет**
  инициализированной переменной-счетчика, **нет** условия, поэтому цикл будет работать **вечно** - **бесконечный цикл**.

```
int i = 1;
for (; i<9;){
    // code
    i++;
}
```

- у нас есть счетчик (**i**), только создан он **вне** цикла. У нас есть условие выполнения цикла (**i<9**). И есть
  приращение счетчика уже в самом блоке for (**i++**).

Код ниже так же будет работать

````
int customCounter = 10; // может быть любой числовой тип, к примеру short или long
for (int i = customCounter; i < 19; i++) {
    // code
}
````

#### Цикл for может определять сразу несколько переменных и управлять ими:

````
for(int i = 0, j = n - 1; i < j; i++, j--){  
    System.out.println(i * j);
}
````

# Задачи на закрепление

- вывести числа от 0 до n

````
  Если n = 5
    0
    1
    2
    3
    4
    5
````

___

- вывести числа от n до 0

````
  Если n = 5
    5
    4
    3
    2
    1
    0
````

___

- вывести на экран таблицу умножения на n:

````
  Если n = 3
    3*1=3
    3*2=6
    3*3=9
    3*4=12
    3*5=15
    3*6=18
    3*7=21
    3*8=24
    3*9=27
    3*10=30
````

___

- Напишите программу, где пользователь вводит любое целое положительное число. А программа суммирует все числа от 1 до
  введенного пользователем числа.

````
Например:
если пользователь введет число 3. Программа должна посчитать сумму чисел от 1 до 3, то есть 1+2+3 и выдать ответ 6.
если пользователь введет число 5. Программа должна посчитать сумму чисел от 1 до 5, то есть 1+2+3+4+5 и выдать ответ 15.
````

___

- Необходимо, чтоб программа выводила на экран вот такую последовательность:

````
7 14 21 28 35 42 49 56 63 70 77 84 91 98
````

___

- Пользователь указывает начальное и конечное число диапазона. Каждое **третье** число в этом диапазоне должно быть
  пропущено и не участвовать в расчетах.

**Правила:**

- Если число четное, добавьте его к итоговому результату.
- Если число нечетное, вычтите его из итогового результата.
- Пропустите каждое третье число в диапазоне.

___

- В цикле программа просит у пользователя ввести два числа и выводит результат их умножения.
  После вывода результата умножения программа спрашивает, надо ли завершить выполнение. И если пользователь введет число
  777, то программа завершаетcя. Если введено любое другое число, то программа продолжает спрашивать у пользователя два
  числа и умножать их.

___

- Выведите на экран первые 11 членов
  последовательности [Фибоначчи](https://ru.wikipedia.org/wiki/%D0%A7%D0%B8%D1%81%D0%BB%D0%B0_%D0%A4%D0%B8%D0%B1%D0%BE%D0%BD%D0%B0%D1%87%D1%87%D0%B8).
  **помните, что:** первый и второй члены последовательности равны единицам, а каждый следующий — сумме двух предыдущих
