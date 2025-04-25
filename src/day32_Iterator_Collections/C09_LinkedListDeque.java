package day32_Iterator_Collections;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class C09_LinkedListDeque {

    public static void main(String[] args) {


        Deque<Integer> sayilar = new LinkedList<>();

        sayilar.add(1);
        sayilar.add(20);
        sayilar.add(30);
        sayilar.add(48);
        System.out.println(sayilar);

        sayilar.add(100);
        System.out.println(sayilar);


    }


}
