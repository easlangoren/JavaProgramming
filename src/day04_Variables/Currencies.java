package day04_Variables;

public class Currencies {
    public static void main(String[] args) {
        //dollar,lira,britishPound,canadianDollar,euro,peso,riyal,jpy,ruble,Yuan, south korean won


        int dollar = 1000;
        double lira = dollar * 13.5;
        double britishPound = dollar * 0.73;
        double canadianDollar = dollar * 1.26;
        double euro = dollar * 0.88;
        double peso = dollar * 20.31;
        double riyal = dollar * 3.75;
        double jpy = dollar * 114.24;
        double ruble = dollar * 76.24;
        double yuan = dollar * 6.35;
        double won = dollar * 1.190_26;

        System.out.println("Dollar = " + dollar);
        System.out.println("Lira = " + lira);
        System.out.println("BritishPound = " + britishPound);
        System.out.println("CanadianDollar = " + canadianDollar);
        System.out.println("Euro = " + euro);
        System.out.println("Peso = " + peso);
        System.out.println("Riyal = " + riyal);
        System.out.println("Jpy = " + jpy);
        System.out.println("Ruble = " + ruble);
        System.out.println("Yuan = " + yuan);
        System.out.println("Won = " + won);
/*
Simdi burda ne yaptik?
Variable larimzi belirledik.
Biz Dollar in diger para birimlerindeki degerini merak ediyorduk buna gore bir source code olustuduk.
Dedik ki, ilk degiskenimiz olan 1000 dolari int 1000 olarak yazdik.
sonra diger variable larimizi yazdik. Bunlar da diger para birimleri. Bunlarin da degeri degisiyor cunku.
Sonra internetten suanki degerleriyle carparak yazdik ki, diger para birimi olan degiskenlermizin 1000 dolar karsisinda nasil degistigini bulalim.
Sonra internettten aldigimiz degerlerle bu degiskenleri carparak, 1000 dolarn diger para birimlerinde neye karsilik geldigni yazdik.
Bunun icin double primitive sini kullandik cunku double decimallar icin ve primitive
 */

    }


}
