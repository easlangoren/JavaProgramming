package day20_Arrays;

import java.util.Arrays;

public class ArraysPractice {
    public static void main(String[] args) {

    /*  // store teh elements: 10, 20 ,50

        int [] numbers = {10,20,50,70};
        //                0, 1, 2, 3

        System.out.println(Arrays.toString(numbers));

        System.out.println("---------------------------------------------------");


     */
        // create a variable that can contain 5 scores

        int[] numbers = new int[4];
        numbers[1] = 85;
        numbers[numbers.length - 1] = 105; //bu String ile son index numarali arrayi secmis oluyoruz.
        numbers[0] = 65;
        numbers[2] = 95;

        System.out.println(Arrays.toString(numbers)); // [65,85,95,105]

        System.out.println("--------------------------------------------------");

        String[] months = {"January", "February", "March", "April", "May", "June", "July",
                "August", "September", "October", "November", "December"}; // 0~11 (length -1)

        for (int i = 0; i < months.length; i++) { // i: reperesent the index numbers of this array starting from 0
            System.out.println(months[i]);


        }

        System.out.println("---------------------------------------------------------------");

        for (int i = months.length-1; i >=0 ; i--) { // burda length -1 verdik cunku basladigi yer 12 degil, lenght 1 den basliyordu saymaya biliyosun. oyuzden -1
            System.out.println(months[i]);

        }










    }
}
