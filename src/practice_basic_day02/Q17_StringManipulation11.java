package practice_basic_day02;

import java.util.Scanner;

public class Q17_StringManipulation11 {
    // Kullanicidan isim ve soyismini girmesini isteyin ve hangisinin daha uzun oldugunu yazdirin.

    public static void main(String[] args) {
        Scanner scann = new Scanner(System.in);
        System.out.println("Lutfen isminizi giriniz");
        String isim=scann.nextLine();
        Scanner scann1 = new Scanner(System.in);
        System.out.println("Lutfen soyisminizi giriniz");
        String soyIsim=scann.nextLine();
        if (isim.length()>soyIsim.length()){
            System.out.println("isminizin uzunlugu soyisminizden buyuktur");
        } else if (soyIsim.length()>isim.length()){
            System.out.println("soyisminizin uzunlugu isminizden buyuktur");

        }else{
            System.out.println("isminizin ve soyisminizin uzunlugu esittir");
        }


    }

}
