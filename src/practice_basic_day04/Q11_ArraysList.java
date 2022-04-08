package practice_basic_day04;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Q11_ArraysList {


    public static void main(String[] args) {
        /*  Rastgele kullanici adi olusturan JAVA kodu yaziniz.
         *  1. Kullanicidan ismini isteyelim
         *  2. Kullanici adindaki bosluklari silelim.
         *  3. Kullanici adinin alinabilir olup olmadigina bakalim.
         *  4. Eger bizim listemizde oyle bir kullanici adi yoksa kullanici adi, kullanicinin girdigi isim olsun.
         *  5. Eger bu kullanici adi zaten varsa, sonuna rastgele sayi olusturup ekleyelim, ve gosterelim.

         */

        // 1. adim

        List<String> kullaniciList = new ArrayList<String>();
        kullaniciList.add("adempolat");
        kullaniciList.add("bugra");
        kullaniciList.add("kazim");
        kullaniciList.add("hacer");
        kullaniciList.add("derya");

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen kullanici adinizi giriniz");
        String username = scan.nextLine();

        // 2. adim
        String userNew = username.replaceAll("\\s", "");

        // 3. adim
        System.out.println(userNew);
        Random rand = new Random();
        int xx = rand.nextInt(100);

        // 4. adim

        for (int i = 0; i < kullaniciList.size(); i++) {

            if (!kullaniciList.contains(userNew)) {

                System.out.print("Kullanici adiniz " + userNew + " olarak onaylanmistir ");
                break;

            } else {
                System.out.println("Kullanici adiniz baskasi tarafindan kullanildigi icin : " + userNew + xx + " kullanabilirsiniz");
                break;
            }

        }
        scan.close();
    }
}
