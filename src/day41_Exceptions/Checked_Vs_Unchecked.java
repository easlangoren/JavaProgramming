package day41_Exceptions;


import day39_Recap.cydeoTask.Person;

import java.io.FileInputStream;

public class Checked_Vs_Unchecked {
    public static void main(String[] args) {

        int a = 10;
        int b = 0;


       // System.out.println(a / b); // ArithmeticExceptions

        char[] characters = {'A','B','C'};
        //                    0,  1,  2

       // System.out.println(characters[99]); // indexOutOfBoundException

       // Person person1 = null;
        //System.out.println(person1.getName()); // NullPointerException


        String str = "Wooden Spoon";

        //str = null;

        String str2= "    "; //String neatural

        System.out.println(str2.isEmpty());







        // checked Exceptions:

        System.out.println("Hello");

        //Thread.sleep(3000);

        System.out.println("Cydeo");


        //FileInputStream file = new FileInputStream("path of the file");












    }
}
