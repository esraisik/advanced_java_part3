package day23_dateTime_varargs;

public class C08_DikkatEdilecekler {

    public static void main(String[] args) {

        //argument olarak girilen sayilardan
        // sonuncusuharic geriye kalanları toplayıp
        // bulunan toplam degeri ile son sayının carpımını yazdıram
        // bir method olusturun

        islemYap(2, 3, 4);//20
        islemYap(1, 2, 3, 4, 5); //50
        islemYap(1, 2, 3, 4, 5, 6, 0); //0
    }

    //public static void islemYap (int...v, int a){
    // varrarg parameter must be the last in the list
    // vararg bir parametre varsa, SON PARAMETRE olmak ZORUNDADIR
    // vararg element sinir tanımaz,tum eiementleri almak ister


    //}

    public static void islemYap(int... v) {

        // vararg array altyapısını kullandığı için
        // son elemeti vararg içinde ayırabiliriz

        // vararg'da son elementler hariç, bastaki elementleri toplayın

        int toplam = 0;

        for (int i = 0; i <= v.length - 2; i++) {
            toplam += v[i];
        }

        System.out.println(toplam * v[v.length - 1]);


    }

}
