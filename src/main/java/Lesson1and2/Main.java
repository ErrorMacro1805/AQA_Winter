package Lesson1and2;

public class Main {
    int rate =3;
    public boolean ifServiceIsGood (int rate){
        if (rate >= 3) {
            return true;
        }
        if (rate < 3) {

            return false;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}