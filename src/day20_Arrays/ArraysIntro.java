package day20_Arrays;

import java.util.Arrays;

public class ArraysIntro {
    public static void main(String[] args) {

        // create a variable thats capable enought to contain 5 names

        String myGroup[] = new String[5];
        myGroup [0] = "Emre";
        myGroup [1] = "Nur";
        myGroup [2] = "Merve";
        myGroup [3] = "Alanur";
        myGroup [4] = "Rusen";

        //System.out.println(myGroup); //hashcode wrong way of printing Array

        System.out.println(Arrays.toString(myGroup));

        System.out.println("-----------------------------------------------------");


        String[] days  = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

        System.out.println(Arrays.toString(days));

        int number = 1;

        if (number <1 || number>7){ //burdaki if karsilanmadigi icin burayi direk atliyor, hic icine girmiyor If in.
            System.err.println("invalid number");
            System.exit(0);
        }
        System.out.println(days[number-1]);



















    }
}
