package day24_lists;

import java.util.ArrayList;
import java.util.List;

public class C03_Remove {
    public static void main(String[] args) {
        List<Integer> sayilar=new ArrayList<>();
        sayilar.add(5);
        sayilar.add(3);
        sayilar.add(0,7);

       // int sayi=5;
       // sayilar.remove(sayi); //
        System.out.println(sayilar);
        Integer sayi=5;
        sayilar.remove(sayi);
        System.out.println(sayilar);

    }

}
