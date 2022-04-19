package day21_ForEachLoop;

import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {

        String str1 = "acdb";
        String str2 = "dbca";

        // write a program that can check if str1 & str2 are build out same characters

         char[] same1= str1.toCharArray();
         char[] same2 =str2.toCharArray();

        Arrays.sort(same1);
        Arrays.sort(same2);

        System.out.println(same1);
        System.out.println(same2);

        boolean anagram = Arrays.equals(same1,same2);
        System.out.println(anagram);


















    }
}
