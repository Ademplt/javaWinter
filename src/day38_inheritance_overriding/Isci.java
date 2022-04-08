package day38_inheritance_overriding;

public class Isci extends Personel{
    public String statu="Isci";
    public String haklar="Isciler kidem tazminati alir";

    public void mesai(){
        System.out.println("tum isciler haftalik 40 saat calisir");
    }
    public void maasHesapla(){
        System.out.println("Tum personel 30 gun * 8 saat * 10 Euro = "+(30*8*10)+"Maas alir");
    }
}
