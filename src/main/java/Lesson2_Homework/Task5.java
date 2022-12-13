package Lesson2_Homework;
//Задача 5.
//Назовем весом числа сумму его цифр.
//Если x любое положительное двузначное число
//Выведите на екран его «вес».

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        if (x > 9 && x < 100){
            System.out.println("Десяток числа "+ (x/10) + " и "+ "единица числа "+(x%10)+" в сумме дают "+((x/10)+((x%10))));
        }
        else if (x <= 9|| x>= 100){
            System.out.println("введите двухзначное число");
        }
    }
}
