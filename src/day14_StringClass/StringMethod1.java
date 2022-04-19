package day14_StringClass;

public class StringMethod1 {
    public static void main(String[] args) {

        String str1 =  "     batch 25      ";
        str1 = str1.trim();

        System.out.println(str1);

        String str2 = "Cydeo School";
        int n1 = str2.indexOf("S");

        System.out.println("n1 = " + n1);

        String str3 = "Java programming language";
        int n3 = str3.indexOf("ag");

        System.out.println("n3 = " + n3);

        int n4 = str3.lastIndexOf("l");
        System.out.println("n4 = " + n4);

        System.out.println("-------------------------------------------------------");

        String s = "Java Nova Cava Wawa orange";

        int firstA = s.indexOf("a");
        int lastA = s.lastIndexOf("a");
        int secondA = s.indexOf("a "); // second a and space will print the second a
        int thirdA = s.indexOf("a C"); // third a represented
       // int fourthA = s.lastIndexOf("av"); //bak sagdan okumaya basliyor ama sola gore index numara veriyor. Ona gore yazmalisin.
        int fourthA = s.indexOf("Ca")+1;// boyle yazinca c nin indexi +1 olmus oldu.
        int fifthA = s.lastIndexOf("a W");
        int sixthA = s.lastIndexOf("aw");
        int seventhA = s.lastIndexOf("a ");


        System.out.println("firstA = " + firstA);
        System.out.println("lastA = " + lastA);
        System.out.println("secondA = " + secondA);
        System.out.println("thirdA = " + thirdA);
        System.out.println("fourthA = " + fourthA);
        System.out.println("fifthA = " + fifthA);
        System.out.println("sixthA = " + sixthA);
        System.out.println("seventhA = " + seventhA);











    }
}
