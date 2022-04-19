package day17_While_DoWhile;

public class BranchingStatements2 {
    public static void main(String[] args) {

        for (char i = 'A'; i <= 'E'; i++) {

            if (i == 'C') {
                continue;
            }

            System.out.println(i);

        }

        System.out.println("-------------------------------------");
        // print all the even numbers between 1~10


        for (int i = 0; i <=10; i++) {
            if (i%2 !=0){ // tek sayilari icinden sectik.
                continue; // skip et dedik.
            }
            System.out.println(i);

        }

        // eger continue yazmayip sadece print statement yazaydik, bize zaten cifti veya teki vericekti.

        System.out.println("-------------------------------------");
        // print all the odd numbers between 1~10
        for (int i = 0; i <=10 ; i++) {
            if(i%2==0){ // cift sayilari icinden sectik.
                continue; // skip et dedik.
            }
            System.out.println(i);
        }






    }
}
