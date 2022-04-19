package day15_ForLoop;

import java.util.Scanner;

public class SumOfNumbers {
    public static void main(String[] args) {

        int sum = 0;

        for (int i = 0; i < 101 ; i++) { // i: 1,2,3,4,5,6,7.... 100

            sum += i;
        }
        System.out.print(sum);

        System.out.println("----------------------------------------");


        Scanner sc = new Scanner(System.in);

        int total = 0;

        for (int i = 0; i<5 ; i++) {
            System.out.println("Enter a number");
            total +=sc.nextInt();
        }

        System.out.println("total = " + total);


        sc.close();







    }
}
