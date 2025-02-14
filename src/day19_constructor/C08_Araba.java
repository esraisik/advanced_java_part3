package day19_constructor;

public class C08_Araba {

    String marka = "Toyota";
    String model = "Corolla";
    String renk = "Kirmizi";
    int yil = 2018;
    int fiyat = 3000;


    C08_Araba() {
        marka = "opel";
        if (yil < 2020) {
            yil = yil + 5;
        }
    }


}
