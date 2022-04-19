package day11_Switch_Scanner;

import java.util.Scanner;

public class ScannerIntro {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        System.out.println("Enter an integer number"); // consolda bunu goruyoruz.

        int num1 = input.nextInt(); // buraya numarayi giriyoruz.Enter.
        System.out.println("Given integer number is: "+num1); // sonra bunu goruyoruz.

        System.out.println("--------------------------------------------------------------------");

        System.out.println("\nEnter a decimal number");

        double num2 = input.nextDouble();
        System.out.println("Given decimal number is: "+num2);

       // input.close(); // BU ARKADAS SCANNER MEVZUSUNU KAPATIYOR.






    }
}
