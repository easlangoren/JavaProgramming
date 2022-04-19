package day19_LoopPractice;

import java.util.Scanner;

public class quiz {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        byte b1 = sc.nextByte();
        byte b2 = sc.nextByte();

        int max = (b1>b2)? b1+2 : b2-4;

        System.out.println(max);



    }
}
