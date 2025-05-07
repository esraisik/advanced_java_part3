package day36_MapsMethods;

import java.awt.image.ImageProducer;
import java.util.Map;
import java.util.TreeMap;

public class C01_maps {

    public static void main(String[] args) {


        //Soru : Verilen bir array’de kullanilan sayilari
        //       ve kacar defa kullanildigini yazdirin.
        //  Input : {1,2,4,4,5,3,4,1,5,1,4,2,4,1}
//  output :
//  1 kullanimi : 4 adet
//  2 kullanimi : 2 adet
//  3 kullanimi : 1 adet
//  4 kullanimi : 5 adet
//  5 kullanimi : 2 adet


        // 1= 4, 2=2, 3=1, 4=5, 5=2}

        Map<Integer, Integer> kullanimSayilariMap = new TreeMap<>();

        int[] arr = {1, 2, 4, 4, 5, 3, 4, 1, 5, 1, 4, 2, 4, 1,};

        System.out.println(kullanimSayilariMap);

        for (int each : arr) {

            // eger baktığı eleman map^te yoksa ekleyecek vevalue2sunu 1 yapacak

            if (kullanimSayilariMap.containsKey(each)) {
                kullanimSayilariMap.put(each, 1);

            } else {
                // eger eleman varsa onun da value'sunu bır artır.
                // int oldvalue= kullanılanSayılarMap.get(each)
                kullanimSayilariMap.put(each, kullanimSayilariMap.get(each) + 1);
            }
        }
        System.out.println(kullanimSayilariMap);
    }

}

