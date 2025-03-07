package day28_Overriding_Polymorphism;

import day27_Inheritance.C03_Hayvanlar;
import day27_Inheritance.C04_Kuslar;
import day27_Inheritance.C05_AvciKuslar;

public class C03_Pollymorphism {


    public static void main(String[] args) {

        String str = "Java Candir";
        System.out.println(str.substring(3)); // a Candir

        System.out.println(str.substring(3, 6)); //a C

        C05_AvciKuslar kartal1 = new C05_AvciKuslar();
        System.out.println(kartal1.beslenme);// et yerler

        C04_Kuslar kartal2 = new C05_AvciKuslar();
        System.out.println(kartal2.beslenme); // beslenirler


    }
}
