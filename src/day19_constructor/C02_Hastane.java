package day19_constructor;


public class C02_Hastane {

    /*
        C02_Hastane (){

            }
     default constructor parametresizidr
     ve body'sinde kod yoktur.

     gorunur bir constructor olusturulduğunda
     java default constructor'ı siler

     */


    String perIsim = "isim atanmamıs";
    String perAdres = "adres atanmamıs";
    String perTel = "tel atanmamıs";


    C02_Hastane() {
        System.out.println("Parametresiz cons. calıstı");
    }
    // Bu default constructor degildir.
    // Bu parametresiz constructor'dır
}
