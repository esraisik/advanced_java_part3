package day34_Maps;

import java.util.Set;

public class C09_BolumleriDegistir extends MapDepo {


    public static void main(String[] args) {

        // ogrenci map'inde tum ögrencileri gözden gecirip
        // verilen eski bolum bilgisine sahip olanları
        // yeniBolum olarak update edin

        System.out.println(ogrenciMap);

        String eskiBolum= "TM";
        String yeniBolum= "Say";

        //Tum ogrencilerin key ve value'lerini gozden gecirmemiz gerekiyor

        // 1- key'leri bir Set olarak kaydedelim

        Set<Integer> ogrenciKeySeti =ogrenciMap.keySet();

        // 2- tum key'leri elden gecirmek için for-each loop lazım

        for (Integer eachKey : ogrenciKeySeti) {

            // biz key'leri elden geciriyoruz ama bolum bilgisi value'de
            // eachKey'i kullanarak eskiValue'yu kaydedelim

            String eskiValue = ogrenciMap.get(eachKey);

            String [] eskiValueArr= eskiValue.split("-");  // [Veli, Kaya, 10, K, TM]

            if(eskiValueArr[4].equalsIgnoreCase(eskiBolum)) {
                eskiValueArr[4] =yeniBolum;
            }

            String yeniValue = String.join("-",eskiValueArr);
            ogrenciMap.put(eachKey,yeniValue);

        }

        System.out.println(ogrenciMap);
    }
}
