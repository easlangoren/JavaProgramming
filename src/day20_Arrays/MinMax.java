package day20_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class MinMax {
    public static void main(String[] args) {

        int[] numbers = new int[10];
        Scanner sc = new Scanner(System.in);


        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Please enter a number:");
            numbers [i]= sc.nextInt(); // each user entered input will be assigned to the indexes of the arrray numbers.


        }

        int max = numbers[0]; // just an assumption
        int min = numbers[0];

        for (int i = 0; i < numbers.length; i++) {

            if(numbers[i] > max){
                max = numbers[i];
            }
            if (numbers[i] < min){
                min = numbers[i];
            }

        }

        System.out.println("numbers = " + Arrays.toString(numbers));
        System.out.println("min = " + min);
        System.out.println("max = " + max);
















    }
}
