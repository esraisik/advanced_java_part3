package day24_stringBuilder_accessModifier;

public class C02_StringBuilderMethods {

    public static void main(String[] args) {

        StringBuilder sb1 = new StringBuilder("Nice have a day");

        //sb1'de yer alan degeri tersten yadırıyoruz
        sb1.reverse();

        System.out.println(sb1);
        // sb1 tersten yazılarak atandığı için eski haline dönmek istersek
        //tekrar reverse methodu kullanmamız gerekir
        sb1.reverse();
        // tersinin tersi kendisidir
        System.out.println(sb1);

        // isim aynı olsa bile String ve Stringbuilder de uygulama farklı olabilir

        //replace methodu indez alarak şistenen aralıktaki metni silip
        //yerine istediğiniz bir metni koyar
        //ilk index dahil ikinci index hariçtir
        String str = "Wise";
        sb1.replace(0, 4, str);
        System.out.println(sb1);

        //delete methodu iki index girilerek iki index arasındaki veriyi siler
        //ilk index dahil ikinci index hariçtir
        sb1.delete(0, 12);
        System.out.println(sb1);

        //herhangi bir indexteki veriyi silmek amacıyla kullanılır
        sb1.deleteCharAt(sb1.length() - 1);
        System.out.println(sb1);

        // herhangi bir index'e verilen bir stringi eklemek için kullanılır
        sb1.insert(sb1.length(), "y");
        System.out.println(sb1);

        // verilen indexten itibaren ilgili str degeri variable'a eklenir
        sb1.insert(0, "Wise have a ");
        System.out.println(sb1);


    }


}
