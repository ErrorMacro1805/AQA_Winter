package Lesson2_Homework;
//Задача 7.
//Если x любое число,выведите на экран одно из следующих сообщений:
//Положительное, или Отрицательное, или Ноль, -в зависимости от значения числа.

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        if (x>0){
            System.out.println("число положительное");}

            else if (x==0){
            System.out.println("число равно нулю");}

            else if (x<0){
            System.out.println("число отрицательное");}
    }
}
// не знаю, как ввывести нецелое число в консоль