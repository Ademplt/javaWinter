package practice_basic_day02;

import java.util.Scanner;

public class Q13_StringManipulation07 {
    /*
     * girilen String icinde "xyz" dizimi var ise true degilse false return eden metod yaziniz
     *
     * input      output
     * axyzm  ==   true
     * xyz    ==   true
     * x.yz   ==   false
     * xyaz   ==   false
     */
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir icinde xyz dizimi olan string giriniz");
        String str=scan.nextLine().toLowerCase();
        if (str.indexOf("xyz")==-1){
            System.out.println("false");

        }else {
            System.out.println("true");
        }

    }
}
