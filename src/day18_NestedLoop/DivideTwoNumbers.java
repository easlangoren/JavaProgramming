package day18_NestedLoop;

public class DivideTwoNumbers {
    public static void main(String[] args) {

       int a=27;
       int b =5;

       int count =0; //kac kere cikartildildigi gormemiz icin.

       while (a>=b){
           a-=b;
           count++; // a dan beyi cikarttikca bu da artmis oluyor, dolaysa sonunda kac kere a nin icinde b var gormus oluyoruz, tam sayi olarak.
       }

        System.out.println(count+ " with a remainder of "+a);








    }
}
