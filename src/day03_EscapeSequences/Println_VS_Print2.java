package day03_EscapeSequences;

public class Println_VS_Print2 {

    public static void main(String[] args) {


        System.out.println("Knock Knock"); // First it printss knock knock, then it appends a new line (append= ilistirmek)
        System.out.println("Who is this?");
        System.out.println("This is Java");

        System.out.println("-------------------------------");

        System.out.print("Knock Knock"); // prints Knock Knock, does not append new Line
        System.out.print("Who is this?");
        System.out.print("This is Java");// after print, we have to give a println or \n to go new line.
        System.out.println(); // Thats why there is println here.

        System.out.println("-------------------------------");

        System.out.println("Hello everyone, How are you all today? Today we will learn Escape Sequences, and next week we will learn Variables" );

        System.out.println("--------------------------------");

        System.out.print("Hello Everyone, How are you all today? ");
        System.out.print("Today we will learn Escape Sequences, ");
        System.out.print("and next week we will learn Variables ");

// Single Line comment goes here

/*
Topics:
    println method
    print method
    comments
 */





    }


}
