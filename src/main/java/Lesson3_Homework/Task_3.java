package Lesson3_Homework;
//Задача 3.
//Создайте программу, вычисляющую факториал натурального числа n,
//которое пользователь введёт с клавиатуры.
//https://javarush.ru/groups/posts/klass-scanner
//Факториал числа n — это произведение натуральных чисел от 1 до n.
//Обозначается n, произносится «эн-факториал».Например !3 = 1*2*3

import java.util.Scanner;

public class Task_3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int result = 1;
        for (int i = 2; i <= x; i++){
            result *= i;}
        System.out.println(result);

if (x==1 || x<=0){
    System.out.println("Ведите положительное число, больше 1");
}
    }
}
