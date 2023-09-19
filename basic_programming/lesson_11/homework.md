<details style="margin-top: 16px">
  <summary style="cursor: pointer; color: blue;"><b>English</b></summary>

## Task 1

**Find the maximum element in the array**
Create an array of 12 random integers ranging from `-15` to `15`. Determine which element is the maximum in this array
and report the index of its last occurrence in the array.

## Task 2

**Replace every array element with an odd index with zero.**

1. Create an array of 8 random integers ranging from `-3` to `10`
2. Display the array on the screen in a line
3. Replace every element with an odd index with zero
4. Again, display the array on the screen on a separate line

## Task 3 *

**Arithmetic mean of array elements**

1. Create 2 arrays of 5 random integers each, ranging from `0` to `5`
2. Display the arrays on the screen in two separate lines
3. Calculate the arithmetic mean of the elements of each array and report which array has a higher value (or report that
   their arithmetic means are equal)

</details>

<hr>

<details style="margin-top: 16px">
  <summary style="cursor: pointer; color: blue;"><b>На русском</b></summary>

## Задача 1

**Найти максимальный элемент в массиве**

Создайте массив из 12 случайных целых чисел из отрезка от `-15` до `15`. Определите какой элемент является в этом
массиве максимальным и сообщите индекс его последнего вхождения в массив.

<!---
https://vertex-academy.com/tutorials/ru/najti-maksimalmyj-element-v-massive-iz-sgenerirovannyh-chisel-java/
public static void main(String[] args) {
        int [] mas = new int[12];
        int maxNumber = -16;
        int maxIndex = 0;
 
        for (int i = 0; i < mas.length; i++) {
            mas[i] = (int)(Math.random()*31)-15;
            if(maxNumber <= mas[i]){
                maxNumber = mas[i];
                maxIndex = i;
            }
        }
        
        System.out.println("Индекс максимального элемента: " + maxIndex);
    }
-->

## Задача 2

**Заменить каждый элемент массива с нечетным индексом на ноль.**

1. Создайте массив из 8 случайных целых чисел из отрезка от `-3` до `10`
2. Выведите массив на экран в строку
3. Замените каждый элемент с нечётным индексом на ноль
4. Снова выведете массив на экран на отдельной строке

<!--
https://vertex-academy.com/tutorials/ru/zamenit-element-massiva-s-nechetnym-indeksom-na-nol-java/
public class Test {
    public static void main(String[] args) {
        int [] mas = new int[8];
       
        for (int i = 0; i < mas.length; i++) {
             mas[i] = (int)(Math.random()*10)+1;
        }
        System.out.println(Arrays.toString(mas));
        for (int i = 0; i < mas.length; i++) {
            if(i%2 == 1){
                mas[i] = 0;
            }
        }
        System.out.println(Arrays.toString(mas));
    }
}
-->

## Задача 3 *

**Среднее арифметическое элементов массива**

1. Создайте 2 массива из 5 случайных целых чисел из отрезка от `0` до `5` каждый
2. Выведите массивы на экран в двух отдельных строках
3. Посчитайте среднее арифметическое элементов каждого массива и сообщите, для какого из массивов это значение оказалось
   больше (либо сообщите, что их средние арифметические равны)

<!--- 
https://vertex-academy.com/tutorials/ru/srednee-arifmeticheskoe-elementov-massiva-java/
public static void main(String[] args) {
        int [] mas1 = new int[5];
        int [] mas2 = new int[5];
 
        for (int i = 0; i < 5; i++) {
            mas1[i] = (int)(Math.random()*6);
            mas2[i] = (int)(Math.random()*6);
        }
        System.out.println(Arrays.toString(mas1));
        System.out.println(Arrays.toString(mas2));
        
        double average1 = 0;
        double average2 = 0;
 
        for (int i = 0; i < 5; i++) {
            average1 += mas1[i];
            average2 += mas2[i];
        }
        average1/=5;
        average2/=5;
 
        if(average1 > average1){
            System.out.println("Среднее арифметическое первого массива ("+average1+") больше среднего арифметического "+
                    "второго массива ("+average2+")");
        } else if(average1 < average2){
            System.out.println("Среднее арифметическое первого массива ("+average1+") меньше среднего арифметического "+
                    "второго массива ("+average2+")");
        } else {
            System.out.println("Средние арифметические массивов равны ("+average1+")");
        }
    }
-->

</details>
