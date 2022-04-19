package day07_Operators;

public class LogicalOperators {
    public static void main(String[] args) {

        String name = "Steven";
        int age = 19;
        String citizen = "USA";

        boolean isEligible = age >= 18 && citizen == "USA";

        System.out.println(name+ " is eligible to vote: " + isEligible);

        System.out.println("------------------------------------------------------------------");

        String name2 = "Josh";

        int creditScore = 720;
        int age2 = 23;
        int income = 23000;

        boolean isEligible2 = creditScore >= 700 && age2 >= 21 && income >= 35000;


        System.out.println(name2+ "is eligible to apply for the loan: " + isEligible2);

        System.out.println("------------------------------------------------------------------");

        String name3 = "Shay";
        int age3 = 11;
        char gender = 'M';

        boolean isEligible3 = age3 >= 18 && (gender == 'F' || gender == 'M');

        System.out.println(name3+ " is eligible: "+ isEligible3);

        System.out.println("------------------------------------------------------------------");

        String name4 = "James";
        String countryOfBirth = "USA";

        boolean marriedToUSCitizen = false;

        boolean isEligible4 = countryOfBirth == "USA" || marriedToUSCitizen == true;

        System.out.println("isEligible4 = " + isEligible4);

        System.out.println("------------------------------------------------------------------");


        boolean result2 = true;
        System.out.println("result2 = " + result2);

        boolean result3 = !result2;
        System.out.println("result3 = " + result3);


        System.out.println("------------------------------------------------------------------");

        int score = 56;
        boolean passed = score >= 60;
        boolean failed = !passed;  // wow nice iki saat bidaha failed variable icin score <=60 yazmamiza gerek yok yani

        System.out.println("score = " + score);
        System.out.println("passed = " + passed);
        System.out.println("failed = " + failed);












    }


}
