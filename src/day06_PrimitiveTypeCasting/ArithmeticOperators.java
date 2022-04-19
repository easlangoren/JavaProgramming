package day06_PrimitiveTypeCasting;

public class ArithmeticOperators {
    public static void main(String[] args) {

        System.out.println("12" + 1); // 121, concatenation

        System.out.println(10 + 20); // 30, Addition
        System.out.println(100-50); //50, Subtraction
        System.out.println(10*7); // 70, Multiplication

        System.out.println(100/3); //33
        System.out.println(10.0/4); //2.5
        System.out.println(10/4.0); //2.5
        System.out.println(10d/4); //2.5

        int a = 100;
        double b = a/6; //16.0   a/6d yaparsan 16.66666... olur yine
        System.out.println(b);

        double c= a/6.0;  //16.66666...
        System.out.println(c);
        //double c = (double)a/6; this one will be as 16.66666... too. Same result.
        // so, the point is the put decimal number in one of the parts of equation.

        System.out.println(45 % 8);









 /*
 + : Addition
 - : Subtraction
 * : Multiplication
 / : Division
            in math: 10/4 = 2.5
            in Java: 10/4 = 2
            You should give the number at least one number as decimal as 10.0 or 4.0 if you want decimal number.


              integer / integer ====> integer
              decimal / integer ====> decimal
              integer / decimal ====> decimal
              decimal / decimal ====> decimal

 % : Remainder
  */




    }


}
