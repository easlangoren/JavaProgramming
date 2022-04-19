package day18_NestedLoop;

import java.util.Scanner;

public class OddOrEven {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);



       while (true){

           System.out.println("Enter a number");
           int num = sc.nextInt();

        if (num % 2 == 0) {
            System.out.println(num + " is even number");
        } else {
            System.out.println(num + " is odd number");
        }

        System.out.println("Would you like to enter another number?");
        String a = sc.next().toLowerCase();

        while (!(a.equals("yes") || a.equals("no"))) { // if the answer is invalid (not yes or no)
            System.err.println("Please re enter, Would you like to enter another number?");
            a = sc.next().toLowerCase();
        }

        if (a.equals("no")) {
            break;
        }

    }




}

}