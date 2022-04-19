package day12_Scanner;

import java.util.Scanner;

public class NextLinePractice {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your age");
        int age = scan.nextInt();
        scan.nextLine();

        System.out.println("Enter your  name");
        String name = scan.next();
        scan.nextLine(); // bunu vermeliyiz ki Scannerdaki Enter i alsin. yoksa school name yazamayiz.

        System.out.println("Enter your school name");
        String school = scan.nextLine();


        System.out.println("age = " + age);
        System.out.println("name = " + name);

        scan.close();









    }
}

/*
1- enter age
2- enter full name
 */