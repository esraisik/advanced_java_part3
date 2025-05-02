package day34_Maps;

import java.util.Set;

public class C05_BolumListesiYazdir  extends MapDepo{
    public static void main(String[] args) {


        // verilen bölümdeki tum ögrencilerin
        //Numara, isim, soyisim ve subeleri yazdırın

        String istenenBolum= "MF";

        System.out.println(istenenBolum + "Bolumdeki ogrenci listesi : ");
        // numara da istendiği için sadece value yetmez, key'leri de kullanmamız  gerekir
        // 1- Tum key'leri kaydedelim

        Set<Integer> ogrenciKeySeti =ogrenciMap.keySet();

        // 2- Herbir key'i ele almak için for each loop yapalım

        for (Integer eachKey :ogrenciKeySeti) {
            //ornek eacKey : 101

            // for each loop her bir key'i bize getirecek
            //ama aradığımız bilgiler ke'de degil value'de

            String eachValue = ogrenciMap.get(eachKey); //"Ali-Can-11-H-MF"

            // 3- istenen bilgilere ulasmak için eachValue'yu split edelim

            String[] eachValueArr = eachValue.split("-");
            //[Ali, Can, 11, H, MF]

            // 4- artık istenen bilgilere ulasabiliyoruz
            //    verilen görevleri yapalım

            if(eachValueArr[4].equalsIgnoreCase(istenenBolum)) {

                System.out.println(
                        eachKey + " " +
                        eachValueArr[1] +" "+
                        eachValueArr[2] +" "+
                        eachValueArr[3]
                );
            }


        }
    }
}
