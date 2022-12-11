package Lesson2_Homework;

import java.util.Scanner;

//Задача 1.
//Во многих странах для измерения небольших размеров используется не только
//единица длины «сантиметр», но и такая единица,
//как «дюйм» (1 дюйм = 2.54 сантиметра).
//Выведите в консоль 10 см,равное размеру в дюймах,
//и затем 25 дюймов,но в сантиметрах.
public class Task1 {

public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

double razmer = scanner.nextInt();

if (razmer==10){
System.out.println("10 sm в дюймах "+razmer*2.54);}

    if (razmer==25){
 System.out.println("25 inch в сантиметрах "+razmer/2.54);}
 else if (razmer!=10 ||razmer!=25){
        System.out.println("Условие задачи не выполняються");
    }
}
}
