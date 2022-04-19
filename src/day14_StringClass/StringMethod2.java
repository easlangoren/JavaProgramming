package day14_StringClass;

public class StringMethod2 {
    public static void main(String[] args) {

        String str = "Java is fun, I love learning Java";

        String str2 = str.replace("Java","Python");


        String email = "JohnSmith@yahoo.com";
        email=email.replace("yahoo","gmail");

        System.out.println("email = " + email);


        String sentence = "Java Java Python Python C# C# C++ C++ Python Python Python Python";
        sentence=sentence.replace("Python","").replace("   "," ");

        System.out.println("sentence = " + sentence);

        String s2 = "C# is fun, C# is cool"; // burda bosluk vererek sadece ikinci C# i degistirmis olduk.
        s2=s2.replace(" C#","Java");

        System.out.println("s2 = " + s2);

        System.out.println("-------------------------------------------------------");

        String result = "Java Java Java";

       // result = result.replace("Java","Python");
        result=result.replaceFirst("Java","Python");

        System.out.println(result);

        String result2 = "C# is fun, C# is cool";
        result2 =result2 =result2.replaceFirst("C#","Java");

        System.out.println(result2);

        String result3 = "Java";
        result3=result3.replaceFirst("va","vo");

        System.out.println(result3);









    }
}
