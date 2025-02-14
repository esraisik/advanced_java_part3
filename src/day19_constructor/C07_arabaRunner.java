package day19_constructor;

public class C07_arabaRunner {

    public static void main(String[] args) {

        // Bir class'ta default constructor kullanılıyorsa
        //olusturulan TUM objeler
        // class'ta atanmıs olan ilk degerlerine sahip olur


        C06_Araba araba1 = new C06_Araba();

        System.out.println(araba1.marka);//Toyota
        System.out.println(araba1.fiyat);//3000

        System.out.println(araba1.toString());
        //Araba ozellikler==>marka:Toyota, model:Corolla, renk:Kirmizi, yil:2012, fiyat:3000

        System.out.println(araba1);
        //Araba ozellikler==>marka:Toyota, model:Corolla, renk:Kirmizi, yil:2012, fiyat:3000


        araba1.marka = "Opel";
        araba1.model = "Corsa";

        System.out.println(araba1);
        // Araba ozellikler ==> marka :Opel, model :Corsa, renk :Kirmizi, yil :2012, fiyat :3000


        C06_Araba araba2 = new C06_Araba();
        System.out.println(araba2);
        // Araba ozellikler ==> marka :Toyota, model :Corolla, renk :Kirmizi, yil :2012, fiyat :3000


    }


}
