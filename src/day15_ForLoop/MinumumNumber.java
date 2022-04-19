package day15_ForLoop;

import java.util.Scanner;

public class MinumumNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int min =  2147483647;

        for (int i = 5; i >0 ; i--) {
            System.out.println("Enter a number:");
            int num =sc.nextInt();

            if (min>num){
                min = num;
            }

        }
        System.out.println("minimum number is = " + min);





    }
}
