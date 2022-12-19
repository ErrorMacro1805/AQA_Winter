package Lesson3_Homework;
//Создайте 2 массива из 5 случайных целых чисел из отрезка [0;5] каждый,
//выведите массивы на экран в двух отдельных строках.
//Посчитайте среднее арифметическое элементов каждого массива и сообщите,
//для какого из массивов это значение оказалось больше
//(либо сообщите, что их средние арифметические равны).

public class Task_7 {
    public static void main(String[] args) {
        int[] array1 = {0, 2, 2, 5, 1};
        int[] array2 = {4, 1, 0, 0, 3};
        for (int i = 0; i < array1.length; i++) {
            System.out.print(" " + array1[i]);

        }
        System.out.println();
        for (int i = 0; i < array2.length; i++) {
            System.out.print(" " + array2[i]);
        }
System.out.println();

        int avg1 = 0;
        int avg2 = 0;

        for (int i = 0; i < array1.length; i++) {
            avg1 += array1[i];
        }
        for (int i = 0; i < array2.length; i++) {
            avg2 += array2[i];
        }
        avg1 /= 5;
        avg2 /= 5;
        if (avg1 > avg2) {
            System.out.println("Среднеарифметическое первого массива больше второго");
        }
        if (avg1 < avg2) {
            System.out.println("Среднеарифметическое первого массива меньше второго");
        }
        if (avg1 == avg2) {
            System.out.println("Среднеарифметическое первого массива и второго равны");
        }
    }
}

