package day15_ForLoop;
import java.util.Scanner;
public class StartsWithX {
    public static void main(String[] args) {

        System.out.println("Enter a word");
        String word =  new Scanner(System.in).next(); // if you are going to use the Scanner only one time. You can use it in this way.

        if (word.charAt(0) == 'x'){
            word=word.replace('x','a').replace('X','a');

        }
        System.out.println(word);




    }
}
