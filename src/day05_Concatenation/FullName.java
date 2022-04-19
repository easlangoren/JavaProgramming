package day05_Concatenation;

public class FullName {

    public static void main(String[] args) {

        String firstName = "Emre";
        String lastName = "Aslangoren";
        int age = 24;
        String jobTitle = "SDET";
        String  companyName = "Apple Inc.";
        double salary = 110000.53;

        String fullName = firstName + " " + lastName + " is a " + jobTitle + ", works at "+ companyName +", and " + firstName + " "+ lastName + "'s salary is $"+ salary;

        // + " " + bosluk birakmaliydik ki isim ve soyisimi ayirsin.
        // FullName is JobTitle, works at CompanyName, and Fullname' salary is salary
        System.out.println(fullName);

        // Hepsini string icinde yazmayip  println icerisinde de de + koyarak yazablirdik. Sadece tercih meselesi.

        // cok ilginctir bak mesela println icerisine sadece tek bir variable atanmasina ragmen yukarda yazilanlari da consolda gosterdi.)



    }




}
