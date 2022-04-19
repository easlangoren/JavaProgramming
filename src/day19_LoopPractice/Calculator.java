package day19_LoopPractice;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a numner");
        int num1 = sc.nextInt();

        System.out.println("Enter a math operator:");
        char operator = sc.next().charAt(0);


        if (!(operator=='+')|| (operator=='-')){
            System.err.println("Invalid math operator: "+operator);

        }


        System.out.println("Enter a number");
        int num2 = sc.nextInt();

        if (operator == '-'){
            System.out.println(num1-num2);
        }else {
            System.out.println(num1 + num2);
        }














    }
}
