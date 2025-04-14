package day29_abstrackClasses;

public abstract class C03_KuralciParent {

     /*
        Parent class'taki method1 ve method2'yi
        BUTUN CHİLD class'lar kendilerine UYARLAMAK ZORUNDA olsun

        method3 ve method4 için bir sey demiyoruz
        klasik inheritance kurallarına uysunlar

        1- Oncelikle Kuralcı parent'lar
        kendilerinin kuralcı oldugunu DEKLARE ETMELİDİR
        bunun için class deklerasyonuna ABSTRACT keyword eklenmelidir

        2-Abstract class olan parent class'lar
        hangi method'ların child class'lar tarafından
        implement edilmesinin (kendilerine uyarlama) ZORUNLU OLACAGINI belirler

        3-Child class'ların implement etmesis ZORUNLU olacak methodlar
        abstract method haline getirilir.

        abstract methot'lar sadece kuralı yazan cumleler  gibidir.
        standart bir method olmasına gerek yoktur.

        4- Abstaract class'taki abstract olmayan methodlar
        child class tarafından implement edilmek zorunda degildir.

        5- Abstract child class'a sonradan abstract method eklenirse
        tum child classlar bu yeni abstaract methodu
        DERHAL kendilerine uyarlamak zorunda kalırlar

        Devam eden bir projede
        bu cok tavsiye edilmez
        cunku child class'lar bu method'u uyguladıgında
        tum uygulamanın ozelliklerini etkileyebilir

         Bu sebeple genellikle abstract yapılara sonradan eklenen methodların
         abstract method olmaması tercıh edilir
     */

    String str;
    String s;
    static int sayi=10;

    //beni parent edinen child class, method1'i kendine uyarlamak zorundadir.
    public abstract  void method1();

    public abstract void method2();

    public static void method3(){
        System.out.println("Parent method3");
    }

    public static void method4(){
        System.out.println("Parent method4");
    }

    public abstract int method5();


}

