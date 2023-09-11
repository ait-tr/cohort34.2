# Conditional operator

## if() statement

The most versatile way to organize the execution of some part of the code
depending on the condition, is to use the conditional operator
if(condition)
This statement has the **full form**, or **abbreviated** (without else).

**Full form:**
`if (condition){
command_1;
team_2;
...
} else {
command_1;
team_2;
...
}`

**Short form** (without else):
`if (condition) {
command_1;
team_2;
...
}`

Block diagrams - see figure.

## Condition

The condition in the parentheses of the if() statement is most often a comparison operation:

* symbol > greater than, x > y - Boolean expression
* symbol < less than , x < y
* this == equals, x == y
* this >= greater than or equal to
* this <= less than or equal to
* this != NOT equal (<> is in other languages)

- these are all logical expressions.
  The logical expression takes the value:
- LIE (false) and TRUTH (true)

## Logical operators:

Logical operations connect (combine) various conditions with each other:

* Logical negation, also known as NOT or inversion.
  Indicated by the symbol “!” before the operand. Applies to one operand.
* Logical AND, also known as AND or conjunction. Identified by the symbol “&” between two operands,
  to which it applies. Example: x > 0 & x <10
* Logical OR in Java, also known as OR, also known as disjunction. Denoted by the symbol “|” between
  two operands.
  Example: x < 0 | x >10 in this expression we get false when x = 2, 3, ... 9
* Exclusive or, XOR, strict disjunction.
  Denoted by a “^” symbol between two operands.
* Conditional OR, denoted by ||, tests the first operand (condition).
* Conditional AND, denoted &&, tests the first operand (condition).
  Conditional OR, conditional AND are useful when the right condition depends on the left one.

The result of comparisons and logical operators is always of type **boolean**,
that is, it can be either TRUE or FALSE.
There is no third!

# Ternary operator

"Ternary" means "triple". This is an alternative to the `if`-`else` conditional statement.

Earlier:

```java
String securityAnswer;
        if(age>=18){
        securityAnswer="It's okay, come in!";
        }else{
        securityAnswer="This movie is not suitable for your age!";
        }
```

Now:

```java
String securityAnswer=(age>=18)?"It's all right, come in!":"This film is not suitable for your age!";
```

Example of design on several lines:

```java
String securityAnswer=(age>=18)?
        "It's all right, come in!":
        "This film is not suitable for your age!";
```

A general recommendation might sound like this: if the condition is simple and easy to check, you can use the ternary
operator without harm. This way you will reduce the amount of code and the number of `if`-`else` checks, of which there
may already be a lot.

But if the condition is complex and multi-stage, it is better to use `if`-`else`.

For example, in this case it would be a bad idea to use the ternary operator:

```java
String securityAnswer=(age>=18&&(hasTicket||hasCoupon)&&!hasChild)?"Come in!":"You can not pass!";
```

# Java Conditional and Logical Operators

## Table for Comparison Operators

Here is a table explaining comparison operators using two variables a = 10 and b = 20 :

| Comparison Operator | Example | Result |
|---------------------|---------|--------|
| `==`                | a == b  | false  |
| `>`                 | a > b   | false  |
| `<`                 | a < b   | true   |
| `>=`                | a >= b  | false  |
| `<=`                | a <= b  | true   |
| `!=`                | a != b  | true   |

## Table for Logical Operators

Here is a table for explaining logical operators "AND", "OR", and "XOR" using four variables a = 10 , b =
20 , c = 30 , d = 40 :

| Logical Operator | Example            | Result |
|------------------|--------------------|--------|
| `&`  (AND)       | (a < b) & (c > d)  | false  |
| `\|`  (OR)       | (a < b) \| (c > d) | true   |
| `^`  (XOR)       | (a < b) ^ (c > d)  | true   |

### Explanations:

1. (a < b) & (c > d)  — Both conditions must be true for the result to be true. a < b is true, but c >
   d is false, so the result is false.

2. (a < b) \| (c > d)  — At least one of the conditions must be true for the result to be true. a < b is
   true, so the result is true.

3. (a < b) ^ (c > d)  — The result will be true if only one of the conditions is true. a < b is true, c >
   d is false, so the result is true.

# Tasks for Reinforcement:

1. Write a program that checks the user's age and displays a message indicating whether they can buy alcohol.
   Use the if-else conditional operator. (void ageVerification(int age))

