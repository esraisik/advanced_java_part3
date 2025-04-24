package day32_Iterator_Collections;

import java.util.LinkedList;
import java.util.List;

public class C07_LinkedList {

    public static void main(String[] args) {

        List<Integer> sayilar = new LinkedList<>();

        sayilar.add(30);
        sayilar.add(40);
        sayilar.add(50);


        System.out.println(sayilar.hashCode()); //59911
    }
}
