package Lesson2_Homework;
//Задача 4.
//Если x любое положительное двузначное число
//Выведите на екран его в «полном виде»: например,
//для числа 34 это будет выглядеть как 30+4.

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        if (x > 9 && x < 100){
            System.out.println(x/10 + " + " + (x%10));
        }
        else if (x <= 9|| x>= 100){
            System.out.println("введите двухзначное число");
        }
    }
}
