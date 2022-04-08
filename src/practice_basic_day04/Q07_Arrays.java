package practice_basic_day04;

import java.util.Arrays;

public class Q07_Arrays {
    public static void main(String[] args) {
        /*
         * {{1,2,3}, {2,3,1} , {5,5,5} , {2,1,3}} int 2D arrayini  olustur
         *  2D arrayinden min number print et
         */

        int arr[][] ={{1,0,3}, {2,3,-1} , {5,5,5} , {2,1,3}};
       int enKucukSayi=Integer.MAX_VALUE;
       for(int i=0; i<arr.length; i++){
           for (int j = 0; j <arr[i].length ; j++) {
               if(arr[i][j]<enKucukSayi){
                   enKucukSayi=arr[i][j];
               }

           }
       }
        System.out.println("Arrayde ki en kucuk eleman : " + enKucukSayi);

    }
}
