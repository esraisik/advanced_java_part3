package day34_Maps;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class C01_MappOlusturmaveMapMethodlari {


    public static void main(String[] args) {

        // bir öğrenci map'i olusturalım
        //map'te ögrencilerin no, isim,soyisim,sınıf, sube ve bölümleri olsun

        // 1- key ve value ne olacak ve nelerden olusacak
        //    key ==> no value==> isim,soyisim,sınıf, sube ve bölümleri

        // 2- value'yü hangi data türünde tutalım
        //    value'yu String olarak tutalım

        // 3- value'deki bilgileri hangi sıra ile olusturacağız
        //    ve nasıl birlestireceğiz
        // bilgileri   "isim-soyisim-sınıf-sube-bölümleri " seklinde  tutacağız

        //4- bu durumda map için key ve value data type'ları ne olacak


        Map<Integer, String> ogrenciMap = new HashMap<>();

        System.out.println(ogrenciMap); // {}

        // Map'e ekleme için put() kullanılır

        ogrenciMap.put(101, "Ali-Can-11-H-MF");
        ogrenciMap.put(102, "Veli-Cem-10-K-TM");
        ogrenciMap.put(103, "Ali-Cem-11-K-TM");
        ogrenciMap.put(104, "Ayse-Can-10-H-MF");
        ogrenciMap.put(105, "Sevgi-Cem-11-M-TM");
        ogrenciMap.put(106, "Sevgi-Can-10-K-MF");
        ogrenciMap.put(107, "Esra-Han-11-M-SOZ");

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


        // map'te kaç eleman var?

        System.out.println(ogrenciMap.size()); // 7

        System.out.println(ogrenciMap.isEmpty()); // false

        //keyî vererek value'yu getirtmek istersek
        System.out.println(ogrenciMap.get(101)); // Ali-Can-11-H-MF

        // contains() key ve value ayrı olrak kullanılır
        // containsvalue() value içindeki bir bölümü değil, bir BUTUN olarak value'yu kontrol eder
        System.out.println(ogrenciMap.containsKey(104));// true
        System.out.println(ogrenciMap.containsKey(110));// false

        System.out.println(ogrenciMap.containsValue("Can")); // false
        System.out.println(ogrenciMap.containsValue("Esra-Han-11-M-SOZ")); // true

        // update için replace() KULLANILABİLİR
        ogrenciMap.replace(102, "102=Veli-Cem-10-K-Say");
        //aynı işlem put ile de olabilir
        ogrenciMap.put(103, "Ali-Cem-11-K-say");

        // replace'in bir avantajı olabilir
        ogrenciMap.replace(104, "Ayse-Can-10-H-MF", "Ayse-Can-10-H-Soz");
        ogrenciMap.replace(104, "Ayse-Can-10-H-MF", "Hamza-Kavas-10-H-Soz");

        System.out.println(ogrenciMap);

        // map'teki tum key'leri ayrı bir java yapısına kaydedin
        Set<Integer> ogrenciKeySeti = ogrenciMap.keySet();

        // map'teki tum value'leri ayrı bir java yapısına kaydedin
        Collection<String> ogrenciValueCollection = ogrenciMap.values();

        System.out.println("Tum key'ler " + ogrenciKeySeti);
        // [101, 102, 103, 104, 105, 106, 107]

        System.out.println("Tum value'ler " + ogrenciValueCollection);
        //[Ali-Can-11-H-MF, 102=Veli-Cem-10-K-Say, Ali-Cem-11-K-say, Ayse-Can-10-H-Soz, Sevgi-Cem-11-M-TM, Sevgi-Can-10-K-MF, Esra-Han-11-M-SOZ]


        //NOT : Eger bize verilen gorev sadce value'ler ile ilgili ise
        //      ogrenciValueCollection kullanabiliriz
        //      AMMAAA hem key hem value'ye ihtiyacimiz varsa
        //      ogrenciKeySeti'ni kaydedip, sonra key kullanarak value'ye de ulasabiliriz


    }

}
