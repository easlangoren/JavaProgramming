package day11_Switch_Scanner;

public class Grade2 {

    public static void main(String[] args) {

        char ch = 'D';
        String result = "";
        //  ||
        switch (ch){

            case 'A': case 'B': case 'C': case 'D':
                result = "Passed"; // passlari ayri gruplandirdi
                break;

            case 'F':
                result = "Failed";
                break; // faili ayri gruplandirdi

            default:
                result = "Invalid"; //bu da invalid dedi.

        }

        System.out.println(result);


    }

}
/*
    if the grade is A or B or C or D =====>"Passed"
    otherwise ==> "Failed"

 */