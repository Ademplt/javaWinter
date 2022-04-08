package practice_basic_day04;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q13_ArraysList {
    public static void main(String[] args) {

        /*
         * verilen arrayin n sayisi kadar maksimun  degerlerini bulan java programi yaziniz
         * not kisa metodlar kullamayiniz
         * Input : {1,2,3,4,5,6,7,8} input n:2 Output : 7 and 8
         */
        int[]arr={1,2,3,4,5,6,7,8,9,54};
        int istenenSayi=3;
        int[]arr2=new int[istenenSayi];
        int index =0;
        for (int i =istenenSayi; i > 0; i--) {
            arr2[index]=arr[arr.length-i];
            index++;

        }
        System.out.println(Arrays.toString(arr2));

    }

}
