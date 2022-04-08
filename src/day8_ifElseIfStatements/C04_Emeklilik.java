package day8_ifElseIfStatements;

import java.util.Scanner;

public class C04_Emeklilik {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen cinsiyetinizi yaziniz " +
                "\nKadin icin K , \nErkek icin E harfini giriniz") ;

        char cinsiyet=scan.next().toUpperCase().charAt(0);
        System.out.println("Lutfen yasinizi giriniz ");
        double yas= scan.nextDouble();

        if (cinsiyet=='k'){
            if (yas<0 || yas>120){
                System.out.println("lutfen");
            }

        } else if (cinsiyet=='e'){

        } else {
            System.out.println("Lutfen cinsiyet icin gecerli bir harf giriniz");
        }

    }
}
