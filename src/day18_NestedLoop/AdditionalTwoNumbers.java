package day18_NestedLoop;

import java.util.Scanner;

public class AdditionalTwoNumbers {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


       while(true) {
           System.out.println("Enter your first number");
           int num1 = sc.nextInt();

           System.out.println("Enter your second number");
           int num2 = sc.nextInt();

           System.out.println("Addition: " + (num1 + num2));

           System.out.println("Would you like to continue?");
           String a = sc.next().toLowerCase();

           while (!(a.equals("yes")||a.equals("no"))){
               System.err.println("Invalid Entry, Please re-enter");
               a= sc.next().toLowerCase();
           }

           if (a.equals("no")){
               break;
           }
       }












    }
}
