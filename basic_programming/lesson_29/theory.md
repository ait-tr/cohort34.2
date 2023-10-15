<details style="margin-top: 16px">
  <summary style="cursor: pointer; color: blue;"><b>English</b></summary>

## StringBuilder:

StringBuilder is a mutable class in Java designed for efficient string manipulation, particularly when performing
multiple string alteration operations. It doesn't create new string objects with each operation, but modifies the
existing object. Example:

```java
        StringBuilder sb=new StringBuilder();
        sb.append("Hello");
        sb.append(" World");
        String result=sb.toString();
```

In this case, we create a StringBuilder object `sb` that allows us to frequently add and alter strings. We only
call `toString()` at the end to get the final string.

### Difference between StringBuilder and regular string concatenation:

When using regular string concatenation with the `+` operator in Java, a new string object is created every time the
strings are concatenated. This means that each concatenation operation creates a new string instance in memory. Example:

1. **Efficiency**: StringBuilder is more efficient for multiple string alteration operations, as it does not create
   additional string objects in memory.

2. **Convenience**: Regular concatenation using the `+` operator is more convenient for simple operations but may become
   inefficient for large data volumes.

3. **Mutability**: StringBuilder allows you to modify strings, while strings (String) in Java are immutable.

**Conclusion:**

StringBuilder is a powerful tool for string manipulation in Java, providing efficiency and flexibility for multiple
string alteration operations. When choosing between regular string concatenation and StringBuilder, consider the needs
of your project and the volume of data you're working with.

`StringBuilder` and `StringBuffer` in Java are two classes designed for string manipulation and provide string
mutability. They have many similarities, but also differences. Here are the main distinctions between them:

1. **Thread Safety:**

    - `StringBuilder` is not thread-safe. This means that if multiple threads try to modify the same `StringBuilder`
      simultaneously, there could be synchronization issues, and the result may be unpredictable.

    - `StringBuffer`, on the other hand, is thread-safe. It synchronizes access to its methods, making it safe for
      multithreaded operations. However, synchronization can impact performance, so `StringBuffer` is generally less
      efficient than `StringBuilder` if thread safety is not required.

2. **Performance:**

    - Due to the lack of synchronization, `StringBuilder` is usually faster than `StringBuffer` in single-threaded
      applications. If you don't need thread safety, `StringBuilder` is preferable.

    - `StringBuffer`, as already mentioned, provides thread safety but this can lead to minor overhead due to
      synchronization.

3. **Usage in modern applications:**

    - Since `Java 5`, the `StringBuilder` class has been introduced and is preferable to use in new applications if
      thread safety is not required.

    - `StringBuffer` remains useful in older applications or in cases where thread safety is needed.

In summary, if you don't need thread safety, `StringBuilder` is a more efficient choice for string manipulation. It
offers the same methods as `StringBuffer`, but without the overhead of synchronization. `StringBuffer` should only be
used when thread safety is critically important.

Certainly! Here's the translated text in English:

## Abstract Classes in Java

**What is an Abstract Class:**

An abstract class in Java is a class that is declared using the `abstract` keyword. Abstract classes provide a means for
creating classes that serve as abstract templates for other classes. They can contain both abstract (without
implementation) and concrete (with implementation) methods. The main difference between an abstract class and a regular
class is that you cannot create an object of an abstract class directly.

**Creating an Abstract Class:**

To create an abstract class, the `abstract` keyword is used before the class declaration:

```java
abstract class Animal {
    String name;

    abstract void makeSound(); // Abstract method without implementation

    void eat() {
        System.out.println(name + " is eating.");
    }
}
```

This abstract class `Animal` includes both an abstract method `makeSound()` that doesn't have an implementation and a
concrete method `eat()` that has an implementation. Instances of the `Animal` class cannot be created directly, but it
can serve as a base class for other classes that provide the necessary implementations.

Of course! Here's the translated text in English:

