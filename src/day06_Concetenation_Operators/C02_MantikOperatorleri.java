package day06_Concetenation_Operators;

public class C02_MantikOperatorleri {
    public static void main(String[] args) {

        System.out.println(5+2==8);
        boolean sonuc1=5>4 && 7<9 && 6+3==9  && 5+2!=8;
        System.out.println(sonuc1);

        boolean sonuc2=5>4 && 7>9 && 6+3==9  && 5+2!=8;
        System.out.println(sonuc2);
        boolean sonuc3=5>4 & 7>9 & 6+3==9  & 5+2!=8;


        System.out.println(sonuc3);

        //&& ile & arasindaki fark

        int sayi3=15;

        // sayi3 un 10 ile 20 arasinda oldugunu  true diyerek ispatlayalim.
        //java 3 lu karsilastirma kabul etmez

        System.out.println(10<sayi3    &&  sayi3<20);

        int sayi4=5;

        // sayi4 un 10 ile 20 in arasinda oladigini true diyerek dondurelim

        System.out.println(sayi4<10 || sayi4>20);





    }
}
