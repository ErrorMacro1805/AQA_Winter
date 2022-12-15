package Lesson3_Homework;
//Задача 1.
//Создайте массив из всех чётных чисел от 2 до 20 и выведите элементы массива на экран сначала в строку,
//отделяя один элемент от другого пробелом, а затем в столбик (отделяя один элемент от другого началом новой строки).
//Перед созданием массива подумайте, какого он будет размера.
//2 4 6 … 18 20
//2
//4
//6
//…
//20

public class Task_5 {
    public static void main(String[] args) {
        int[] array = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20};
        for (int i = 0; i < array.length; i++) {
            System.out.print(" "+ array[i]);}
        System.out.println();
        for (int i = 0; i < array.length; i++){
            System.out.println( array[i]);

        }
    }
}