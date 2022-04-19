package day17_While_DoWhile;

public class RemoveDublicates {
    public static void main(String[] args) {

        String str = "AABBCCC";

        String result = ""; //ABC

        for (int i = 0; i < str.length(); i++) {
            char ch =  str.charAt(i); //"A","A","B","B","C","C"
            if (result.contains(""+ch)) { // if the result already contains the character
                continue; // we skip it
            }
            result += ch;

        }

        System.out.println(result);
    }
}
