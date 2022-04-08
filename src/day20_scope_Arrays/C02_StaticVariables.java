package day20_scope_Arrays;

public class C02_StaticVariables {

    static String okulIsmi = "Yildiz Koleji";
    static int okulNo;
    static boolean okulAcikMi;

    public static void main(String[] args) {
        System.out.println(okulIsmi);

    }
    public static void staticMethod(){
        okulNo=200;
    }

}
