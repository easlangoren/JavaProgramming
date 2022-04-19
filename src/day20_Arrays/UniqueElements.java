package day20_Arrays;

public class UniqueElements {
    public static void main(String[] args) {

        String[] words = {"Java", "Java", "C#", "Python", "Python"};


        // element array icindeki word e tek tek 1, 2, 3 filan verip denemeliyiz ki tekrar ediyor mu, ona gore unique olan ortaya ciksin. Ozaman loopa ihtiyacimiz var.
        for (int j = 0; j < words.length; j++) {

            // bu asagidaki approach is needed to find the unique one.
            String element = words[j]; //"Java" simdi olustdugumuz bu variable ile hepsini one by one compare edecegiz. ||| Bak smdi j yazarak nested loop olusturmus olduk.
            int frequency = 0; // ne siklikla kullanildigini da buraya assign etmek icin olusturduk.

            for (int i = 0; i < words.length; i++) {
                if (words[i].equals(element)) { // esitligin compare edilip esitse asagi atandigi yer.
                    frequency++;
                }
            }

            if (frequency==1){ // yukardaki looplarda tek basina olan bulununca onu yaz dedik boyle
                System.out.println(element);
            }


        }






    }
}
