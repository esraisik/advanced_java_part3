package day35_NestedMaps;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C02_FarkliDataTurleriKullanma {

    public static void main(String[] args) {


        String str = "Ali";

        //Integer sayi =str;

        Integer sayi = 20;

        //List<String> isimler = str;
        List<String> isimler = new ArrayList<>();

        Object obj = str;
        obj = sayi;
        obj = isimler;

        // non-primitive data turlerinde casting
        // SADECE parent child ilişkisi olan class'larda olur

        //str = (String) obj;

        List<Object> elementler = new ArrayList<>();

        elementler.add(20);
        elementler.add(true);
        elementler.add('a');
        elementler.add("Esra");

        int[] arr = {2, 4, 6};

        elementler.add(arr);

        // Data türünü Object secmek, elementleri eklemede cok kolaylık saglar
        // AMMAAAAA elementleri kullanırken surekli casting gerekebilir
        // surekli olarak kullanmak istediğimiz elementin data türünü kontrol etmeli
        // ve Object turunden istediğimiz data turune cast etmeliyiz

        System.out.println(elementler); // [20, true, a, Esra, [I@5f184fc6]

        //List'in içindeki elementler listesindeki4. indexteki array'i yazdırın

        System.out.println(
                Arrays.toString((int[]) elementler.get(4))
        ); // [2, 4, 6]

        // elementler listesindeki 3. index'in uzunlugunu yazdırın

        System.out.println(
                ((String) elementler.get(3)).length()
        ); // 4

        // elementler listesindeki 0. indexteki sayıyı 5 artır

        elementler.set(0, (Integer) elementler.get(0) + 5);

        System.out.println(elementler);


    }
}
