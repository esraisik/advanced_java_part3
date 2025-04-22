package day31_Exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class C07_CheckedExeptions {

    public static void main(String[] args) throws FileNotFoundException {

        int sayi1 = 10;
        int sayi2 = 0;

        //System.out.println(sayi1 / sayi2);//                    int / int

        //String str =10; // Srting bekliyor ama int atadık

        //List<> sayilar= new ArrayList<>() // Identifier expected

        int s;
        // System.out.println(s);// Variable 's' might not have been initialized
        // sayi1 + 5 = 10; // Variable expected


        /*
            Exceptions temel olarak ikiye ayrılır

         Run time'da ortaya cıkan exception'lar. RunTimeExceptions, UnCheckedExceptions
            StringIndexOutOfBoundExceptions
            ArrayIndexOutOfBoundExceptions
            AritmeticExceptions


        Compile Time sirasinda farkedilenler CheckedExceptions
        Biz bugune kadar alti kirmizi cizgili olan herseye CTE Compile Time Error
            Ammmaaa alti kirmizi olan her kod hata degildir

            Ozellikle dosya okuma ve yazma islemlerinde
            Java exception olasiligini compile time'da kontrol edip
            bize uyari verir

            Unhandled exception: java.io.FileNotFoundException

            Compile time exception'larda Java bize 2 alternatif sunar
            1- Java ile try-catch yapabiliriz
               exception kontrol altina alinip e objesine kaydedilir
               ve kod normal calismaya devam eder
            2- Eger exception'i kontrol altina almak istemiyorsaniz
               (ornegin, dosyaya ulasamiyorsak kodun calismaya devam etmesinin bir anlami kalmiyorsa)
               Amacimiz sadece kirmizi cizgiyi kaldirip
               Class'i Run edilebilir hale getirmek ise
               sorumlulugu aldigimizi Java'ya soylemeli
               ve bu Class'i sonradan kullanacak insanlari uyarmaliyiz

                Bunun icin method signature'ina "throws FileNotFoundException " ekleyebiliriz
         */


        String dosyaYolu = "src/day31_exceptions/notlar.txt";

        /*
        try {
            FileInputStream fileInputStream = new FileInputStream(dosyaYolu);
            // Unhandled exception: java.io.FileNotFoundException

        } catch (FileNotFoundException e) {

            System.out.println("Verilen dosya yolunda bir dosya mevcut degil");
        }
         */

        FileInputStream fileInputStream = new FileInputStream(dosyaYolu);


    }
}
