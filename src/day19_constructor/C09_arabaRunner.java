package day19_constructor;

public class C09_arabaRunner {

    // Eger default constructor disinda
    // bir constructor kullanılıyorsa
    // her obje için mutlaka constructor'da yapılan
    //islemler kontrol edilmelidir


    public static void main(String[] args) {

        C08_Araba araba = new C08_Araba();

        System.out.println(araba.yil);// 2023
        System.out.println(araba.marka);//Opel

    }


}
