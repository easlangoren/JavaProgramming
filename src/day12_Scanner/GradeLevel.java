package day12_Scanner;

public class GradeLevel {
    public static void main(String[] args) {

        byte number = 18;
        String result = "";

        if(number>= 1 && number<= 18){ //1~18

            switch (number){
                case 1: // bu besliyi en sona defaulta da alabilirdik. Cunku en uzunu bunlar. Dolayisyla zamandan kar etmis olurduk.
                case 2:
                case 3:
                case 4:
                case 5:
                    result = "Elementary school";
                    break;
                case 6:
                case 7:
                case 8:
                    result = "Middle School";
                    break;

                case 9:
                case 10:
                case 11:
                case 12:
                    result = "High School";
                    break;

                case 13:
                case 14:
                case 15:
                case 16:
                    result = "College";
                    break;

                default:
                    result = "Grad School";
            }

        }else {
            System.out.println("invalid number");
        }
        System.out.println(result);


    }
}
