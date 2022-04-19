package day17_While_DoWhile;

import java.util.Scanner;

public class BranchingStatements {
    public static void main(String[] args) {


        for (char i= 'A'; i<= 'Z' ; i++){
            System.out.print(i+" ");
           if (i == 'F'){
               break; // exist the loop NOT printing the F
           }


        }

        System.out.println();

        System.out.println("-------------------------------------");

        Scanner sc = new Scanner(System.in);

        while (true){
            System.out.println("Enter a number:");
            int num = sc.nextInt();

        if (num<0){ // negatif oldugunda loopu durdur demek, aksi halde hep numara yazabilcez.
            break;
        }

        }






    }
}
