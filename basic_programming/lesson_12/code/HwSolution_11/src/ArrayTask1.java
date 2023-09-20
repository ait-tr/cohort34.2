/**
 * @author Andrej Reutow
 * created on 19.09.2023
 * <p>
 * Создайте массив из 12 случайных целых чисел из отрезка от `-15` до `15`. Определите какой элемент является в этом
 * массиве максимальным и сообщите индекс его последнего вхождения в массив.
 */
public class ArrayTask1 {

    public static void main(String[] args) {
        int[] mas = {15, -1, 5, 8, 10, -13, -9, 8, 7, 10, -2,  -3};
        int maxNumber = -16;
        int maxIndex = 0;

        for (int i = 0; i < mas.length; i++) {
            mas[i] = (int) (Math.random() * 31) - 15;
            if (maxNumber <= mas[i]) {
                maxNumber = mas[i];
                maxIndex = i;
            }
        }

        System.out.println("Индекс максимального элемента: " + maxIndex);
    }
}
