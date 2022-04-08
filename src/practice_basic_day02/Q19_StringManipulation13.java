package practice_basic_day02;

import day15_methodCreation.C04;

import java.util.Scanner;

public class Q19_StringManipulation13 {

    // Kullanicidan 4 harfli bir kelime isteyin
    // ve girilen kelimeyi tersten yazdirin

    public static void main(String[] args) {
        String kelime="adem";
       String yeniKelime=kelime.substring(3,4).toUpperCase()+kelime.substring(2,3)+
               kelime.substring(1,2)+kelime.substring(0,1);
        System.out.println("yeniKelime = " + yeniKelime);




    }
}
