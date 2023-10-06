<details style="margin-top: 16px">
  <summary style="cursor: pointer; color: blue;"><b>English</b></summary>

The `final` modifier can be applied to classes, methods and variables. When it is applied to a class it is
means that the class cannot be inherited by other classes. Here's how it works:

1. `final` for the class:
   When a class is declared as `final`, it means that it is "complete" and cannot be extended or
   inherit. This is useful, for example, when you want to prevent the creation of subclasses that could change or
   disrupt your class. Example:

    ```java
    final class MyFinalClass {
        // Class code
    }
    ```

2. `final` for the method:
   The `final` modifier can also be applied to methods within a class. When a method is declared as `final`, subclasses are not
   can override this method. This ensures that the method implementation will be constant and will not change across subclasses.
   Example:

    ```java
    class MyBaseClass {
        final void myFinalMethod() {
            // Method code
        }
    }
    ```

3. `final` for variables:
   When a variable is declared as `final`, it can only be assigned a value once, and that value cannot be
   changed after that. This is used to create immutable variables. Example:

    ```java
    final int myFinalVariable = 10;
    ```

Using the `final` modifier helps create more reliable and predictable code in Java and should be
Use where necessary to ensure the stability and security of your application.

</details>

<hr>

<details style="margin-top: 16px">
  <summary style="cursor: pointer; color: blue;"><b>На русском</b></summary>



Модификатор `final` может применяться к классам, методам и переменным. Когда он применяется к классу, это
означает, что класс не может быть наследован другими классами. Вот как это работает:

1. `final` для класса:
   Когда класс объявлен как `final`, это означает, что он является "завершенным", и его нельзя расширить или
   унаследовать. Это полезно, например, когда вы хотите предотвратить создание подклассов, которые могли бы изменить или
   нарушить работу вашего класса. Пример:

   ```java
   final class MyFinalClass {
       // Код класса
   }
   ```

2. `final` для метода:
   Модификатор `final` также может применяться к методам внутри класса. Когда метод объявлен как `final`, подклассы не
   могут переопределить этот метод. Это гарантирует, что реализация метода будет постоянной и не изменится в подклассах.
   Пример:

   ```java
   class MyBaseClass {
       final void myFinalMethod() {
           // Код метода
       }
   }
   ```

3. `final` для переменных:
   Когда переменная объявлена как `final`, ей можно присвоить значение только один раз, и это значение не может быть
   изменено после этого. Это используется, чтобы создать неизменяемые переменные. Пример:

   ```java
   final int myFinalVariable = 10;
   ```

Использование модификатора `final` помогает создавать более надежный и предсказуемый код в Java, и его следует
использовать там, где это необходимо для обеспечения стабильности и безопасности вашего приложения.

</details>
