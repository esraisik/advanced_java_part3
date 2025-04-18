package day31_Exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class C01_TrycatchKullanimi {
    public static void main(String[] args) {


        //Kullanıcıdan iki tam sayi isteyip
        // sayıları biribirine bölün ve sonucu yazdırın

        /*
            Ongörduğumuz problem if ekse ile cözulebiliyorsa cozeriz.

            eger if- else ile cozulemezse
            try-catch blogu kullanırız

            try blogu hata olusma riski olan kodlari calıstırır
            try blogunun tek basına yazılması anlamsız olur
            mutlaka catch ve/veya finally blokları ile calısmalıdır

            catch keyword'unun onundeki parantezde bulunan exception
             karsılasmayı beklediğimiz exceptions olmalıdır

             (InputMismatchException e)
             bu kod şu anlama gelir:
             Eger try bloğunda kodları calıstırırken
             InputMismatchException olusursa
             hata raporunu e objesine kaydet
             ve catch blogunu calıstır.
             catch() {}

              try blogunda exception olusmazsa
            catch blogunun calismasina gerek olmaz
            (yangin yoksa, yangin sondurme tupunu kullanmaya gerek yok)


         */



        Scanner scanner= new Scanner(System.in);
        System.out.println("Lütfen iki tam sayi giriniz...");

        int sayi1= 0;
        int sayi2= 0;

        try {

            sayi1 = scanner.nextInt();
            sayi2 = scanner.nextInt();

            if(sayi2==0) {
                System.out.println("bolecek sayi 0 olamaz");
            }else {
                System.out.println(sayi1/sayi2);
            }

        } catch (InputMismatchException e) {

            System.out.println("Girilen deger tamsayi olmalı");
        }


    }
}
