package day07_Operators;

public class RelationalOperators {
    public static void main(String[] args) {

        // >, >=, < , <=

        boolean result1 = 200 > 40;  //true
        System.out.println("result1 = " + result1);


        boolean result2 = 150 >= 150; //true
        System.out.println("result2 = " + result2);

        boolean result3 = 25 >= 36;
        System.out.println("result3 = " + result3);

        // credit score of 720

        int creditScore = 745;

        boolean isEligibleForLoan = creditScore >= 720;

        System.out.println("isEligibleForLoan = " + isEligibleForLoan);

        /*
        The thing that we do is checking the eligibilty the loan. Credit scoru adamin  745 mis.
        Sonra boolean isEligibleForLoan diye variable olusturdk ve dedik ki creditScoru 720 ve uzeryse dedik ver krediyi.

        e 749 demistik zaten. Oyuzden boolean bize true cikartti.
         */

        boolean result4 = 100 < 99;
        System.out.println("result4 = " + result4);

        int score = 59;
        boolean hasFailed = score <= 59;

        System.out.println("hasFailed = " + hasFailed);

        boolean result6 = 45 <= 60;
        System.out.println("result6 = " + result6);

        System.out.println("--------------------------------------------------");

        int x = 100;
        int y = 200;

        boolean equal = x==y;
        System.out.println("equal = " + equal); //false cunku 100 ile 200 esit degil. Bunu == operator vererek yazdik.

        boolean result7 = "Muhtar" == "Good Guy";
        System.out.println("result7 = " + result7);

        boolean result9 = 'A' == 'a';
        System.out.println("result9 = " + result9);

        boolean result10 = "Java" == "Java     "; // bosluklarda karakter sayildigi icin burda false vericek.
        System.out.println("result10 = " + result10);

        boolean result11 = 10 != 11; //true
        System.out.println("result11 = " + result11);

        boolean result12 = "Java" != "Break"; // true
        System.out.println("result12 = " + result12);





















    }



}
