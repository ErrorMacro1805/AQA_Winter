package Lesson4;

import java.util.Scanner;

public class Main {



    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        String operation = scanner.next();

int sum = Methods.getSum(a,b);
int dif = Methods.getDif(a,b);
int mul = Methods.getMultiply(a,b);
int result  = calc(a, b, operation);

System.out.println("result = "+result);


    }

    public static int calc (int x, int y, String operator){
        switch (operator){
            case "+":
                return  Methods.getSum(x, y);
            case"-":
                return Methods.getDif(x, y);
            case "*":
                return Methods.getMultiply(x,y);
            default:
                return 0;
        }

    }


}

