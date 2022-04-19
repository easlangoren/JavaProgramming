package day08_IfStatement;

public class SingleIfStatementsInfo {
    public static void main(String[] args) {

        int number = 301;

        boolean evenNumber = number %2 ==0;

        /*boolean oddNumber = number%2 !=0;
         Bu da olusturmak istersen oddNumber variable. 1,3,5,7,9 kalabilir geriye. OYuzden !=0 a diyerek geresinin hepsinin tek sayi oldugunu anlamis ol diyoruz.
//      ama ozaman ikinci if statemen icerisini de oddNumber olarak degistirmelisn.*/

        if (evenNumber) {

            System.out.println(number + " is an even number."); // number variable assign etmelisin !

        }

        if (!evenNumber){  // ! opposite operator vererek evenNumber variable i false ise bunu print et demis olduk.
            System.out.println(number+ " is an odd number.");
        }

        System.out.println("-------------------------------------------------------------");

        int n = -56;

        if (n < 0){
            System.out.println(n+ " is a negative number.");

        }

        if (n>0){
            System.out.println(n + " is a positive number");

        }

        if (n==0){

            System.out.println(n+" is zero");

        }





       /* System.out.println("Odd Number");
        System.out.println("Even Number")

        */








    }
}
