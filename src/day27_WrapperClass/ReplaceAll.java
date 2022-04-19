package day27_WrapperClass;

import java.util.Arrays;

public class ReplaceAll {
    public static void main(String[] args) {


        int[] arr = {10, 20, 30, 40, 50, 30, 30, 30};

        arr = replaceAll(arr, 30, 300);

        System.out.println(Arrays.toString(arr));


    }

    // replace all the matching values of the array with the new value
    public static int[] replaceAll(int[] array, int oldValue, int newValue) {

        for (int i = 0; i < array.length; i++) {

            if (array[i] == oldValue) {
                array[i] = newValue;
            }

        }

        return array;
    }

    public static double[] replaceAll(double[] array, double oldValue, double newValue) {

        for (int i = 0; i < array.length; i++) {

            if (array[i] == oldValue) {
                array[i] = newValue;
            }

        }

        return array;


    }

    public static char[] replaceAll(char[] array, char oldValue, char newValue) {

        for (int i = 0; i < array.length; i++) {

            if (array[i] == oldValue) {
                array[i] = newValue;
            }

        }

        return array;

    }
}


