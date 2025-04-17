package day30_interfacesExceptions;

public interface I01 {

    String str="I01 str";
    int sayi=45;
    boolean izindeMi=true;

    //void method1(){};
    //Interface abstract methods connot have body

    void method1();

    void method3();

    //void method4();

    //voıd method7();
    // Bir interface'e sonradan bir abstract method ekledıgınızde
    // o ınterface'i implement etmıs olan TUM CHİLD CLASS'lar bundan etkilenir
    // tum child class'ların bu yeni method'u kendisine uyarlaması gerekir
    // bu da bıtmıs bir proje de negatif etkiler olusturabilir







}
