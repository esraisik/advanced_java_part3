package day34_Maps;

import javax.xml.transform.Source;
import java.util.Collection;

public class C03_SubeListesiYazdirma extends MapDepo{

    public static void main(String[] args) {

        // verilen sinif ve subedeki tum ögrencilerin isim ve soyisimlerini yazdırın

        int istenenSinif = 10;
        String istenenSube ="K";

        // Sadece value yeterli

        System.out.println(istenenSinif +"/" +istenenSube + " sinifi ogrenci listesi");
        // 1- Sınıf ve subeyi görebilmel için value'lere ihtiyacım var

        Collection<String> valueCollections = ogrenciMap.values();

        //2- her bir value'yu elden gecirip bilgileri kontrol etmek için for each loop kullanalım
        for (String eachValue : valueCollections) {

            //ornegın each bize "Ali-Can-11-H-MF" getirdi

            // 3- value içindeki sınıf ve sube bilgisine ulasmak için split edelim

            String[] eachValueArr = eachValue.split("-");
            //[Ali, Can, 11, H, MF]

            // 4- ARTIK istediğimiz bilgiye ulasabiliriz
            //bizden istenen görevi yapalım

            // verilen sınıf ve subedeki tum ogrencilerin isim ve soyisimlerini yazdırın

            if ((istenenSinif+"").equalsIgnoreCase( eachValueArr[2])
                && istenenSube.equalsIgnoreCase( eachValueArr[3]) ) {

                System.out.println(eachValueArr[0] + " " + eachValueArr[1]);

            }


        }


    }
}
