<details style="margin-top: 16px">
  <summary style="cursor: pointer; color: blue;"><b>Open in English</b></summary>

## Arrays

1. Why do we need data arrays?
   The main function of arrays is **storing large volumes of information**.

### Examples of arrays you know from life:

- Employee list
- List of tasks/assignments
- Phone book
- Shopping list
- Library (books)
- Document archive
- Photo archives
- Warehouses
- Product catalog
- Audio library
- Lists of buyers, clients
- Real estate registry (rent, sale, purchase)
- List of assets
- Land plot cadastre
- Customer accounts in banks
- ...
  You have a variable and a data type => how to store them????
  int X = 1000;
  int Y = 2000;
  int Z = 2500;
  ... this is inconvenient.
  Conveniently, data can be turned into an array:
  int X[0], X[1], X[2], ...
  double Y[0], Y[1], Y[2] ..., Y[30] - array length 31

### Definition:

* An array is an object-container that contains a **fixed number** of values **of the same type**.
* An array can contain data **OF ONLY ONE type**.
* The type of what is stored in the array are the data types that we have in the Java language; there are no other
  types.
  **Main characteristics of an array:**

- **Type** of data placed in it (int, double, boolean, long, String, ...)
- Array name (like variableName)
- **Length** (a natural number, cannot be negative) = array size (number of cells, length),
  always has **type int**.
  **IMPORTANT!** - you cannot change the length of the array after its creation.
  In arrays, as everywhere in Java, **elements are numbered from zero**.

2. Syntax for declaring an array:
   | Array Declaration | Examples |
   |------------------------|-------------------|
   | `dataType[] arrayName;`| `int[] myArray;`  |
   | `dataType arrayName[];`| `int myArray[];`  |

- In both cases, dataType is the type of variables in the array.
- Step **1**: defining/setting the **type of stored data** (the array stores data **OF ONLY ONE** type),
- Step **2**: declaring and initiating the array `Type[] arrayName = new Type[size];`
  **Examples:**
  `int[] arrayNum = new int[5];` // defined an array of integers, array length = 5
  `arrayNum[0]` - this is the first element of the array, arrayNum[4] - this is the last element
  `String[] arrayCity = new String[10];` // defined an array of strings, array length = 10
  `arrayCity[0]` - this is the first element of the array, arrayCity[9] - this is the last element
  `double[] arrayResults = new double[100];` // defined an array of floating-point numbers, array length = 100
  `arrayResults[0]` - this is the first element of the array, arrayResults[99] - this is the last element

3. Filling the array
   After the array is created (initialized), it is filled
   **with default values**.
    - for int all elements = 0
    - for float, double all elements = 0.0
    - for String all elements = "null"
    - for char all elements = '\0'
    - for boolean all elements = false
      Direct (manual) filling of the array:
      int[] myArray = new int[3];
      the array is called myArray, data type - int, array length = 3
      myArray[0] = 5;
      myArray[1] = -19;
      myArray[2] = 155;

___
String[] directions = new String[4];
directions = {"left", "right", "up", "down"};
direction[0] = "left"
direction[1] = "right"
.....
direction[3] = "down"
direction[4] = "up-side-down" - error, trying to access a non-existent array element
direction[5] - error, trying to access a non-existent array element,
out of range - going beyond the array limits
___
int[] marks = {2, 5, 4, 3, 5, 3, 5, 4, 1}; // you can also define an array like this
marks.length - returns the length of the array marks
double[] temperature = {16.0, 18.0, 17.5, 22.6, 25.0, 28.0, 26.8}
temperature.length - returns the length of the array temperature

4. Accessing array elements:
   Access to an array element is obtained by the **array name** and **element index** in it:
   arrayName[n] - this is the n-th element in the array with the name arrayName, numbering starts from 0

### Standard tasks and operations with arrays:

- finding an array element;
- adding a new element (to the beginning, to the end, to the middle);
- editing (changing) an array element;
- deleting an array element;
- finding the maximum/minimum value;
- sorting in ascending/descending order;
- removing duplicates;
- shifting the array;
- removing empty (zero) elements.
  We will gradually go through all these points.

## Массивы

1. Зачем нужны массивы данных?

Главная функция массивов - **хранение больших объемов информации**.

### Примеры массивов, которые вам известны из жизни:

