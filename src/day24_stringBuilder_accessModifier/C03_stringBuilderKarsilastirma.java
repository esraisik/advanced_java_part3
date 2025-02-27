package day24_stringBuilder_accessModifier;

public class C03_stringBuilderKarsilastirma {

    public static void main(String[] args) {


        String str1 = "Murat";
        String str2 = "Murat";

        System.out.println(str1 == str2); // true
        System.out.println(str1.equals(str2)); // true

        StringBuilder sb1 = new StringBuilder("Murat");
        StringBuilder sb2 = new StringBuilder("Murat");

        // aynı metne (içeriğe) sahip str1, sb1,sb2'yi karşılastıralım
        System.out.println("___________________________");

        System.out.println(sb1 == sb2); //false
        // Java Compile ederken de run ederken de sorun cıkarmaz ama hep false sonuc verir
        System.out.println(sb1.equals(sb2)); // false

        // equals'ın tek true vereceği hal şudur

        System.out.println(sb1.equals(sb1));// true


        // String Builder'ların metinse eşitliği compare() methodu ile karşılaştırılır.
        // karılaştırma sonucu 0 ise 2 SB birbirinin aynıdır.
        // ikisinin compare() edilmesi sonucu 0 değil ise bu bize ikisinin eşit olmadığını gösterir

        System.out.println(sb1.compareTo(sb2));

        StringBuilder sb3 = new StringBuilder("Java");
        StringBuilder sb4 = new StringBuilder("java");
        StringBuilder sb5 = new StringBuilder("Tava");
        StringBuilder sb6 = new StringBuilder("Tele");
        StringBuilder sb7 = new StringBuilder("Temu");


        System.out.println(sb3.compareTo(sb4)); // -32
        //karşılaştırmaya başlarken ilk farklı karakterde durur ve karakterler arası farkı ASCII değeriyle bildirir
        // J ile j arasındaki fark 32 olduğu için

        System.out.println(sb4.compareTo(sb3)); // 32


        System.out.println(sb5.compareTo(sb6)); //-4

        // ilk harf olan T aynı( Tava - Tele) a ile e arasında 4 fark var

        System.out.println(sb6.compareTo(sb7)); // -1


    }
}
