package day28_Overriding_Polymorphism;

public class C02_Child extends C01_Parent {

    public void method1(int a) {  // method1 int
    /*
        Biz aynı class'ta
        aynı signature'a sahip 2 method olusturamayız

        Override edebilmek için
        method'ların chil class'ta olması
        ve parent class'taki method ile aynı signatur'a sahip olması gerekir

        override  etme yani child'ın metodu kendine uyarlaması
        method body'sini degiştirerek olur

     */
    }

    public void method2() {
    }
    // overriding yaparken esas olan signatur'ın aynı olmasıdır.
    //ancak signature'a dahil olmayan
    // returnType ve access modifier için de kurallar vardır}}


    @Override
    public void method3() {
        //@Override notasyonu kullanmak mecburı değildir
        // Ancak kullanmak faydalidir
        //@Override parent classtaki override edilen methodu takip eder
        // ve method silinir veya signature'ı degiştılirse
        //CTE verir
        // Bu notasyon kullanılmadıysa
        //overriding methot,overridden methodu takip etmez
        // silinir veya signature2ı degiştirilirse
        //override etmeden yoluna devam eder

    }

    @Override
    public void method4() {
        super.method4();
        //Normal sartlarda
        //overriding method ve overriddin method'tan sadce biri çalısır
        //Ama yazdığımız kod geregi ikisinin de çalısmasını istersek
        //child class'da super.method4(); yazabilirsiniz

    }

    public static void method5() {
        //static methodlar override edilemez
        //biz manuel olarak aysını yazsak da
        //java bunları override olrak kabul etmez
        //biribriyle ilgisi olmayan iki farklı method kabul eder
    }


    public void method66() {
        // overidden method is final
        //final method, override edilmeyen method demektır
        //signature'ı aynı olan bir method yazsak da
        //java CTE verir ve final method override edilemez diye bizi uyarır

    }


    private void method7() {
        //Parent class da olsa
        //private class uyelerine baska class'lrdan ulasmak mumkun olmadığı için
        // bız aynı methodu child class'ta olustursak da
        //bunları bagımsız method'lar kabul eder
        // override olarak ilişkilendırmez
    }

    public void method() {
        //child class'taki overriding method'un access modifier'ı
        //parent class'taki overriding method'un access modifier'ından
        // daha kısıtlayıcı olamaz.
        // overridden method default access modifier oldugundan
        // bu method default access mod, protected veya public olabilir
    }


    public int method9() {
        //overridden method'un return type'i
        //primitive veya void ise
        // overriding method da aynı olmalıdır
        return 0;
    }

    public void method10() {

    }


    public String method11() {
        // Return type non-primitive ise
        // child class'taki method'un return tyoe'ı
        // ya parent class'daki methodun return type'ı ile aynı olmalıdır
        //ya da onun child'ı olmalıdır.
        //Buna da Covariant data turu denir.
        return "";
    }


}