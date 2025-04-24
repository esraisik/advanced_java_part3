package day32_Iterator_Collections;

import java.util.*;

public class C04_ListIterator {

    public static void main(String[] args) {

        List<Integer> sayilar = new ArrayList<>(Arrays.asList(2, 5, 9, 6, 13, 15, 28, 42, 63, 80));

        // list içindeki elemanların her birini 5 artıralım

        int toplam = 0;

        Iterator itr = sayilar.iterator();
        while (itr.hasNext()) {
            toplam += (Integer) itr.next();
        }
        System.out.println(toplam);
        System.out.println(sayilar);

        //Iterator'da en cok dikkat edilmesi gereken konu iterator'un nerede olduğudur.
        // Iterator objesi while sonuna kadar gittiği için aynı iterator ile bizim elemanları silmemiz mumkun değildir.
        //aynı iterator ile bizim elemanları silmemiz


        Iterator itr2 = sayilar.iterator();

        while (itr2.hasNext()) {
            itr2.next();
            itr2.remove();
        }
        System.out.println(sayilar);


        //iterator sınırlı sayıda öethod içerdiği için
        // bu işlemlerdeki gibi farklı iterator'lar olusturmak gerekir
        // java bu durumu ç


        List<Integer> sayilar2 = new ArrayList<>(Arrays.asList(1, 15, 63, 71, 34, 41, 35, 80));

        ListIterator lit = sayilar2.listIterator();

        int toplam2 = 0;
        while (lit.hasNext()) {
            toplam2 = (Integer) lit.next();
        }
        System.out.println(toplam2);
        System.out.println(sayilar2);


    }
}
