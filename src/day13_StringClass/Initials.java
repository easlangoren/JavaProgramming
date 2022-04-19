package day13_StringClass;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Initials {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your first name:");
        String firstName = scan.next();


        System.out.println("Enter yout last name:");
        String lastName = scan.next();

        char a = firstName.charAt(0);
        char b = lastName.charAt(0);

        String initials = ""+a+b; //bak burda bir string boslugu verdi congetination icin. As soon as a String involve its a concatenation.

        System.out.println("initials = " + initials);













    }
}
