package Lesson3_Homework;
//Задача 2.
//Создайте массив из всех нечётных чисел от 1 до 99,
//выведите его на экран в строку, а затем этот же массив выведите на экран тоже в строку,
//но в обратном порядке (99 97 95 93 … 7 5 3 1).

public class Task_6 {
    public static void main(String[] args) {
        int[] array = new int[51];
        int value1 = 1;
        int value2 =99;
        for (int i = 1; i < array.length; i++) {
            array[i] = value1;
            value1 += 2;
            System.out.print(" " + array[i]);

        }
        System.out.println();
        for (int i = array.length-1; i != 0; i--) {
            array[i] = value2;
            value2 -= 2;
            System.out.print(" " + array[i]);
        }
    }
}
