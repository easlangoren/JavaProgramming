package day08_IfStatement;

public class GradeReport {
    public static void main(String[] args) {

      /*  System.out.println( true == !false); //true
        System.out.println( !true != false); //false
        System.out.println( !false == true); //true

        System.out.println(!!false); // false

       */

        int score = 92;

        boolean a = score >= 90 && score <= 100;
        boolean b = score >= 80 && !a; // if its grater than 80 but did not make A..... <=89 seklinde de yazbilirdik. No difference.

        //boolean c = score >= 70 && score <= 79;
        boolean c =  !a && !b && score >= 70 ;

        boolean d = !a && !b && !c && score >= 60;
        boolean e = !a && !b && !c && !d && score <= 59;

        if (a){

            System.out.println("Excellent");

        }

        if (b){

            System.out.println("Great");

        }

        if (c){

            System.out.println("Good");

        }

        if (d){

            System.out.println("Failed");

        }
        if (e){

            System.out.println("Failed");

        }















        /*if (score>=90 && score <= 100){

            System.out.println(score+ " Student score is A");

        }

        if (score >= 80 && score <=89){

            System.out.println(name+"'s score is B");

        }

         */
















    }
}

/*
        90~ 100 ==> Excellent
        80 ~ 89 ==> Great
        70 ~79 ==> Good
        60 ~ 69 ==> Passed
        0 ~59 ==> Failed

 */