<details style="margin-top: 16px">
  <summary style="cursor: pointer; color: blue;"><b>English</b></summary>

## Task 1

Look around you. Write three classes that describe some entities around you. Don't forget to use
abstraction.

For example, describe the student, the desk, the keyboard, etc.

You can select your entities (objects) for description.

## Task 2

Hierarchy of classes "**Company Employees**"

Create:

- Basic class Employee (**Employee**):
  - Private attributes: name, salary.
  - Constructor for initializing name and salary.
  - Getters and setters for name and salary.
  - The **work()** method (`work()`), which displays the message "**_I'm an employee, I'm working_**".
- The Manager class (**Manager**) is inherited from **Employee**:
  - Additional private attribute: number of subordinates (numSubordinates).
  - Constructor for initializing all attributes.
  - Getters and setters for the new attribute.
  - Overridden **work()** method, which displays the message "**_I am a manager, I manage a team_**".
- The Engineer class (**Engineer**) is inherited from **Employee**:
  - Additional private attribute: specialization.
  - Constructor for initializing all attributes. Getters and setters for the new attribute.
  - Overridden method work(), which displays the message "**_I'm developing_**".
- The Intern class (**Intern**) is inherited from **Employee**:
  - Additional private attribute: university.
  - Constructor for initializing all attributes. Getters and setters for the new attribute.
  - Overridden **work()** method, which displays the message "**_I'm studying and working_**".

**Tasks:**

1. Create several instances of each class and call the **work()** method on each of them.
2. Create an array or list of Employees and add objects of all classes to it. Loop through this array
   calling the work() method on each object.
3. Demonstrate the principles of encapsulation by creating getters and setters for all attributes and making attributes private.

## Task 3 (Optional)

Hierarchy of classes "**Musical Instruments**"

- Basic class Musical Instrument:
  - Private attributes: name, type, price.
  - Constructor for initializing attributes.
  - Getters and setters for all attributes.
  - The play() method, which displays the message “[instrument name] is playing.”
- The String Instrument class inherits from Musical Instrument:
  - Additional attribute: number of strings (numberOfStrings).
  - Constructor for initializing all attributes.
  - Getter and setter for the new attribute. An overridden play() method that prints "
    Plays [instrument name] with [number of strings] strings."
- The WindInstrument class is inherited from Musical Instrument:
  - Additional attribute: material, for example, “wood” or “metal”.
  - Constructor for initializing all attributes.
  - Getter and setter for the new attribute.
  - Overridden play() method which outputs "Plays [instrument name] from [material]".

**Tasks:**

1. Create multiple instances of each class and call the play() method on each of them.
2. Create an array or list of objects of the Musical Instrument type and add objects of all derived classes to it.
   Loop through this array, calling the play() method on each object.
3. Use getters and setters for all class attributes to demonstrate the principles of encapsulation.
4. ****** add the method Rental Cost() (rentalCost) to the base class, which will calculate the cost
   renting a tool based on its price. Override this method in derived classes if necessary.

___

**Do not forget:**

- Variables: camelCase, nouns (totalSum).
- Methods: camelCase, verbs (calculateSum).
- Boolean: starts with is, has, can (isReady).

</details>

<hr>

<details style="margin-top: 16px">
  <summary style="cursor: pointer; color: blue;"><b>На русском</b></summary>

## Задача 1

Посмотрите вокруг себя. Напишите три класса, описывающие какие-то сущности вокруг Вас. Не забудьте использовать
абстракцию.

Например, опишите студента, стол, клавиатуру и т.д.

Вы можете выбрать свои сущности(объекты) для описания.

## Задача 2

Иерархия классов "**Сотрудники компании**"

Создать:

- Базовый класс Сотрудник (**Employee**):
    - Приватные атрибуты: имя (name), зарплата (salary).
    - Конструктор для инициализации имени и зарплаты.
    - Геттеры и сеттеры для имени и зарплаты.
    - Метод **работать()** (`work()`), который выводит сообщение "**_Я сотрудник, я работаю_**".
- Класс Менеджер (**Manager**) наследуется от **Сотрудник**:
    - Дополнительный приватный атрибут: количество подчиненных (numSubordinates).
    - Конструктор для инициализации всех атрибутов.
    - Геттеры и сеттеры для нового атрибута.
    - Переопределенный метод **работать()**, который выводит сообщение "**_Я менеджер, я управляю командой_**".
- Класс Инженер (**Engineer**) наследуется от **Сотрудник**:
    - Дополнительный приватный атрибут: специализация (specialization).
    - Конструктор для инициализации всех атрибутов. Геттеры и сеттеры для нового атрибута.
    - Переопределенный метод работать(), который выводит сообщение "**_Я разрабатываю_**".
- Класс Интерн (**Intern**) наследуется от **Сотрудник**:
    - Дополнительный приватный атрибут: университет (university).
    - Конструктор для инициализации всех атрибутов. Геттеры и сеттеры для нового атрибута.
    - Переопределенный метод **работать()**, который выводит сообщение "**_Я учусь и работаю_**".

**Задачи:**

1. Создать несколько экземпляров каждого класса и вызвать метод **работать()** для каждого из них.
2. Создать массив или список Сотрудников и добавить в него объекты всех классов. Пройтись по этому массиву в цикле,
   вызывая метод работать() для каждого объекта.
3. Продемонстрировать принципы инкапсуляции, создав геттеры и сеттеры для всех атрибутов и делая атрибуты приватными.

## Задача 3 (Опциональная)

Иерархия классов "**Музыкальные инструменты**"

- Базовый класс Музыкальный Инструмент (MusicalInstrument):
    - Приватные атрибуты: название (name), тип (type), цена (price).
    - Конструктор для инициализации атрибутов.
    - Геттеры и сеттеры для всех атрибутов.
    - Метод играть() (play), который выводит сообщение "Играет [название инструмента]".
- Класс Струнный Инструмент (StringInstrument) наследуется от Музыкальный Инструмент:
    - Дополнительный атрибут: количество струн (numberOfStrings).
    - Конструктор для инициализации всех атрибутов.
    - Геттер и сеттер для нового атрибута. Переопределенный метод играть(), который выводит "
      Играет [название инструмента] с [количество струн] струнами".
- Класс Духовой Инструмент (WindInstrument) наследуется от Музыкальный Инструмент:
    - Дополнительный атрибут: материал (material), например, "дерево" или "металл".
    - Конструктор для инициализации всех атрибутов.
    - Геттер и сеттер для нового атрибута.
    - Переопределенный метод играть(), который выводит "Играет [название инструмента] из [материал]".

**Задачи:**

1. Создать несколько экземпляров каждого класса и вызвать метод играть() для каждого из них.
2. Создать массив или список объектов типа Музыкальный Инструмент и добавьте в него объекты всех производных классов.
   Пройтись по этому массиву в цикле, вызывая метод играть() для каждого объекта.
3. Используйте геттеры и сеттеры для всех атрибутов классов для демонстрации принципов инкапсуляции.
4. ****** добавьте метод стоимостьАренды() (rentalCost) в базовый класс, который будет рассчитывать стоимость
   аренды инструмента на основе его цены. Переопределите этот метод в производных классах, если необходимо.

___

**Не забывайте:**

- Переменные: camelCase, существительные (totalSum).
- Методы: camelCase, глаголы (calculateSum).
- Булевы: начинаются с is, has, can (isReady).

</details>
