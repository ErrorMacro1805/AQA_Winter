package Lesson2_Homework;
//Задача 9.
//Если x любое положительное двузначное число выведите на экран что больше:
//само это число или произведение его цифр.

import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        if (x > 9 && x < 100) {
            if (x>((x/10)*(x%10))){
                System.out.println(x);}
            else if (x<((x/10)*(x%10))){
                System.out.println("произведение цифр числа = "+((x/10)*(x%10)));}
        }

        else if (x <= 9|| x>= 100){
            System.out.println("введите двухзначное число");}

    }
}