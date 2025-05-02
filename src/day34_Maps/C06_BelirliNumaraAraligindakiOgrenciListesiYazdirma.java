package day34_Maps;

import java.util.Set;

public class C06_BelirliNumaraAraligindakiOgrenciListesiYazdirma extends MapDepo {

    public static void main(String[] args) {

        // verilen baslangic ve bitis numaralari dahil olmak uzere
        // bu numaralar arasindaki ogrencilerin
        // No,isim ve soyismlerini yazdirin


        int basNo= 102;
        int bitNo=105;

        System.out.println(basNo +" ile " + bitNo + " numaralari arasindaki ogrenci listesi");
        Set<Integer> ogrenciKeySeti =ogrenciMap.keySet();

        // butun key'leri elden gecirmek icin for-each loop
        for(Integer eachKey :ogrenciKeySeti) {

            //  bu defa kontrol value'de degil key'de

            if (eachKey >= basNo && eachKey<= bitNo) {

                //isim ve soyisimlere ulasabilmek için value'ye ihtiyacımız var

                String eachValue = ogrenciMap.get(eachKey);

                //valudeki bilgilere ulasmak için split yapmalıyız

                String[] eachValueArr = eachValue.split("-");

                // artık istedigimiz bilgilere ulasabilirz

                System.out.println(
                        eachKey + " " +
                        eachValueArr[0] + " "+
                        eachValueArr[1]
                );

            }
        }


    }
}
