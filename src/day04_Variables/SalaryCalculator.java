package day04_Variables;

public class SalaryCalculator {
    public static void main(String[] args) {
        // hourlyRate, weeklyHour

        int hourlyRate = 65;
        int weeklyHour = 45;
        int numberOfWeeks = 52;

        int salary = hourlyRate * weeklyHour * numberOfWeeks;

        /*
        System.out.println(salary);
        if you put double quote "" into the println using variable, it WONT print the variable.
        It will print a text..
        shortcut is soutv
        */

        System.out.println("hourlyRate = $" + hourlyRate); // for the dollar sign, we should use this soutv shortcut
        System.out.println("weeklyHour = " + weeklyHour);
        System.out.println("numberOfWeeks = " + numberOfWeeks);
        System.out.println("salary = $" + salary);


    }






}
