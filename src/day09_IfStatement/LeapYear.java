package day09_IfStatement;

public class LeapYear {
    public static void main(String[] args) {

        int year = 2008;

        boolean leapYear = year % 4 ==0;  // 4 yilda bir leap yilsa, seneyi 4 e boldugumde 0 kaliyorsa leap yil kabul et demis oluyorum.

        if (leapYear){
            System.out.println("Year "+ year+" is leap year");
        }

        if (!leapYear){ // !leapyear yani eger leapyear degilse bu ifadeyi yaz diyorum.
            System.out.println("Year "+year+" is NOT a leap year");

        }

        System.out.println("-------------------------------------------------------");

        if (leapYear){
            System.out.println("Year "+year+" is a leap year");
        } else {
            System.out.println("Year "+ year+" is NOT a leap year");
        }



    }
}
