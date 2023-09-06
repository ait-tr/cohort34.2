# In English

## First Program "Hello, World!":

1. Open your IDE and create a new Java file.
2. Insert the following code:

```java
   public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }
}
```

#### Notes:

- `public static void main(String[] args)`: the entry point to the program.
- `public static void main(String... args)`: also serves as the entry point to the program.
- `System.out.println()` is a method for outputting text to the console.
  Text or a variable can be specified in parentheses.

## Types of Comments:

- Single-line: // This is a single-line comment
- Multi-line: /* This is a multi-line comment */

#### Notes:

- Comments are ignored and do not affect program execution.

## DRY

- **DRY** stands for "Don't Repeat Yourself". This is a software development principle aimed at reducing redundancy in
  code.

### Meaning

- Repeated code complicates maintenance and makes it more error-prone. If you need to change some logic, you may have to
  do it in several places, increasing the likelihood of errors.

```text
Copy code
To get an output like this:
Wow, so many of us gathered, 16 people.
I'll go and meet everyone.
**Hi, my name is Andrey**
Hi, my name is Maria
**Nice to meet you and thank you for the conversation.**
**Hi, my name is Andrey**
Hi, my name is Kostya
**Nice to meet you and thank you for the conversation.**
**Hi, my name is Andrey**
...
**Nice to meet you and thank you for the conversation.**
```

## Part 3: Syntax and Structure Basics

### Semicolon ';'

- In Java, each expression (line of code) must end with a semicolon (;).

#### Real-Life Example:

- **Ending a sentence**: Like in real life, a sentence ends with a period, in Java an expression ends with a semicolon.

### Curly Braces `{}`

- Curly braces ({}) are used to define a block of code.

#### Real-Life Example:

- **Rooms in a house**: Curly braces are like rooms in a house. Everything in the room belongs to that room.

### Placement of Classes, Methods, and Variables

- Classes contain methods, and methods contain variables. None of this can exist outside curly braces.

#### Real-Life Example:

- **Apartments and items**: Methods are like apartments in a house (class). Boxes (variables) can only be inside
  apartments (
  methods) or in common areas of the house (class variables), but not on the street (outside curly braces).

