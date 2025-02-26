package day23_dateTime_varargs;

public class C06_VarrargsSoru {


    public static void main(String[] args) {

        //argument olarak girilen sayilardan
        // ilki haric geriye kalanları toplayıp
        // bulunan toplam degeri ile ilk sayının carpımını yazdıram
        // bir method olusturun

        islemYap(1, 2, 3); // 5
        islemYap(2, 3, 4, 5, 6);// 36
        islemYap(0, 1, 2, 3, 4, 5, 6, 7, 8, 6, 5);// 0

        islemYap(3, 4);// 12
        islemYap(5);// 0

        // varargs'a hic eleman atamasak da
        // varargs bos bir array olur ve CTE olusmaz

        //islemYap(); islem yao methodu ile parametreler uyumlu degil
        // varargs bos kalabilir ama a ya deger atamak zorundayız
    }

    public static void islemYap(int a, int... v) {

        int toplam = 0;

        for (int each : v) {

            toplam += each;
        }
        System.out.println("islem sonucu..:" + toplam * a);
    }
}