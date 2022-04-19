package day18_NestedLoop;

import java.util.Scanner;

public class NestedLoopPractice {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Enter your age:");
            int age = sc.nextInt();

            while (!(age >= 1 && age <= 120)) { //while the age is invalid
                System.err.println("invalid Entry , Please re enter your age");
                age = sc.nextInt();

            }
            System.out.println("Would you like to continue?");
            String a = sc.next().toLowerCase();

            while (!(a.equals("yes") || a.equals("no"))) { //while the answer is invalid
                System.err.println("Invalid Entry, Please re enter. Would you like to continue?");
                a = sc.next().toLowerCase();
            }

            if (a.equals("no")) {
                break;

            }


        }
sc.close();




    }
}
