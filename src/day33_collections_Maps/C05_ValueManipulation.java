package day33_collections_Maps;

import java.util.Arrays;

public class C05_ValueManipulation {

    public static void main(String[] args) {

        // Biz öğrenci map'i olustururken, her öğrencinin
        // isim -soyisim-sinif-sube-bolum bilgilerini value olarak tutuyoruz
        // asagıda verile value'deki isim ve soyismi yazdırın


        String value = "Ali can-Tataroglu-10-K-Say";

        // value bir string olduğu için
        // string içindeki degerleri manıpule etmemız gerekir
        // value olusturulurken degerler arasına - konulmussa
        // biz de tersine ilem yapıp split ile -'den bilgileri ayırt edebilriz


        String[] bilgiler = value.split("-");

        System.out.println(Arrays.toString(bilgiler));

        // [Ali can, Tataroglu, 10, K, Say]

        // Array'den istediğimiz bilgiye rahatlıkla ulasabliriz.

        System.out.println(bilgiler[0] + " " + bilgiler[1]); // Ali can Tataroglu

        value = "Veli-Cem-11-K-TM";

        // kullanıcıdaan gecmek istediği bölümü  secip
        // value'deki bölum degerini update edin

        String istenenYeniBolum = "MF";

        // EGER value bir String olarak olusturulmussa
        // bilgileri kullanabilmek için mecburen önce split yapmalıyız

        bilgiler = value.split("-");
        //[Veli, Cem, 11, K, TM]

        System.out.println(Arrays.toString(bilgiler));

        // array haline gelince istediğimiz bilgiyi yazdırabilir ya da update edebilirz
        bilgiler[4] = istenenYeniBolum;
        //[Veli, Cem, 11, K, MF]


        // guncellemeyi bilgiler array'inde yaptık
        // güncel bilgileri tekrar birleştirip value olarak kaydetmemiz gerekir

        value = bilgiler[0] + "-" +
                bilgiler[1] + "-" +
                bilgiler[2] + "-" +
                bilgiler[3] + "-" +
                bilgiler[4];

        value = String.join("-", bilgiler);

        System.out.println("Value'nun son hali : " + value);


    }
}
