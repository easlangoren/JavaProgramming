package day15_ForLoop;

import java.util.Locale;

public class StringMethods {
    public static void main(String[] args) {

        String str= "             ";

       boolean r = str.isEmpty();

        System.out.println(r);


        boolean rt = str.isBlank();
        System.out.println(rt);

        String str2 = "Cydeo    ";

        System.out.println(str2.isBlank()); //false vericek.

        System.out.println("-----------------------------------------------------");

        String s1 = "CYDEO";
        String s2 = "cydeo";

        System.out.println(s1.equals(s2)); //false
        System.out.println(s1.equalsIgnoreCase(s2)); //true


        System.out.println("YEs".equalsIgnoreCase("yes"));

        System.out.println("-----------------------------------------------------");


        String sentence = "My favorite programming language is Java";

        boolean hasCSharp = sentence.contains("C#");
        boolean hasJava = sentence.contains("Java");
        boolean hasJava2 = sentence.contains("java"); // keys sensitivity
        boolean hasJava3=sentence.toLowerCase().contains("java"); // this is the way to ignore keys sensitivity.


        System.out.println(hasCSharp);
        System.out.println(hasJava);
        System.out.println(hasJava2);
        System.out.println(hasJava3);



        String input1 = "I love jAvA";
        String input2 = "Java";

     System.out.println(input1.contains("Java"));//false

     System.out.println(input1.toLowerCase().contains("java")); //true
     System.out.println(input1.toUpperCase().contains("JAVA")); //true

     System.out.println("-----------------------------------------------------");

     String a = "Wooden SpOon";

     //System.out.println(a.startsWith("Woo")); ayni yontem boolean yazmakla

     boolean x =a.startsWith("Woo");
     System.out.println(x);

     System.out.println(a.toLowerCase().endsWith("spoon"));

























    }
}
