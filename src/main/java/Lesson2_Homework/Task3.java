package Lesson2_Homework;
//Если x любое положительное двузначное число
//Выведите на екран его десятки и еденицы (2 числа)
//разделенные знаком «пробел», но в обратном порядке.
//То есть для числа 45 будет выведено на экран 5 4.

import java.util.Scanner;

public class Task3 {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        if (x > 9 && x < 100){
            System.out.println(x%10 + " " + (x / 10));
        }
    else if (x <= 9|| x>= 100){
            System.out.println("введите двухзначное число");
        }
    }
}