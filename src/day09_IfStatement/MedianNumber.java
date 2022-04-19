package day09_IfStatement;

public class MedianNumber {
    public static void main(String[] args) {

        int a = 10,
                b = 2000,
                c = 30;
//                          a=15, b=10, c=20    a=15, c=10, b=20
        boolean aIsMedian = (a > b && a < c) || (a > c && a < b); // eger a is median numaraysa ozaman b ve c nin en kucuk ve en buyuk oldugu durumlari yaziyoruz.
        /*
                    1. if c is the maximum number & b is the minumum number, then a is median number
                    2. if b is the maximum number & c is the minimum number, then a is median number
         */



        boolean bIsMedian = (b > c && b <a) || (b > a && b < c);

        boolean cIsMedian = !aIsMedian && !bIsMedian;

        if (aIsMedian){
            System.out.println(a+ " is the median number");
        }

        if (bIsMedian){
            System.out.println(b+ " is the median number");
        }

        if (cIsMedian){
            System.out.println(c + " is a median number");

        }







    }
}

/*
 Create a class called MedianNumber. write a program that can find the median number between three DIFFERENT given integers

			Ex:
				a = 10, b= 15, c = 20;

			Output:
				15 is the median number


			Posibility #1: a could be median number
			Posibility #2: b could be median number
			Posibility #3: c could be median number



 */