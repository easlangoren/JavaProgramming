package day07_Operators;

public class ShorthandOperators {
    public static void main(String[] args) {

        //assignment: =
        int number = 100;
        System.out.println("number = " + number); //100

        number = 200;

        System.out.println("number = " + number); //200

        String word = "Java Programming";
        System.out.println("word = " + word);

        word = "Wooden Spoon";
        System.out.println("word = " + word);

        System.out.println("------------------------------------------");

        // Additional Assignment

        int x = 100;

        System.out.println("x = " + x);
        System.out.println(x + 200); //300

        //x = x + 200;
        x += 200; // this is additional assignment
        System.out.println("x = " + x); //300

       String str = "Wooden";

       str += " Spoon";

        System.out.println("str = " + str);

        double num1 = 2.5;
        num1 += 5.5;

        System.out.println("num1 = " + num1);

        double availableBalance = 1000.50;
        System.out.println("availableBalance = " + availableBalance);

        //deposit 300$

        availableBalance += 300; //availableBalance = 1000.50 + 300

        System.out.println("availableBalance = " + availableBalance);

        System.out.println("--------------------------------------------------");

        //withdrawing 500$

        availableBalance -= 500;
        System.out.println("availableBalance = " + availableBalance);

        System.out.println("--------------------------------------------------");

        double salary = 50000.50;
        salary *= 2; // burda da iste reassign ediyoruz yine ama 2 ile carparak //// salary = salary * 2 ile ayni islemi yapiyor. Sadece shorter.

        System.out.println("salary = " + salary);

        double doge = 0.00000001;
        doge *= 1000000;

        System.out.println("dodge = " + doge);

        System.out.println("--------------------------------------------------");

        double num2 = 25000;

        //num2 = num2 /2;
        num2 /= 2;

        System.out.println("num2 = " + num2);

        System.out.println("--------------------------------------------------");

        double num3= 100;

        // %=

        num3 %= 3; // Yani 3 e bolundugunde remainder ne kalacagini soyle bize diyoruz.

        System.out.println("num3 = " + num3);

        System.out.println("--------------------------------------------------");

        System.out.println("Testing how much cent you should give to the costumer\n");

        int amount = 127; // cents

        int quarters = 127 /25;
        int cents = 127 % 25;

        System.out.println("quarters = " + quarters);
        System.out.println("cents = " + cents);


        System.out.println("--------------------------------------------------");

        int cents2 = 127;

        cents2 %= 25;

        System.out.println("cents2 = " + cents2);

        System.out.println("--------------------------------------------------");

        int y = 300;

        y %= 16;

        System.out.println("y = " + y);

        System.out.println("--------------------------------------------------");

        int balance = 3500;

        // insurance fee: $153

        balance %= 153;

        // balance /= 12;    bu da balance taki parayi 12 ye yani 12 aya bolunce 11 cvp vererek kac ay odeyebilcegini gosteriyor. Reminder kullaninca da bize o son ay icin ne kadar eksik para kaldigini gosteriyor.

        System.out.println("balance = " + balance); // remainder will be 134$ yani bu para kalinca insurance odenmesi durucak.






















































    }


}
