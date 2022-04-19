package day10_NestedIf;

public class NestedIfIntro {
    public static void main(String[] args) {

        int score = 76;
        // if score is valid
        if (score >= 0 && score <= 100) {// kapsayan kume gibi dusun Nested if. PRE_CONDITON.

            if (score >= 60) {
                System.out.println("Passed");

            } else {
                System.out.println("Failed");
            }


            // This else is belong to nested if
        } else { //if score is not valid
            System.out.println("Invalid Score");
        }

        System.out.println("----------------------------------------------");

        int age = 19;
        boolean hadId = true;

        if (hadId) { //if the person has ID
            if (age >= 21) {
                System.out.println("Eligible to buy alcohol");
            } else {
                System.out.println("Not eligible to buy alcohol");
            }
        } else { // if the person has NO ID.
            System.out.println("ID must be shown. Cannot buy alcohol.");
        }

        System.out.println("----------------------------------------------");

        int number = 7;
        String days ="";

        if (number >= 1 && number <= 7) { // if the number is valid.

            if (number == 1) {
                days = "Monday";
            } else if (number == 2) {
                days = "Tuesday";
            } else if (number == 3) {
                days = "Wednesday";
            } else if (number == 4) {
                days = "Thursday";
            } else if (number == 5) {
                days = "Friday";
            } else if (number == 6) {
                days = "Saturday";
            } else {
                days = "Sunday";


                // Nested if icerisnde ki if lerin print statementleri nested if icerisnde verilmeli.


            }
        } else { // if the number is not valid.
            System.out.println("Given number is not representing the week days.");
            System.out.println(days);

        }


    }
}