## General Conclusion:

**Abstract Class:**

1. **Object Creation:** You cannot directly create an object from an abstract class. It serves as an abstract template
   for derived classes.

2. **Common Characteristics:** An abstract class can contain fields and methods that will be common to all its derived
   classes.

3. **Abstract Methods:** An abstract class may contain abstract methods (methods without implementation) that must be
   implemented in all derived classes.

4. **Methods with Implementation:** An abstract class can also contain methods with specific implementations that can be
   inherited and used by derived classes.

**Abstract Method:**

1. **Without Implementation:** An abstract method is declared in an abstract class without specific implementation. It
   does not contain actual code and relies on concrete classes to provide its implementation.

2. **Mandatory Implementation:** All derived classes inheriting from the abstract class are obliged to provide
   implementations for abstract methods. Otherwise, the compiler will throw an error.

3. **Polymorphism:** Abstract methods enable the use of polymorphism. This means you can call an abstract method on an
   object of a derived class, and the method's implementation will execute according to the object's type.

**Comparison between an Abstract Class and a Regular Class:**

- **Abstract Class:**
    - Can contain abstract methods without implementation.
    - Cannot create an object directly from an abstract class.
    - Used for creating a common (abstract) template for derived classes.
    - Can contain methods with implementation and fields.

- **Regular Class:**
    - All methods have specific implementation.
    - Objects can be directly created from regular classes.
    - Used for creating specific objects and classes.

**Comparison between an Abstract Method and a Regular Method:**

- **Abstract Method:**
    - Declared without specific implementation in an abstract class.
    - Must be implemented in all derived classes.
    - Allows for the use of polymorphism.

- **Regular Method:**
    - Has specific implementation in the class.
    - Doesn't require mandatory implementation in subclasses.
    - Called as defined in the specific class.

**_In summary, abstract classes and methods allow for the creation of abstract templates for classes and methods,
providing flexibility and structure in projects where common characteristics and requirements for derived classes need
to be described._**

</details>

<hr>

<details style="margin-top: 16px">
  <summary style="cursor: pointer; color: blue;"><b>На русском</b></summary>

## StringBuilder:

StringBuilder представляет собой изменяемый (mutable) класс в Java, который предназначен для эффективной работы со
строками, особенно при выполнении множества операций изменения строки. Он не создает новых объектов строк при каждой
операции, а изменяет существующий объект. Пример:

```
        StringBuilder sb=new StringBuilder();
        sb.append("Hello");
        sb.append(" World");
        String result=sb.toString();
```

В данном случае, мы создаем объект StringBuilder `sb`, который позволяет нам многократно добавлять и изменять строки.
Только в конце мы вызываем `toString()`, чтобы получить результирующую строку.

### Разница между StringBuilder и обычной конкатенацией:

При использовании обычной конкатенации строк с оператором `+` в Java каждый раз, когда строки объединяются, создается
новый объект строки. Это означает, что при каждой операции конкатенации создается новый экземпляр строки в памяти.
Пример:

1. Эффективность: StringBuilder более эффективен при множестве операций изменения строки, так как он не создает лишних
   объектов строк в памяти.
2. Удобство: Обычная конкатенация с оператором `+` более удобна для простых операций, но может стать неэффективной при
   больших объемах данных.
3. Изменяемость: StringBuilder позволяет изменять строки, в то время как строки (String) в Java неизменяемы (immutable).

**Заключение:**

StringBuilder - это мощный инструмент для работы со строками в Java, который обеспечивает эффективность и гибкость при
многократных операциях изменения строк. При выборе между обычной конкатенацией строк и StringBuilder, учитывайте
потребности вашего проекта и объем данных, с которыми вы работаете.

`StringBuilder` и `StringBuffer` в Java представляют собой два класса, предназначенных для работы со строками и
обеспечивающих изменяемость (mutable) строк. Они имеют много общих черт, но есть и различия. Вот основные отличия между
ними:

