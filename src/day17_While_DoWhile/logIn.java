package day17_While_DoWhile;

import java.util.Scanner;

public class logIn {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your username:");
        String u = sc.next();

        System.out.println("Enter your password:");
        String p = sc.next();

        if (u.equals("Cydeo")&& p.equals("Cydeo123")){
            System.out.println("logged in");
        } else {
            int attempts =3;
            while (!(u.equals("Cydeo") && p.equals("Cydeo123")) && attempts>0 )// while the credentials are invalid, and user still have attempts.
            {if(attempts==1){
                System.out.println("THIS IS YOUR LAST CHANCE");
            }
                System.out.println("Incorrect username or password, please re-enter");
                System.out.println("Enter your username:");
                u=sc.next();

                System.out.println("Enter your password:");
                p= sc.next();
                attempts--; // 3 hakkin bitmesi burda oluyor. ve while icinde >0 vererek yukarda attempt 3 dedigimiz icin 3 hak vermis oluyoruz.

            }
            if (u.equals("Cydeo")&& p.equals("Cydeo123")){
                System.out.println("logged in");
            } else {
                System.out.println("Your account is locked.");
            }







        }











    }

}