package day15_ForLoop;

public class ForLoopPractices {
    public static void main(String[] args) {


        for (int i=15; i<=45; ++i){
            System.out.print(i+" "); // burda print ile yazdigmiz icin hello yazmak istesek sonuna ekliyor. Oyuzden asagiya ya bir bos sout veririz yada \n
        }
        System.out.println("\nHello");




        for (int i =100; i>=50; i--){
            System.out.print(i+" ");
        }

        System.out.println("------------------------------------------------------");

        for (int i =0; i<=55; i++){

            if (i%2 ==0){
                System.out.print(i+(" "));
            }
        } // bos println statement vermeyi unutma.
        System.out.println();

        for (char i= 65; i<=90; i++ ){
            System.out.print(i+" ");

        }
        System.out.println();

        for (char i= 97; i<=122; i++){
            System.out.print(i+" ");

        }




    }
}
