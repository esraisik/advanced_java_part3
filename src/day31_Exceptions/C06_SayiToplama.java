package day31_Exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class C06_SayiToplama {

    public static void main(String[] args) {

        // Kullanıcıdan toplanmak üzere tam sayılar isteyin
        //ve kullanıcı q ve ya Q'ya basıncaya kadar işlemi devam ettirin
        //Kullanıcı q'ya bastığında
        //kac adet sayi girildiğini ve toplamın ne oldugunu yazdırın

        Scanner scanner = new Scanner(System.in);
        int toplam = 0;
        int sayac = 0;
        int girilenSayi = 0;
        String girilenMetin = "";


        do {
            System.out.println("Lütfen toplanmak üzere tamsayi grin,\nbitirmek için q'ya basın");

            try {
                girilenSayi = scanner.nextInt();
                toplam += girilenSayi;
                sayac++;
            } catch (InputMismatchException e) {
                girilenMetin = scanner.nextLine();// q sanane, 4,5 ,true, Quin....

                if (girilenMetin.equalsIgnoreCase("Q")) {
                    break;
                } else System.out.println("GİRİS HATALI...tamsayi veya Q olmalı");
            }

        } while (!girilenMetin.equalsIgnoreCase("q"));
        System.out.println("Girilen " + sayac + "adet sayının toplamı " + toplam);
    }
}
