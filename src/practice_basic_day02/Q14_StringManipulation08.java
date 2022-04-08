package practice_basic_day02;

import java.util.Scanner;

public class Q14_StringManipulation08 {

    /*
		name1 ve name2 degiskenlerini olusturun.
		name1 degiskeninin karakter sayisi cift ise kelimenin ortasina name2 yi yerlestirin.
		name1 degiskeninin karakter sayisi tek ise "name1 cift sayili olmadigi icin ortasina yerlestiremedik" yazdirin.
		          e.g:
		         name1= mehmet
		         name2= ahmet
		         Print ==> mehahmetmet

     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir isim giriniz");
        String name1= scanner.nextLine();
        System.out.println("Lutfen ikinci isimi giriniz");
        String name2= scanner.nextLine();
        int name1Uzunluk=name1.length();



        if (name1Uzunluk%2==0){
            System.out.println("yeni kelime :"+name1.substring(0,name1Uzunluk/2)+
                    name2+name1.substring(name1Uzunluk/2,name1.length()));

        }else {
            System.out.println("name1 cift sayili olmadigi icin ortasina yerlestiremedik ");
        }

    }
}
