package day22_Mutable_ImmutableClasses_dateTime;

public class C02_StringAtamaYapilirsa {

    public static void main(String[] args) {

        String str = "Java";

        str = str.replace("J", "T");

        System.out.println(str);// Tava


        str = "Hava";

        System.out.println(str); // Hava

        // String immutable oldugundan degeri DEGİSTİRİLEMEZ
        // kod yazan kişi yeni bir atama yaptığında
        // java atamanin calismasi için yeni bir obje olusturur ve yeni obje'yi pointer'a tanitir

        // Böylece kullanıcı olarak biz String variable'lara deger atayabiliriz

        // AMMAAA her yeni deger atamasinda kullanılmayan bir String objesi açıga cıkar

        // Java'daki Garbage Collector (cop toplayıcı) mekanizması
        // belirli araliklarla calisip, kullanilmayan bu objeleri toplayip yok eder.


        String s = "";

        for (int i = 1; i < 100; i++) {
            s += i;
        }
        System.out.println(s);

    }
}