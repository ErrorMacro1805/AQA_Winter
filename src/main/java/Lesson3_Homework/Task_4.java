package Lesson3_Homework;
//Задача 4.
//Для введённого пользователем с клавиатуры натурального числа посчитайте сумму всех его цифр
//(заранее не известно сколько цифр будет в числе).

import java.util.Scanner;

public class Task_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int x = scanner.nextInt();
        int summa = 0;
        while (x !=0) {
            summa += x % 10;
            x = x / 10;}
        System.out.println(summa);



    }

}