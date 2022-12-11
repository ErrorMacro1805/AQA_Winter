public class MainClass {

    public static void main (String[] args){
char ch ='c';
        byte b=-10;
        short s = 0;
        int i =10;
        long l = 100L;
        float f = 3.14F;
        double d = 2.85;
        boolean bl = true;
        float q = (float) (d*f);

        System.out.println("char c"+"="+ch);

    System.out.println("byte b"+"="+b +" "+ "short s"+"="+s+" "+"int i"+"="+i );

    System.out.println("long l"+"="+l +" "+ "float f"+"="+f+" "+"double d"+"="+d );

    System.out.println("И наконец boolean у меня равно "+bl);

    System.out.println(i+b);

    System.out.println(l-s);

    System.out.println(q);

    System.out.println(q/f);

    System.out.println(l%b);



    }
}
