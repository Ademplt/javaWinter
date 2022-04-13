package day42_exceptions;

import java.util.Scanner;

public class C03_IllegalArgumentException {
    public static void main(String[] args) {
        /*
        Kullanicidan yasini isteyin kullanici negatif bir sayi,0 veya 120'den buyuk
        bir sayi girerse illegalArgumentexception olusacak sekilde bir prgrm yaziniz.

         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen yasinizi giriniz");
        int yas = scan.nextInt();

        if(yas<=0 || yas>120){
           // System.out.println("lutfen gecerli bir yas giriniz");
            //java bizim isredigimiz durumlarda exception firlatabilir
            throw new IllegalArgumentException();

        }else{
            System.out.println("uygun yas girdiniz ,tesekkurler");
        }


    }
}
