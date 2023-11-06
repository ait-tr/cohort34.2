Русский текст смотри ниже


<ol>
<li> An enumeration type is a special data type that allows a variable to be a set of predefined constants. The variable must be equal to one of its predefined values. Because they are constants, the field names of the enumerated type are written in capital letters. </li>
<li>In the Java programming language, the type of an enumeration is defined using the enum keyword. For example, you can specify the enumeration type for days of the week like this:
	
	public enum Day {
	    SUNDAY, MONDAY, TUESDAY, WEDNESDAY,
	    THURSDAY, FRIDAY, SATURDAY 
	}
	
All enums implicitly extend java.lang.Enum.
Here is a link to the official Oracle tutorial on enumerated types:
<a href="https://docs.oracle.com/javase/tutorial/java/javaOO/enum.html">Enum</a>

</li>
<li> An error in a method interrupts its work at the point of origin of the error, and destroys the entire stack of functions. At the same time, Java creates and “forwards” a special object characterizing the error. All such objects inherit the Throwable class.
</li>
<li> All Throwable descendants are divided into two categories: Error and Exception. Error are errors with which nothing can be done. For example, lack of memory. The second category, Exception - exceptional situations caused by an incorrect state of the program.
</li>
<li> Errors are of two types: checked (checked) and unchecked (unchecked). The first type the compiler “sees” and forces the programmer to somehow react to them. How to respond to unverifiable errors (and whether to respond at all) is up to the developer to decide.
</li>
<li> Error handling is carried out using the try-catch-finally construct. In try blocks we indicate what to do if everything is fine. We handle errors in the catch block. The finally block is executed in any case.
</li>
<li> We can create our own errors and “throw” them using the throw keyword. If we want to create a checked exception, then we can extend the Exception class. If unchecked, then we inherit the RuntimeException class.
</li>
<li> If we encounter a checked exception, but do not want to handle it in this method using try-catch, and decide to throw this exception to the calling method, then we can use the throws keyword in the method signature.
</li>
</ol>

<br>

<ol>
<li> Тип перечисления — это специальный тип данных, который позволяет переменной быть набором предопределенных констант. Переменная должна быть равна одному из предопределенных для нее значений. Поскольку они являются константами, имена полей перечисляемого типа пишутся большими буквами. </li>
<li>В языке программирования Java тип перечисления определяется с помощью ключевого слова enum. Например, вы можете указать тип перечисления дней недели следующим образом:  
	
	public enum Day {
	    SUNDAY, MONDAY, TUESDAY, WEDNESDAY,
	    THURSDAY, FRIDAY, SATURDAY 
	}
	
Все перечисления неявно расширяют java.lang.Enum. 
Вот ссылка на официальный Oracle туториал по перечисляемым типам: 
<a href="https://docs.oracle.com/javase/tutorial/java/javaOO/enum.html">Enum</a>

</li>
<li> Ошибка в методе, прерывает его работы в точке происхождения ошибки, и разрушает весь стек функций.При этом Java создает и "пробрасывает" специальный объект характеризующий ошибку. Все такие объекты наследуют классу Throwable.
</li>
<li> Все наследники Throwable делятся на две категории: Error и Exception. Error - это ошибки с которыми ничего сделать нельзя. Например нехватка памяти. Вторая категория, Exception - исключительные ситуации вызванные некорректным состоянием программы.
</li>
<li> Ошибки бывают двух типов: checked (проверяемые) и unchecked (непроверяемые). Первый тип компилятор "видит" и заставляет программиста как-то на них отреагировать. Как реагировать на непроверяемые ошибки (и реагировать ли вообще), решает сам разработчик. 
</li>
<li> Обработка ошибок осуществляется при помощи конструкции try-catch-finally. В блоки try мы указываем, что делать если все нормально. В блоке catch обрабатываем ошибки. Блок finally выполняется в любой случае.
</li>
<li> Мы можем создавать свои ошибки и "бросать" их при помощи ключего слова throw. Если мы хотим создать проверяемое исключение, то можно наследовать классу Exception. Если непроверяемое, то наследуем классу RuntimeException.
</li>
<li> Если мы столкнулись с проверяемым исключением, но не хотим его обрабатывать в данном методе при помощи try-catch, и решили пробросить это исключение в вызывающий метод, то можно воспользоваться ключевым словом throws в сигнатуре метода.
</li>

</ol>