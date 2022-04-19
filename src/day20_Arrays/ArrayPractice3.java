package day20_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayPractice3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("How many numbers would you like to enter?");
        int enteredNumber = sc.nextInt();

        if (enteredNumber <=0){ // if olusturup dedik ki, eger scannerde girilen numara negatif veya 0 ise, sistemi exit yap.
            System.err.println("Invalid number");
            System.exit(0);
        }

        int [] numbers = new int[enteredNumber]; // scannerda girilen numarayi arrraye variable ismini yazarak atadik.

        // eger scannera 10 girilirse diye dusunup meselaaa hemmen loop olsuturyoruz.

        for (int i = 0; i < enteredNumber; i++) { //index no 0 dan baslasin ve enteredNumber kac girildiyse artik scannerda oraya kadar loop olustursun.
            System.out.println("Enter a number"); // her seferinde sorsun.
            numbers[i] = sc.nextInt();  //numbers arrayine tek tek index no olarak assign edelim.

        }

        System.out.println(Arrays.toString(numbers));


























    }
}
