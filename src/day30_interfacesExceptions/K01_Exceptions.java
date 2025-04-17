package day30_interfacesExceptions;

import java.util.Scanner;

public class K01_Exceptions {

    public static void main(String[] args) {

        //Kullanıcıdan iki tam sayi isteyip
        // sayıları biribirine bölün ve sonucu yazdırın


        /*
              Iyi bir kod yazari
            kod'da nerelerde hata olusabilecegini de ongorur
            ve o hata ihtimallerine karsi
            Java'ya yol gosterir

            Ornegin bu gorevde
            kullanicinin payda olarak 0 girmesini ongorup
            if ile bir cozum uretebiliriz

            AMMMAAA kullanıcı tamsayi yerine farklı bir deger girerse
            olusacak "InputMismatchExeption"ı if else ile cozemeyız

            Java ongorebileceğimiz bu  tür sorunları
            Java'nın cozup yoluna devam edebilmesi (handle) için
            bize try-catch blokları hazırlanmıstır
         */



        Scanner scanner= new Scanner(System.in);
        System.out.println("Lütfen iki tam sayi giriniz...");

        int sayi1=scanner.nextInt();
        int sayi2=scanner.nextInt();

        if(sayi2==0) {
            System.out.println("bolecek sayi 0 olamaz");
        }else {
            System.out.println(sayi1/sayi2);
        }

    }
}
