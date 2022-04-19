package day20_Arrays;

import java.util.Arrays;

public class ArraysPractice2 {
    public static void main(String[] args) {

        char [] letters = new char[26];


       /* for (int i = 0, j='A'; i < letters.length && j<='Z'; i++, j++) { // index numbers 0~ last index
            letters[i]=(char) j; //casting yaptik cnku char int ten buyuk.

        }

        */
// yada direk char methodyla yazariz, ve kafamiz rahat eder, casting yapmayiz.
       /* for (char i =0, j='A'; i < letters.length && j<='Z' ; i++, j++) {

            letters[i]=j;

        }

        */

        //ikinci j=0 initilization istemiyorsak..  chari disari yazar, iceride int ile devam edeblirz.

        char ch = 'A'; // starting pointi temsil ediyor.
        for (int i = 0; i < letters.length; i++) { // ch++ buraya da yazabiliyorz. Iki tane yazmis oldun ama programi bozmuyor sadece ek olarak gor anla diye.
            letters[i]=ch++;  // eger pre-increment ++ch verirsen A yi atlayarak B den basliyor.
        }


        System.out.println(Arrays.toString(letters));


        System.out.println("-------------------------------------------------------------");

        char[] numbers2 =new char [26];

        for (char i = 0, j='Z'; i < numbers2.length && j>='A' ; i++,j--) {
            numbers2[i]=j;

        }
        System.out.println(Arrays.toString(numbers2));





















    }
}
