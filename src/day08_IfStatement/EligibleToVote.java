package day08_IfStatement;

public class EligibleToVote {
    public static void main(String[] args) {

        String name = "Josh";
        int age = 15;
        String citizen = "USA";

        boolean isEligible = age >= 21 && citizen == "USA"; // variablelara yeni bir variable altinda toplamayi unutuyosun!

        // Eligible
        if (isEligible){

            System.out.println(name+" is elegible to vote");

        }

        //Not eligible
        if (!isEligible){

            System.out.println(name+" is not eligible to vote");

        }





    }


}
