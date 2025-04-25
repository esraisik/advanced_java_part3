package day32_Iterator_Collections;

import javax.swing.text.html.HTMLDocument;
import java.util.*;

public class Pactise {

    public static void main(String[] args) {


        List<Integer> sayilar = new ArrayList<>(Arrays.asList(9, 3, 5, 4, 6, 6, 7, 8));

        // index kullanmadan listedeki tum elementlerın toplamını yazdırın

        Integer sayi = 0;
        Integer toplam = 0;

        Iterator itr = sayilar.iterator();

        while (itr.hasNext()) {

            sayi = (Integer) itr.next();

            toplam += sayi;
        }


        List<Integer> sayilarr = new ArrayList<>(Arrays.asList(9, 3, 5, 4, 6, 6, 7, 8));

        // index kullnmadan Listedeki tum sayilari toplayıp elemanları silelim.


        Integer tpplam = 0;

        Iterator itrr = sayilarr.iterator();


        while (itrr.hasNext()) {


            tpplam += (Integer) itrr.next();

        }

        System.out.println(tpplam); //48

        itrr.remove();
        System.out.println(sayilarr); //[9, 3, 5, 4, 6, 6, 7]


        List<Integer> sayilar2 = new ArrayList<>(Arrays.asList(9, 3, 5, 4, 6, 6, 7, 8));

        ListIterator lit = sayilar2.listIterator();

        toplam = 0;

        while (lit.hasNext()) {

            toplam += (Integer) lit.next();
        }

        System.out.println(toplam); //48

        while (lit.hasPrevious()) {

            lit.previous();
            lit.remove();
        }

        System.out.println(sayilar2);


        List<Integer> sayilar3 = new ArrayList<>(Arrays.asList(9, 3, 5, 4, 6, 6, 7, 8));
        // verilen listedeki tum elementleri 2 artırın

        ListIterator lit1 = sayilar3.listIterator();


        while (lit1.hasNext()) {

            lit1.set((Integer) lit1.next() + 2);

        }

        System.out.println(sayilar3); //[11, 5, 7, 6, 8, 8, 9, 10]


        // listede var olan her elemnetten sonra
        //elemnetin bir fazlası degere sahip yeni bir element ekleyın
        // [11,12, 5,6, 7,8, 6,7, 8,9, 8, 9, 9,10, 10,11]

        lit1 = sayilar3.listIterator();

        while (lit1.hasNext()) {

            lit1.add((Integer) lit1.next() + 1);
        }
        System.out.println(sayilar3);
    }
}
