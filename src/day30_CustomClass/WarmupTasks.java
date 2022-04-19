package day30_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;

public class WarmupTasks {
    public static void main(String[] args) {


        String str = "ABCHSFJWIFJ123&!@£$%5532EGF1";

        ArrayList<Character> chars = new ArrayList<>(); // bu ArrayList yukaridaki stringi Array liste atamak icin olusturuldu.

        for (int i = 0; i < str.length(); i++) {
            chars.add(str.charAt(i));
        }

        System.out.println("ALL of it = "+chars);
        ArrayList<Character> letters = new ArrayList<>(chars); // baska bir arraylisti de constructiona yazabiliyosun.

        letters.removeIf(p->!Character.isLetter(p));

        System.out.println("letters = " + letters);

        ArrayList<Character> digits = new ArrayList<>(chars); // hepsini en yukardakine bagliyoruz add yapiyoruz.

        digits.removeIf(p->!Character.isDigit(p)); //lambda expression. Bu if gibi calisiyor ama sadeece p ile yazmaliyiz.

        System.out.println("digits = " + digits);

        ArrayList<Character> specialChars = new ArrayList<>(chars);

      /*  specialChars.removeAll(letters);
        specialChars.removeAll(digits);
        bu bir cozum sprecial karakterleri bulmak icin
       */

        // the other cozum

        specialChars.removeIf(p->Character.isLetterOrDigit(p)); // bu da yukadakina gerek kalmadan direk isi cozuyor.


        System.out.println("specialChars = " + specialChars);












    }
}