2. Write a program that takes the temperature and suggests appropriate clothing for the weather. Use if-else and
   the ternary operator. (void weatherClothing(int temperature))

3. Write a program that checks the user's age and ticket possession. If the user has a ticket and is 18 or older, allow
   them to watch the movie. Use logical operators. (void movieTicketCheck(int age, boolean hasTicket))

4. Write a program that calculates discounts on items in the shopping cart. If the user has a coupon, add an additional
   5% discount. Use if-else and logical operators. (void shoppingCartDiscount(double cartTotal, boolean hasCoupon))

5. Write a program that checks if you can go to a party. Conditions: you must be over 18 and either have an invitation
   or go with a friend who is already 21. Use logical operators. (void partyAccess(int age, boolean hasInvitation,
   boolean withFriend))

___

# Условный оператор

## Оператор if()

Самым универсальный способ организовать выполнение какой-то части кода в зависимости от условия,
является использования условного оператора:
if(условие) {...}
Этот оператор имеет **полную форму**, или **сокращенную** (без else).

**Полная форма:**
`if (условие){
команда_1;
команда_2;
...
} else {
команда_1;
команда_2;
...
}`

**Сокращенная форма** (без else):
`if (условие) {
команда_1;
команда_2;
...
}`

Блок-схемы - см. рисунок.

## Условие

Условие в скобках оператора if () - это чаще всего операции сравнения:

* символ > больше , x > y - логическое выражение
* символ < меньше , x < y
* это == равно, x == y
* это >= больше или равно
* это <= меньше или равно
* это != НЕ равно (<> - это в других языках)

- всё это логические выражения.
  Логическое выражение принимает значение:
- ЛОЖЬ (false) или ПРАВДА (true)

## Логические операторы:

Логические операции соединяют(комбинируют) между собой различные условия:

* Логическое отрицание, оно же NOT или инверсия.
  Обозначается символом “!” перед операндом. Применяется к одному операнду.
* Логическое И, оно же AND или конъюнкция. Обозначается символом “&” между двумя операндами,
  к которым применяется. Пример: x > 0 & x <10
* Логическое ИЛИ в Java, оно же — OR, оно же — дизъюнкция. Обозначается символом “|” между
  двумя операндами.
  Пример: x < 0 | x >10 в этом выражении получаем ложь, когда x = 2, 3, ... 9
* Исключающее или, XOR, строгая дизъюнкция.
  Обозначается символом “^” между двумя операндами.
* Условное ИЛИ, обозначаемое как ||, проверяет первый операнд (условие).
* Условное И, обозначаемое как &&, проверяет первый операнд (условие).
  Условное ИЛИ, условное И полезно тогда, когда правое условие зависит от левого.

Результат сравнения и логических операторов всегда имеет тип **boolean**,
то есть может быть либо ИСТИНА (true), либо ЛОЖЬ (false).
Третьего НЕ ДАНО!

# Тернарный оператор

"Тернарный" в переводе означает "тройной". Это альтернатива условному оператору `if`-`else`.

Раньше:

```java
String securityAnswer;
        if(age>=18){
        securityAnswer="Все в порядке, проходите!";
        }else{
        securityAnswer="Этот фильм не подходит для вашего возраста!";
        }
```

Теперь:

```java
String securityAnswer=(age>=18)?"Все в порядке, проходите!":"Этот фильм не подходит для вашего возраста!";
```

Пример оформления на нескольких строках:

```java
String securityAnswer=(age>=18)?
        "Все в порядке, проходите!":
        "Этот фильм не подходит для вашего возраста!";
```

Общая рекомендация может звучать так: если условие простое и легко проверяется, можно без ущерба использовать тернарный
оператор. Таким образом ты сократишь объем кода и количество проверок `if`-`else`, которых там и без того может быть
немало.

А вот если условие является сложным и многоступенчатым — лучше использовать `if`-`else`.

Например, в этом случае использовать тернарный оператор будет плохой идеей:

```java
String securityAnswer=(age>=18&&(hasTicket||hasCoupon)&&!hasChild)?"Проходите!":"Вы не можете пройти!";
```

# Дополнительный материал:

# Java Условные и Логические Операторы

## Таблица Операторов Сравнения

Вот таблица, объясняющая операторы сравнения с использованием двух переменных a = 10 и b=20:

