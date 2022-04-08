package practice_basic_day04;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Q10_Arrays {
    public static void main(String[] args) {
        /*
         *  Verilen bir cumledeki bosluklar haric character sayisini bulunuz.
         *  Cumle: Verilen bir cumledeki bosluklar haric character sayisini bulunuz.
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir cumle giriniz");
        String cumle=scan.nextLine();

        String newcumle=cumle.replaceAll("\\s" ,"");
        System.out.println(newcumle);
       String[]newArr=newcumle.split("");
        System.out.println(Arrays.toString(newArr));
        System.out.println(newArr.length);



    }
}
