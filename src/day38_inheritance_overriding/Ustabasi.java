 package day38_inheritance_overriding;

public class Ustabasi extends Isci {
    public String statu="Ustabasi";
    public String haklar="Ustabasi haftada bir gun ekstra tatil hakkina sahiptir";
    public void mesai(){

        System.out.println("tum personel 5 gun,gunde 8 saat calisir");
    }
    public void maasHesapla(){
        System.out.println("Ustabasi 30 gun * 8 saat * 10 Euro = "+(30*8*12)+"Maas alir");
    }

    public static void main(String[] args) {

        //icinde oldugumuz klastan klasik haliyle bir obje olusturursak
        //o obje ile cagirdigimiz variable ve methodlarda java once icinde bulundugumuz klasa bakar
        //aradigimiz klas uysei icinde oldugumuz klasta varsa bize onu getirir.
        //yoksa parent klaslara bakar ilk bulgunu getirir
        Ustabasi yasin=new Ustabasi();
        System.out.println(yasin.statu); //ustabasi
        System.out.println(yasin.haklar); //Ustabasi haftada bir gun ekstra tatil hakkina sahiptir

        /*
        Eger isci olarak ozelliklerini gormek istersek
        class adini data turunu isci seceriz
         */
        Isci ahmet=new Ustabasi();
        System.out.println(ahmet.statu);
    }
}
