package day34_Maps;

import java.util.Collection;
import java.util.Map;

public class C04_SoyisimdenOgrenciListesi extends MapDepo {

    public static void main(String[] args) {

        // Verilen  soyisme sahip ogrencilerin
        // isim, sınıf ve subelerini liste olarak yazdırın

        String istenenSoyIsim = "Han";

        // 1- Soyismi görebilmek için value'lere ihtiyacım var

        Collection<String> valueCollections = ogrenciMap.values();

        System.out.println(valueCollections);
        /*
            [Ali-Can-11-H-MF,
             Veli-Cem-10-K-TM,
             Ali-Cem-11-K-TM,
             Ayse-Can-10-H-MF,
             Sevgi-Cem-11-M-TM,
             Sevgi-Can-10-K-MF,
             Esra-Han-11-M-SOZ]


         */

        System.out.println("Soyismi " + istenenSoyIsim +" olan ogrenci listesi : ");

        //2- her bir value'yu elden gecirip bilgileri kontrol etmek için for each loop kullanalım
        for (String eachValue : valueCollections) {
            //ornegın each bize "Ali-Can-11-H-MF" getirdi

            // 3- valure içindeki isim bilgisine ulasmak için split edelim

            String[] eachValueArr = eachValue.split("-");
            //[Ali, Can, 11, H, MF]

            // 4- ARTIK istediğimiz bilgiye ulasabiliriz
            //bizden istenen görevi yapalım

            // verilen soyisme sahip öğrencilerin isim,sinif, ve subelerini yazdırın

            if (eachValueArr[1].equalsIgnoreCase(istenenSoyIsim)) {
                System.out.println(eachValueArr[0] + " " +
                                   eachValueArr[2] + " " +
                                    eachValueArr[3]
                        );
            }

        }
    }
}
