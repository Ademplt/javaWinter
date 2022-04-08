package practice_basic_day04;

import java.util.Arrays;
import java.util.Scanner;

public class Q05_Arrays {
    public static void main(String[] args) {
       /*
         Kullanicidan aldigimiz 8 elemanli arrayin icinde
         kac tane 3 e bolunebilen sayi vardir ?(negatif sayilar da dahil olsun)
        */

        Scanner scan = new Scanner(System.in);
        int uzunluk=8;
        int arr []=new int[uzunluk];
        for (int i = 0; i <uzunluk ; i++) {
            System.out.println("Lutfen 8 elemanli Arrayin " + (i+1) +"." + " elemanini giriniz ");
            arr[i] =scan.nextInt();


        }
        System.out.println("Listenin ilk hali : " +  Arrays.toString(arr));
        System.out.print("Arrayde ki 3 e bolunebilen elemanlar : ");
        for (int i = 0; i <arr.length ; i++) {
            if (arr[i]%3==0){

                System.out.print(arr[i] + " ");
        }

        }

    }
}