[//]: # (## Part 4: Variables and Data Types)

[//]: # (### Variables)

[//]: # ()
[//]: # (- Variables are "containers" for storing information that can be used and modified in the program.)

[//]: # (- Real-life examples)

[//]: # (- **Wallet**: A variable is like a wallet where you can store money &#40;values&#41;. You can put money into it, take money out)

[//]: # (  of it, or check how much money you have.)

[//]: # (### Primitive Types and Strings)

[//]: # ()
[//]: # (- Java has different data types:)

[//]: # (- boolean values &#40;boolean&#41;)

[//]: # (- integers &#40;byte, short, int, long&#41;)

[//]: # (- floating-point numbers &#40;double, float&#41;)

[//]: # (- characters &#40;char&#41;)

[//]: # (- strings &#40;String&#41;.)

[//]: # (  The data type determines the range of values that a variable can store.)

[//]: # ()
[//]: # (| Type    | Description                         | Example code                  | Range of values                                         | Size &#40;in bits&#41; | Size in bytes |)

[//]: # (|---------|-------------------------------------|-------------------------------|---------------------------------------------------------|----------------|---------------|)

[//]: # (| boolean | Stores either true or false         | boolean isActive = false;     | true,  false                                            | 1 bit          |               |)

[//]: # (| byte    | Integer                             | byte a = 3;                   | -128 to 127                                             | 8              | 1             |)

[//]: # (| short   | Integer                             | short a = 3;                  | -32,768 to 32,767                                       | 16             | 2             |)

[//]: # (| int     | Integer                             | int a = 4;                    | -2,147,483,648 to 2,147,483,647                         | 32             | 4             |)

[//]: # (| long    | Integer                             | long a = 5L;                  | -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807 | 64             | 8             |)

[//]: # (| double  | Floating-point number               | double x = 8.5;               | ±4.910^-324 to ±1.797693134862315710^308                | 64             | 8             |)

[//]: # (| float   | Floating-point number               | float x = 8.5F;               | -3.410^38 to 3.410^38                                   | 32             | 4             |)

[//]: # (| char    | Single character in UTF-16 encoding | char c = 'A'; char c = '178'; | 0 to 65,535                                             | 16             | 2             |)

[//]: # ()
[//]: # (### What is a Bit, Byte)

[//]: # ()
[//]: # (- A Bit is the smallest unit of information, a single memory cell. It can take one of two values: 0 or 1.)

[//]: # (- A Byte is a set of 8 bits. A byte can store a number ranging from 0 to 255 &#40;inclusive&#41; in the decimal numbering system.)

# По русский

## Первая программа "Hello, World!":

1. Откройте вашу IDE и создайте новый Java-файл.
2. Вставьте следующий код:

```java
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }
}
```

#### Заметки:

- `public static void main(String[] args)`: точка входа в программу.
- `public static void main(String... args)`: так же является точкой входа в программу.
- `System.out.println()` — это метод для вывода текста в консоль.
- В скобках можно указать текст или переменную.

## Типы комментариев:

- Однострочные: `// Это однострочный комментарий`
- Многострочные: `/* Это многострочный комментарий */`

#### Заметки:

- Комментарии игнорируются и не влияют на выполнение программы.

## DRY

- **DRY** расшифровывается как "Не повторяйся / "Don't Repeat Yourself"". Это принцип разработки программного
  обеспечения,
  направленный на уменьшение
  избыточности в коде.

### Значение

- Повторение кода затрудняет его поддержку и делает его более подверженным ошибкам. Если вам нужно изменить какую-то
  логику, возможно, это нужно будет сделать в нескольких местах, что увеличит вероятность ошибок.

```text
Что бы вывод был примерно такой:
Ого, сколько нас сабролось, 16 человек.
Я пойду со всеми знакомиться.
**Привет, меня зовут Андрей**
Привет, меня зовут Мария
**Рад с вами познакомиться и спасибо за общение.**
**Привет, меня зовут Андрей**
Привет, меня зовут костя
**Рад с вами познакомиться и спасибо за общение.**
**Привет, меня зовут Андрей**
...
**Рад с вами познакомиться и спасибо за общение.**
```

## Часть 3: Основы Синтаксиса и Структуры

### Точка с запятой ';'

- В Java каждое выражение (строчка кода) должно заканчиваться точкой с запятой (`;`).

#### Пример из жизни:

- **Закончить предложение**: Как в реальной жизни предложение заканчивается точкой, в Java выражение заканчивается
  точкой с запятой.

### Фигурные скобки

- Фигурные скобки (`{}`) используются для определения блока кода.

#### Пример из жизни:

- **Комнаты в доме**: Фигурные скобки как комнаты в доме. Всё, что находится в комнате, принадлежит этой комнате.

### Расположение классов, методов и переменных

- Классы содержат методы, а методы содержат переменные. Ничего из этого не может существовать вне фигурных скобок.

#### Пример из жизни:

- **Квартиры и вещи**: Методы как квартиры в доме (классе). Ящики (переменные) могут находиться только в квартирах (
  методах) или в общих помещениях дома (переменные класса), но не на улице (вне фигурных скобок).

### Имя класса и имя файла

- Имя класса и имя файла, в котором он находится, должны совпадать.

#### Пример из жизни:

- **Почтовые ящики**: Номер квартиры (имя класса) и номер на почтовом ящике (имя файла) должны совпадать для правильной
  доставки почты (компиляции).
- **Паспорт и ФИО**: Представьте, что имя файла — это ваш паспорт, а имя класса — это ваше ФИО в этом паспорте. Они
  должны совпадать, иначе будет путаница.

[//]: # (## Часть 4: Переменные и Типы Данных)

[//]: # ()
[//]: # (### Переменные)

[//]: # ()
[//]: # (- Переменные — это "контейнеры" для хранения информации, которую можно использовать и изменять в программе.)

[//]: # ()
[//]: # (#### Примеры из жизни)

[//]: # ()
[//]: # (- **Кошелек**: Переменная — это как кошелек, в котором можно хранить деньги &#40;значения&#41;. Вы можете положить туда деньги,)

[//]: # (  взять их оттуда или проверить, сколько у вас денег.)

[//]: # ()
[//]: # (### Примитивные типы и строки)

[//]: # ()
[//]: # (- В Java есть разные типы данных:)

[//]: # (- логические значения &#40;`boolean`&#41;)

[//]: # (- целые числа &#40;`byte`, `short`, `int`, `long`&#41;)

[//]: # (- дробные числа &#40;`double`, `float`&#41;)

[//]: # (- символы &#40;`char`&#41;)

[//]: # (- строки &#40;`String`&#41;.)

[//]: # ()
[//]: # (Тип данных определяет диапазон значений, которые может хранить переменная)

[//]: # ()
[//]: # (| Тип     | Описание                            | Пример кода                       | Диапазон значений                                       | Размер &#40;в битах&#41; | Размер в байтах |)

[//]: # (|---------|-------------------------------------|-----------------------------------|---------------------------------------------------------|------------------|-----------------|)

[//]: # (| boolean | Хранит значение `true` или `false`  | `boolean isActive = false;`       | `true`, `false`                                         | 1 бит            |                 |)

[//]: # (| byte    | Целое число                         | `byte a = 3;`                     | -128 до 127                                             | 8                | 1               |)

[//]: # (| short   | Целое число                         | `short a = 3;`                    | -32,768 до 32,767                                       | 16               | 2               |)

[//]: # (| int     | Целое число                         | `int a = 4;`                      | -2,147,483,648 до 2,147,483,647                         | 32               | 4               |)

[//]: # (| long    | Целое число                         | `long a = 5L;`                    | -9,223,372,036,854,775,808 до 9,223,372,036,854,775,807 | 64               | 8               |)

[//]: # (| double  | Число с плавающей точкой            | `double x = 8.5;`                 | ±4.9*10^-324 до ±1.7976931348623157*10^308              | 64               | 8               |)

[//]: # (| float   | Число с плавающей точкой            | `float x = 8.5F;`                 | -3.4*10^38 до 3.4*10^38                                 | 32               | 4               |)

[//]: # (| char    | Одиночный символ в кодировке UTF-16 | `char c = 'A';` `char c = '178';` | 0 до 65,535                                             | 16               | 2               |)

[//]: # ()
[//]: # (### Что такое Бит, Байт)

[//]: # ()
[//]: # (- Бит — это минимальная единица информации, одна ячейка в памяти. Он может принимать одно из двух значений: 0 или 1.)

[//]: # (- Байт — это набор из 8 битов. В одном байте можно хранить число от 0 до 255 &#40;включительно&#41; в десятичной системе)

[//]: # (счисления.)
