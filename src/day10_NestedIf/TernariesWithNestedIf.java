package day10_NestedIf;

public class TernariesWithNestedIf {
    public static void main(String[] args) {

         /*
        if(s >= 0 && s <= 100){
            if(s >= 60){
                System.out.println("Passed");
            }else{
                System.out.println("Failed");
            }
        }else{
            System.out.println("Invalid Score");
        }
        */

        int s = 5000;

     String score=   (s>=0 && s <=100)? (s>=60)?"Passed" : "Failed" : "Invalid number"; // THERE IS NESTED IF TO COMPLETE.
        // Iki kere ? ? ve en sonda iki ker : : olmali, else else
        System.out.println(score);








    }
}
