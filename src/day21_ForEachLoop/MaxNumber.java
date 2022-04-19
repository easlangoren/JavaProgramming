package day21_ForEachLoop;

public class MaxNumber {
    public static void main(String[] args) {

       int[] numbers = {10,5,4,20,1,0};
       int max = numbers[0]; //20


        for (int each : numbers) {
            if (each>max){ //eger [0] daki degerden herhangi bir indexe karsilik gelen sayi buyukse..
                max = each; // ozaman maximum number o eachtir.
            }
            
        }

        System.out.println(max);










    }
}
