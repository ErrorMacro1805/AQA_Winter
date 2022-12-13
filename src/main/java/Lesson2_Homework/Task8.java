package Lesson2_Homework;
//Задача 8.
//Если x любое число,
//если оно как минимум трехзначное и положительное,
//уменьшает его на 1 и выводит на экран.

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int x = scanner.nextInt();
        if (x >=100 && x < 1000){
            --x;
        System.out.println(x);}

        else if (x < 100|| x>= 1000){
        System.out.println("введите трехзначное число");}
}
}
