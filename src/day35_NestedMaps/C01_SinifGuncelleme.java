package day35_NestedMaps;

import day34_Maps.MapDepo;

import java.util.Set;

public class C01_SinifGuncelleme extends MapDepo {

    public static void main(String[] args) {

        // Yil sonu sınıf artırma yapın
        // her ogrenciyi bir ust sınıfa gecirin
        // sınıf 12 ise mezun yapın,zaten mezun olanlara dokunmayın

        System.out.println(ogrenciMap);

         /*
            {101=Ali-Can-11-H-MF,
            102=Veli-Cem-10-K-TM,
            103=Ali-Cem-11-K-TM,
            104=Ayse-Can-10-H-MF,
            105=Sevgi-Cem-11-M-TM,
            106=Sevgi-Can-10-K-MF,
            107=Esra-Han-11-M-SOZ}

         */

        MapDepo.yilSonuSinifArtir();
        System.out.println(ogrenciMap);

        MapDepo.yilSonuSinifArtir();
        System.out.println(ogrenciMap);


    }
}
