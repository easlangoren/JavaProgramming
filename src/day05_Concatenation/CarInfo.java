package day05_Concatenation;

public class CarInfo {
    public static void main(String[] args) {

        //year,make,model,miles,color,price

        //2018 Toyota Camry, 50000 miles, Red, $19000


        int year = 2014;
        String make = "Mini", model = "cooper", colour = "red";
        double price = 9440;
        int milage = 76240;
        String carinfo = make+", " + model+", " + colour;
        //variable belirledikten sonra o variablelari da icine bir kume yapicak bir variable belirleyebiliriz.


        System.out.println(year +", "+ carinfo+ ", " + price+"£"+ ", "+ milage+".");

        //System.out.println(year +",\n" + carinfo+ ", \n" + price+"£"+ ", "+ "\n"   + milage+".");







    }
}
