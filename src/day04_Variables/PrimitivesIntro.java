package day04_Variables;

public class PrimitivesIntro {
    public static void main(String[] args) {
         // age: 38 years old

        byte age = 38;

        // weight: 160 pound

        short weight = 160; // 160 is out of byte's range

        // salary: 100.000$

        int salary = 100_000; // default data type for integer numbers (byte veya short yazsan da compiler bunu int olarak algilacayacak oyuzden most preferred

        long asset = 3_333_333_333L; // for the out of int range. We must add upper case L or lower case l to write long range numbers! Eger L yazmazsak default olarak int aldigi icin calismiyor !

        // tax: 0.26

        float tax = 0.26F; // float type requires special as F or f at the end to run properly.

        // PI : 3.14

        double PI = 3.14;

        // #

        char ch1 = '#';
        System.out.println("ch1 = " + ch1);

        char ch2 = 35;
        System.out.println("ch2 = " + ch2);

        char ch3 = 45000;
        System.out.println("ch3 = " + ch3);

        char gender = 'F';

        char grade = 'F'; // himm. Hem notla ilgili assign edebiliriz hem de cinsiyetle ilgili assing edebilirz baska bir variableda. oyuzden sorun yok.

        char yesNO = 'Y';

        boolean IsEmployed = true; // boolean yalnizca true or false icin kullanilir.
        boolean isMarried = false;

        System.out.println("IsEmployed = " + IsEmployed);
        System.out.println("isMarried = " + isMarried);

        // mesela matematiksel olarak 100>300 dedigimizde false olacagi icin boolean kullanilabilir.

        boolean result = 100>300;
        System.out.println("result = " + result);


        String Name = "wooden spoon";

        String City = "McLean";

        String Country = "United Kingdom";

        System.out.println("Name = " + Name);
        System.out.println("City = " + City);
        System.out.println("Country = " + Country);








    }


}
