<details style="margin-top: 16px">
  <summary style="cursor: pointer; color: blue;"><b>English</b></summary>

### Task 1: Student Management

Create a base class `Student` with the attributes `name`, `age` and `GPA`. Then create two
subclass: `HighSchoolStudent` (High School Student) and `CollegeStudent` (College Student).

Add methods to the base class to calculate a student's status based on GPA. For example, if the average score
greater than or equal to 4.5, the student is considered an “excellent student,” if between 3.0 and 4.49 he is considered
an “good student,” and so on.

Create several objects of different student classes and call methods to determine their status.

### Task 2: Hierarchy of computer devices

Create a class hierarchy for computing devices: laptops and desktop computers. Each device has
attributes `brand` and `memory capacity`.

Create methods to display information about each device, including its type (laptop or desktop), brand, and
Memory.

Create objects of different types of computer devices and display information about each of them.

### Problem 3*: Hierarchy of animals

Create a class hierarchy for animals, including mammals and birds. Each class will have common attributes `name`
and `habitat`, as well as specific attributes: in mammals - `type of food` (herbivores, predators)
and “number of legs”, in birds - “wingspan” and “type of feathers” (fluffy, feathered).

Create methods for each class to allow animals to make their own sounds (meow, bark, chirp, etc.). Also
Implement a method that prints information about animals, including their general and specific attributes.

Create objects of different types of animals and call methods to make sounds and display information about them.

___

## Type conversion tasks, for reinforcement:

### Task 4: Reduction of types in animal hierarchies

Let's say we have a hierarchy of animal classes:

````
class Animal { /* ... */ }
class Mammal extends Animal { /* ... */ }
class Bird extends Animal { /* ... */ }

````

Create objects of different classes and try casting between them. For example, create an object like
Mammal, and then try casting it to type Animal.

### Task 5: Type casting in student hierarchies

We have a hierarchy of student classes:

````
class Student { /* ... */ }
class HighSchoolStudent extends Student { /* ... */ }
class CollegeStudent extends Student { /* ... */ }

````

Create objects of different student classes and try casting between them. For example, create an object
type CollegeStudent and then try to cast it to type Student

### Task 6: Coercion of types in the hierarchy of computer devices

We have a hierarchy of computer device classes:

````

class ComputerDevice { /* ... */ }
class Laptop extends ComputerDevice { /* ... */ }
class DesktopComputer extends ComputerDevice { /* ... */ }
````

Create objects from different classes of computer devices and try casting between them. For example,
create an object of type Laptop and then try to cast it to type ComputerDevice.

</details>

<hr>

<details style="margin-top: 16px">
  <summary style="cursor: pointer; color: blue;"><b>На русском</b></summary>

### Задача 1: Управление студентами

Создайте базовый класс `Student` (Студент) с атрибутами `имя`, `возраст` и `средний балл`. Затем создайте два
подкласса: `HighSchoolStudent` (Старшеклассник) и `CollegeStudent` (Студент колледжа).

Добавьте методы в базовый класс для вычисления статуса студента на основе среднего балла. Например, если средний балл
больше или равен 4.5, студент считается "отличником", если между 3.0 и 4.49 - "хорошистом", и так далее.

Создайте несколько объектов разных классов студентов и вызовите методы для определения их статуса.

### Задача 2: Иерархия компьютерных устройств

Создайте иерархию классов для компьютерных устройств: ноутбуки и стационарные компьютеры. Каждое устройство имеет
атрибуты `марка` и `объем памяти`.

Создайте методы для вывода информации о каждом устройстве, включая его тип (ноутбук или стационарный компьютер), марку и
объем памяти.

Создайте объекты разных типов компьютерных устройств и выведите информацию о каждом из них.

### Задача 3*: Иерархия животных

Создайте иерархию классов для животных, включая млекопитающих и птиц. У каждого класса будут общие атрибуты `имя`
и `место обитания`, а также специфичные атрибуты: у млекопитающих - `тип питания` (травоядные, хищники)
и `количество ног`, у птиц - `размах крыльев` и `тип перьев` (пушистые, пернатые).

Создайте методы для каждого класса, позволяющие животным издавать свои звуки (мяукать, гавкать, чирикать и т. д.). Также
реализуйте метод, который выводит информацию о животных, включая их общие и специфичные атрибуты.

Создайте объекты разных типов животных и вызовите методы для издания звуков и вывода информации о них.

___

## Задачи на приведение типов, для закрепления:

### Задача 4: Приведение типов в иерархии животных

Предположим, у нас есть иерархия классов животных:

````
class Animal { /* ... */ }
class Mammal extends Animal { /* ... */ }
class Bird extends Animal { /* ... */ }

````

Создайте объекты разных классов и попробуйте выполнить приведение типов между ними. Например, создайте объект типа
Mammal, а затем попробуйте привести его к типу Animal.

### Задача 5: Приведение типов в иерархии студентов

У нас есть иерархия классов студентов:

````
class Student { /* ... */ }
class HighSchoolStudent extends Student { /* ... */ }
class CollegeStudent extends Student { /* ... */ }

````

Создайте объекты разных классов студентов и попробуйте выполнить приведение типов между ними. Например, создайте объект
типа CollegeStudent, а затем попробуйте привести его к типу Student

### Задача 6: Приведение типов в иерархии компьютерных устройств

У нас есть иерархия классов компьютерных устройств:

````

class ComputerDevice { /* ... */ }
class Laptop extends ComputerDevice { /* ... */ }
class DesktopComputer extends ComputerDevice { /* ... */ }
````

Создайте объекты разных классов компьютерных устройств и попробуйте выполнить приведение типов между ними. Например,
создайте объект типа Laptop, а затем попробуйте привести его к типу ComputerDevice.


</details>
