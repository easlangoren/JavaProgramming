package day12_Scanner;

import java.util.Scanner;

public class ScannerPractice2 {
    public static void main(String[] args) {

        Scanner practice = new Scanner(System.in);

       // System.out.println("Enter true or false");
       // boolean result = practice.nextBoolean(); // it expect only true or false keybords. No expressions.

        System.out.println("Enter you name: ");
        String name = practice.next(); // bosluk birakamiyoruz. Ne zaman ki inputa bisey yazarken bosluk biraktik. Sadece ilk kelimeli algiliyor.

        System.out.println("name = " + name);

        practice.close();











    }
}
