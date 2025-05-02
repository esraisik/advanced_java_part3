package day34_Maps;

public class Runner {
    public static void main(String[] args) {

        MapDepo.isimdenListeYazdir("Ali");
        //Ismi Ali olan ogrenci listesi
        //Ali Can 11 H
        //Ali Cem 11 K

        MapDepo.isimdenListeYazdir("veli");
        //Ismi veli olan ogrenci listesi
        //Veli Cem 10 K

        MapDepo.sinifSubeListesiYazdir(10,"k");
        //10/k sinifi ogrenci listesi
        //Veli Cem
        //Sevgi Can

        MapDepo.sinifSubeListesiYazdir(11,"M");
        //11/M sinifi ogrenci listesi
        //Sevgi Cem
        //Esra Han

        MapDepo.soyIsimdenListeYazdir("can");
        //Soyismi Can olan ogrenci listesi
        // Ali 11 H
        // Ayse 10 H
       // Sevgi 10 K

        MapDepo.bolumListeYazdir("MF");

        //MFBolumdeki ogrenci listesi :
        //101 Can 11 H
        //104 Can 10 H
        //106 Can 10 K

        MapDepo.numaraAraligindakiOgrenciListesi(104,106);
        //104 ile 106 numaralari arasindaki ogrenci listesi
        //104 Ayse Can
        //105 Sevgi Cem
        //106 Sevgi Can


        MapDepo.numaraiIleSoyisimUpdate(102,"Mutlu");
        MapDepo.numaraiIleSoyisimUpdate(103,"Sen");

        System.out.println(MapDepo.ogrenciMap);

        MapDepo.bolumGuncelle("Mf","Say");

        System.out.println(MapDepo.ogrenciMap);


    }

}
