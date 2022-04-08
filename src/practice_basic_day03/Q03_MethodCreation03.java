package practice_basic_day03;

import java.util.Scanner;

public class Q03_MethodCreation03 {
    public static void main(String[] args) {
         /*
    cm olarak verilen bir sayiyi, metre ve kilometreye donusturen bir method yaziniz

     */
        Scanner scan =new Scanner(System.in);
        System.out.println("Lutfen donusturmek istediginiz sayiyi cm turunden giriniz");
       int sayi=scan.nextInt();
         int km=0;
         int mtre=0;
         mtrVeKmCevir( sayi,km,mtre);
    }

    private static void mtrVeKmCevir(int sayi, int km, int mtre) {
        km=sayi/100000;
        mtre=sayi/100;
        System.out.println("Girdiginiz sayinin km cinsinden degeri : "+ km + " metre cinsinden degeri : " + mtre);
    }

}