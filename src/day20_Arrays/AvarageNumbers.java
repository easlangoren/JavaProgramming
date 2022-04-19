package day20_Arrays;

public class AvarageNumbers {
    public static void main(String[] args) {

        int[] numbers = {10,20,30,40,50,60};

        double sum = 0; // +10+20+30... bunu da double a cevirmeliyiz cunku kusurati da gormek istiyoruz asagida.

        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i]; // loop ile toplanip sum a atanmis oldu.
        }

        double avarageNumber = sum/ numbers.length;

        System.out.println("avarageNumber = " + avarageNumber);














    }
}
