package day34_Maps;

public class C07_KullanicidanBilgileriAlipBilgileriEkleme extends  MapDepo {

    public static void main(String[] args) {

        //Kullanıcıdan numara, isim, soyisim, sınıf, sube ve bolum bilgilerini alıp
        //ogrenciyi map'e kaydeden bir method olusturun


        kullaniciyaYeniOgrenciOlusturma();

        System.out.println(ogrenciMap);

        /*
            Java Run Time Program'dır
            Her Run tusuna bastıgımızda her sey sıfırdan baslar.
            kodun çalısması DURUNCAYA KADAR
            ypılan degisiklikler KALICIDIR

            AMMMAAAA kod durduğu anda HER SEY SIFIRLANIR.

         */


        soyIsimdenListeYazdir("Cem");
        bolumListeYazdir("mf");

    }
}
