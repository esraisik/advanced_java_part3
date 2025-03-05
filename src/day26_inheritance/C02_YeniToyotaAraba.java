package day26_inheritance;

import day25_encaptulation_inheritance.C09_Toyota;

public class C02_YeniToyotaAraba extends C09_Toyota {

    // Class cannot extend multiple classes

    String model = "Yeni model";

    public static void main(String[] args) {

        C02_YeniToyotaAraba obj1 = new C02_YeniToyotaAraba();


    }
            /*
                Bir obje olusturulurken
                objeyi olusturup ilk deger atamasını Constructor yapar

                constructor çalısmaya baslamadan önce
                obje yoksa objeyi olusturur
                ve ait olduğu class'taki instance variable'lar ve degerlerinin birer kopyasını alıp
                objeye yapıstırır.


                Child class'tan obje olusturuldugunda
                on-bjenin Parent class(lar)'daki özelliklere de sahip olabilmesi için
                parent class constructor'larının da calısması ZORUNLUDUR.

                Java bunu super() sayesinde otomatik olarak yapar.




             */


}
