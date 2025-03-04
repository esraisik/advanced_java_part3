package day25_encaptulation_inheritance;

public class C09_Toyota extends C08_Araba {

    // Dunya'da Toyota olarak adlandırılıp
    // modeli olmayan bir arac yok
    //o zaman bu Toyota Class'ı kendisinden obje olusturmak için degil
    // alt class'laro bir catı aştında toplamak icin olusturulmustur


    // 1- bu class baslangıc itibariyle parant'i olan
    //    C08_Araba Class'indaki tüm ozelliklere sahiptır diyebiliriz.
    //    ornegın bu class'ta marka ,kasa yada motor variable'ları olmasa da
    //    parent Class'taki var olan variable'ları kullanabiliriz.


    protected C09_Toyota() {

        // System.out.println(marka);
        // System.out.println(kasa);
        // motor="1.4 benzinli";


    }

    // 2- Toyota class'ı isterse parent clas'ı olan Arabaa class'indaki
    //    bazı veriable'ları kendisine uyarlayabilir.

    protected String marka = "Toyota";
    protected String motor = "Çevreye duyarli motor";

    // 3- Toyota class'ı isterse parent class'ında olmayan
    //    yeni özellikler ekleyebilir


    protected String lastik = "Pirelli";
    protected String guvenlik = "DGS1001";
    protected String fren = "ABS";

    // bu durumda Toyota class2ından olusturulacak obje olan
    // Araba class'ından 3 adet ( model, sanzıman, kasa)
    // guncellediği 2 adet (marka, motor)
    // ve yeni eklediği 3 adet (lastik, guvenlil, fren)
    // toplam 8 ozelliğe sahip olur


}
