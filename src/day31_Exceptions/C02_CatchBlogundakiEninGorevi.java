package day31_Exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class C02_CatchBlogundakiEninGorevi {

    public static void main(String[] args) {

        //Kullanıcıdan iki tam sayi isteyip
        // sayıları biribirine bölün ve sonucu yazdırın


        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen iki tam sayi giriniz...");

        int sayi1 = 0;
        int sayi2 = 0;

        try {

            sayi1 = scanner.nextInt();
            sayi2 = scanner.nextInt();

            if (sayi2 == 0) {
                System.out.println("bolecek sayi 0 olamaz");
            } else {
                System.out.println(sayi1 / sayi2);
            }

        } catch (InputMismatchException e) {

            System.out.println("Girilen deger tamsayi olmalı");

            /*
                e yakalanan InputMismatchException hatasını
                kaydettigimiz variable'dir

                İsminin e olması sart degildir ama genelde e kullanılır

                Eger isterseniz hata bildirmek için
                e ile bazı hazır metotarı'ları kullanabilirsiniz

             */

           // System.out.println(e.getMessage()); //null
           // System.out.println(e.getCause());//null
            e.printStackTrace();

               /*
                Hem butun exception detaylarini yazdirir
                hem de normal calismaya devam eder

                java.util.InputMismatchException
                at java.base/java.util.Scanner.throwFor(Scanner.java:939)
                at java.base/java.util.Scanner.next(Scanner.java:1594)
                at java.base/java.util.Scanner.nextInt(Scanner.java:2258)
                at java.base/java.util.Scanner.nextInt(Scanner.java:2212)
                at day31_exceptions.C02_CatchBlogundakiEninGorevi.main(C02_CatchBlogundakiEninGorevi.java:24)
             */

        }
    }
}