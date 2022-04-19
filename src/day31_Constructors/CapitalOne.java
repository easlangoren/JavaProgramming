package day31_Constructors;

public class CapitalOne {
    public static void main(String[] args) {

        BankAccount account1 = new BankAccount();
        account1.setInfo("Ahmet Ozkok",123456789);

        System.out.println(account1);

        account1.deposit(1000);
        account1.checkBalance();

        account1.withdraw(900);

        account1.checkBalance();

        System.out.println("-----------------------------------------------------------");

        BankAccount account2 = new BankAccount();
        account2.setInfo("Emre Aslangoren",1245432345);

        account2.deposit(1000);
        account2.checkBalance();

       //  System.out.println(account2); bunu yazmana gerek YOK ! Cunku zaten checkBalance icinde printstatement yazili.






























    }
}