1. **Потокобезопасность (Thread Safety):**

    - `StringBuilder` не является потокобезопасным. Это означает, что если несколько потоков пытаются изменять один и
      тот же `StringBuilder` одновременно, могут возникнуть проблемы с синхронизацией, и результат может быть
      непредсказуемым.

    - `StringBuffer`, напротив, является потокобезопасным. Это означает, что он синхронизирует доступ к своим методам,
      что делает его безопасным для многопоточных операций. Однако синхронизация может сказаться на производительности,
      поэтому `StringBuffer` обычно менее эффективен, чем `StringBuilder`, если потокобезопасность не требуется.

2. **Производительность:**

    - Из-за отсутствия синхронизации `StringBuilder` обычно быстрее `StringBuffer` в однопоточных приложениях. Если вам
      не нужна потокобезопасность, `StringBuilder` предпочтительнее.

    - `StringBuffer`, как уже упомянуто, обеспечивает потокобезопасность, но это может привести к небольшим накладным
      расходам на синхронизацию.

3. **Использование в современных приложениях:**

    - С `Java 5` введен класс `StringBuilder`, который предпочтительнее использовать в новых приложениях, если не
      требуется потокобезопасность.

    - `StringBuffer` остается полезным в старых приложениях или в случаях, когда потокобезопасность необходима.

В общем, если вам не нужна потокобезопасность, `StringBuilder` - это более эффективный выбор для манипуляции строками.
Он предоставляет те же методы, что и `StringBuffer`, но без накладных расходов на синхронизацию. `StringBuffer` следует
использовать только в случаях, когда потокобезопасность является критически важной.

# ООП - абстракция

## Абстрактные классы в Java

**Что такое абстрактный класс:**

Абстрактный класс в Java - это класс, который объявлен с использованием ключевого слова `abstract`. Абстрактные классы
предоставляют средство для создания классов, которые служат в качестве абстрактных шаблонов для других классов. Они
могут содержать как абстрактные (без реализации) методы, так и конкретные (с реализацией) методы. Главное отличие
абстрактного класса от обычного заключается в том, что вы не можете создать объект абстрактного класса напрямую.

**Создание абстрактного класса:**

Для создания абстрактного класса используется ключевое слово `abstract` перед объявлением класса:

```java
abstract class Animal {
    String name;

    abstract void makeSound(); // Абстрактный метод без реализации

    void eat() {
        System.out.println(name + " ест.");
    }
}
```

## Абстрактные методы:

Абстрактный метод - это метод, который объявлен в абстрактном классе, но не имеет реализации в самом классе. Он
определяется с помощью ключевого слова `abstract`. Абстрактные методы обязательно должны быть реализованы в
производных (конкретных) классах.

**Пример абстрактного метода:**

```java
abstract void makeSound();
```

**Производные классы:**

Для создания объектов на основе абстрактного класса вы должны создать производный (конкретный) класс и реализовать все
абстрактные методы, которые объявлены в абстрактном классе.

**Пример производного класса:**

```java
class Dog extends Animal {
    Dog(String name) {
        this.name = name;
    }

    void makeSound() {
        System.out.println(name + " лает: Гав-гав!");
    }
}
```

### Использование абстрактных классов:

```java
public class Main {
    public static void main(String[] args) {
        Animal dog = new Dog("Шарик");
        dog.eat();
        dog.makeSound();
    }
}
```

В этом примере мы создаем объект класса `Dog`, который является производным от абстрактного класса `Animal`. Мы
реализуем абстрактный метод `makeSound()` в классе `Dog`. Таким образом, абстрактные классы позволяют нам создавать
абстрактные шаблоны для классов и обеспечивают наследование и реализацию в производных классах.

**Заключение:**

