package day17_While_DoWhile;

public class FrequencyOfWord_WhileLoop {
    public static void main(String[] args) {


        String str = "Java Java Python Python";

        int frequency = 0;

        while (str.contains("Java")){
            str= str.replaceFirst("Java","");
            frequency++;
        }

        System.out.println(frequency);

        System.out.println("----------------------------------");

        String sectence = "cat cat cat cat dog dog dog cat cat";

        int countCat = 0;

        while (sectence.contains("cat")){
            sectence= sectence.replaceFirst("cat","");
            countCat++;
        }

        System.out.println(countCat);



    }
}
