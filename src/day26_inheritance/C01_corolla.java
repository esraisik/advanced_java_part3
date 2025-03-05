package day26_inheritance;

import day25_encaptulation_inheritance.C09_Toyota;

public class C01_corolla extends C09_Toyota {


    /*
          1- baslangıc itibariyle parent'i olan Toyota
             ve grand parent'i olan araba class'larındaki
             tum özelliklere sahiptir.

          2- Corolla class'i parent ve grandparent Class'larındaki
             isteği variable'ları kendisine UYARLAYABİLİR

          3- Corolla class'ı butun corolla araclarda olan
             ama parent class'ı Toyota veya grandparent'ı olan Araba class'larında olmayan
             YENI variable'lar ekleyebilir.


     */

    String model = "Corolla";
    String kasa = "Corolla kasası";
    String motor = "vvdi";
    String lastik = "15 inch Pirelli";

    String uretimYeri = "Turkiye";
    String aku = "Inci aku";
    String renk = "renk secilmedi";
    String yakitTuru = "yakit turu secilmedi";

    C01_corolla() {
        // System.out.println(marka); // Toyota
        //System.out.println(motor);// Cevreye duyarlı motor
        //System.out.println(kasa); // kasa secilmedi
    }

    public static void main(String[] args) {

        C01_corolla corolla1 = new C01_corolla();

        System.out.println(corolla1.sanzuman);// A sanzuman secilmedi

        System.out.println(corolla1.marka); // T Toyota
        System.out.println(corolla1.guvenlik); // T DGS1001
        System.out.println(corolla1.fren); // T ABS

        System.out.println(corolla1.model); // C corolla
        System.out.println(corolla1.kasa); // C corolla Kasasi
        System.out.println(corolla1.motor); // C vvdi
        System.out.println(corolla1.lastik); // C 15 inch Pirelli
        System.out.println(corolla1.uretimYeri); // C Turkiye
        System.out.println(corolla1.aku); // C Inci aku
        System.out.println(corolla1.renk); // C renk secilmedi
        System.out.println(corolla1.yakitTuru); // C yakıt turu secilmedi

        corolla1.sanzuman = "Otomatik";
        corolla1.kasa = "Corolla sedan";
        corolla1.renk = "Kirmizi";
        corolla1.yakitTuru = "Hybrit";
    }

}
