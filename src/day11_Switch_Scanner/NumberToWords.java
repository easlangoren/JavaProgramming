package day11_Switch_Scanner;

public class NumberToWords {
    public static void main(String[] args) {

        int number = 88;


     String result =   (number>=0 && number<=9)? // yine de okumasi kolay olmayacak oyuzden nested if seklinde  yazmak daha uygun

             (number==1)?"Alfa" :(number==2)?"Bravo" :(number==3)? "Charlie"

             :(number==4)?"Delta" :(number==5)?"Echo" :(number==6)? "Foxtrot" :(number==7)?"Golf"

             :(number==8)?"Hotel" : "India"  :("Given number is invalid");

        System.out.println(result);






    }
}

/*
Write a program that can convert numbers 0~9 to words.

		NOTE: MUST use ternary
 */