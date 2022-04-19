package day17_While_DoWhile;

import java.util.Scanner;

public class Proposal {
    public static void main(String[] args) {

        Scanner sc =new Scanner(System.in);

        System.out.println("Will you marry me?");
        String answer = sc.next();

        while (! (answer.equalsIgnoreCase("yes")||answer.equalsIgnoreCase("no"))){
            System.err.println("Invalid message, re-enter");
            answer=sc.next();
        }
        if (answer.equalsIgnoreCase("Yes")){
            System.out.println("Congrats.");
        }else
        {
            System.out.println("Goodbye");
        }










    }
}
