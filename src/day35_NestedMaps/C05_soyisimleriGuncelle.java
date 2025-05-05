package day35_NestedMaps;

import java.util.Set;

public class C05_soyisimleriGuncelle extends NestedMapDepo {

    public static void main(String[] args) {

        // tum ogrencilerin soyisimlerini buyuk harf yapın

          /*
            {
                101={sinif=11, sube=K, soyisim=Cem, bolum=TM, isim=Ali},
                102={sinif=10, sube=M, soyisim=Can, bolum=MF, isim=Ipek},
                103={sinif=11, sube=L, soyisim=Can, bolum=MF, isim=Esra},
                104={sinif=10, sube=L, soyisim=Cem, bolum=TM, isim=Maya},
                105={sinif=12, sube=K, soyisim=Kaya, bolum=Soz, isim=Hamza},
                106={sinif=9, sube=M, soyisim=Kaya, bolum=Soz, isim=Dilan}
                107={sinif=12, sube=K, soyisim=Han, bolum=Soz, isim=Veli}}
         */


        // 1- key'leri bir Set olarak kaydedelim

        Set<Integer> ogrenciKeySeti = ogrenciMap.keySet();

        // 2- butun key'leri elden gecirelim

        for (Integer eachKey : ogrenciKeySeti) {

            // gelen her eachKey'e ait value'de soyismi update edelim

            String eskiSoyisim = ogrenciMap.get(eachKey).get("soyisim");
            String yeniSoyisim = eskiSoyisim.toUpperCase();

            // Map'i yeni soyisim ile guncelleyelım

            ogrenciMap.get(eachKey).put("soyisim", yeniSoyisim);

            //isterseniz 3 satırı tek satırda yapabilirz
            // ama islemin anlasılır olması ıcın 3 adımda yaptık

            System.out.println(ogrenciMap);
        }
    }
}
