package day36_MapsMethods;

import java.util.Map;
import java.util.TreeMap;

public class C04_mapsMethotlari {

    public static void main(String[] args) {

        Map<String, Integer> map = new TreeMap<>();
        map.put("W", 10);
        map.put("W", 100);
        map.put("I", 40);
        map.put("S", 25);
        map.put("E", 100);

        System.out.println("Ilk Map : " + map);

        map.replace("I", 60);
        System.out.println(map);

        map.replace("S", 30); // map.put("S",30); ile aynı sonucu verir
        // varolan key'lerde put ile replace arasında bir fark yoktur.

        System.out.println(map);
        map.put("W", 140);
        System.out.println(map);

        map.replace("Y", 2024);
        // var olmayan bir key için put kullanırsanız ekler ama replace derseniz hiçbir işlem yapmaz
        System.out.println(map);

        map.replace("W", 140, 1980);
        System.out.println(map);

        // bu metotta önce eski degere (ilk yazılana) bakar doğru ise 2. yazılanı omnunla degıstırır

        map.replace("W", 140, 145);
        System.out.println(map);

        System.out.println(map.getOrDefault("X", 500));

        map.remove("W", 1980);
        System.out.println(map);

    }
}