| Comparison Operator | Example | Result |                                       |
|---------------------|---------|--------|---------------------------------------|
| `==`                | a == b  | false  | Переменные a и b не равны между собой |
| `>`                 | a > b   | false  | a меньше b                            |
| `<`                 | a < b   | true   | a меньше b                            |
| `>=`                | a >= b  | false  | a меньше b                            |
| `<=`                | a <= b  | true   | a меньше или равно b                  |
| `!=`                | a != b  | true   | a не равно b                          |

## Таблица Логических Операторов

Вот таблица для объяснения логических операторов "И", "ИЛИ" и "ИСКЛЮЧАЮЩЕЕ ИЛИ" с использованием четырёх переменных
a=10,b=20, c=30, d=40:

| Logical Operator | Example              | Result |                                                 |
|------------------|----------------------|--------|-------------------------------------------------|
| `&`  (AND)       | (a < b) `&` (c > d)  | false  | Оба условия должны быть истинными, но c>d ложно |
| `\|`  (OR)       | (a < b) `\|` (c > d) | true   | Хотя бы одно из условий должно быть истинным    |
| `^`  (XOR)       | (a < b) `^` (c > d)  | true   | Только одно из условий должно быть истинным     |

### Explanations:

1. (a < b) & (c > d)  — Both conditions must be true for the result to be true. a < b is true, but c >
   d is false, so the result is false.

2. (a < b) \| (c > d)  — At least one of the conditions must be true for the result to be true. a < b is
   true, so the result is true.

3. (a < b) ^ (c > d)  — The result will be true if only one of the conditions is true. a < b is true, c >
   d is false, so the result is true.

# Задачи для закрепления:

1. Напишите программу, которая проверяет возраст пользователя и выводит сообщение, может ли он купить алкоголь.
   Используйте условный оператор if-else. (`void ageVerification(int age)`)

2. Напишите программу, которая принимает температуру и выводит подходящую одежду для погоды. Используйте if-else и
   тернарный оператор. (`void weatherClothing(int temperature)`)

3. Напишите программу, которая проверяла бы возраст, наличие билета у пользователя. Если у
   пользователя есть билет, и пользователю 18 или больше лет, то пускайте его на фильм. Используйте логические
   операторы. (`void movieTicketCheck(int age, boolean hasTicket)`)

4. Напишите программу, которая рассчитывает скидку на товары в корзине. Если у пользователя есть купон, добавьте
   дополнительную скидку 5%. Используйте if-else и логические
   операторы. (`void shoppingCartDiscount(double cartTotal, boolean hasCoupon)`)

5. *Напишите программу, которая проверяет, можно ли вам пойти на вечеринку. Условия: вы должны быть старше 18 лет и у
   вас
   должно быть либо приглашение, либо вы идете с другом, который уже 21 год. Используйте логические
   операторы. (`void  partyAccess(int age, boolean hasInvitation, boolean withFriend)`)

<!--
````java

public class TaskSolutions {

    // Задача 1: Проверка возраста для покупки алкоголя
    public static void ageVerification(int age) {
        if (age >= 18) {
            System.out.println("You can buy alcohol.");
        } else {
            System.out.println("You cannot buy alcohol.");
        }
    }

    // Задача 2: Подбор одежды в зависимости от температуры
    public static void weatherClothing(int temperature) {
        String clothing = (temperature > 25) ? "Wear light clothes" : "Wear warm clothes";
        System.out.println(clothing);
    }

    // Задача 3: Проверка возраста и наличия билета для просмотра фильма
    public static void movieTicketCheck(int age, boolean hasTicket) {
        if (age >= 18 || hasTicket) {
            System.out.println("You can watch the movie.");
        } else {
            System.out.println("You cannot watch the movie.");
        }
    }

    // Задача 4: Проверка возможности посещения вечеринки
    public static void partyEligibility(int age, boolean hasInvitation, boolean withFriend) {
        if (age > 18 && (hasInvitation || withFriend)) {
            System.out.println("You can go to the party.");
        } else {
            System.out.println("You cannot go to the party.");
        }
    }

    // Задача 5: Расчет скидки на товары в корзине
    public static void shoppingCartDiscount(double cartTotal, boolean hasCoupon) {
        if (hasCoupon) {
            cartTotal *= 0.95;
        }
        System.out.println("Your total after discount is: " + cartTotal);
    }

    public static void main(String[] args) {
        // Вызов методов для демонстрации
        ageVerification(25);
        weatherClothing(30);
        movieTicketCheck(16, true);
        partyEligibility(19, false, true);
        shoppingCartDiscount(100.0, true);
    }
}

````
-->
