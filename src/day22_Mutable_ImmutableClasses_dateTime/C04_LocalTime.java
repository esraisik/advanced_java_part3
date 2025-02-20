package day22_Mutable_ImmutableClasses_dateTime;

import java.time.Duration;
import java.time.LocalTime;

public class C04_LocalTime {

    public static void main(String[] args) {

        LocalTime localtimeBas = LocalTime.now();

        // LocalTime class'ı obje olusturdugumuz satır calıstırdıgında
        // calıstıgı sistemdeki zaman bilgisini alır

        // olusturulan localtime objesi bir kronometre degil
        // olusturuldugu andaki degeri saklayan basit bir variable'dir

        System.out.println("Loop'tan once localtime  : " + localtimeBas); // 23:08:55.575234200

        for (int i = 0; i < 500000; i++) {
            String str = "" + i + 1;
        }
        LocalTime localtimeBitis = LocalTime.now();
        System.out.println("Loop'tan sonra localtime  : " + localtimeBitis);// 23:10:28.946995200

        System.out.println(localtimeBitis.getSecond() - localtimeBas.getSecond());

        //.get.. localtime degerşndeki saat,dakika,saniye veya nanosaniyeyi bize getirir.

        System.out.println(Duration.between(localtimeBas, localtimeBitis));

        // .with.. localtime degerindeki saat,dakika,saniye veya nanosaniyeyi
        // istediğimiz deger olarak ayarlar
        System.out.println(localtimeBitis.withHour(20));

        System.out.println(localtimeBitis.withMinute(0));

        System.out.println(localtimeBitis.withSecond(0).withNano(0));

        // .plus.. veya .minus.. localtime degerindeki saat,dakika,saniye veya nanosaniyeyi
        // istediginiz deger kadar ileri veya geriye alır

        System.out.println(localtimeBitis.plusHours(29).plusMinutes(17));

        System.out.println(localtimeBitis.minusHours(217));

        System.out.println(localtimeBas.toSecondOfDay());//84806
        // gunun baslangıcı olan 00:00'dan localtimeBas zamanına kadar gecen toplam saniye
        System.out.println(localtimeBas.toNanoOfDay());//84806615937600
        // gunun baslangıcı olan 00:00'dan localtimeBas zamanına kadar gecen toplam nanosaniye

        // yukarıdaki loop islem suresini baslangoc ve bitis saniyeleri ile bulalım

        System.out.println(localtimeBitis.toSecondOfDay() - localtimeBas.toSecondOfDay());


        // yukarıdaki loop islem suresini baslangoc ve bitis nanosaniyeleri ile bulalım

        System.out.println(localtimeBitis.toNanoOfDay() - localtimeBas.toNanoOfDay());
    }
}
