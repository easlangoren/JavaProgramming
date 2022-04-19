package day15_ForLoop;

import java.util.Scanner;

public class MaximumNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int max =  -2147483648; // any entered number will be greater than -2147483648

        for (int i = 0; i <5 ; i++) {
            System.out.println("Enter a number:");
            int num =sc.nextInt(); // burda yeni variable olusturdu. 1

            if(num>max){ // yani diyoruz ki, verilen numara yukardaki int max ten buyukse(ki buyuk) onu re-assign etmis oluyoruz.Ve kucuk girilse bile en buyuk girilen orda kalmis oluyor.
                max =num;
            }

        }

        System.out.println("max = " + max);






    }


}
