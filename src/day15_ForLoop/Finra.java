package day15_ForLoop;

public class Finra {
    public static void main(String[] args) {

        for (int i =1; i<=100; i++){

            if(i%15==0){ // hem 3 e hem 5 bolunebilen demek 15 e demek
                System.out.print("FINRA ");
            }else if(i%3==0){
                System.out.print("FIN ");
            }else if(i%5==0) {
                System.out.print("RA ");
            }else {
                System.out.print(i+" ");
            }



        }












    }
}
