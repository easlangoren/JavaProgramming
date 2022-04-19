package day08_IfStatement;

public class SwapTwoVariables_WithTemporaryVariable {
    public static void main(String[] args) {


        int a = 10;
        int b = 15;
        //----------------------------------
        int c = b; // c = 15;    THIS IS A TEMPORARY VARIABLE

        b = a; // b = 10;
        a = c;



        //-----------------------------------

        System.out.println("b = " + b);
        System.out.println("a = " + a);













    }
}
