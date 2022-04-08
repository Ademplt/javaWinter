package practice_basic_day02;

import java.util.Scanner;

public class Q11_StringManipulation05 {
    /*
     * Kullanicidan 4 kelime isteyin ve cumle olarak yazdirip sonuna . koyun
     *
     * Ornek : Inputs : cesaret, insana, sinirlarini, ogretir
     *         Output : Cesaret insana sinirlarini ogretir.
     *
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen 1. kelime giriniz");
        String kelime1=scan.next().toLowerCase();
        System.out.println("Lutfen 2. kelime giriniz");
        String kelime2=scan.next().toLowerCase();
        System.out.println("Lutfen 3. kelime giriniz");
        String kelime3=scan.next().toLowerCase();
        System.out.println("Lutfen 4. kelime giriniz");
        String kelime4=scan.next().toLowerCase();
        System.out.println("cumle kurmdan once : "+kelime1+" ," +kelime2+"," +kelime3+"," +kelime4);


        System.out.println( "cumle: " + kelime1.toUpperCase().charAt(0)+kelime1.substring(1)+" "
                +kelime2+" " +kelime3+" " +kelime4+".");


    }
}
