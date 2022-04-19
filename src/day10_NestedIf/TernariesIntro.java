package day10_NestedIf;

public class TernariesIntro {
    public static void main(String[] args) {


        int n = 100;

        if (n % 2 == 0) {
            System.out.println("Even"); //String
        } else {
            System.out.println("Odd"); // String
        }

        System.out.println("-------------------------------------------");

        String result1 = (n % 2 == 0) ? "Even" : "Odd";

        System.out.println(result1);

        System.out.println("-------------------------------------------");

      /*  int age  = 23;

        if (age >=21){
            System.out.println("Eligible"); // String
        }

        else {
            System.out.println("Not eligible"); // String
        }

       */

        int age = 44;

        System.out.println((age >= 24) ? "Eligible" : "Not eligible"); // VAAY if statemetnler print icerisinde yazilabildi.

        String result = (age >= 24) ? "Eligible" : "Not eligible";
        System.out.println(result);

        System.out.println("-------------------------------------------");

        int number =1;

        String result2 = (number>0)? "Positive":(number<0)? "Negative" :"Zero";
        System.out.println(result2);


        System.out.println("-------------------------------------------");







    }
}