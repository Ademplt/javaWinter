package practice_basic_day04;

public class Q09_Arrays {
    public static void main(String[] args) {
        /*
         * Girilen Multidimensional arraydeki cift sayilari toplayan bir method
         * yaziniz
         * INPUT : {{1,3,6},{2,8},{5,7,9,14}}
         *
         * OUTPUT : Arraydeki cift sayilarin toplami : 30
         */

      int arr[][]={{1,3,6},{2,8},{5,7,9,14}};
      int sum=0;
        System.out.print("Arrayde ki cift sayilar : ");
      for(int i=0; i<arr.length; i++){
          for(int j=0; j<arr[i].length; j++){
              if (arr[i][j]%2==0){
                  System.out.print(","+ arr[i][j]);
                  sum+=arr[i][j];
              }
          }
      }
        System.out.println(" ");
        System.out.println("Arrayde ki cift sayilarin toplami : "+ sum);
    }
}
