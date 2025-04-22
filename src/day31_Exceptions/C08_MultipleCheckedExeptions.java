package day31_Exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class C08_MultipleCheckedExeptions {

    public static void main(String[] args) {

        /*
            FileInputStream olusturdugumuzda
            Java ya dosyayı bulamazsam dedi,
            biz de try catch ile sarmlayıp
            FileNotFoundException'ı kontrol altına aldık

            Ancak fileInputStream.read yazdıgımızda
            bu defa da IOExeption riski barindirdigi için altını kırmızı cizdi

            IOxeption, FileNotFoundExeption!ın parent'i olduğundan
            işlem yaparken bu ilişkiyi dikkate almalıyız.
            1- eger ikisini de ayrı catch cumleleri ile yazacaksak
            uste child exception yazilmalidir

            2- eger ikisini ayri ayri yazmak istemezsek
               sadece parent olan IO exception'i yazmamiz yeterli olacaktir
               cunku IOException ikisini de kapsar

         */

        // notlar dosyasindaki yazilari konsolda yazdirin

        String dosyaYolu = "src/day31_exceptions/notlar.txt";
        FileInputStream fileInputStream;

        try {
            fileInputStream = new FileInputStream(dosyaYolu);
            // dosyadaki yazilari konsolda yazdirin

            int k = 0;
            while ((k = fileInputStream.read()) != (-1)) { // dosyayi okuyup, bize getirme
                // Unhandled exception: java.io.IOException
                System.out.print((char) k);
            }

        } catch (FileNotFoundException e) {
            System.out.println("Verilen dosya yolu hatali...");

        } catch (IOException e) { // IO Input Output
            System.out.println("Dosyadaki değerler okunamıyor");
        }
    }
}
