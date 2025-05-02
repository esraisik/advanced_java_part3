package day34_Maps;

import java.util.Collection;

public class C02_IsimleOgrenciListele extends MapDepo {

    public static void main(String[] args) {

        // ogrenci map'inde verilen isme


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

        String istenenIsim = "Ali";

        // 1- ismi görebilmel için value'lere ihtiyacım var

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

        System.out.println("Ismi " + istenenIsim + " olan ogrenci listesi : ");

        //2- her bir value'yu elden gecirip bilgileri kontrol etmek için for each loop kullanalım
        for (String eachValue : valueCollections) {
            //ornegın each bize "Ali-Can-11-H-MF" getirdi

            // 3- valure içindeki isim bilgisine ulasmak için split edelim

            String[] eachValueArr = eachValue.split("-");
            //[Ali, Can, 11, H, MF]

            // 4- ARTIK istediğimiz bilgiye ulasabiliriz
            //bizden istenen görevi yapalım

            // verilen isme sahip öğrencilerin isim, soyisim, sinif, ve subelerini yazdırın

            if (eachValueArr[0].equalsIgnoreCase(istenenIsim)) {
                System.out.println(eachValueArr[0] + " " +
                        eachValueArr[1] + " " +
                        eachValueArr[2] + " " +
                        eachValueArr[3]
                );

            }


        }


    }
}
