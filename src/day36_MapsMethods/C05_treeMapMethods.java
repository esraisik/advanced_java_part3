package day36_MapsMethods;

import java.util.TreeMap;

public class C05_treeMapMethods {

    public static void main(String[] args) {

        /*
            Map<String,Integer> map= new TreeMap<>();

            biz bu göstermede obje'yi treeMap yapmamıza ragmen
            data türü string secildiği için
            BÜTÜN MAP özelliklerine ulaşabilirz

            Ama data türü de TreeMap secilirse
            sadece treeMap'e özgü metotlar kullanılır

         */

        TreeMap<String,Integer> treeMap= new TreeMap<>();
        treeMap.put("H",40);
        treeMap.put("T",10);
        treeMap.put("M",50);
        treeMap.put("L",65);
        treeMap.put("C",45);
        treeMap.put("SS",25);

        //TreeMap index kullanmamasına ragmen doğal sıralı olduğu için
        // bastaki ve ssondaki ya da onalrdan bir önce ve sonrakı elemana ulasabilirz

        System.out.println(treeMap.firstKey());
        System.out.println(treeMap.lastKey());
        System.out.println(treeMap.firstEntry());
        System.out.println(treeMap.lastEntry());

        System.out.println(treeMap.tailMap("M"));
        System.out.println(treeMap.tailMap("L", true));
        System.out.println(treeMap.tailMap("L", false));


        System.out.println(treeMap.headMap("L"));
        System.out.println(treeMap.headMap("L",true));
        //headMap() verilen keyden öncekileri getirir


        System.out.println(treeMap.higherKey("H"));
        System.out.println(treeMap.ceilingKey("H"));

        System.out.println(treeMap.descendingMap()); // sıralamayı tersine cevirir

        System.out.println(treeMap.pollFirstEntry());
        System.out.println(treeMap);


    }
}
