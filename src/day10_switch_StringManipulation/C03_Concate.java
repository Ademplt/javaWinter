package day10_switch_StringManipulation;

public class C03_Concate {
    public static void main(String[] args) {
        String str1="java";
        String str2=" Candir";
        //java candir yazdiralim
        System.out.println(str1 + " "+str2);

        String cumle=str1.concat(str2);
        System.out.println(cumle);
        cumle=str1.concat(" ").concat(str2);
        System.out.println(cumle);

        // concat icine string degilde sayi veya boolean ne olur
        //cumle= str1.concat(5);
        // cumle=str1.concat(true);
        cumle= str1.concat(5+ " ");
        cumle=str1.concat(" "+ true);


    }
}
