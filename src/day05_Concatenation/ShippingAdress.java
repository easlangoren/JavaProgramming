package day05_Concatenation;

public class ShippingAdress {
    public static void main(String[] args) {

        String name = "James King", buildingNuber = "12345",
                streetName = "Jones Branch Dr", city = "McLean", state = "VA", zipCode = "22031A";


        //bu String bir kere yazip , ile digelerini pesine yazabilmemizi gosteren bir baska yontem


        //System.out.println(name + "\n"+ buildingNumber + " "+ streetName+"\n" + city+", "+ state + " " +zipCode );

        String address = name +"\n"+ buildingNuber +" "+  streetName+"\n" + city+", "+ state + " " +zipCode;
        //double quote koymadik
        //Eger double quote koysaydik ozamn bir "text" olusturmus olucaktik.

        System.out.println(address);








    }


}
