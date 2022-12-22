package Lesson4_Homework;

import java.util.Scanner;

public class Methods {

   public static int getNum() {
       Scanner scanner = new Scanner(System.in);
       int getNum = scanner.nextInt();
       return getNum;
   }
  public static String getOperator (){
      Scanner scanner = new Scanner(System.in);
      String getOperator = scanner.next();
      return getOperator;
  }
    public static int getSum(int x, int y) {
        return x + y;

    }
     public static int getDif(int x, int y){
        return x - y;
   }

     public static int getMultiply(int x, int y){
        return x*y;
   }

     public static int getDivision (int x, int y){
        return x/y;
   }
    public static int calc (int x, int y, String operator){
        switch (operator){
            case "+":
                return  Methods.getSum(x, y);
            case"-":
                return Methods.getDif(x, y);
            case "*":
                return Methods.getMultiply(x,y);
            case "/":
                return Methods.getDivision(x, y);
            default:
                return 0;
        }

    }
}
