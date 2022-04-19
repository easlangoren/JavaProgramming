package day20_Arrays;

import java.util.Arrays;

public class Alphabet {
    public static void main(String[] args) {

        //

        char[] alphabet = new char[26];     // Z~A
        /*
        alphabet[0] ='Z'; //90
        alphabet[1] ='Y'; // 89
        alphabet[2] ='X'; // 88


         */

       /* char ch ='Z';
        for (int i = 0; i< alphabet.length  ; i++) {
            alphabet[i] =ch--; //ch-- yazdik cnku 65 e kadar azaltiyoruz ki Z den A ya yazsin. index 0 = 90 gibi tersten basliyor.

        }


        */

        for (char i=0, j='Z'; i< alphabet.length && j>='A'; i++,j-- ){
            alphabet[i]=j; // i = index number of array temsil ediyor.
        }


        System.out.println(Arrays.toString(alphabet)); //print the whole array
      //  System.out.println(alphabet[0]); // printing the element of array



















    }
}
