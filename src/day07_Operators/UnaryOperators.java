package day07_Operators;

public class UnaryOperators {
    public static void main(String[] args) {

        int num1 = +25;
        int num2 = -25;

        System.out.println( num1 < 0); // false will be printed
        System.out.println( num2 < 0); // true will be printed

        System.out.println("---------------------------------------");

        int a = 5;
        ++a; // pre increment : increase the value by 1 right away(hemen)
        System.out.println(a);

        --a; // pre decrement : decreases the value by 1 right away (hemen)
        System.out.println(a); // bunlari sout icerisnde de yazablirsn (--a); gibi
        System.out.println("---------------------------------------");

        int b = 100;

        System.out.println(++b); // pre increment: increases the value by 1 right away

        int c = 150;

        System.out.println(c++); // post increment : fist passes the current value, then increases the value by 1 in the next one ! Still 150
        System.out.println(c); // 151

        System.out.println("---------------------------------------");

        int x = 200;
        System.out.println(--x); //pre decrement: decreases the value by 1 right away, so will be 199 !

        int y = 200;
        System.out.println( y--); // post decrement, will still be 200
        System.out.println(y); // 199

        System.out.println("---------------------------------------");

        int z = 200;
        System.out.println(z++);
        System.out.println(z--);
        System.out.println(z);

        int g = 45;
        System.out.println( ++g);
        System.out.println(g++);
        System.out.println(g);

















    }


}
