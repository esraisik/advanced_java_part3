package day22_Mutable_ImmutableClasses_dateTime;

public class C03_StringPool {

    public static void main(String[] args) {

        String str1 = "Ali"; //1
        String str2 = "Ali"; //1
        String str3 = new String("Ali"); //2
        String str4 = "A" + "li"; //1
        String s = "A"; //1
        String t = "li";  //1
        String str5 = s + t; //2
        String r = "ali"; //1
        String str6 = r.substring(0, 1).toUpperCase() + r.substring(1); //2

        /*
           Java'da temel olarak 2 turlu String olusturabiliriz
           1- en basit yöntem olan " " içinde yazarak veya "" ları + ile birlestirerek
           2- new keyword veya method'lar kullanilarak

           Java obje olusturmada tasarruf etmek için
           1. yontemle olusturulan String'leri ayrı bir String Pool'da tutar.

           EGEERRRRR 1. yontemle bir String olusturdugumuzda
                     String Pool'da daha önce aynı degere sahip bir String varsa
                     Java yeni String'i eski String ile eslestirir
                     aynı referans ve aynı degeri kullanmalarını saglar
         */


        System.out.println(str1.equals(str2)); // Ali <==> Ali  ==> true
        System.out.println(str1.equals(str3)); // Ali <==> Ali  ==> true
        System.out.println(str1.equals(str4)); // Ali <==> Ali  ==> true
        System.out.println(str1.equals(str5)); // Ali <==> Ali  ==> true
        System.out.println(str1.equals(str6)); // Ali <==> Ali  ==> true
        System.out.println(str1.equals("Ali")); // Ali <==> Ali  ==> true



        /*
           String ifadelerin eşitliğini kontrol etmek için == kullanırsak
           metni aynı olan ifadeler için her zaman true vermez.

           == Sadece metne bakmaz, metne ve referansa birlikte bakar
              yani true olması için hem metnin heö de referansın aynı olması gerekir.
              Bu da ancak String Pool'da olup metni aynı olan String'ler için MUMKUNDUR
              equals() ise SADECE metne bakar, mrtin aynı ise  true verir
         */

        System.out.println("==============================");


        System.out.println(str1 == (str2)); // Ali h<==>h Ali  ==> true
        System.out.println(str1 == (str3)); // Ali h<==>- Ali  ==> false
        System.out.println(str1 == (str4)); // Ali h<==>h Ali  ==> true
        System.out.println(str1 == (str5)); // Ali h<==>- Ali  ==> false
        System.out.println(str1 == (str6)); // Ali <==>- Ali  ==> false
        System.out.println(str1 == ("Ali")); // Ali h<==>h Ali  ==> true
        System.out.println(str2 == ("Ali")); // Ali h<==>h Ali  ==> true
        System.out.println(str3 == (str4)); // Ali -<==>h Ali  ==>false
        System.out.println(str5 == (str6)); // Ali -<==>- Ali  ==> false
        System.out.println(str6 == (str2)); // Ali -<==>h Ali  ==> false


    }
}
