package day35_NestedMaps;

import java.util.Map;
import java.util.TreeMap;

public class C08_ComputeMethodlari {

    public static void main(String[] args) {

        Map<String,Integer> harfler = new TreeMap<>();

        harfler.put("F",40);
        harfler.put("M",50);
        harfler.put("Z",10);
        harfler.put("T",25);
        harfler.put("X",5);

        System.out.println(harfler); // {F=40, M=50, T=25, X=5, Z=10}

        // F'nin değerini 10 azaltin

        int eskiDeger = harfler.get("F");
        harfler.put("F",eskiDeger-10);

        System.out.println(harfler); //{F=30, M=50, T=25, X=5, Z=10}

        // eger map'te X varsa degerini 40yapın

        if (harfler.containsKey("X")) {
            harfler.put("X",40);
        }

        System.out.println(harfler); //{F=30, M=50, T=25, X=40, Z=10}


        // eger map'te Y varsa degeri 40 yapın

        if (harfler.containsKey("Y")) {
            harfler.put("Y",40);
        }

        System.out.println(harfler); //{F=30, M=50, T=25, X=40, Z=10}

        // eger map'te Z yoksa degeri 15 olrak ekleyin

        if (! harfler.containsKey("Z")) {
            harfler.put("Z",15);

        }

        System.out.println(harfler); //{F=30, M=50, T=25, X=40, Z=10}

        // eger map'te Q yoksa degeri 15 yapın
        if (! harfler.containsKey("Q")) {
            harfler.put("Q",15);

        }
        System.out.println(harfler); // {F=30, M=50, Q=15, T=25, X=40, Z=10}


        //eger map'te R yoksa degeri 12 olarak belirleyin

        harfler.putIfAbsent("R",12);
        System.out.println(harfler);//{F=30, M=50, Q=15, R=12, T=25, X=40, Z=10}

        harfler.putIfAbsent("M",23);
        System.out.println(harfler);//{F=30, M=50, Q=15, R=12, T=25, X=40, Z=10}

        // Map'te M varsa değerini 2 katına cıkarın

        harfler.computeIfPresent("M",(k,v) -> v*2);
        System.out.println(harfler);// {F=30, M=100, Q=15, R=12, T=25, X=40, Z=10}

        // map'te S varsa degerini 10 artırın

        harfler.computeIfPresent("S",(k,v) -> v+10);
        System.out.println(harfler); //{F=30, M=100, Q=15, R=12, T=25, X=40, Z=10}

        // map'te N yoksa degeri 17 olarak ekleyin

        //harfler.putIfAbsent("N",17);

        harfler.computeIfAbsent("N",v->17);
        System.out.println(harfler); // {F=30, M=100, N=17, Q=15, R=12, T=25, X=40, Z=10}








    }
}
