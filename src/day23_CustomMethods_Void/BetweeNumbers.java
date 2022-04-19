package day23_CustomMethods_Void;

public class BetweeNumbers {

    public static void main(String[] args) {

        betweenNumbers(765,999);


    }







    public static void betweenNumbers(int x, int y){

        for (int i = x; i <=y ; i++) {
            System.out.println(i);

        }

        for (int i = y; i <=x ; i++) {
            System.out.println(i);

        }




    }










}