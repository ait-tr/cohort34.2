
---

# Повторение:

## Циклы:

**Цикл** - это конструкция, которая позволяет повторять выполнение блока кода до тех пор, пока не будет выполнено
заданное условие.

- while
- do while
- fori

### while

- Цикл while выполняется, пока условие истинно. Он имеет следующую синтаксис:

````
while (условие) {
    // ...
}
````

- Вот пример использования цикла while:

````
int i = 0;

while (i < 10) {
    System.out.println(i);
    i++;
}
````

### do while

Цикл do-while выполняется, по крайней мере, один раз. Он имеет следующую синтаксис:

````
do {
    // ...
} while (условие);

````

Вот пример использования цикла do-while:

````
int i = 0;

do {
    System.out.println(i);
    i++;
} while (i < 10);
````

Этот код также будет выводить на экран числа от 0 до 9.

### fori

Цикл for - это наиболее часто используемый тип цикла в Java. Он имеет следующую синтаксис:

````
for (инициализация; условие; итерация) {
// ...
}
````

1. Инициализация выполняется один раз, когда цикл запускается. Она может использоваться для инициализации переменной
   цикла.
2. Условие проверяется перед каждым повторением цикла. Если условие истинно, цикл выполняется. Если условие ложно, цикл
   завершается.
3. Итерация выполняется после каждого повторения цикла. Она может использоваться для изменения переменной цикла или
   выполнения других действий.

Вот пример использования цикла for:

````
for (int i = 0; i < 10; i++) {
System.out.println(i);
}
````

Этот код будет выводить на экран числа от 0 до 9.

## Итог

### Цикл for

Цикл for является наиболее гибким типом цикла в Java. Он может использоваться для повторения блока кода произвольное
количество раз.

**Вот несколько советов по использованию цикла for:**

- Используйте цикл for, когда вы знаете, сколько раз нужно повторить блок кода.
- Используйте переменную цикла для отслеживания количества повторений.
- Используйте итератор для выполнения действий на каждом повторении.

### Цикл while

Цикл while используется для повторения блока кода, пока условие истинно.

**Вот несколько советов по использованию цикла while:**

- Используйте цикл while, когда вы не знаете, сколько раз нужно повторить блок кода.
- Используйте условие для проверки, нужно ли повторять блок кода.
- Используйте переменную цикла для отслеживания количества повторений.

### Цикл do-while

Цикл do-while используется для повторения блока кода, по крайней мере, один раз.

**Вот несколько советов по использованию цикла do-while:**

- Используйте цикл do-while, когда вы хотите выполнить блок кода хотя бы один раз.
- Используйте условие для проверки, нужно ли повторять блок кода.
- Используйте переменную цикла для отслеживания количества повторений.

## Массив:

**Массив** - это структура данных, которая хранит данные одного типа в виде линейной последовательности.

### Основные характеристики массивов:

**Тип данных**: Массив может содержать только данные одного типа.
**Размер:** Массив имеет фиксированный размер, который определяется при его создании.
**Индексы:** Каждому элементу массива присваивается уникальный индекс, который используется для доступа к нему.

### Создание массива

Массивы в Java создаются с помощью ключевого слова `new`.

````
int[] array = new int[10];

````

**Другие способы создания массивов, с заполнением данными при создании**

````
int[] marks = {2, 5, 4, 3, 5, 3, 5, 4, 1}; // так тоже можно задавать массив
int[] array = new int[]{2, 5, 4, 3, 5, 3, 5, 4, 1} // так тоже можно задавать массив
````

Этот код создаст массив из 10 целых чисел.

### Доступ к элементам массива

Элементы массива можно получить по их индексу.

````
int element = array[0];

````

Этот код вернет **первый** элемент массива.

### Изменение элементов массива

````
array[0] = 10;
````

Этот код установит значение 10 для первого элемента массива.

### Значение по умолчанию

**Значение по умолчанию** - это значение, которое присваивается переменной, если оно не было явно задано

В Java значения по умолчанию для переменных определяются их типом данных.

**Значения по умолчанию для примитивных типов данных:**

- Целочисленные типы: '0'
- Действительные типы: '0.0'
- Логический тип: 'false'
- Тип char: '\u0000'
- ссылочных типы, объекты: 'null'

Например, следующий код создаст массив из 10 целых чисел, все элементы которого будут иметь значение 0:

````
int[] array = new int[10];

````

В этом примере элементы массива будут иметь значение по умолчанию для целочисленного типа данных, то есть 0.

#### Массив целых чисел:

````
int[] array = new int[10];

for (int i = 0; i < array.length; i++) {
    System.out.println(array[i]); // Выведет 0 0 0 0 ... 0
}
````

#### Массив вещественных чисел:

````
double[] array = new double[10];

for (int i = 0; i < array.length; i++) {
    System.out.println(array[i]); // Выведет 0.0 0.0 0.0 0.0 ... 0.0
}
````

#### Массив логических значений:

````
boolean[] array = new boolean[10];

for (int i = 0; i < array.length; i++) {
    System.out.println(array[i]); // Выведет false false false false ... false
}
````

#### Массив символов:

````
char[] array = new char[10];

for (int i = 0; i < array.length; i++) {
System.out.println(array[i]); // Выведет \u0000 \u0000 \u0000 \u0000 ... \u0000
}
````

### Удаление элементов массива

Элементы массива можно удалить с помощью цикла for.

````
for (int i = 0; i < array.length; i++) {
    if (array[i] == 10) {
        array[i] = 0;
    }
}
````

Этот код удалит все элементы массива, равные 10.

### Вот несколько советов по использованию массивов:

- Используйте массивы, когда вам нужно хранить большое количество данных одного типа.
- Используйте цикл for, чтобы получить доступ к каждому элементу массива.

## Алгоритмы массивов:

- Bubble Sort
- Binary search

### Bubble Sort

Метод сортировки пузырьком - это простой алгоритм сортировки, который работает путем сравнения соседних элементов
массива и обмена их местами, если они находятся в неправильном порядке. Этот процесс повторяется до тех пор, пока все
элементы массива не будут отсортированы.

### Binary search

Бинарный поиск - это алгоритм сортировки, который работает путем последовательного уменьшения области поиска. Алгоритм
начинается с середины массива и сравнивает целевое значение с элементом в середине. Если целевое значение меньше
элемента в середине, область поиска сужается до левой половины массива. Если целевое значение больше элемента в
середине, область поиска сужается до правой половины массива. Этот процесс повторяется до тех пор, пока целевое значение
не будет найдено или пока область поиска не станет пустой.

