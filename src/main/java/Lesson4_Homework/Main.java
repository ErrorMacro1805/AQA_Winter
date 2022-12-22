package Lesson4_Homework;

import java.util.Scanner;

public class Main {



    public static void main(String[] args) {
       System.out.println("Ведите первое целое число");
        int a = Methods.getNum();
            System.out.println("Ведите первое второе число");
        int b = Methods.getNum();
        System.out.println("Ведите математический оператор действия");
        String operation = Methods.getOperator();

int sum = Methods.getSum(a,b);
int dif = Methods.getDif(a,b);
int mul = Methods.getMultiply(a,b);
int div = Methods.getMultiply(a,b);
int result  = Methods.calc(a, b, operation);

System.out.println("result = "+result);
    }
}

