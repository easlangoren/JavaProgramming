package day19_LoopPractice.day24_CustomMethod_Return;

public class ReturnMethodIntro {

    public static void main(String[] args) {
        String str = "Java";

         String result =  reverse(str);

          System.out.println(result);

       if(str.equalsIgnoreCase(result)){ // tekrar baska biseyin icinde kullanmamiza izin vermis oldu yani return method kullanarak.
            System.out.println(str+" is palindrome");
        }else{
            System.out.println(str+" is not palindrome");
        }



    }
    // void yerine direk String yazdik ve sonra variable ismini yazmalisin. Sonra parantez icine bir daha.g
    public static String reverse(String str) {

        String reverse = "";

        for (int i= str.length()-1; i>=0; i--){
            reverse+=str.charAt(0);
        }

        return (reverse);




    }


}