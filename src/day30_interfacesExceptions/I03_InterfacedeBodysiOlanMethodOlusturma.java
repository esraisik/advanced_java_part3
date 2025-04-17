package day30_interfacesExceptions;

public interface I03_InterfacedeBodysiOlanMethodOlusturma {


    void method1();
    // Interface'de olusturulan tum method'lar public ve abstractır
    // yazsak da yazmasak da farketmez



    public default void method2(){
        /*
            Extension method should have a body

            buradaki default keyword 5. default kullanısımız

            bu default'un access modifier olamdığı acık,
            cunku yanında public var

            Java8 ile beraber,
            developer'ların talebi üzerine
            Java istisnai bir kullanım olusturmustur

            Amac bir interface'e sonradan method eklendiğinde
            yeni eklenen method'u
            MECBURI IMPLEMENT  EDILECEK METHOD statusunden cıkarmaktır

            Bunu saglamak için,
            Java sonradan eklenen method'a
              "static" veya "default" keyword'unun eklenmesi
            ve bu method'un body'e sahip olmasi cozumunu uretmistir.

            Böylece abstract class'larda opsıyonel olan
             body'li method'lar gibi kullanılabilirler


         */
    }

    public static void method3(){
        //Static methods in interfaces should have a body
    }





}
