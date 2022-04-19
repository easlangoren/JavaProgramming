package day13_StringClass;

import java.util.Locale;

public class StringMethods {
    public static void main(String[] args) {


        String word = "Cydeo";

        char thirdChar = word.charAt(3);

        System.out.println("thirdChar = " + thirdChar);

        System.out.println("-------------------------------------------");

        String s1 = "Batch 25 is the best batch. Java programming Language";

       int totalChars = s1.length();

        System.out.println("totalChars = " + totalChars);

        char lastChar = s1.charAt(  s1.length()-1); // last character gosteriyor.
        System.out.println("lastChar = " + lastChar);

        //total number of chacters starts to count from 1 but index number starts to count from 0, thats why we use -1

        System.out.println("-------------------------------------------");

        String str = "wooden spoon";
        str = str.toUpperCase(); //  "WOODEN SPOON"
        System.out.println(str);

        String s = "TODAY IS A GREAT DAY TO LEARN JAVA PROGRAMMING LANGUAGE.";
        s= s.toLowerCase();
        System.out.println(s);









    }
}
