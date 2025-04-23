package day32_Iterator_Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class C02_Iterator {

    /*
        java index kullanımının mumkun olmadığı durumlarda
         ya da index kullanmak istemediğimiz durumlarda
         tüm elemanlara ılasabileceğimiz ve kalıcı değişiklik yapabileceğimiz
         Iterator isinli bir interface olusturmustur


     */

    public static void main(String[] args) {

        List<Integer> sayilar = new ArrayList<>(Arrays.asList(1, 2, 3, 36, 48, 9));
        // İndex kullanmadan list içindeki çift sayıları silelim


        // 1 2 3 36 48 9
        Iterator iterator = sayilar.iterator();

        System.out.println(iterator.hasNext()); // true


        int sayi = (Integer) iterator.next();
        System.out.println(sayi);

        if (sayi % 2 == 0) {
            iterator.remove();
        }
        System.out.println(sayilar);

        sayi = (Integer) iterator.next();
        if (sayi % 2 == 0) {
            iterator.remove();
        }
        System.out.println(sayilar);

        sayi = (Integer) iterator.next();
        if (sayi % 2 == 0) {
            iterator.remove();
        }
        System.out.println(sayilar);

        sayi = (Integer) iterator.next();
        if (sayi % 2 == 0) {
            iterator.remove();
        }
        System.out.println(sayilar);
        sayi = (Integer) iterator.next();
        if (sayi % 2 == 0) {
            iterator.remove();
        }
        System.out.println(sayilar);

        sayi = (Integer) iterator.next();
        if (sayi % 2 == 0) {
            iterator.remove();
        }
        System.out.println(sayilar);

        System.out.println(iterator.hasNext());
    }


}