Абстрактные классы являются важным инструментом в объектно-ориентированном программировании. Они позволяют создавать
общие шаблоны для классов и обеспечивать структуру наследования в Java. Абстрактные методы в абстрактных классах
гарантируют, что производные классы предоставят необходимую реализацию для этих методов.

Наследование от абстрактного класса и наследование от обычного (конкретного) класса в Java имеют сходства, но также
имеют существенные различия.

### Наследование от абстрактного класса:

1. **Абстрактные методы:** Абстрактные классы могут содержать абстрактные методы (методы без реализации). Подкласс,
   наследующий абстрактный класс, **обязан** предоставить реализацию всех абстрактных методов. Это означает, что
   абстрактные
   классы предоставляют абстрактные шаблоны для производных классов.

2. **Создание объектов:** **Нельзя** создать объект абстрактного класса напрямую. Вы можете создать объект только для
   производного класса, который реализует все абстрактные методы.

3. **Использование наследования:** Наследование от абстрактного класса используется, когда вы хотите создать семейство
   классов с общими характеристиками и методами, но не хотите предоставлять реализацию для всех методов в базовом
   классе. Абстрактные классы предоставляют общий интерфейс и соглашения о том, как должны быть реализованы методы в
   производных классах.

Разница между наследованием от обычного и абстрактного класса заключается в том, что абстрактные классы
предоставляют абстрактные методы и создают абстрактные шаблоны для производных классов, в то время как обычные классы
предоставляют конкретные реализации методов и могут быть использованы для создания объектов напрямую.

## Общее заключение:

**Абстрактный класс:**

1. **Создание объектов:** Вы не можете создать объект напрямую от абстрактного класса. Он служит как абстрактный шаблон
   для производных классов.

2. **Общие характеристики:** Абстрактный класс может содержать поля и методы, которые будут общими для всех его
   производных классов.

3. **Абстрактные методы:** Абстрактный класс может содержать абстрактные методы (методы без реализации), которые должны
   быть реализованы во всех производных классах.

4. **Методы с реализацией:** Абстрактный класс также может содержать методы с конкретной реализацией, которые могут быть
   унаследованы и использованы производными классами.

**Абстрактный метод:**

1. **Без реализации:** Абстрактный метод объявлен в абстрактном классе без конкретной реализации. Он не содержит
   фактического кода и зависит от конкретных классов, чтобы предоставить свою реализацию.

2. **Обязательность реализации:** Все производные классы, наследующие от абстрактного класса, обязаны предоставить
   реализацию абстрактных методов. В противном случае компилятор выдаст ошибку.

3. **Полиморфизм:** Абстрактные методы позволяют использовать полиморфизм. Это означает, что вы можете вызывать
   абстрактный метод на объекте производного класса, и будет выполнена реализация этого метода в соответствии с типом
   объекта.

**Сравнение абстрактного класса и обычного класса:**

- **Абстрактный класс**:
    - Может содержать абстрактные методы без реализации.
    - Нельзя создать объект напрямую от абстрактного класса.
    - Используется для создания общего шаблона (абстрактного) для производных классов.
    - Может содержать методы с реализацией и поля.

- **Обычный класс**:
    - Все методы имеют конкретную реализацию.
    - Можно создавать объекты от обычных классов напрямую.
    - Используется для создания конкретных объектов и классов.

**Сравнение абстрактного метода и обычного метода:**

- **Абстрактный метод**:
    - Объявлен без конкретной реализации в абстрактном классе.
    - Обязан быть реализован во всех производных классах.
    - Позволяет использовать полиморфизм.

- **Обычный метод**:
    - Имеет конкретную реализацию в классе.
    - Не требует обязательной реализации в подклассах.
    - Вызывается так, как определено в конкретном классе.

**_В итоге, абстрактные классы и методы позволяют создавать абстрактные шаблоны для классов и методов, обеспечивая
гибкость
и структуру в проектах, где нужно описывать общие характеристики и требования для производных классов._**

</details>
