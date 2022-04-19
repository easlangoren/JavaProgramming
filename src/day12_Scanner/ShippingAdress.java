package day12_Scanner;

import java.util.Scanner;

public class ShippingAdress {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your full name");
        String fullName = scan.nextLine();

        System.out.println("Enter your building number");
        String apt = scan.next();
        scan.nextLine();

        System.out.println("Enter the street name");
        String street = scan.nextLine();

        System.out.println("Enter City name");
        String city = scan.nextLine();

        System.out.println("enter your state");
        String state = scan.next();
        scan.nextLine();

        System.out.println("enter your zip code");
        String zip = scan.next();


        System.out.println("Shipping address is:\n"+apt+" "+street+"\n"+city+" "+state+"\n"+zip);


        scan.close();



    }
}

/*
Enter yourr full name
enter building number
enter your street name
enter city name
enter your state
enter your zip code

display the shipping adress
 */

