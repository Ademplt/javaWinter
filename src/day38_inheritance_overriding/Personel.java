package day38_inheritance_overriding;

public class Personel {
   public String statu="Personel";
   public String haklar="Tum Personel esit haklara sahiptir";
   public String izin="tum personel yilda";
    public void mesai(){
        System.out.println("tum personel 5 gun,gunde 8 saat calisir");
    }
    public void maasHesapla(){
        System.out.println("Tum personel 30 gun * 8 saat * 10 Euro = "+(30*8*10)+"Maas alir");
    }
}
