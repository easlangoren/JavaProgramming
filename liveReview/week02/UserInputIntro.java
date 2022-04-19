package week02;

import java.sql.SQLOutput;
import java.util.Scanner;

public class UserInputIntro {
    public static void main(String[] args) {

        String name = ""; //hard coded way

        //output goes to console --- print or println
        System.out.println("Output");

        //How can I recieve input for my JAVA class

        // 1. Create your scanner object (object name can be anything)

        Scanner input = new Scanner(System.in); // you dont' see anything

        // 2. prompt the user for putting input

        System.out.println("Put your name : ");

        // 3. get the input

        name = input.next(); // reads the date from the console

        // 4. use the value that I read

        System.out.println("name = " + name);









    }


}
