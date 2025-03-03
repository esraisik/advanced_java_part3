package day25_encaptulation_inheritance;

public class C03_EncapsuleRapor {

    private int satisTutari;

    public void setSatisTutari(int satisTutari) {
        this.satisTutari = satisTutari;

        toplamSatisTutari += satisTutari;
    }

    //baska class'lardan deger  atamasi yapılabilsin - write yetkisi  OK
    //ama atanmis degerleri kimse göremesin        - read yetkisi   yasak


    private int toplamSatisTutari;

    public int getToplamSatisTutari() {

        return toplamSatisTutari;
    }

    // baska class'lardan deger atamasi YAPILAMASIN - write yetkisi  yasak
    //ama atanmıs degeri GÖREBİLSİN                  -read yetkisi    OK


}