- список сотрудников
- перечень дел/поручений
- телефонная книжка
- список покупок
- библиотека (книги)
- архив документов
- фотоархивы
- склады
- каталог товаров
- аудиотека
- списки покупателей, клиентов
- реестр недвижимости (аренда, продажа, покупка)
- перечень имущества, активов
- кадастр по земельным участкам
- счета клиентов в банках
- ...

Есть переменная и тип данных => как их сохранять????
int X = 1000;
int Y = 2000;
int Z = 2500;
... так неудобно.

Удобно так, данные можно превратить в массив:
int X[0], X[1], X[2], ...
double Y[0], Y[1], Y[2] ..., Y[30] - длина массива 31

### Определение:

* Массив – это объект-контейнер, содержащий **фиксированное количество** значений **одного типа**.
* В массиве могут содержаться данные **ТОЛЬКО ОДНОГО типа**.
* Тип того, что хранится в массиве - это типы данных, которые у нас есть в языке Java, других типов нет.

**Главные характеристики массива:**

- **тип** помещённых в него данных (int, double, boolean, long, String, ...)
- имя массива (как имяПеременной)
- **длина** (натуральное число, не может быть отрицательным) = размер массива (количество ячеек, длина),
  всегда имеет **тип int**.

**ВАЖНО!** - изменить длину массива после его создания нельзя.

В массивах, как и везде в Java, **элементы нумеруются с нуля**.

2. Синтаксис объявления массива:

| Объявление массива      | Примеры          |
|-------------------------|------------------|
| `dataType[] arrayName;` | `int[] myArray;` |
| `dataType arrayName[];` | `int myArray[];` |

- В обоих случаях dataType — тип переменных в массиве.
  <br><br>
- Шаг **1**: определение/задание **типа хранимых данных** (в массиве хранятся данные **ОДНОГО** типа),

- Шаг **2**: объявление и инициация массива `Тип[] имяМассива = new Тип[размер];`

  <br>

  **Прмеры:**
  <br>
  `int[] arrayNum = new int[5];` // определили массив целых чисел, длина массива = 5
  `arrayNum[0]` - это первый элемент массива, arrayNum[4] - это последний элемент
  <br> <br>
  `String[] arrayCity = new String[10];` // определили массив строк, длина массива = 10
  `arrayCity[0]` - это первый элемент массива, arrayCity[9] - это последний элемент
  <br> <br>
  `double[] arrayResults = new double[100];` // определили массив дробных чисел, длина массива = 100
  `arrayResults[0]` - это первый элемент массива, arrayResults[99] - это последний элемент


3. Заполнение массива
   После процедуры создания (инициализации) массива он наполнен
   **значениями по умолчанию**.
    - для int все элементы = 0
    - для float, double все элементы = 0.0
    - для String все элементы = "null"
    - для char все элементы = '\0'
    - для boolean все элементы = false

Прямое (ручное) заполнение массива:

		int[] myArray = new int[3]; 

массив называется myArray, тип данных - int , длина массива = 3

		myArray[0] = 5;
		myArray[1] = -19;
		myArray[2] = 155;

___

        String[] directions = new String[4];

        directions = {"left", "right", "up", "down"};
        direction[0] = "left"
        direction[1] = "right"
        .....
        direction[3] = "down"

        direction[4] = "up-side-down" - ошибка, попытка обращения к несуществующему элементу массива
        direction[5] - ошибка, попытка обращения к несуществующему элементу массива, 
                        out of range - выход за пределы массива

___

        int[] marks = {2, 5, 4, 3, 5, 3, 5, 4, 1}; // так тоже можно задавать массив
            marks.length - возвращает длину массива marks

        double[] temperature = {16.0, 18.0, 17.5, 22.6, 25.0, 28.0, 26.8}
            temperature.length - возвращает длину массива temperature

4. Доступ к элементам массива:
   Доступ к элементу массива получают по **имени массива** и **индексу элемента** в нем:
   arrayName[n] - это n-й элемент в массиве с именем arrayName, нумерация начинается с 0

### Стандартные задачи и операции с массивами:

- поиск элемента массива;
- добавление нового элемента (в начало, в конец, в середину);
- редактирование(изменение) элемента массива;
- удаление элемента массива;
- поиск максимального/минимального значения;
- сортировка по возрастанию/убыванию;
- удаление дубликатов;
- сдвиг массива;
- удаление пустых (нулевых) элементов.

Постепенно мы пройдем все эти пункты.

</details>
