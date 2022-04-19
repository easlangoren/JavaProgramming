package day19_LoopPractice;

public class FrequencyOfCharecters {
    public static void main(String[] args) {

        String str = "aabcccdaaaaaaaaaa";
        String result = "";
        for (int j = 0; j < str.length(); j++) {

            char ch = str.charAt(j); // each character from string
            int count = 0; // toplayip buraya en sonda assign etmek icin.

            for (int i = 0; i < str.length(); i++) {

                char each = (str.charAt(i));
                if (ch == each) {
                    count++;
                }
            }

            if (result.contains(""+ch)){
                continue;
            }


            result += ch;
            result += count;



        }

        System.out.println(result);
    }


}

