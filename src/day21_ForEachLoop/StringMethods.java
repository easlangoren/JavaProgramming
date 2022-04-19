package day21_ForEachLoop;


import java.util.Arrays;

public class StringMethods {
    public static void main(String[] args) {
        
        String str = "Java";
        char[] chars=str.toCharArray(); // bu simdi yukardaki stringin karakterlerini tek tek char a cevirdi.

        System.out.println(Arrays.toString(chars));

        for (char each : str.toCharArray()) {
            System.out.println(each);
        }

        System.out.println("-----------------------------------------------------");

        String sentence = "Wooden Spoon";

        String[] words = sentence.split(" "); //" " bosluktan böl dedik. "Wooden Spoon" Stringini aldii.. [Wooden, Spoon] sekilde bolup array olusturdu.
        System.out.println(Arrays.toString(words));


        System.out.println("--------------------------------------------------------");

        String email = "woodenspoon@cydeo.com";

        String[] arrays= email.split("@"); // @ characterini cikartti ve ordan split etti Stringi
        System.out.println(Arrays.toString(arrays));

        System.out.println("------------------------------------------------------");

        String s = "Today is a nice day. Today is Wednesday. Today we learn Java";
        String[] sentences = s.split("\\."); // speacial character . icin

        System.out.println(Arrays.toString(sentences));







        
        
        
        
        
        
        
    }
}
