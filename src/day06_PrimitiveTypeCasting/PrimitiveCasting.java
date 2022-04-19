package day06_PrimitiveTypeCasting;

public class PrimitiveCasting {
    public static void main(String[] args) {

        byte a = 100;
        short b = a;

        int c = b;

        long d = c;

        float e = d;

        double f = e;

        System.out.println("-------------------------------------");


        int x = 55;
        double y = (double)x;

        System.out.println(x + " : " + y);

        long j = 1000000;
        short k = (short)j;

        System.out.println(j+ " : "+ k); //sout icerisine karistirip datatype yaziyosun! Hayir. Variable ismini yazicaksin.
        // console da gordugun gibi 1000000 : 16960 cikti cnki k variablei shortu temsil ediyor ve short un max range okadar

        double n = 10.8;
        int s = (byte) n;

        System.out.println(n + " : "+ s); //it wont rounded to 11 it will take it as 10 because int is a date type of integer











    }


}
