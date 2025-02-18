package day21_PassByValue_immutableClasses;

public class C01_PassByValue {

    public static void main(String[] args) {

        String cumle = "java her gun daha da guzellesiyor";
        uzunlukYazdir(cumle); // method'ta " verilen cumlenın uzunluğu: 33 yazdırır

    }

    public static void uzunlukYazdir(String cumle) {

        //cumlenın uzunlugunu yazdırın


        System.out.println("Verilen cumlenın uzunlugu:" + cumle.length());


        /*
            cumle variable'ı main method içerisinde olusturulduğu icin
            local bir variable'dir.
              scope'u main method'dur
            ve main method disindan KULLANILAMAZ

            Eger cumle variable'inin degerini
            uzunlukYazdir()'unda kullanmak istersek
            parametre olarak yollayabiliriz
         */
    }

    public static void buyukHarfeCevir(String cumle) {

        cumle = cumle.toUpperCase();

        System.out.println("Method'da cumle  : " + cumle);
    }


}




