package day20_Arrays;

public class MinNumberOfArray {
    public static void main(String[] args) {

       int[] numbers = {5,17,60,1,64,93};

       int min = numbers[0]; // bu loop icinde atamak icin olustudugumuz minumum numarayi oylesine temsil eden bir variable

        for (int i = 0; i < numbers.length; i++) {

            if (numbers[i] < min){
                min = numbers[i]; // assigning each time while loop is executing.
            }

        }
        System.out.println(min);










    }
}
