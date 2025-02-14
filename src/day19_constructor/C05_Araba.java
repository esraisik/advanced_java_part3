package day19_constructor;

public class C05_Araba {

    String marka = "marka atanmamıs";
    String model = "model atanmamıs";
    String renk = "Renk atanmamıs";
    int yil = 1900;
    int fiyat;

    C05_Araba() {
        // bir Kod blogunun constructor olması için
        //MUTLAKA 2 sarti karşılaması gerekir
        // 1- ismi class ismi ile aynı olmalıdır (buyuk harfle baslar)
        //2- return type olmaz

    }

    void method1() {
        // return type varsa method'dur
    }

    void C05_Araba() {
        // ismi class ismi ile aynı
        // AMMAA return type oldugu için method'dur.

    }
    /*
    C005_Araba(){
        // ismi class ismi ile aynu degil,Constructor olamaz
        // return type yok, method olamaz
        // CTE verir, CALISMAZ
    }

     */
}
